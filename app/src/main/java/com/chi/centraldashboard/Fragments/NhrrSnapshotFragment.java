package com.chi.centraldashboard.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.chi.centraldashboard.Minister.HealthCareInfrastructure.NHRRStatewiseCustomRecViewThreeAdapter;
import com.chi.centraldashboard.Minister.HealthCareInfrastructure.NHRRTypewiseCustomRecviewTwelveAdapter;
import com.chi.centraldashboard.R;
import com.chi.centraldashboard.apiCall.ApiClient;
import com.chi.centraldashboard.apiCall.ApiInterface;
import com.chi.centraldashboard.apiCall.bin.MinisterNhrrData;
import com.chi.centraldashboard.apiCall.bin.MinisterNhrrDataList;
import com.chi.centraldashboard.apiCall.bin.MinisterNhrrDataStatewise;
import com.chi.centraldashboard.apiCall.bin.MinisterNhrrDataTypewise;
import com.chi.centraldashboard.others.ConnectionDetector;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NhrrSnapshotFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    private Toolbar toolbar;
    private RecyclerView recyclerView;
    private NHRRStatewiseCustomRecViewThreeAdapter mStateAdapter;
    private NHRRTypewiseCustomRecviewTwelveAdapter mTypeAdapter;
    private ProgressBar progressBar;
    private int page_number = 1, item_count = 10;
    ConnectionDetector cd;
    String strNinId;
    TextView tvFiltersHeading, tvStatetop;
    Button btnDetailedStatus,btnOrange, btnBlue;
    String strStateID, strStateName, strDistrictID, strTalukaID, strBlockID, strFacilityID;
    private static RelativeLayout bottomLayout;
    android.support.v7.widget.LinearLayoutManager mLayoutManager;
    private List<MinisterNhrrDataStatewise> ministerNhrrDataStatewiseList;
    private List<MinisterNhrrDataTypewise> ministerNhrrDataTypewiseList;
    private List<MinisterNhrrDataList> ministerNhrrDataListList;
    private ApiInterface apiInterface;
    Call<MinisterNhrrData> ministerNhrrDataCall;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_nhrr_snapshot, container, false);




            btnOrange = (Button) view.findViewById(R.id.btn_orange);
            btnBlue = (Button) view.findViewById(R.id.btn_blue);
            recyclerView = (RecyclerView) view.findViewById(R.id.rec_view_pmssydata);



            mLayoutManager = new LinearLayoutManager(getContext());
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(mLayoutManager);


            apiInterface = ApiClient.getClient().create(ApiInterface.class);

            StateWiseRecyclerView();

            //implementScrollListener();



            btnOrange.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    StateWiseRecyclerView();
                }
            });

            btnBlue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    TypeWiseRecyclerView();
                }
            });
        return view;
    }
    private void StateWiseRecyclerView() {
        ministerNhrrDataListList = new ArrayList<>();
        ministerNhrrDataStatewiseList = new ArrayList<>();
        ministerNhrrDataTypewiseList = new ArrayList<>();

        ministerNhrrDataCall = apiInterface.ministerNhrrData();
//        progressBar.setVisibility(View.VISIBLE);
        ministerNhrrDataCall.enqueue(new Callback<MinisterNhrrData>() {
            @Override
            public void onResponse(Call<MinisterNhrrData> call, Response<MinisterNhrrData> response) {
                Log.i("RS", "" + response);
                ministerNhrrDataListList.addAll(response.body().getMinisterNhrrDataListList());
                ministerNhrrDataStatewiseList.addAll(ministerNhrrDataListList.get(0).getMinisterNhrrDataStatewise());
                ministerNhrrDataTypewiseList.addAll(ministerNhrrDataListList.get(0).getMinisterNhrrDataTypewise());

                mStateAdapter = new NHRRStatewiseCustomRecViewThreeAdapter(getContext(), ministerNhrrDataStatewiseList);

                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(mStateAdapter);
                mStateAdapter.notifyDataSetChanged();

                btnOrange.setText(String.valueOf(ministerNhrrDataStatewiseList.get(0).getHe_statewise()));
                btnBlue.setText(String.valueOf(ministerNhrrDataTypewiseList.get(0).getHe_typewise()));
            }

            @Override
            public void onFailure(Call<MinisterNhrrData> call, Throwable t) {
                Log.e("RSerror", "value" + t);
            }

        });


    }


    private void TypeWiseRecyclerView() {
        ministerNhrrDataListList = new ArrayList<>();
        ministerNhrrDataTypewiseList = new ArrayList<>();

        ministerNhrrDataCall = apiInterface.ministerNhrrData();
//        progressBar.setVisibility(View.VISIBLE);
        ministerNhrrDataCall.enqueue(new Callback<MinisterNhrrData>() {
            @Override
            public void onResponse(Call<MinisterNhrrData> call, Response<MinisterNhrrData> response) {
                Log.i("RS", "" + response);
                ministerNhrrDataListList.addAll(response.body().getMinisterNhrrDataListList());
                ministerNhrrDataTypewiseList.addAll(ministerNhrrDataListList.get(0).getMinisterNhrrDataTypewise());

                mTypeAdapter = new NHRRTypewiseCustomRecviewTwelveAdapter(getContext(), ministerNhrrDataTypewiseList);

                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(mTypeAdapter);
                //  Toast.makeText(RecyclerViewActivity.this, "First page is loaded", Toast.LENGTH_LONG).show();
//                progressBar.setVisibility(View.INVISIBLE);
                mTypeAdapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<MinisterNhrrData> call, Throwable t) {
                Log.e("RSerror", "value" + t);
            }

        });


    }

}
