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
import com.chi.centraldashboard.apiCall.bin.FRU10CSection;
import com.chi.centraldashboard.apiCall.bin.FRU5CSection;
import com.chi.centraldashboard.apiCall.bin.FRUData;
import com.chi.centraldashboard.apiCall.bin.FRUDataList;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FRUActivity extends MiHealthCareInfrastructureActivity {
    Button btnOrange, btnBlue;
    private RecyclerView recView;
    private BloodBankCusRecviewFourAdapter bloodBankCusRecviewAdapter;
    android.support.v7.widget.LinearLayoutManager mLayoutManager;
    private ApiInterface apiInterface;

    private List<FRUDataList> fruDataListList;
    private List<FRU5CSection> fru5CSectionList;
    private List<FRU10CSection> fru10CSectionList;

    Call<FRUData> fruDataCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_bloodbank);

        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_healthcareinfraframe); //Remember this is the FrameLayout area within your activity_main.xml
        getLayoutInflater().inflate(R.layout.activity_fru, contentFrameLayout);

        btnOrange = (Button) findViewById(R.id.btn_fruorange);
        btnBlue = (Button) findViewById(R.id.btn_frublue);

        recView = (RecyclerView) findViewById(R.id.recview_fru);
        mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recView.setHasFixedSize(true);
        recView.setLayoutManager(mLayoutManager);

        apiInterface = ApiClient.getClient().create(ApiInterface.class);

        fruDataListList = new ArrayList<>();
        fru5CSectionList = new ArrayList<>();
        fru10CSectionList = new ArrayList<>();

        fruDataCall = apiInterface.fruData();
        fruDataCall.enqueue(new Callback<FRUData>() {
            @Override
            public void onResponse(Call<FRUData> call, Response<FRUData> response) {
                fruDataListList.addAll(response.body().getFruDataListList());
                fru5CSectionList.addAll(fruDataListList.get(0).getFru5CSectionList());
                fru10CSectionList.addAll(fruDataListList.get(0).getFru10CSectionList());

                bloodBankCusRecviewAdapter = new BloodBankCusRecviewFourAdapter(getApplicationContext(), fru5CSectionList, fru10CSectionList, 5);

                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(bloodBankCusRecviewAdapter);
                bloodBankCusRecviewAdapter.notifyDataSetChanged();


                btnOrange.setText(fru5CSectionList.get(1).getFrus5c());
                btnBlue.setText(fru10CSectionList.get(1).getFrus_10c_Section());
            }

            @Override
            public void onFailure(Call<FRUData> call, Throwable t) {

            }
        });
        btnOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bloodBankCusRecviewAdapter = new BloodBankCusRecviewFourAdapter(getApplicationContext(), fru5CSectionList, fru10CSectionList, 5);

                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(bloodBankCusRecviewAdapter);
                bloodBankCusRecviewAdapter.notifyDataSetChanged();

            }
        });


        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bloodBankCusRecviewAdapter = new BloodBankCusRecviewFourAdapter(getApplicationContext(), fru5CSectionList, fru10CSectionList, 10);

                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(bloodBankCusRecviewAdapter);
                bloodBankCusRecviewAdapter.notifyDataSetChanged();

            }
        });
    }
}
