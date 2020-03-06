package com.chi.centraldashboard.Minister.HealthCareInfrastructure;

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
import com.chi.centraldashboard.apiCall.bin.MinisterDialysisData;
import com.chi.centraldashboard.apiCall.bin.MinisterDialysisDataList;
import com.chi.centraldashboard.apiCall.bin.MinisterDialysisDistrict;
import com.chi.centraldashboard.apiCall.bin.MinisterDialysisPMNDP;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DialysisActivity extends MiHealthCareInfrastructureActivity {
    Button btnOrange, btnBlue;
    private RecyclerView recView;
    DialysisCusRecviewFourAdapter dialysisCusRecviewAdapter;
    android.support.v7.widget.LinearLayoutManager mLayoutManager;
    private ApiInterface apiInterface;
    Call<MinisterDialysisData> ministerDialysisDataCall;

    private List<MinisterDialysisDataList> ministerDialysisDataListList;
    private List<MinisterDialysisDistrict> ministerDialysisDistrictList;
    private List<MinisterDialysisPMNDP> ministerDialysisPMNDPList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_dialysis);
        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_healthcareinfraframe); //Remember this is the FrameLayout area within your activity_main.xml
        getLayoutInflater().inflate(R.layout.activity_dialysis, contentFrameLayout);


        btnOrange = (Button) findViewById(R.id.btn_orange);
        btnBlue = (Button) findViewById(R.id.btn_blue);

        recView = (RecyclerView) findViewById(R.id.recview_dialysis);
        mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recView.setHasFixedSize(true);
        recView.setLayoutManager(mLayoutManager);

        apiInterface = ApiClient.getClient().create(ApiInterface.class);

        ministerDialysisDataListList = new ArrayList<>();
        ministerDialysisDistrictList = new ArrayList<>();
        ministerDialysisPMNDPList = new ArrayList<>();

        ministerDialysisDataCall = apiInterface.ministerDialysisData();
        ministerDialysisDataCall.enqueue(new Callback<MinisterDialysisData>() {
            @Override
            public void onResponse(Call<MinisterDialysisData> call, Response<MinisterDialysisData> response) {
                ministerDialysisDataListList.addAll(response.body().getMinisterDialysisDataListList());
                ministerDialysisDistrictList.addAll(ministerDialysisDataListList.get(0).getMinisterDialysisDistrictList());
                ministerDialysisPMNDPList.addAll(ministerDialysisDataListList.get(0).getMinisterDialysisPMNDPList());


                dialysisCusRecviewAdapter = new DialysisCusRecviewFourAdapter(getApplicationContext(), ministerDialysisDistrictList, ministerDialysisPMNDPList, "ddistrict");
                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(dialysisCusRecviewAdapter);
                dialysisCusRecviewAdapter.notifyDataSetChanged();

                btnOrange.setText(ministerDialysisDistrictList.get(1).getTotal_No_of_districts_with_functional_dialysis_units_against_the_total_districts());
                btnBlue.setText(ministerDialysisPMNDPList.get(1).getNo_of_patients_receiving_treatment_sessions_held_under_PMNDP());


            }

            @Override
            public void onFailure(Call<MinisterDialysisData> call, Throwable t) {

            }
        });
        btnOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialysisCusRecviewAdapter = new DialysisCusRecviewFourAdapter(getApplicationContext(), ministerDialysisDistrictList, ministerDialysisPMNDPList, "ddistrict");
                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(dialysisCusRecviewAdapter);
                dialysisCusRecviewAdapter.notifyDataSetChanged();
            }
        });

btnBlue.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        dialysisCusRecviewAdapter = new DialysisCusRecviewFourAdapter(getApplicationContext(), ministerDialysisDistrictList, ministerDialysisPMNDPList, "dPMNDP");
        recView.setLayoutManager(mLayoutManager);
        recView.setItemAnimator(new DefaultItemAnimator());
        recView.setAdapter(dialysisCusRecviewAdapter);
        dialysisCusRecviewAdapter.notifyDataSetChanged();
    }
});
    }
}
