package com.chi.centraldashboard.Minister.QualityOfHealthServices;

import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.chi.centraldashboard.R;
import com.chi.centraldashboard.apiCall.ApiClient;
import com.chi.centraldashboard.apiCall.ApiInterface;
import com.chi.centraldashboard.apiCall.bin.CEAAdopted;
import com.chi.centraldashboard.apiCall.bin.CEAData;
import com.chi.centraldashboard.apiCall.bin.CEADataList;
import com.chi.centraldashboard.apiCall.bin.CEANotAdopted;
import com.chi.centraldashboard.apiCall.bin.CEARegistered;
import com.chi.centraldashboard.apiCall.bin.CEATreatmentGuidline;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CEAActivity extends MiQualityOfHealthServiceActivity {
    Button btnOrange, btnBlue, btnLGreen, btnGreen;
    android.support.v7.widget.LinearLayoutManager mLayoutManager;
    private ApiInterface apiInterface;
    private RecyclerView recyclerView;
    CEACusRecviewElevenAdapter ceaCusRecviewElevenAdapter;
    EHospitalCusRecViewThreeAdapter eHospitalCusRecViewThreeAdapter;

    private List<CEADataList> ceaDataListList;
    private List<CEARegistered> ceaRegisteredList;
    private List<CEAAdopted> ceaAdoptedList;
    private List<CEANotAdopted> ceaNotAdoptedList;
    private List<CEATreatmentGuidline> ceaTreatmentGuidlineList;
    Call<CEAData> ceaDataCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         //setContentView(R.layout.activity_cea);

        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_qualityofhealthservicesframe); //Remember this is the FrameLayout area within your activity_main.xml
        getLayoutInflater().inflate(R.layout.activity_cea, contentFrameLayout);

        btnOrange = (Button) findViewById(R.id.btn_ceaorange);
        btnBlue = (Button) findViewById(R.id.btn_ceablue);
        btnLGreen = (Button) findViewById(R.id.btn_cealgreen);
        btnGreen = (Button) findViewById(R.id.btn_ceagreen);

        recyclerView = (RecyclerView) findViewById(R.id.recview_cea);

        mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(mLayoutManager);

        apiInterface = ApiClient.getClient().create(ApiInterface.class);
        ceaDataListList = new ArrayList<>();
        ceaRegisteredList = new ArrayList<>();
        ceaAdoptedList = new ArrayList<>();
        ceaNotAdoptedList = new ArrayList<>();
        ceaTreatmentGuidlineList = new ArrayList<>();
        ceaDataCall = apiInterface.ceaData();
        ceaDataCall.enqueue(new Callback<CEAData>() {
            @Override
            public void onResponse(Call<CEAData> call, Response<CEAData> response) {
                ceaDataListList.addAll(response.body().getCeaDataListList());
                ceaRegisteredList.addAll(ceaDataListList.get(0).getCeaRegisteredList());
                ceaAdoptedList.addAll(ceaDataListList.get(0).getCeaAdoptedList());
                ceaNotAdoptedList.addAll(ceaDataListList.get(0).getCeaNotAdoptedList());
                ceaTreatmentGuidlineList.addAll(ceaDataListList.get(0).getCeaTreatmentGuidlineList());

                ceaCusRecviewElevenAdapter = new CEACusRecviewElevenAdapter(getApplicationContext(), ceaRegisteredList, "ceaRegistered");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(ceaCusRecviewElevenAdapter);
                ceaCusRecviewElevenAdapter.notifyDataSetChanged();

                btnOrange.setText(ceaRegisteredList.get(1).getTotal_Number_of_Clinical_Establishments_Registered());
                btnBlue.setText(ceaAdoptedList.get(1).getNumber_of_States_UTs_that_have_adopted_the_CEA_Act());
                btnLGreen.setText(ceaNotAdoptedList.get(1).getTotal_Number_of_States_UTs_that_have_Not_adopted_the_CEA_Act());
                btnGreen.setText(ceaTreatmentGuidlineList.get(1).getTotal_Number_of_Standard_Treatment_Guidelines());

            }

            @Override
            public void onFailure(Call<CEAData> call, Throwable t) {

            }
        });

        btnOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ceaCusRecviewElevenAdapter = new CEACusRecviewElevenAdapter(getApplicationContext(), ceaRegisteredList, "ceaRegistered");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(ceaCusRecviewElevenAdapter);
                ceaCusRecviewElevenAdapter.notifyDataSetChanged();
            }
        });

        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eHospitalCusRecViewThreeAdapter =new EHospitalCusRecViewThreeAdapter(getApplicationContext(),ceaAdoptedList,ceaNotAdoptedList,ceaTreatmentGuidlineList,"Adopted",1);
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(eHospitalCusRecViewThreeAdapter);
                eHospitalCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });

        btnLGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eHospitalCusRecViewThreeAdapter =new EHospitalCusRecViewThreeAdapter(getApplicationContext(),ceaAdoptedList,ceaNotAdoptedList,ceaTreatmentGuidlineList,"NotAdopted",1);
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(eHospitalCusRecViewThreeAdapter);
                eHospitalCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });

        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eHospitalCusRecViewThreeAdapter =new EHospitalCusRecViewThreeAdapter(getApplicationContext(),ceaAdoptedList,ceaNotAdoptedList,ceaTreatmentGuidlineList,"TreatmentGuidelines",1);
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(eHospitalCusRecViewThreeAdapter);
                eHospitalCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });
    }

}
