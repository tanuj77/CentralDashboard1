package com.chi.centraldashboard.Fragments;

import android.content.Context;
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

import com.chi.centraldashboard.Minister.HealthCareInfrastructure.PMSSYMedicalCollegeCusRecviewEightAdapter;
import com.chi.centraldashboard.Minister.HealthCareInfrastructure.PMSSYNewAiimsCusRecViewNineAdapter;
import com.chi.centraldashboard.R;
import com.chi.centraldashboard.apiCall.ApiClient;
import com.chi.centraldashboard.apiCall.ApiInterface;
import com.chi.centraldashboard.apiCall.bin.MinisterPmssyData;
import com.chi.centraldashboard.apiCall.bin.MinisterPmssyDataList;
import com.chi.centraldashboard.apiCall.bin.MinisterPmssyDataMedicalCollege;
import com.chi.centraldashboard.apiCall.bin.MinisterPmssyDataNewAiims;
import com.chi.centraldashboard.others.ConnectionDetector;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class PmssySnapshotFragment extends Fragment {
    // private List<FacilityTypeDetailsList> detailMovieList = new ArrayList<>();
    private Toolbar toolbar;
    private RecyclerView recyclerView;
    private PMSSYNewAiimsCusRecViewNineAdapter mNewAiimsAdapter;
    private PMSSYMedicalCollegeCusRecviewEightAdapter mMedicalCollegeAdapter;
    private ProgressBar progressBar;
    private int page_number = 1, item_count = 10;
    ConnectionDetector cd;

    Button btnSnapshot, btnDetailedStatus, btnOrange, btnBlue;

    private static RelativeLayout bottomLayout;
    android.support.v7.widget.LinearLayoutManager mLayoutManager;
    private List<MinisterPmssyDataNewAiims> ministerPmssyDataNewAiimsList;
    private List<MinisterPmssyDataMedicalCollege> ministerPmssyDataMedicalCollegeList;
    private List<MinisterPmssyDataList> ministerPmssyDataListList;
    private ApiInterface apiInterface;
    Call<MinisterPmssyData> ministerPmssyDataCall;

    Context context;
    // Variables for Pagination listener
    private boolean isLoading = true;
    int pastVisiblesItems, visibleItemCount, totalItemCount, previousTotal = 0;
    private int view_threshold = 10;


    public PmssySnapshotFragment() {
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
        View view = inflater.inflate(R.layout.fragment_pmssy_snapshot, container, false);




            btnOrange = (Button) view.findViewById(R.id.btn_orange);
            btnBlue = (Button) view.findViewById(R.id.btn_blue);
            recyclerView = (RecyclerView) view.findViewById(R.id.rec_view_pmssydata);




            mLayoutManager = new LinearLayoutManager(getContext());
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(mLayoutManager);


            apiInterface = ApiClient.getClient().create(ApiInterface.class);

            NewAiimsRecyclerView();

            //implementScrollListener();

            btnOrange.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    NewAiimsRecyclerView();
                }
            });

            btnBlue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    MedicalCollegeRecyclerView();
                }
            });


        return view;
    }

    private void NewAiimsRecyclerView() {
        ministerPmssyDataListList = new ArrayList<>();
        ministerPmssyDataNewAiimsList = new ArrayList<>();
        ministerPmssyDataMedicalCollegeList = new ArrayList<>();

        ministerPmssyDataCall = apiInterface.ministerPmssyData();
//        progressBar.setVisibility(View.VISIBLE);
        ministerPmssyDataCall.enqueue(new Callback<MinisterPmssyData>() {
            @Override
            public void onResponse(Call<MinisterPmssyData> call, Response<MinisterPmssyData> response) {
                Log.i("RS", "" + response);
                ministerPmssyDataListList.addAll(response.body().getMinisterPmssyDataListList());
                ministerPmssyDataNewAiimsList.addAll(ministerPmssyDataListList.get(0).getMinisterPmssyDataNewAiimsList());
                ministerPmssyDataMedicalCollegeList.addAll(ministerPmssyDataListList.get(0).getMinisterPmssyDataMedicalCollegeList());

                mNewAiimsAdapter = new PMSSYNewAiimsCusRecViewNineAdapter(getContext(), ministerPmssyDataNewAiimsList);
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(mNewAiimsAdapter);
                mNewAiimsAdapter.notifyDataSetChanged();

                btnOrange.setText(String.valueOf(ministerPmssyDataNewAiimsList.get(0).getNew_aiims_announced()));
                btnBlue.setText(String.valueOf(ministerPmssyDataMedicalCollegeList.get(0).getMedical_college_upgradation()));
            }

            @Override
            public void onFailure(Call<MinisterPmssyData> call, Throwable t) {
                Log.e("RSerror", "value" + t);
            }

        });


    }

    private void MedicalCollegeRecyclerView() {
        ministerPmssyDataListList = new ArrayList<>();
        ministerPmssyDataNewAiimsList = new ArrayList<>();
        ministerPmssyDataMedicalCollegeList = new ArrayList<>();

        ministerPmssyDataCall = apiInterface.ministerPmssyData();
//        progressBar.setVisibility(View.VISIBLE);
        ministerPmssyDataCall.enqueue(new Callback<MinisterPmssyData>() {
            @Override
            public void onResponse(Call<MinisterPmssyData> call, Response<MinisterPmssyData> response) {
                Log.i("RS", "" + response);
                ministerPmssyDataListList.addAll(response.body().getMinisterPmssyDataListList());

                ministerPmssyDataMedicalCollegeList.addAll(ministerPmssyDataListList.get(0).getMinisterPmssyDataMedicalCollegeList());

                mMedicalCollegeAdapter = new PMSSYMedicalCollegeCusRecviewEightAdapter(getContext(), ministerPmssyDataMedicalCollegeList);

                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(mMedicalCollegeAdapter);
                mMedicalCollegeAdapter.notifyDataSetChanged();


                btnBlue.setText(String.valueOf(ministerPmssyDataMedicalCollegeList.get(0).getMedical_college_upgradation()));
            }

            @Override
            public void onFailure(Call<MinisterPmssyData> call, Throwable t) {
                Log.e("RSerror", "value" + t);
            }

        });
    }


}

