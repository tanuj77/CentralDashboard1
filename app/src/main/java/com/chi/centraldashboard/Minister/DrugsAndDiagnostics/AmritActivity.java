package com.chi.centraldashboard.Minister.DrugsAndDiagnostics;

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

import com.chi.centraldashboard.apiCall.bin.MinisterAmritData;
import com.chi.centraldashboard.apiCall.bin.MinisterAmritDataList;
import com.chi.centraldashboard.apiCall.bin.MinisterAmritDrugsDispensed;
import com.chi.centraldashboard.apiCall.bin.MinisterAmritPatientsServed;
import com.chi.centraldashboard.apiCall.bin.MinisterAmritPharmacies;
import com.chi.centraldashboard.apiCall.bin.MinisterAmritSavingsPatients;
import com.chi.centraldashboard.others.ConnectionDetector;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AmritActivity extends MiDrugsAndDiagnostics {
    ConnectionDetector cd;

    Button  btnOrange, btnBlue, btnOrange2, btnBlue2;
    private RecyclerView recView;
    private AmritCusRecviewThreeAdapter amritCusRecviewAdapter;
    android.support.v7.widget.LinearLayoutManager mLayoutManager;
    private ApiInterface apiInterface;

    private List<MinisterAmritDataList> ministerAmritDataListList;
    private List<MinisterAmritPharmacies> ministerAmritPharmaciesList;
    private List<MinisterAmritPatientsServed> ministerAmritPatientsServedList;
    private List<MinisterAmritDrugsDispensed> ministerAmritDrugsDispensedList;
    private List<MinisterAmritSavingsPatients> ministerAmritSavingsPatientsList;

    Call<MinisterAmritData> ministerAmritDataCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_nhrrdata);

        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_drugsanddiagnosticsframe); //Remember this is the FrameLayout area within your activity_main.xml
        getLayoutInflater().inflate(R.layout.activity_amrit, contentFrameLayout);

        btnOrange = (Button) findViewById(R.id.btn_amorange);
        btnBlue = (Button) findViewById(R.id.btn_ambblue);
        btnOrange2 = (Button) findViewById(R.id.btn_amorange2);
        btnBlue2 = (Button) findViewById(R.id.btn_ambblue2);
        recView = (RecyclerView) findViewById(R.id.recview_amrit);

        apiInterface = ApiClient.getClient().create(ApiInterface.class);
        mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recView.setHasFixedSize(true);
        recView.setLayoutManager(mLayoutManager);

        ministerAmritDataListList = new ArrayList<>();
        ministerAmritPharmaciesList = new ArrayList<>();
        ministerAmritPatientsServedList = new ArrayList<>();
        ministerAmritDrugsDispensedList = new ArrayList<>();
        ministerAmritSavingsPatientsList = new ArrayList<>();

        ministerAmritDataCall = apiInterface.ministerAmritData();
        ministerAmritDataCall.enqueue(new Callback<MinisterAmritData>() {
            @Override
            public void onResponse(Call<MinisterAmritData> call, Response<MinisterAmritData> response) {
                ministerAmritDataListList.addAll(response.body().getMinisterAmritDataListList());
                ministerAmritPharmaciesList.addAll(ministerAmritDataListList.get(0).getMinisterAmritPharmaciesList());
                ministerAmritPatientsServedList.addAll(ministerAmritDataListList.get(0).getMinisterAmritPatientsServedList());
                ministerAmritDrugsDispensedList.addAll(ministerAmritDataListList.get(0).getMinisterAmritDrugsDispensedList());
                ministerAmritSavingsPatientsList.addAll(ministerAmritDataListList.get(0).getMinisterAmritSavingsPatientsList());

                amritCusRecviewAdapter = new AmritCusRecviewThreeAdapter(getApplicationContext(), ministerAmritPharmaciesList, ministerAmritPatientsServedList, ministerAmritDrugsDispensedList, ministerAmritSavingsPatientsList, "pharmacies");
                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(amritCusRecviewAdapter);
                amritCusRecviewAdapter.notifyDataSetChanged();

                btnOrange.setText(ministerAmritPharmaciesList.get(1).getTotal_number_of_pharmacies());
                btnBlue.setText(ministerAmritPatientsServedList.get(1).getTotal_Number_of_patients_served());
                btnOrange2.setText(ministerAmritDrugsDispensedList.get(1).getTotal_Value_of_drugs_dispensed());
                btnBlue2.setText(ministerAmritSavingsPatientsList.get(1).getTotal_Savings_to_the_patients());


            }

            @Override
            public void onFailure(Call<MinisterAmritData> call, Throwable t) {

            }
        });
        btnOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amritCusRecviewAdapter = new AmritCusRecviewThreeAdapter(getApplicationContext(), ministerAmritPharmaciesList, ministerAmritPatientsServedList, ministerAmritDrugsDispensedList, ministerAmritSavingsPatientsList, "pharmacies");
                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(amritCusRecviewAdapter);
                amritCusRecviewAdapter.notifyDataSetChanged();
            }
        });

        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amritCusRecviewAdapter = new AmritCusRecviewThreeAdapter(getApplicationContext(), ministerAmritPharmaciesList, ministerAmritPatientsServedList, ministerAmritDrugsDispensedList, ministerAmritSavingsPatientsList, "patientsServed");
                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(amritCusRecviewAdapter);
                amritCusRecviewAdapter.notifyDataSetChanged();
            }
        });

        btnOrange2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amritCusRecviewAdapter = new AmritCusRecviewThreeAdapter(getApplicationContext(), ministerAmritPharmaciesList, ministerAmritPatientsServedList, ministerAmritDrugsDispensedList, ministerAmritSavingsPatientsList, "drugsDispensed");
                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(amritCusRecviewAdapter);
                amritCusRecviewAdapter.notifyDataSetChanged();
            }
        });


        btnBlue2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amritCusRecviewAdapter = new AmritCusRecviewThreeAdapter(getApplicationContext(), ministerAmritPharmaciesList, ministerAmritPatientsServedList, ministerAmritDrugsDispensedList, ministerAmritSavingsPatientsList, "savingsPatients");
                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(amritCusRecviewAdapter);
                amritCusRecviewAdapter.notifyDataSetChanged();
            }
        });
    }
}
