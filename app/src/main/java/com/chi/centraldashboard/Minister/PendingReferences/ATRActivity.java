package com.chi.centraldashboard.Minister.PendingReferences;

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
import com.chi.centraldashboard.apiCall.bin.MinisterAtrData;
import com.chi.centraldashboard.apiCall.bin.MinisterAtrDataList;
import com.chi.centraldashboard.apiCall.bin.MinisterAtrParliament;
import com.chi.centraldashboard.apiCall.bin.MinisterAtrPmo;
import com.chi.centraldashboard.apiCall.bin.MinisterAtrVip;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ATRActivity extends MiPendingReferences {
    Button btnOrange, btnBlue, btnGreen;
    private RecyclerView recView;

    android.support.v7.widget.LinearLayoutManager mLayoutManager;
    private ATRCusRecviewFourAdapter atrCusRecviewFourAdapter;
    private ApiInterface apiInterface;

    private List<MinisterAtrDataList> ministerAtrDataListList;
    private List<MinisterAtrPmo> ministerAtrPmoList;
    private List<MinisterAtrVip> ministerAtrVipList;
    private List<MinisterAtrParliament> ministerAtrParliamentList;

    Call<MinisterAtrData> ministerAtrDataCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_bloodbank);

        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_pendingreferencesframe); //Remember this is the FrameLayout area within your activity_main.xml
        getLayoutInflater().inflate(R.layout.activity_atr, contentFrameLayout);

        btnOrange = (Button) findViewById(R.id.btn_atrorange);
        btnBlue = (Button) findViewById(R.id.btn_atrblue);
        btnGreen = (Button) findViewById(R.id.btn_atrgreen);

        recView = (RecyclerView) findViewById(R.id.recview_atr);
        mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recView.setHasFixedSize(true);
        recView.setLayoutManager(mLayoutManager);

        apiInterface = ApiClient.getClient().create(ApiInterface.class);

        ministerAtrDataListList = new ArrayList<>();
        ministerAtrPmoList = new ArrayList<>();
        ministerAtrParliamentList = new ArrayList<>();
        ministerAtrVipList = new ArrayList<>();

        ministerAtrDataCall = apiInterface.ministerAtrData();
        ministerAtrDataCall.enqueue(new Callback<MinisterAtrData>() {
            @Override
            public void onResponse(Call<MinisterAtrData> call, Response<MinisterAtrData> response) {
                ministerAtrDataListList.addAll(response.body().getMinisterAtrDataListList());
                ministerAtrPmoList.addAll(ministerAtrDataListList.get(0).getMinisterAtrPmoList());
                ministerAtrParliamentList.addAll(ministerAtrDataListList.get(0).getMinisterAtrParliamentList());
                ministerAtrVipList.addAll(ministerAtrDataListList.get(0).getMinisterAtrVipList());

                atrCusRecviewFourAdapter = new ATRCusRecviewFourAdapter(getApplicationContext(), ministerAtrPmoList, ministerAtrParliamentList, ministerAtrVipList, "pmo");
                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(atrCusRecviewFourAdapter);
                atrCusRecviewFourAdapter.notifyDataSetChanged();

                btnOrange.setText(ministerAtrPmoList.get(1).getTotal_No_of_Pending_ATR_on_PMO_References());
                btnBlue.setText(ministerAtrVipList.get(1).getNo_of_VIP_References());
                btnGreen.setText(ministerAtrParliamentList.get(1).getTotal_Parliament_Assurances());
            }

            @Override
            public void onFailure(Call<MinisterAtrData> call, Throwable t) {

            }
        });
        btnOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                atrCusRecviewFourAdapter = new ATRCusRecviewFourAdapter(getApplicationContext(), ministerAtrPmoList, ministerAtrParliamentList, ministerAtrVipList, "pmo");
                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(atrCusRecviewFourAdapter);
                atrCusRecviewFourAdapter.notifyDataSetChanged();
            }
        });

        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                atrCusRecviewFourAdapter = new ATRCusRecviewFourAdapter(getApplicationContext(), ministerAtrPmoList, ministerAtrParliamentList, ministerAtrVipList, "vip");
                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(atrCusRecviewFourAdapter);
                atrCusRecviewFourAdapter.notifyDataSetChanged();
            }
        });

        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                atrCusRecviewFourAdapter = new ATRCusRecviewFourAdapter(getApplicationContext(), ministerAtrPmoList, ministerAtrParliamentList, ministerAtrVipList, "parliament");
                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(atrCusRecviewFourAdapter);
                atrCusRecviewFourAdapter.notifyDataSetChanged();
            }
        });
    }
}
