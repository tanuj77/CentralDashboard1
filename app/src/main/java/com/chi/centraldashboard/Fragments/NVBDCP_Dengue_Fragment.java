package com.chi.centraldashboard.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.chi.centraldashboard.Minister.Survillance.PbsCusRecViewThreeAdapter;
import com.chi.centraldashboard.R;
import com.chi.centraldashboard.apiCall.ApiClient;
import com.chi.centraldashboard.apiCall.ApiInterface;
import com.chi.centraldashboard.apiCall.bin.NVBDCP_DengueData;
import com.chi.centraldashboard.apiCall.bin.NVBDCP_DengueDataList;
import com.chi.centraldashboard.apiCall.bin.NVBDCP_Dengue_Deaths;
import com.chi.centraldashboard.apiCall.bin.NVBDCP_Dengue_Fatality;
import com.chi.centraldashboard.apiCall.bin.NVBDCP_Dengue_Sentinel;
import com.chi.centraldashboard.apiCall.bin.NVBDCP_Dengue_TotalCases;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NVBDCP_Dengue_Fragment extends Fragment {
    Button btnDetailedStatus, btnOrange, btnBlue, btnLgreen, btnGreen;
    RecyclerView recyclerView;
    private static RelativeLayout bottomLayout;
    android.support.v7.widget.LinearLayoutManager mLayoutManager;
    private ApiInterface apiInterface;
    PbsCusRecViewThreeAdapter pbsCusRecViewThreeAdapter;

    private List<NVBDCP_DengueDataList> nvbdcp_dengueDataListList;
    private List<NVBDCP_Dengue_TotalCases> nvbdcp_dengue_totalCasesList;
    private List<NVBDCP_Dengue_Deaths> nvbdcp_dengue_deathsList;
    private List<NVBDCP_Dengue_Sentinel> nvbdcp_dengue_sentinelList;
    private List<NVBDCP_Dengue_Fatality> nvbdcp_dengue_fatalityList;

    Call<NVBDCP_DengueData> nvbdcp_dengueDataCall;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_nvbdcp__dengue_, container, false);
        btnOrange = (Button) view.findViewById(R.id.btn_dengueorange);
        btnBlue = (Button) view.findViewById(R.id.btn_dengueblue);
        btnLgreen = (Button) view.findViewById(R.id.btn_denguelgreen);
        btnGreen = (Button) view.findViewById(R.id.btn_denguegreen);
        recyclerView = (RecyclerView) view.findViewById(R.id.rec_view_nvbdcpdengue);

        mLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(mLayoutManager);

        apiInterface = ApiClient.getClient().create(ApiInterface.class);

        nvbdcp_dengueDataListList = new ArrayList<>();
        nvbdcp_dengue_totalCasesList = new ArrayList<>();
        nvbdcp_dengue_deathsList = new ArrayList<>();
        nvbdcp_dengue_sentinelList = new ArrayList<>();
        nvbdcp_dengue_fatalityList = new ArrayList<>();
        nvbdcp_dengueDataCall = apiInterface.nvbdcp_DengueData();
        nvbdcp_dengueDataCall.enqueue(new Callback<NVBDCP_DengueData>() {
            @Override
            public void onResponse(Call<NVBDCP_DengueData> call, Response<NVBDCP_DengueData> response) {
                nvbdcp_dengueDataListList.addAll(response.body().getNvbdcp_dengueDataListList());
                nvbdcp_dengue_totalCasesList.addAll(nvbdcp_dengueDataListList.get(0).getNvbdcp_dengue_totalCasesList());
                nvbdcp_dengue_deathsList.addAll(nvbdcp_dengueDataListList.get(0).getNvbdcp_dengue_deathsList());
                nvbdcp_dengue_sentinelList.addAll(nvbdcp_dengueDataListList.get(0).getNvbdcp_dengue_sentinelList());
                nvbdcp_dengue_fatalityList.addAll(nvbdcp_dengueDataListList.get(0).getNvbdcp_dengue_fatalityList());

                recyclerView.setVisibility(View.VISIBLE);
                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getContext(), nvbdcp_dengue_totalCasesList, nvbdcp_dengue_deathsList, nvbdcp_dengue_sentinelList, nvbdcp_dengue_fatalityList, 1.25, "DengueTotalCases");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();

                btnOrange.setText(nvbdcp_dengue_totalCasesList.get(1).getTotal_NUMBER_OF_TOTAL_CASES());
                btnBlue.setText(nvbdcp_dengue_deathsList.get(1).getTotal_NUMBER_OF_DEATHS());
                btnLgreen.setText(nvbdcp_dengue_sentinelList.get(1).getTotal_NO_OF_SENTINEL_SITES());
                btnGreen.setText(nvbdcp_dengue_fatalityList.get(1).getTotal_CASE_FATALITY_RATE());

            }

            @Override
            public void onFailure(Call<NVBDCP_DengueData> call, Throwable t) {

            }
        });

        btnOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerView.setVisibility(View.VISIBLE);
                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getContext(), nvbdcp_dengue_totalCasesList, nvbdcp_dengue_deathsList, nvbdcp_dengue_sentinelList, nvbdcp_dengue_fatalityList, 1.25, "DengueTotalCases");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });

        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerView.setVisibility(View.VISIBLE);
                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getContext(), nvbdcp_dengue_totalCasesList, nvbdcp_dengue_deathsList, nvbdcp_dengue_sentinelList, nvbdcp_dengue_fatalityList, 1.25, "DengueDeath");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });

        btnLgreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerView.setVisibility(View.VISIBLE);
                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getContext(), nvbdcp_dengue_totalCasesList, nvbdcp_dengue_deathsList, nvbdcp_dengue_sentinelList, nvbdcp_dengue_fatalityList, 1.25, "DengueSentine");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });


        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerView.setVisibility(View.VISIBLE);
                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getContext(), nvbdcp_dengue_totalCasesList, nvbdcp_dengue_deathsList, nvbdcp_dengue_sentinelList, nvbdcp_dengue_fatalityList, 1.25, "DengueFatality");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });


        return view;
    }


}
