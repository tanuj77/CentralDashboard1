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

import com.chi.centraldashboard.apiCall.bin.NVBDCP_MalariaData;
import com.chi.centraldashboard.apiCall.bin.NVBDCP_MalariaDataList;
import com.chi.centraldashboard.apiCall.bin.NVBDCP_Malaria_Deaths;
import com.chi.centraldashboard.apiCall.bin.NVBDCP_Malaria_LLIN;
import com.chi.centraldashboard.apiCall.bin.NVBDCP_Malaria_PFCases;
import com.chi.centraldashboard.apiCall.bin.NVBDCP_Malaria_TotalCases;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NVBDCP_Malaria_Fragment extends Fragment {
    Button btnDetailedStatus, btnOrange, btnBlue, btnLgreen, btnGreen;
    RecyclerView recyclerView;
    private static RelativeLayout bottomLayout;
    android.support.v7.widget.LinearLayoutManager mLayoutManager;
    private ApiInterface apiInterface;
    PbsCusRecViewThreeAdapter pbsCusRecViewThreeAdapter;

    private List<NVBDCP_MalariaDataList> nvbdcp_malariaDataListList;
    private List<NVBDCP_Malaria_TotalCases> nvbdcp_malaria_totalCasesList;
    private List<NVBDCP_Malaria_PFCases> nvbdcp_malaria_pfCasesList;
    private List<NVBDCP_Malaria_Deaths> nvbdcp_malaria_deathsList;
    private List<NVBDCP_Malaria_LLIN> nvbdcp_malaria_llinList;

    Call<NVBDCP_MalariaData> nvbdcp_malariaDataCall;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_nvbdcp__malaria, container, false);

        btnOrange = (Button) view.findViewById(R.id.btn_orange);
        btnBlue = (Button) view.findViewById(R.id.btn_blue);
        btnLgreen = (Button) view.findViewById(R.id.btn_lgreen);
        btnGreen = (Button) view.findViewById(R.id.btn_green);
        recyclerView = (RecyclerView) view.findViewById(R.id.rec_view_nvbdcpmalaria);

        mLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(mLayoutManager);

        apiInterface = ApiClient.getClient().create(ApiInterface.class);
        nvbdcp_malariaDataListList = new ArrayList<>();
        nvbdcp_malaria_totalCasesList = new ArrayList<>();
        nvbdcp_malaria_pfCasesList = new ArrayList<>();
        nvbdcp_malaria_deathsList = new ArrayList<>();
        nvbdcp_malaria_llinList = new ArrayList<>();
        nvbdcp_malariaDataCall = apiInterface.nvbdcp_MalariaData();
        nvbdcp_malariaDataCall.enqueue(new Callback<NVBDCP_MalariaData>() {
            @Override
            public void onResponse(Call<NVBDCP_MalariaData> call, Response<NVBDCP_MalariaData> response) {

                nvbdcp_malariaDataListList.addAll(response.body().getNvbdcp_malariaDataListList());
                nvbdcp_malaria_totalCasesList.addAll(nvbdcp_malariaDataListList.get(0).getNvbdcp_malaria_totalCasesList());
                nvbdcp_malaria_pfCasesList.addAll(nvbdcp_malariaDataListList.get(0).getNvbdcp_malaria_pfCasesList());
                nvbdcp_malaria_deathsList.addAll(nvbdcp_malariaDataListList.get(0).getNvbdcp_malaria_deathsList());
                nvbdcp_malaria_llinList.addAll(nvbdcp_malariaDataListList.get(0).getNvbdcp_malaria_llinList());

                recyclerView.setVisibility(View.VISIBLE);
                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getContext(), nvbdcp_malaria_totalCasesList, nvbdcp_malaria_pfCasesList, nvbdcp_malaria_deathsList, nvbdcp_malaria_llinList, "MalariaTotalCases", 1);
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();

                btnOrange.setText(nvbdcp_malaria_totalCasesList.get(1).getNo_of_Total_Cases());
                btnBlue.setText(nvbdcp_malaria_pfCasesList.get(1).getTotal_NO_OF_PF_CASES());
                btnLgreen.setText(nvbdcp_malaria_deathsList.get(1).getTotal_No_of_Deaths());
                btnGreen.setText(nvbdcp_malaria_llinList.get(1).getTotal_LLIN_Distribution());
            }

            @Override
            public void onFailure(Call<NVBDCP_MalariaData> call, Throwable t) {

            }
        });
        btnOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerView.setVisibility(View.VISIBLE);

                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getContext(), nvbdcp_malaria_totalCasesList, nvbdcp_malaria_pfCasesList, nvbdcp_malaria_deathsList, nvbdcp_malaria_llinList, "MalariaTotalCases", 1);
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
                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getContext(), nvbdcp_malaria_totalCasesList, nvbdcp_malaria_pfCasesList, nvbdcp_malaria_deathsList, nvbdcp_malaria_llinList, "MalariaPFCases", 1);
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
                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getContext(), nvbdcp_malaria_totalCasesList, nvbdcp_malaria_pfCasesList, nvbdcp_malaria_deathsList, nvbdcp_malaria_llinList, "MalariaDeath", 1);
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });

        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerView.setVisibility(View.INVISIBLE);

                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getContext(), nvbdcp_malaria_totalCasesList, nvbdcp_malaria_pfCasesList, nvbdcp_malaria_deathsList, nvbdcp_malaria_llinList, "MalariaLlin", 1);
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });
        return view;
    }


}
