package com.chi.centraldashboard.Minister.HumanResouces;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.chi.centraldashboard.Minister.Survillance.NCDCCusRecviewFourAdapter;
import com.chi.centraldashboard.R;
import com.chi.centraldashboard.apiCall.ApiClient;
import com.chi.centraldashboard.apiCall.ApiInterface;
import com.chi.centraldashboard.apiCall.bin.HRData;
import com.chi.centraldashboard.apiCall.bin.HRDataList;
import com.chi.centraldashboard.apiCall.bin.HRMedicalOfficerNRHM;
import com.chi.centraldashboard.apiCall.bin.HRMedicalOfficerNUHM;
import com.chi.centraldashboard.apiCall.bin.HRStaffNurseNRHM;
import com.chi.centraldashboard.apiCall.bin.HRStaffNurseNUHM;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HRActivity extends MiHumanResource {


    Button btnOrange, btnBlue, btnLGreen, btnGreen, btnBrown;

    private NCDCCusRecviewFourAdapter ncdcCusRecviewFourAdapter;
    android.support.v7.widget.LinearLayoutManager mLayoutManager;
    private ApiInterface apiInterface;

    private RecyclerView recyclerView;

    Call<HRData> hrDataCall;

    private List<HRDataList> hrDataListList;
    private List<HRMedicalOfficerNRHM> hrMedicalOfficerNRHMList;
    private List<HRStaffNurseNRHM> hrStaffNurseNRHMList;
    private List<HRMedicalOfficerNUHM> hrMedicalOfficerNUHMList;
    private List<HRStaffNurseNUHM> hrStaffNurseNUHMList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_hr);

        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_hrframe); //Remember this is the FrameLayout area within your activity_main.xml
        getLayoutInflater().inflate(R.layout.activity_hr, contentFrameLayout);

        btnOrange = (Button) findViewById(R.id.btn_hrorange);
        btnBlue = (Button) findViewById(R.id.btn_hrblue);
        btnLGreen = (Button) findViewById(R.id.btn_hrlgreen);
        btnGreen = (Button) findViewById(R.id.btn_hrgreen);


        recyclerView = (RecyclerView) findViewById(R.id.recview_hr);

        mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(mLayoutManager);

        apiInterface = ApiClient.getClient().create(ApiInterface.class);
        hrDataListList = new ArrayList<>();
        hrMedicalOfficerNRHMList = new ArrayList<>();
        hrStaffNurseNRHMList = new ArrayList<>();
        hrMedicalOfficerNUHMList = new ArrayList<>();
        hrStaffNurseNUHMList = new ArrayList<>();
        hrDataCall = apiInterface.hrData();
        hrDataCall.enqueue(new Callback<HRData>() {
            @Override
            public void onResponse(Call<HRData> call, Response<HRData> response) {
                hrDataListList.addAll(response.body().getHrDataListList());
                hrMedicalOfficerNRHMList.addAll(hrDataListList.get(0).getHrMedicalOfficerNRHMList());
                hrStaffNurseNRHMList.addAll(hrDataListList.get(0).getHrStaffNurseNRHMList());
                hrMedicalOfficerNUHMList.addAll(hrDataListList.get(0).getHrMedicalOfficerNUHMList());
                hrStaffNurseNUHMList.addAll(hrDataListList.get(0).getHrStaffNurseNUHMList());

                ncdcCusRecviewFourAdapter = new NCDCCusRecviewFourAdapter(getApplicationContext(), hrMedicalOfficerNRHMList, hrStaffNurseNRHMList, hrMedicalOfficerNUHMList, hrStaffNurseNUHMList, "MedicalOfficerNRHM", 1);
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(ncdcCusRecviewFourAdapter);
                ncdcCusRecviewFourAdapter.notifyDataSetChanged();


                btnOrange.setText(hrMedicalOfficerNRHMList.get(1).getTotal_vacancies());
                btnBlue.setText(hrStaffNurseNRHMList.get(1).getTotal_staffnurse_NRHM());
                btnLGreen.setText(hrMedicalOfficerNUHMList.get(1).getTotal_medicalofficer_NUHM());
                btnGreen.setText(hrStaffNurseNUHMList.get(1).getTotal_staffnurse_NUHM());
            }

            @Override
            public void onFailure(Call<HRData> call, Throwable t) {

            }
        });
        btnOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ncdcCusRecviewFourAdapter = new NCDCCusRecviewFourAdapter(getApplicationContext(), hrMedicalOfficerNRHMList, hrStaffNurseNRHMList, hrMedicalOfficerNUHMList, hrStaffNurseNUHMList, "MedicalOfficerNRHM", 1);
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(ncdcCusRecviewFourAdapter);
                ncdcCusRecviewFourAdapter.notifyDataSetChanged();
            }
        });

        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ncdcCusRecviewFourAdapter = new NCDCCusRecviewFourAdapter(getApplicationContext(), hrMedicalOfficerNRHMList, hrStaffNurseNRHMList, hrMedicalOfficerNUHMList, hrStaffNurseNUHMList, "StaffNurseNRHM", 1);
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(ncdcCusRecviewFourAdapter);
                ncdcCusRecviewFourAdapter.notifyDataSetChanged();
            }
        });

        btnLGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ncdcCusRecviewFourAdapter = new NCDCCusRecviewFourAdapter(getApplicationContext(), hrMedicalOfficerNRHMList, hrStaffNurseNRHMList, hrMedicalOfficerNUHMList, hrStaffNurseNUHMList, "MedicalOfficerNUHM", 1);
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(ncdcCusRecviewFourAdapter);
                ncdcCusRecviewFourAdapter.notifyDataSetChanged();
            }
        });

        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ncdcCusRecviewFourAdapter = new NCDCCusRecviewFourAdapter(getApplicationContext(), hrMedicalOfficerNRHMList, hrStaffNurseNRHMList, hrMedicalOfficerNUHMList, hrStaffNurseNUHMList, "StaffNurseNUHM", 1);
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(ncdcCusRecviewFourAdapter);
                ncdcCusRecviewFourAdapter.notifyDataSetChanged();
            }
        });
    }
}
