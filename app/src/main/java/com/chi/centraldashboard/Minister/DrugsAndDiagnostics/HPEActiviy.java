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
import com.chi.centraldashboard.apiCall.bin.HPEAmountReceived;
import com.chi.centraldashboard.apiCall.bin.HPEData;
import com.chi.centraldashboard.apiCall.bin.HPEDataList;
import com.chi.centraldashboard.apiCall.bin.HPEHospitals;
import com.chi.centraldashboard.apiCall.bin.HPELabs;
import com.chi.centraldashboard.apiCall.bin.HPEPMC;
import com.chi.centraldashboard.apiCall.bin.HPEPharmaRetail;
import com.chi.centraldashboard.apiCall.bin.HPEProducts;
import com.chi.centraldashboard.others.ConnectionDetector;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HPEActiviy extends MiDrugsAndDiagnostics {
    ConnectionDetector cd;

    Button btnOrange, btnBlue, btnLGreen, btnGreen, btnBrown, btnRed;
    private RecyclerView recView;
    private HPECusREcviewFiveAdapter hpeCusREcviewFiveAdapter;
    android.support.v7.widget.LinearLayoutManager mLayoutManager;
    private ApiInterface apiInterface;

    private List<HPEDataList> hpeDataListList;
    private List<HPEProducts> hpeProductsList;
    private List<HPEAmountReceived> hpeAmountReceivedList;
    private List<HPEPharmaRetail> hpePharmaRetailList;
    private List<HPELabs> hpeLabsList;
    private List<HPEHospitals> hpeHospitalsList;
    private List<HPEPMC> hpepmcList;

    Call<HPEData> hpeDataCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_nhrrdata);

        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_drugsanddiagnosticsframe); //Remember this is the FrameLayout area within your activity_main.xml
        getLayoutInflater().inflate(R.layout.activity_hpe, contentFrameLayout);


        btnOrange = (Button) findViewById(R.id.btn_hpeorange);
        btnBlue = (Button) findViewById(R.id.btn_hpeblue);
        btnLGreen = (Button) findViewById(R.id.btn_hpelgreen);
        btnGreen = (Button) findViewById(R.id.btn_hpegreen);
        btnBrown = (Button) findViewById(R.id.btn_hpebrown);
        btnRed = (Button) findViewById(R.id.btn_hpered);
        recView = (RecyclerView) findViewById(R.id.recview_hpe);

        apiInterface = ApiClient.getClient().create(ApiInterface.class);
        mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recView.setHasFixedSize(true);
        recView.setLayoutManager(mLayoutManager);


        hpeDataListList = new ArrayList<>();
        hpeProductsList = new ArrayList<>();
        hpeAmountReceivedList = new ArrayList<>();
        hpePharmaRetailList = new ArrayList<>();
        hpeLabsList = new ArrayList<>();
        hpeHospitalsList = new ArrayList<>();
        hpepmcList = new ArrayList<>();
        hpeDataCall = apiInterface.hpeData();
        hpeDataCall.enqueue(new Callback<HPEData>() {
            @Override
            public void onResponse(Call<HPEData> call, Response<HPEData> response) {
                hpeDataListList.addAll(response.body().getHpeDataListList());
                hpeProductsList.addAll(hpeDataListList.get(0).getHpeProductsList());
                hpeAmountReceivedList.addAll(hpeDataListList.get(0).getHpeAmountReceivedList());
                hpePharmaRetailList.addAll(hpeDataListList.get(0).getHpePharmaRetailList());
                hpeLabsList.addAll(hpeDataListList.get(0).getHpeLabsList());
                hpeHospitalsList.addAll(hpeDataListList.get(0).getHpeHospitalsList());
                hpepmcList.addAll(hpeDataListList.get(0).getHpepmcList());

                hpeCusREcviewFiveAdapter = new HPECusREcviewFiveAdapter(getApplicationContext(), hpeProductsList, hpeAmountReceivedList, hpePharmaRetailList, hpeLabsList, hpeHospitalsList, hpepmcList, "Product");
                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(hpeCusREcviewFiveAdapter);
                hpeCusREcviewFiveAdapter.notifyDataSetChanged();

                btnOrange.setText(hpeProductsList.get(1).getTotal_Number_of_Products());
                btnBlue.setText(hpeAmountReceivedList.get(1).getTotal_Amount_received_during_the_month_in_Lakh());
                btnLGreen.setText(hpePharmaRetailList.get(1).getTotal_Number_of_Pharma_Retail_Outlets());
                btnGreen.setText(hpeLabsList.get(1).getTotal_Number_of_Labs());
                btnBrown.setText(hpeHospitalsList.get(1).getTotal_Number_of_Hospitals());
                btnRed.setText(hpepmcList.get(1).getTotal_Number_of_Projects_in_Hand_PMC());
            }

            @Override
            public void onFailure(Call<HPEData> call, Throwable t) {

            }
        });
        btnOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hpeCusREcviewFiveAdapter = new HPECusREcviewFiveAdapter(getApplicationContext(), hpeProductsList, hpeAmountReceivedList, hpePharmaRetailList, hpeLabsList, hpeHospitalsList, hpepmcList, "Product");
                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(hpeCusREcviewFiveAdapter);
                hpeCusREcviewFiveAdapter.notifyDataSetChanged();
            }
        });
        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hpeCusREcviewFiveAdapter = new HPECusREcviewFiveAdapter(getApplicationContext(), hpeProductsList, hpeAmountReceivedList, hpePharmaRetailList, hpeLabsList, hpeHospitalsList, hpepmcList, "AmountReceived");
                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(hpeCusREcviewFiveAdapter);
                hpeCusREcviewFiveAdapter.notifyDataSetChanged();
            }
        });

        btnLGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hpeCusREcviewFiveAdapter = new HPECusREcviewFiveAdapter(getApplicationContext(), hpeProductsList, hpeAmountReceivedList, hpePharmaRetailList, hpeLabsList, hpeHospitalsList, hpepmcList, "PharmaRetail");
                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(hpeCusREcviewFiveAdapter);
                hpeCusREcviewFiveAdapter.notifyDataSetChanged();
            }
        });

        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hpeCusREcviewFiveAdapter = new HPECusREcviewFiveAdapter(getApplicationContext(), hpeProductsList, hpeAmountReceivedList, hpePharmaRetailList, hpeLabsList, hpeHospitalsList, hpepmcList, "Labs");
                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(hpeCusREcviewFiveAdapter);
                hpeCusREcviewFiveAdapter.notifyDataSetChanged();
            }
        });
        btnBrown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hpeCusREcviewFiveAdapter = new HPECusREcviewFiveAdapter(getApplicationContext(), hpeProductsList, hpeAmountReceivedList, hpePharmaRetailList, hpeLabsList, hpeHospitalsList, hpepmcList, "Hospital");
                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(hpeCusREcviewFiveAdapter);
                hpeCusREcviewFiveAdapter.notifyDataSetChanged();
            }
        });

        btnRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hpeCusREcviewFiveAdapter = new HPECusREcviewFiveAdapter(getApplicationContext(), hpeProductsList, hpeAmountReceivedList, hpePharmaRetailList, hpeLabsList, hpeHospitalsList, hpepmcList, "PMC");
                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(hpeCusREcviewFiveAdapter);
                hpeCusREcviewFiveAdapter.notifyDataSetChanged();
            }
        });

    }
}
