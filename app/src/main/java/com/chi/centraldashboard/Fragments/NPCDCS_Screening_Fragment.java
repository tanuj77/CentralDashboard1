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

import com.chi.centraldashboard.Minister.Survillance.PbsCusRecViewThreeAdapter;
import com.chi.centraldashboard.R;
import com.chi.centraldashboard.apiCall.ApiClient;
import com.chi.centraldashboard.apiCall.ApiInterface;
import com.chi.centraldashboard.apiCall.bin.NPCDCS_ScreeningData;
import com.chi.centraldashboard.apiCall.bin.NPCDCS_ScreeningDataList;
import com.chi.centraldashboard.apiCall.bin.NPCDCS_Screening_Opportunistic;
import com.chi.centraldashboard.apiCall.bin.NPCDCS_Screening_Outreach;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class NPCDCS_Screening_Fragment extends Fragment {
    private RecyclerView recView;
    android.support.v7.widget.LinearLayoutManager mLayoutManager;
    private ApiInterface apiInterface;

    PbsCusRecViewThreeAdapter pbsCusRecViewThreeAdapter;
    Button btnOrange, btnBlue;

    private List<NPCDCS_ScreeningDataList> npcdcs_screeningDataListList;
    private List<NPCDCS_Screening_Opportunistic> npcdcs_screening_opportunisticList;
    private List<NPCDCS_Screening_Outreach> npcdcs_screening_outreachList;
    Call<NPCDCS_ScreeningData> npcdcs_screeningDataCall;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_npcdcs__screening_, container, false);

        btnOrange = (Button) view.findViewById(R.id.btn_npcdcs2orange);
        btnBlue = (Button) view.findViewById(R.id.btn_npcdcs2blue);
        recView = (RecyclerView) view.findViewById(R.id.rec_view_npcdcs2);
        mLayoutManager = new LinearLayoutManager(getContext());
        recView.setHasFixedSize(true);
        recView.setLayoutManager(mLayoutManager);

        apiInterface = ApiClient.getClient().create(ApiInterface.class);
        npcdcs_screeningDataListList = new ArrayList<>();
        npcdcs_screening_opportunisticList = new ArrayList<>();
        npcdcs_screening_outreachList = new ArrayList<>();
        npcdcs_screeningDataCall = apiInterface.npcdcs_ScreeningData();
        npcdcs_screeningDataCall.enqueue(new Callback<NPCDCS_ScreeningData>() {
            @Override
            public void onResponse(Call<NPCDCS_ScreeningData> call, Response<NPCDCS_ScreeningData> response) {
                npcdcs_screeningDataListList.addAll(response.body().getNpcdcs_screeningDataListList());
                npcdcs_screening_opportunisticList.addAll(npcdcs_screeningDataListList.get(0).getNpcdcs_screening_opportunisticList());
                npcdcs_screening_outreachList.addAll(npcdcs_screeningDataListList.get(0).getNpcdcs_screening_outreachList());

                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getContext(), npcdcs_screening_opportunisticList, npcdcs_screening_outreachList, "npcdcs_screening_opportunistic", 1);
                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();

                btnOrange.setText(npcdcs_screening_opportunisticList.get(1).getTotal_Under_Opportunistic_Screening_Total_persons_screened());
                btnBlue.setText(npcdcs_screening_outreachList.get(1).getTotal_Under_Outreach_Screening_Total_persons_screened());

            }

            @Override
            public void onFailure(Call<NPCDCS_ScreeningData> call, Throwable t) {

            }
        });

        btnOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getContext(), npcdcs_screening_opportunisticList, npcdcs_screening_outreachList, "NPCDCS_screening_opportunistic", 1);
                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });

        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getContext(), npcdcs_screening_opportunisticList, npcdcs_screening_outreachList, "NPCDCS_screening_outreach", 1);
                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });

        return view;
    }

}
