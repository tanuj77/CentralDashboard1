package com.chi.centraldashboard.Minister.Survillance;

import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.chi.centraldashboard.Minister.HealthServiceDelivery.FamilyPlaningRecviewCusFiveAdapter;
import com.chi.centraldashboard.R;
import com.chi.centraldashboard.apiCall.ApiClient;
import com.chi.centraldashboard.apiCall.ApiInterface;
import com.chi.centraldashboard.apiCall.bin.NLEPData;
import com.chi.centraldashboard.apiCall.bin.NLEPDataList;
import com.chi.centraldashboard.apiCall.bin.NLEP_CasesDetected;
import com.chi.centraldashboard.apiCall.bin.NLEP_CasesOnRecord;
import com.chi.centraldashboard.apiCall.bin.NLEP_ChildCases;
import com.chi.centraldashboard.apiCall.bin.NLEP_FemaleCases;
import com.chi.centraldashboard.apiCall.bin.NLEP_Grade2;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NLEPActivity extends MiSurvillanceActivity {
    private RecyclerView recyclerView;
    android.support.v7.widget.LinearLayoutManager mLayoutManager;
    private ApiInterface apiInterface;

    PbsCusRecViewThreeAdapter pbsCusRecViewThreeAdapter;
    FamilyPlaningRecviewCusFiveAdapter familyPlaningRecviewCusFiveAdapter;
    Button btnDetailedStatus, btnOrange, btnBlue, btnLGreen, btnGreen, btnBrown;

    private List<NLEPDataList> nlepDataListList;
    private List<NLEP_CasesOnRecord> nlep_casesOnRecordList;
    private List<NLEP_CasesDetected> nlep_casesDetectedList;
    private List<NLEP_Grade2> nlep_grade2List;
    private List<NLEP_FemaleCases> nlep_femaleCasesList;
    private List<NLEP_ChildCases> nlep_childCasesList;

    Call<NLEPData> nlepDataCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_bloodbank);

        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_survillanceframe); //Remember this is the FrameLayout area within your activity_main.xml
        getLayoutInflater().inflate(R.layout.activity_nlep, contentFrameLayout);

        btnOrange = (Button) findViewById(R.id.btn_nleporange);
        btnBlue = (Button) findViewById(R.id.btn_nlepblue);
        btnLGreen = (Button) findViewById(R.id.btn_nleplgreen);
        btnGreen = (Button) findViewById(R.id.btn_nlepgreen);
        btnBrown = (Button) findViewById(R.id.btn_nlepbrown);

        recyclerView = (RecyclerView) findViewById(R.id.recview_nlep);

        mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(mLayoutManager);

        apiInterface = ApiClient.getClient().create(ApiInterface.class);
        nlepDataListList = new ArrayList<>();
        nlep_casesOnRecordList = new ArrayList<>();
        nlep_casesDetectedList = new ArrayList<>();
        nlep_grade2List = new ArrayList<>();
        nlep_femaleCasesList = new ArrayList<>();
        nlep_childCasesList = new ArrayList<>();
        nlepDataCall = apiInterface.nlepData();
        nlepDataCall.enqueue(new Callback<NLEPData>() {
            @Override
            public void onResponse(Call<NLEPData> call, Response<NLEPData> response) {
                nlepDataListList.addAll(response.body().getNlepDataListList());
                nlep_casesOnRecordList.addAll(nlepDataListList.get(0).getNlep_casesOnRecordList());
                nlep_casesDetectedList.addAll(nlepDataListList.get(0).getNlep_casesDetectedList());
                nlep_grade2List.addAll(nlepDataListList.get(0).getNlep_grade2List());
                nlep_femaleCasesList.addAll(nlepDataListList.get(0).getNlep_femaleCasesList());
                nlep_childCasesList.addAll(nlepDataListList.get(0).getNlep_childCasesList());

                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getApplicationContext(), nlep_casesOnRecordList, nlep_casesDetectedList, 1, "CasesOnRecord");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();


                btnOrange.setText(nlep_casesOnRecordList.get(1).getTotal_Cases_on_Record());
                btnBlue.setText(nlep_casesDetectedList.get(1).getTotal_New_Cases_Detected());
                btnLGreen.setText(nlep_grade2List.get(1).getTotal_Grade_II_Disability_G2D_cases_Percentage_in_New_Cases());
                btnGreen.setText(nlep_femaleCasesList.get(1).getTotal_No_of_Female_Cases_Percentage_in_New_cases());
                btnBrown.setText(nlep_childCasesList.get(1).getTotal_No_of_Child_Cases_Percentage_in_New_cases());
            }

            @Override
            public void onFailure(Call<NLEPData> call, Throwable t) {

            }
        });

        btnOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getApplicationContext(), nlep_casesOnRecordList, nlep_casesDetectedList, 1, "CasesOnRecord");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();

            }
        });

        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getApplicationContext(), nlep_casesOnRecordList, nlep_casesDetectedList, 1, "CasesDetected");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();

            }
        });
        btnLGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                familyPlaningRecviewCusFiveAdapter = new FamilyPlaningRecviewCusFiveAdapter(getApplicationContext(), nlep_grade2List, nlep_femaleCasesList, nlep_childCasesList, "nlep_grade2", 1);
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(familyPlaningRecviewCusFiveAdapter);
                familyPlaningRecviewCusFiveAdapter.notifyDataSetChanged();
            }
        });

        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                familyPlaningRecviewCusFiveAdapter = new FamilyPlaningRecviewCusFiveAdapter(getApplicationContext(), nlep_grade2List, nlep_femaleCasesList, nlep_childCasesList, "nlep_FemaleCases", 1);
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(familyPlaningRecviewCusFiveAdapter);
                familyPlaningRecviewCusFiveAdapter.notifyDataSetChanged();
            }
        });

        btnBrown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                familyPlaningRecviewCusFiveAdapter = new FamilyPlaningRecviewCusFiveAdapter(getApplicationContext(), nlep_grade2List, nlep_femaleCasesList, nlep_childCasesList, "nlep_ChildCases", 1);
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(familyPlaningRecviewCusFiveAdapter);
                familyPlaningRecviewCusFiveAdapter.notifyDataSetChanged();
            }
        });
    }
}
