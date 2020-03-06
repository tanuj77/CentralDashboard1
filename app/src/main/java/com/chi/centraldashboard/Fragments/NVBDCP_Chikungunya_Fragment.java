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
import com.chi.centraldashboard.apiCall.bin.NVBDCP_ChikungunyaData;
import com.chi.centraldashboard.apiCall.bin.NVBDCP_ChikungunyaDataList;
import com.chi.centraldashboard.apiCall.bin.NVBDCP_Chikungunya_Confirmed;
import com.chi.centraldashboard.apiCall.bin.NVBDCP_Chikungunya_Sentinel;
import com.chi.centraldashboard.apiCall.bin.NVBDCP_Chikungunya_Suspected;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class NVBDCP_Chikungunya_Fragment extends Fragment {
    Button btnDetailedStatus, btnOrange, btnBlue, btnLgreen;
    RecyclerView recyclerView;
    private static RelativeLayout bottomLayout;
    android.support.v7.widget.LinearLayoutManager mLayoutManager;
    private ApiInterface apiInterface;
    PbsCusRecViewThreeAdapter pbsCusRecViewThreeAdapter;

    private List<NVBDCP_ChikungunyaDataList> nvbdcp_chikungunyaDataListList;
    private List<NVBDCP_Chikungunya_Suspected> nvbdcp_chikungunya_suspectedList;
    private List<NVBDCP_Chikungunya_Confirmed> nvbdcp_chikungunya_confirmedList;
    private List<NVBDCP_Chikungunya_Sentinel> nvbdcp_chikungunya_sentinelList;

    Call<NVBDCP_ChikungunyaData> nvbdcp_chikungunyaDataCall;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_nvbdcp__chikungunya_, container, false);


        btnOrange = (Button) view.findViewById(R.id.btn_chikungunyaorange);
        btnBlue = (Button) view.findViewById(R.id.btn_chikungunyablue);
        btnLgreen = (Button) view.findViewById(R.id.btn_chikungunyagreen);


        recyclerView = (RecyclerView) view.findViewById(R.id.recview_chikungunya);

        mLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(mLayoutManager);

        apiInterface = ApiClient.getClient().create(ApiInterface.class);
        nvbdcp_chikungunyaDataListList = new ArrayList<>();
        nvbdcp_chikungunya_suspectedList = new ArrayList<>();
        nvbdcp_chikungunya_confirmedList = new ArrayList<>();
        nvbdcp_chikungunya_sentinelList = new ArrayList<>();
        nvbdcp_chikungunyaDataCall = apiInterface.nvbdcp_ChikungunyaData();
        nvbdcp_chikungunyaDataCall.enqueue(new Callback<NVBDCP_ChikungunyaData>() {
            @Override
            public void onResponse(Call<NVBDCP_ChikungunyaData> call, Response<NVBDCP_ChikungunyaData> response) {
                nvbdcp_chikungunyaDataListList.addAll(response.body().getNvbdcp_chikungunyaDataListList());
                nvbdcp_chikungunya_suspectedList.addAll(nvbdcp_chikungunyaDataListList.get(0).getNvbdcp_chikungunya_suspectedList());
                nvbdcp_chikungunya_confirmedList.addAll(nvbdcp_chikungunyaDataListList.get(0).getNvbdcp_chikungunya_confirmedList());
                nvbdcp_chikungunya_sentinelList.addAll(nvbdcp_chikungunyaDataListList.get(0).getNvbdcp_chikungunya_sentinelList());


                recyclerView.setVisibility(View.VISIBLE);
                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getContext(), nvbdcp_chikungunya_suspectedList, nvbdcp_chikungunya_confirmedList, nvbdcp_chikungunya_sentinelList,10.20,"ChikungunyaSuspected");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();


                btnOrange.setText(nvbdcp_chikungunya_suspectedList.get(1).getTotal_Suspected_cases());
                btnBlue.setText(nvbdcp_chikungunya_confirmedList.get(1).getTotal_Confirmed_cases());
                btnLgreen.setText(nvbdcp_chikungunya_sentinelList.get(1).getTotal_No_of_Sentinel_Sites());
            }

            @Override
            public void onFailure(Call<NVBDCP_ChikungunyaData> call, Throwable t) {

            }
        });

        btnOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerView.setVisibility(View.VISIBLE);
                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getContext(), nvbdcp_chikungunya_suspectedList, nvbdcp_chikungunya_confirmedList, nvbdcp_chikungunya_sentinelList,10.20,"ChikungunyaSuspected");
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
                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getContext(), nvbdcp_chikungunya_suspectedList, nvbdcp_chikungunya_confirmedList, nvbdcp_chikungunya_sentinelList,10.20,"ChikungunyaConfirmed");
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
                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getContext(), nvbdcp_chikungunya_suspectedList, nvbdcp_chikungunya_confirmedList, nvbdcp_chikungunya_sentinelList,10.20,"ChikungunyaSentine");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();

            }
        });


        return view;
    }


}
