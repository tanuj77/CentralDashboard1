package com.chi.centraldashboard.Minister.HealthServiceDelivery;

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
import com.chi.centraldashboard.apiCall.bin.ImmunizationCoverage;
import com.chi.centraldashboard.apiCall.bin.ImmunizationData;
import com.chi.centraldashboard.apiCall.bin.ImmunizationDataList;
import com.chi.centraldashboard.apiCall.bin.ImmunizationFirstDose;
import com.chi.centraldashboard.apiCall.bin.ImmunizationSecondDose;
import com.chi.centraldashboard.apiCall.bin.ImmunizationVaccineCoverage;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ImmunizationActivity extends MiHealthServiceDeliveryActivity {
    Button btnOrange, btnBlue, btnLGreen, btnGreen;

    private PMJAYCusRecViewThreeAdapter pmjayCusRecViewThreeAdapter;
    android.support.v7.widget.LinearLayoutManager mLayoutManager;
    private ApiInterface apiInterface;

    private List<ImmunizationDataList> immunizationDataListList;
    private List<ImmunizationCoverage> immunizationCoverageList;
    private List<ImmunizationVaccineCoverage> immunizationVaccineCoverageList;
    private List<ImmunizationFirstDose> immunizationFirstDoseList;
    private List<ImmunizationSecondDose> immunizationSecondDoseList;

    Call<ImmunizationData> immunizationDataCall;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_bloodbank);

        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_healthservicedeliveryframe); //Remember this is the FrameLayout area within your activity_main.xml
        getLayoutInflater().inflate(R.layout.activity_immunization, contentFrameLayout);

        btnOrange = (Button) findViewById(R.id.btn_imuborange);
        btnBlue = (Button) findViewById(R.id.btn_imubblue);
        btnLGreen = (Button) findViewById(R.id.btn_imulgreen);
        btnGreen = (Button) findViewById(R.id.btn_imugreen);

        recyclerView = (RecyclerView) findViewById(R.id.recview_immunization);

        mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(mLayoutManager);

        apiInterface = ApiClient.getClient().create(ApiInterface.class);

        immunizationDataListList = new ArrayList<>();
        immunizationCoverageList = new ArrayList<>();
        immunizationVaccineCoverageList = new ArrayList<>();
        immunizationFirstDoseList = new ArrayList<>();
        immunizationSecondDoseList = new ArrayList<>();

        immunizationDataCall = apiInterface.immunizationData();
        immunizationDataCall.enqueue(new Callback<ImmunizationData>() {
            @Override
            public void onResponse(Call<ImmunizationData> call, Response<ImmunizationData> response) {
                immunizationDataListList.addAll(response.body().getImmunizationDataListList());
                immunizationCoverageList.addAll(immunizationDataListList.get(0).getImmunizationCoverageList());
                immunizationVaccineCoverageList.addAll(immunizationDataListList.get(0).getImmunizationVaccineCoverageList());
                immunizationFirstDoseList.addAll(immunizationDataListList.get(0).getImmunizationFirstDoseList());
                immunizationSecondDoseList.addAll(immunizationDataListList.get(0).getImmunizationSecondDoseList());

                pmjayCusRecViewThreeAdapter = new PMJAYCusRecViewThreeAdapter(getApplicationContext(), immunizationCoverageList, immunizationVaccineCoverageList, immunizationFirstDoseList, immunizationSecondDoseList, "coverage", 1);
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pmjayCusRecViewThreeAdapter);
                pmjayCusRecViewThreeAdapter.notifyDataSetChanged();

                btnOrange.setText(immunizationCoverageList.get(1).getTotal_immunization_coverage());
                btnBlue.setText(immunizationVaccineCoverageList.get(1).getTotal_rotavirus_vaccine_coverage());
                btnLGreen.setText(immunizationFirstDoseList.get(1).getTotal_mrone_dose_coverage());
                btnGreen.setText(immunizationSecondDoseList.get(1).getTotal_mrsecond_dose_coverage());

            }

            @Override
            public void onFailure(Call<ImmunizationData> call, Throwable t) {

            }
        });

        btnOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pmjayCusRecViewThreeAdapter = new PMJAYCusRecViewThreeAdapter(getApplicationContext(), immunizationCoverageList, immunizationVaccineCoverageList, immunizationFirstDoseList, immunizationSecondDoseList, "coverage", 1);
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pmjayCusRecViewThreeAdapter);
                pmjayCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });

        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pmjayCusRecViewThreeAdapter = new PMJAYCusRecViewThreeAdapter(getApplicationContext(), immunizationCoverageList, immunizationVaccineCoverageList, immunizationFirstDoseList, immunizationSecondDoseList, "vaccinecoverage", 1);
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pmjayCusRecViewThreeAdapter);
                pmjayCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });

        btnLGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pmjayCusRecViewThreeAdapter = new PMJAYCusRecViewThreeAdapter(getApplicationContext(), immunizationCoverageList, immunizationVaccineCoverageList, immunizationFirstDoseList, immunizationSecondDoseList, "firstdose", 1);
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pmjayCusRecViewThreeAdapter);
                pmjayCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });

        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pmjayCusRecViewThreeAdapter = new PMJAYCusRecViewThreeAdapter(getApplicationContext(), immunizationCoverageList, immunizationVaccineCoverageList, immunizationFirstDoseList, immunizationSecondDoseList, "seconddose", 1);
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pmjayCusRecViewThreeAdapter);
                pmjayCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });


    }

}
