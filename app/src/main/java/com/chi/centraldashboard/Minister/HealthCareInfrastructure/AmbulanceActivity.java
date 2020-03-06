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
import com.chi.centraldashboard.apiCall.bin.Ambulance;
import com.chi.centraldashboard.apiCall.bin.AmbulanceALS;
import com.chi.centraldashboard.apiCall.bin.AmbulanceAvgALS;
import com.chi.centraldashboard.apiCall.bin.AmbulanceAvgBLS;
import com.chi.centraldashboard.apiCall.bin.AmbulanceBLS;
import com.chi.centraldashboard.apiCall.bin.AmbulanceDataList;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AmbulanceActivity extends MiHealthCareInfrastructureActivity {
    Button btnOrange, btnBlue, btnLGreen, btnGreen;
    private RecyclerView recView;
    private NHRRStatewiseCustomRecViewThreeAdapter nhrrStatewiseCustomRecViewAdapter;
    android.support.v7.widget.LinearLayoutManager mLayoutManager;
    private ApiInterface apiInterface;


    private List<AmbulanceDataList> ambulanceDataListList;
    private List<AmbulanceALS> ambulanceALSList;
    private List<AmbulanceBLS> ambulanceBLSList;
    private List<AmbulanceAvgALS> ambulanceAvgALSList;
    private List<AmbulanceAvgBLS> ambulanceAvgBLSList;

    Call<Ambulance> ambulance1Call;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_bloodbank);

        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_healthcareinfraframe); //Remember this is the FrameLayout area within your activity_main.xml
        getLayoutInflater().inflate(R.layout.activity_ambulance, contentFrameLayout);

        btnOrange = (Button) findViewById(R.id.btn_amborange);
        btnBlue = (Button) findViewById(R.id.btn_ambbblue);
        btnLGreen = (Button) findViewById(R.id.btn_amblgreen);
        btnGreen = (Button) findViewById(R.id.btn_ambgreen);

        recView = (RecyclerView) findViewById(R.id.recview_ambulance);
        mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recView.setHasFixedSize(true);
        recView.setLayoutManager(mLayoutManager);

        apiInterface = ApiClient.getClient().create(ApiInterface.class);

        ambulanceDataListList = new ArrayList<>();
        ambulanceALSList = new ArrayList<>();
        ambulanceBLSList = new ArrayList<>();
        ambulanceAvgALSList = new ArrayList<>();
        ambulanceAvgBLSList = new ArrayList<>();


        ambulance1Call = apiInterface.ambulance();
        ambulance1Call.enqueue(new Callback<Ambulance>() {
            @Override
            public void onResponse(Call<Ambulance> call, Response<Ambulance> response) {
                ambulanceDataListList.addAll(response.body().getAmbulanceDataListList());
                ambulanceALSList.addAll(ambulanceDataListList.get(0).getAmbulanceALSList());
                ambulanceBLSList.addAll(ambulanceDataListList.get(0).getAmbulanceBLSList());
                ambulanceAvgALSList.addAll(ambulanceDataListList.get(0).getAmbulanceAvgALSList());
                ambulanceAvgBLSList.addAll(ambulanceDataListList.get(0).getAmbulanceAvgBLSList());

                nhrrStatewiseCustomRecViewAdapter = new NHRRStatewiseCustomRecViewThreeAdapter(getApplicationContext(), ambulanceALSList, ambulanceBLSList, ambulanceAvgALSList, ambulanceAvgBLSList, "als");

                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(nhrrStatewiseCustomRecViewAdapter);
                nhrrStatewiseCustomRecViewAdapter.notifyDataSetChanged();

                btnOrange.setText(ambulanceALSList.get(1).getTotal_Advanced_Life_Support_ALS_Ambulances_Operational_against_Required());
                btnBlue.setText(ambulanceBLSList.get(1).getTotal_Basic_Life_Support_BLS_Ambulances_Operational_against_Required());
                btnLGreen.setText(ambulanceAvgALSList.get(1).getKpi_Average_response_time_call_to_scene_ALS_min_sec());
                btnGreen.setText(ambulanceAvgBLSList.get(1).getKpi_Average_response_time_call_to_scene_BLS_min_sec());
            }

            @Override
            public void onFailure(Call<Ambulance> call, Throwable t) {

            }
        });

        btnOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nhrrStatewiseCustomRecViewAdapter = new NHRRStatewiseCustomRecViewThreeAdapter(getApplicationContext(), ambulanceALSList, ambulanceBLSList, ambulanceAvgALSList, ambulanceAvgBLSList, "als");

                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(nhrrStatewiseCustomRecViewAdapter);
                nhrrStatewiseCustomRecViewAdapter.notifyDataSetChanged();

            }
        });


        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nhrrStatewiseCustomRecViewAdapter = new NHRRStatewiseCustomRecViewThreeAdapter(getApplicationContext(), ambulanceALSList, ambulanceBLSList, ambulanceAvgALSList, ambulanceAvgBLSList, "bls");

                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(nhrrStatewiseCustomRecViewAdapter);
                nhrrStatewiseCustomRecViewAdapter.notifyDataSetChanged();

            }
        });


        btnLGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nhrrStatewiseCustomRecViewAdapter = new NHRRStatewiseCustomRecViewThreeAdapter(getApplicationContext(), ambulanceALSList, ambulanceBLSList, ambulanceAvgALSList, ambulanceAvgBLSList, "avgals");

                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(nhrrStatewiseCustomRecViewAdapter);
                nhrrStatewiseCustomRecViewAdapter.notifyDataSetChanged();

            }
        });

        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nhrrStatewiseCustomRecViewAdapter = new NHRRStatewiseCustomRecViewThreeAdapter(getApplicationContext(), ambulanceALSList, ambulanceBLSList, ambulanceAvgALSList, ambulanceAvgBLSList, "avgbls");

                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(nhrrStatewiseCustomRecViewAdapter);
                nhrrStatewiseCustomRecViewAdapter.notifyDataSetChanged();

            }
        });

    }
}
