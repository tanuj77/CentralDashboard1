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
import com.chi.centraldashboard.apiCall.bin.NVBDCP_KalaazarData;
import com.chi.centraldashboard.apiCall.bin.NVBDCP_KalaazarDataList;
import com.chi.centraldashboard.apiCall.bin.NVBDCP_Kalaazar_Deaths;
import com.chi.centraldashboard.apiCall.bin.NVBDCP_Kalaazar_PFCases;
import com.chi.centraldashboard.apiCall.bin.NVBDCP_Kalaazar_TotalCases;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class NVBDCP_kalaazar_Fragment extends Fragment {

    Button btnDetailedStatus, btnOrange, btnBlue, btnLgreen;
    RecyclerView recyclerView;
    private static RelativeLayout bottomLayout;
    android.support.v7.widget.LinearLayoutManager mLayoutManager;
    private ApiInterface apiInterface;
    PbsCusRecViewThreeAdapter pbsCusRecViewThreeAdapter;

    private List<NVBDCP_KalaazarDataList> nvbdcp_kalaazarDataListList;
    private List<NVBDCP_Kalaazar_TotalCases> nvbdcp_kalaazar_totalCasesList;
    private List<NVBDCP_Kalaazar_PFCases> nvbdcp_kalaazar_pfCasesList;
    private List<NVBDCP_Kalaazar_Deaths> nvbdcp_kalaazar_deathsList;

    Call<NVBDCP_KalaazarData> nvbdcp_kalaazarDataCall;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_nvbdcp_kalaazar_, container, false);

        btnOrange = (Button) view.findViewById(R.id.btn_kalaazarorange);
        btnBlue = (Button) view.findViewById(R.id.btn_kalaazarblue);
        btnLgreen = (Button) view.findViewById(R.id.btn_kalaazargreen);


        recyclerView = (RecyclerView) view.findViewById(R.id.recview_kalaazar);

        mLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(mLayoutManager);

        apiInterface = ApiClient.getClient().create(ApiInterface.class);

        nvbdcp_kalaazarDataListList = new ArrayList<>();
        nvbdcp_kalaazar_totalCasesList = new ArrayList<>();
        nvbdcp_kalaazar_pfCasesList = new ArrayList<>();
        nvbdcp_kalaazar_deathsList = new ArrayList<>();
        nvbdcp_kalaazarDataCall = apiInterface.nvbdcp_KalaazarData();
        nvbdcp_kalaazarDataCall.enqueue(new Callback<NVBDCP_KalaazarData>() {
            @Override
            public void onResponse(Call<NVBDCP_KalaazarData> call, Response<NVBDCP_KalaazarData> response) {
                nvbdcp_kalaazarDataListList.addAll(response.body().getNvbdcp_kalaazarDataListList());
                nvbdcp_kalaazar_totalCasesList.addAll(nvbdcp_kalaazarDataListList.get(0).getNvbdcp_kalaazar_totalCasesList());
                nvbdcp_kalaazar_pfCasesList.addAll(nvbdcp_kalaazarDataListList.get(0).getNvbdcp_kalaazar_pfCasesList());
                nvbdcp_kalaazar_deathsList.addAll(nvbdcp_kalaazarDataListList.get(0).getNvbdcp_kalaazar_deathsList());


                recyclerView.setVisibility(View.VISIBLE);
                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getContext(), nvbdcp_kalaazar_totalCasesList, nvbdcp_kalaazar_pfCasesList, nvbdcp_kalaazar_deathsList, "KalaazarTotalCases", "faltu");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();

                btnOrange.setText(nvbdcp_kalaazar_totalCasesList.get(1).getTotal_No_of_Total_Cases());
                btnBlue.setText(nvbdcp_kalaazar_pfCasesList.get(1).getTotal_NO_OF_POPULATION());
                btnLgreen.setText(nvbdcp_kalaazar_deathsList.get(1).getTotal_No_of_Deaths());
            }

            @Override
            public void onFailure(Call<NVBDCP_KalaazarData> call, Throwable t) {

            }
        });

        btnOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerView.setVisibility(View.VISIBLE);
                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getContext(), nvbdcp_kalaazar_totalCasesList, nvbdcp_kalaazar_pfCasesList, nvbdcp_kalaazar_deathsList, "KalaazarTotalCases", "faltu");
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
                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getContext(), nvbdcp_kalaazar_totalCasesList, nvbdcp_kalaazar_pfCasesList, nvbdcp_kalaazar_deathsList, "KalaazarPFCases", "faltu");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();

            }
        });

        btnLgreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerView.setVisibility(View.INVISIBLE);
                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getContext(), nvbdcp_kalaazar_totalCasesList, nvbdcp_kalaazar_pfCasesList, nvbdcp_kalaazar_deathsList, "KalaazarDeath", "faltu");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();

            }
        });

        return view;
    }

}
