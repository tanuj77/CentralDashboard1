package com.chi.centraldashboard.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.chi.centraldashboard.Minister.InternationalHealth.IHCusRecViewSixAdapter;


import com.chi.centraldashboard.R;
import com.chi.centraldashboard.apiCall.ApiClient;
import com.chi.centraldashboard.apiCall.ApiInterface;
import com.chi.centraldashboard.apiCall.bin.MinisterMouActive;
import com.chi.centraldashboard.apiCall.bin.MinisterMouData;
import com.chi.centraldashboard.apiCall.bin.MinisterMouDataList;
import com.chi.centraldashboard.apiCall.bin.MinisterMouInactive;
import com.chi.centraldashboard.apiCall.bin.MinisterMouSigned;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MOUFragment extends Fragment {
    private RecyclerView recView;
    Button btnOrange, btnBlue, btnGreen;
    android.support.v7.widget.LinearLayoutManager mLayoutManager;
    private ApiInterface apiInterface;

    private List<MinisterMouDataList> ministerMouDataListList;
    private List<MinisterMouSigned> ministerMouSignedList;
    private List<MinisterMouActive> ministerMouActiveList;
    private List<MinisterMouInactive> ministerMouInactiveList;
    Call<MinisterMouData> ministerMouDataCall;
    private IHCusRecViewSixAdapter ihCusRecViewSixAdapter;

    public MOUFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_mou, container, false);
        btnOrange = (Button) view.findViewById(R.id.btn_orange);
        btnBlue = (Button) view.findViewById(R.id.btn_blue);
        btnGreen = (Button) view.findViewById(R.id.btn_green);

        recView = (RecyclerView) view.findViewById(R.id.recview_moudata);
        mLayoutManager = new LinearLayoutManager(getContext());
        recView.setHasFixedSize(true);
        recView.setLayoutManager(mLayoutManager);


        apiInterface = ApiClient.getClient().create(ApiInterface.class);

        ministerMouDataListList = new ArrayList<>();
        ministerMouSignedList = new ArrayList<>();
        ministerMouActiveList = new ArrayList<>();
        ministerMouInactiveList = new ArrayList<>();

        ministerMouDataCall = apiInterface.ministerMouData();
        ministerMouDataCall.enqueue(new Callback<MinisterMouData>() {
            @Override
            public void onResponse(Call<MinisterMouData> call, Response<MinisterMouData> response) {
                ministerMouDataListList.addAll(response.body().getMinisterMouDataListList());
                ministerMouSignedList.addAll(ministerMouDataListList.get(0).getMinisterMouSignedList());
                ministerMouActiveList.addAll(ministerMouDataListList.get(0).getMinisterActiveMouList());
                ministerMouInactiveList.addAll(ministerMouDataListList.get(0).getMinisterInactiveMouList());

                ihCusRecViewSixAdapter = new IHCusRecViewSixAdapter(getContext(), ministerMouSignedList, ministerMouActiveList, ministerMouInactiveList, "signed");
                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(ihCusRecViewSixAdapter);
                ihCusRecViewSixAdapter.notifyDataSetChanged();

                btnOrange.setText(String.valueOf(ministerMouSignedList.get(0).getTotal_No_of_MOUs_Signed()));
                btnBlue.setText(ministerMouActiveList.get(0).getTotal_No_of_Active_MOUs());
                btnGreen.setText(ministerMouInactiveList.get(0).getTotal_No_of_Inactive_MOUs());
            }

            @Override
            public void onFailure(Call<MinisterMouData> call, Throwable t) {
                Log.e("RSerror", "value" + t);
            }
        });


        btnOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ihCusRecViewSixAdapter = new IHCusRecViewSixAdapter(getContext(), ministerMouSignedList, ministerMouActiveList, ministerMouInactiveList, "signed");
                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(ihCusRecViewSixAdapter);
                ihCusRecViewSixAdapter.notifyDataSetChanged();
            }
        });

        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ihCusRecViewSixAdapter = new IHCusRecViewSixAdapter(getContext(), ministerMouSignedList, ministerMouActiveList, ministerMouInactiveList, "active");
                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(ihCusRecViewSixAdapter);
                ihCusRecViewSixAdapter.notifyDataSetChanged();
            }
        });

        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ihCusRecViewSixAdapter = new IHCusRecViewSixAdapter(getContext(), ministerMouSignedList, ministerMouActiveList, ministerMouInactiveList, "inactive");
                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(ihCusRecViewSixAdapter);
                ihCusRecViewSixAdapter.notifyDataSetChanged();
            }
        });

        return view;
    }

}