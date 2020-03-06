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
import com.chi.centraldashboard.apiCall.bin.NVBDCP_LymphaticData;
import com.chi.centraldashboard.apiCall.bin.NVBDCP_LymphaticDataList;
import com.chi.centraldashboard.apiCall.bin.NVBDCP_Lymphatic_Endemic;
import com.chi.centraldashboard.apiCall.bin.NVBDCP_Lymphatic_IDA;
import com.chi.centraldashboard.apiCall.bin.NVBDCP_Lymphatic_MDA;
import com.chi.centraldashboard.apiCall.bin.NVBDCP_Lymphatic_TAS;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class NVBDCP_Lymphatic_Fragment extends Fragment {
    Button btnDetailedStatus, btnOrange, btnBlue, btnLgreen, btnGreen;
    RecyclerView recyclerView;
    private static RelativeLayout bottomLayout;
    android.support.v7.widget.LinearLayoutManager mLayoutManager;
    private ApiInterface apiInterface;
    PbsCusRecViewThreeAdapter pbsCusRecViewThreeAdapter;

    private List<NVBDCP_LymphaticDataList> lymphaticDataListList;
    private List<NVBDCP_Lymphatic_Endemic> nvbdcp_lymphatic_endemicList;
    private List<NVBDCP_Lymphatic_TAS> nvbdcp_lymphatic_tasList;
    private List<NVBDCP_Lymphatic_MDA> nvbdcp_lymphatic_mdaList;
    private List<NVBDCP_Lymphatic_IDA> nvbdcp_lymphatic_idaList;

    Call<NVBDCP_LymphaticData> nvbdcp_lymphaticDataCall;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_nvbdcp__lymphatic_, container, false);

        btnOrange = (Button) view.findViewById(R.id.btn_lymphaticorange);
        btnBlue = (Button) view.findViewById(R.id.btn_lymphaticblue);
        btnLgreen = (Button) view.findViewById(R.id.btn_lymphaticlgreen);
        btnGreen = (Button) view.findViewById(R.id.btn_lymphaticgreen);
        recyclerView = (RecyclerView) view.findViewById(R.id.rec_view_nvbdcplymphatic);

        mLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(mLayoutManager);

        apiInterface = ApiClient.getClient().create(ApiInterface.class);
        lymphaticDataListList = new ArrayList<>();
        nvbdcp_lymphatic_endemicList = new ArrayList<>();
        nvbdcp_lymphatic_tasList = new ArrayList<>();
        nvbdcp_lymphatic_mdaList = new ArrayList<>();
        nvbdcp_lymphatic_idaList = new ArrayList<>();

        nvbdcp_lymphaticDataCall = apiInterface.nvbdcp_LymphaticData();
        nvbdcp_lymphaticDataCall.enqueue(new Callback<NVBDCP_LymphaticData>() {
            @Override
            public void onResponse(Call<NVBDCP_LymphaticData> call, Response<NVBDCP_LymphaticData> response) {
                lymphaticDataListList.addAll(response.body().getLymphaticDataListList());
                nvbdcp_lymphatic_endemicList.addAll(lymphaticDataListList.get(0).getNvbdcp_lymphatic_endemicList());
                nvbdcp_lymphatic_tasList.addAll(lymphaticDataListList.get(0).getNvbdcp_lymphatic_tasList());
                nvbdcp_lymphatic_mdaList.addAll(lymphaticDataListList.get(0).getNvbdcp_lymphatic_mdaList());
                nvbdcp_lymphatic_idaList.addAll(lymphaticDataListList.get(0).getNvbdcp_lymphatic_idaList());


                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getContext(), nvbdcp_lymphatic_endemicList, nvbdcp_lymphatic_tasList, nvbdcp_lymphatic_mdaList, nvbdcp_lymphatic_idaList, "LymphaticEndemic", "faltu");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();

                btnOrange.setText(nvbdcp_lymphatic_endemicList.get(1).getTotal_Endemic_Districts());
                btnBlue.setText(nvbdcp_lymphatic_tasList.get(1).getTotal_Number_of_Districts_cleared_TAS());
                btnLgreen.setText(nvbdcp_lymphatic_mdaList.get(1).getTotal_Number_of_Districts_proposed_for_next_MDA());
                btnGreen.setText(nvbdcp_lymphatic_idaList.get(1).getTotal_Number_of_Districts_proposed_for_next_IDA());
            }

            @Override
            public void onFailure(Call<NVBDCP_LymphaticData> call, Throwable t) {

            }
        });

        btnOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getContext(), nvbdcp_lymphatic_endemicList, nvbdcp_lymphatic_tasList, nvbdcp_lymphatic_mdaList, nvbdcp_lymphatic_idaList, "LymphaticEndemic", "faltu");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });
        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getContext(), nvbdcp_lymphatic_endemicList, nvbdcp_lymphatic_tasList, nvbdcp_lymphatic_mdaList, nvbdcp_lymphatic_idaList, "LymphaticTAS", "faltu");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });
        btnLgreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getContext(), nvbdcp_lymphatic_endemicList, nvbdcp_lymphatic_tasList, nvbdcp_lymphatic_mdaList, nvbdcp_lymphatic_idaList, "LymphaticMDA", "faltu");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });
        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getContext(), nvbdcp_lymphatic_endemicList, nvbdcp_lymphatic_tasList, nvbdcp_lymphatic_mdaList, nvbdcp_lymphatic_idaList, "LymphaticIDA", "faltu");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });
        return view;
    }


}
