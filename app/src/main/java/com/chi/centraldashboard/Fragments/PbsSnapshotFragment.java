package com.chi.centraldashboard.Fragments;

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

import com.chi.centraldashboard.apiCall.bin.MinisterPbsData;
import com.chi.centraldashboard.apiCall.bin.MinisterPbsDataList;
import com.chi.centraldashboard.apiCall.bin.MinisterPbsTrainedNcd;
import com.chi.centraldashboard.others.ConnectionDetector;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class PbsSnapshotFragment extends Fragment {
    Button btnOrange, btnBlue, btnGreen;
    private RecyclerView recView;
    private ApiInterface apiInterface;
    ConnectionDetector cd;
    android.support.v7.widget.LinearLayoutManager mLayoutManager;

    private List<MinisterPbsDataList> ministerPbsDataListList;
    private List<MinisterPbsTrainedNcd> ministerPbsTrainedNcdList;
    Call<MinisterPbsData> ministerPbsDataCall;
    PbsCusRecViewThreeAdapter pbsCusRecViewThreeAdapter;

    public PbsSnapshotFragment() {
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
        View view = inflater.inflate(R.layout.fragment_pbs_snapshot, container, false);

        btnOrange = (Button) view.findViewById(R.id.btn_orange);
        btnBlue = (Button) view.findViewById(R.id.btn_blue);
        btnGreen = (Button) view.findViewById(R.id.btn_green);

        recView = (RecyclerView) view.findViewById(R.id.recview_pbsdata);
        mLayoutManager = new LinearLayoutManager(view.getContext());//////check this line/////
        recView.setHasFixedSize(true);
        recView.setLayoutManager(mLayoutManager);
        apiInterface = ApiClient.getClient().create(ApiInterface.class);

        ministerPbsDataListList = new ArrayList<>();
        ministerPbsTrainedNcdList = new ArrayList<>();


        ministerPbsDataCall = apiInterface.ministerPbsData();

        ministerPbsDataCall.enqueue(new Callback<MinisterPbsData>() {
            @Override
            public void onResponse(Call<MinisterPbsData> call, Response<MinisterPbsData> response) {
                ministerPbsDataListList.addAll(response.body().getMinisterPbsDataListList());
                ministerPbsTrainedNcdList.addAll(ministerPbsDataListList.get(0).getMinisterPbsTrainedNcdList());

                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getContext(), ministerPbsTrainedNcdList,"pbs");
                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();

                btnOrange.setText(String.valueOf(ministerPbsTrainedNcdList.get(0).getTotal_Personnel_trained_on_NCD_application()));
                btnBlue.setText(String.valueOf(ministerPbsDataListList.get(0).getTotal_Persons_enrolled_in_NCD_application()));
                btnGreen.setText(String.valueOf(ministerPbsDataListList.get(0).getTotal_Persons_screened()));
            }

            @Override
            public void onFailure(Call<MinisterPbsData> call, Throwable t) {

            }
        });


        btnOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recView.setVisibility(View.VISIBLE);
                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getContext(), ministerPbsTrainedNcdList,"pbs");
                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });

        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recView.setVisibility(View.INVISIBLE);
            }
        });
        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recView.setVisibility(View.INVISIBLE);
            }
        });

        return view;
    }

}