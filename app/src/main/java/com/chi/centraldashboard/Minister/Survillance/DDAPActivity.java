package com.chi.centraldashboard.Minister.Survillance;

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
import com.chi.centraldashboard.apiCall.bin.DDAPData;
import com.chi.centraldashboard.apiCall.bin.DDAPDataList;
import com.chi.centraldashboard.apiCall.bin.DDAPFollowUp;
import com.chi.centraldashboard.apiCall.bin.DDAPIPD;
import com.chi.centraldashboard.apiCall.bin.DDAPNewReg;
import com.chi.centraldashboard.apiCall.bin.DDAPPatients;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DDAPActivity extends MiSurvillanceActivity {
    Button btnOrange, btnBlue, btnLGreen, btnGreen, btnBrown, btnRed;
    android.support.v7.widget.LinearLayoutManager mLayoutManager;
    private ApiInterface apiInterface;
    private RecyclerView recyclerView;
    NCDCCusRecviewFourAdapter ncdcCusRecviewFourAdapter;

    private List<DDAPDataList> ddapDataListList;
    private List<DDAPNewReg> ddapNewRegList;
    private List<DDAPFollowUp> ddapFollowUpList;
    private List<DDAPIPD> ddapipdList;
    private List<DDAPPatients> ddapPatientsList;

    Call<DDAPData> ddapDataCall;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_bloodbank);

        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_survillanceframe); //Remember this is the FrameLayout area within your activity_main.xml
        getLayoutInflater().inflate(R.layout.activity_ddap, contentFrameLayout);

        btnOrange = (Button) findViewById(R.id.btn_ddaporange);
        btnBlue = (Button) findViewById(R.id.btn_ddapblue);
        btnLGreen = (Button) findViewById(R.id.btn_ddaplgreen);
        btnGreen = (Button) findViewById(R.id.btn_ddapgreen);


        recyclerView = (RecyclerView) findViewById(R.id.recview_ddap);

        mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(mLayoutManager);

        apiInterface = ApiClient.getClient().create(ApiInterface.class);
        ddapDataListList = new ArrayList<>();
        ddapNewRegList = new ArrayList<>();
        ddapFollowUpList = new ArrayList<>();
        ddapipdList = new ArrayList<>();
        ddapPatientsList = new ArrayList<>();
        ddapDataCall = apiInterface.ddapData();
        ddapDataCall.enqueue(new Callback<DDAPData>() {
            @Override
            public void onResponse(Call<DDAPData> call, Response<DDAPData> response) {
                ddapDataListList.addAll(response.body().getDdapDataListList());
                ddapNewRegList.addAll(ddapDataListList.get(0).getDdapNewRegList());
                ddapFollowUpList.addAll(ddapDataListList.get(0).getDdapFollowUpList());
                ddapipdList.addAll(ddapDataListList.get(0).getDdapipdList());
                ddapPatientsList.addAll(ddapDataListList.get(0).getDdapPatientsList());

                ncdcCusRecviewFourAdapter = new NCDCCusRecviewFourAdapter(getApplicationContext(), ddapNewRegList, ddapFollowUpList, ddapipdList, ddapPatientsList, "NewReg");
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(ncdcCusRecviewFourAdapter);
                ncdcCusRecviewFourAdapter.notifyDataSetChanged();

                btnOrange.setText(ddapNewRegList.get(1).getTotal_Number_of_New_Registrations());
                btnBlue.setText(ddapFollowUpList.get(1).getTotal_Number_of_Follow_up());
                btnLGreen.setText(ddapipdList.get(1).getTotal_No_of_Patients_IPD());
                btnGreen.setText(ddapPatientsList.get(1).getTotal_Number_of_Patients());
            }

            @Override
            public void onFailure(Call<DDAPData> call, Throwable t) {

            }
        });
        btnOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ncdcCusRecviewFourAdapter = new NCDCCusRecviewFourAdapter(getApplicationContext(), ddapNewRegList, ddapFollowUpList, ddapipdList, ddapPatientsList, "NewReg");
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(ncdcCusRecviewFourAdapter);
                ncdcCusRecviewFourAdapter.notifyDataSetChanged();
            }
        });

        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ncdcCusRecviewFourAdapter = new NCDCCusRecviewFourAdapter(getApplicationContext(), ddapNewRegList, ddapFollowUpList, ddapipdList, ddapPatientsList, "FollowUp");
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(ncdcCusRecviewFourAdapter);
                ncdcCusRecviewFourAdapter.notifyDataSetChanged();
            }
        });


        btnLGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ncdcCusRecviewFourAdapter = new NCDCCusRecviewFourAdapter(getApplicationContext(), ddapNewRegList, ddapFollowUpList, ddapipdList, ddapPatientsList, "IPD");
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(ncdcCusRecviewFourAdapter);
                ncdcCusRecviewFourAdapter.notifyDataSetChanged();
            }
        });

        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ncdcCusRecviewFourAdapter = new NCDCCusRecviewFourAdapter(getApplicationContext(), ddapNewRegList, ddapFollowUpList, ddapipdList, ddapPatientsList, "Patients");
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(ncdcCusRecviewFourAdapter);
                ncdcCusRecviewFourAdapter.notifyDataSetChanged();
            }
        });
    }
}
