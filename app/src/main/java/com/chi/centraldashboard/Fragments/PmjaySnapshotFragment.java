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

import com.chi.centraldashboard.Minister.HealthServiceDelivery.PMJAYCusRecViewThreeAdapter;
import com.chi.centraldashboard.R;
import com.chi.centraldashboard.apiCall.ApiClient;
import com.chi.centraldashboard.apiCall.ApiInterface;
import com.chi.centraldashboard.apiCall.bin.MinisterPmjayData;
import com.chi.centraldashboard.apiCall.bin.MinisterPmjayDataList;
import com.chi.centraldashboard.apiCall.bin.MinisterPmjayECardsGenerated;
import com.chi.centraldashboard.apiCall.bin.MinisterPmjayHospitalsEmpanelled;
import com.chi.centraldashboard.apiCall.bin.MinisterPmjayPreAuthorizations;
import com.chi.centraldashboard.others.ConnectionDetector;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class PmjaySnapshotFragment extends Fragment {

    private Toolbar toolbar;
    private RecyclerView recView;
    private PMJAYCusRecViewThreeAdapter pmjayCusRecViewThreeAdapter;

    private ProgressBar progressBar;
    private int page_number = 1, item_count = 10;
    ConnectionDetector cd;

    Button btnOrange, btnBlue, btnGreen;

    private static RelativeLayout bottomLayout;
    android.support.v7.widget.LinearLayoutManager mLayoutManager;
    private List<MinisterPmjayDataList> ministerPmjayDataListList;
    private List<MinisterPmjayECardsGenerated> ministerPmjayECardsGeneratedList;
    private List<MinisterPmjayHospitalsEmpanelled> ministerPmjayHospitalsEmpanelledList;
    private List<MinisterPmjayPreAuthorizations> ministerPmjayPreAuthorizationsList;

    private ApiInterface apiInterface;
    Call<MinisterPmjayData> ministerPmjayDataCall;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_pmjay_snapshot, container, false);



            btnOrange = (Button) view.findViewById(R.id.btn_orange);
            btnBlue = (Button) view.findViewById(R.id.btn_blue);
            btnGreen = (Button) view.findViewById(R.id.btn_green);

            recView = (RecyclerView) view.findViewById(R.id.recview_pmjaydata);
            mLayoutManager = new LinearLayoutManager(getContext());
            recView.setHasFixedSize(true);
            recView.setLayoutManager(mLayoutManager);



            apiInterface = ApiClient.getClient().create(ApiInterface.class);



            ministerPmjayDataListList = new ArrayList<>();
            ministerPmjayECardsGeneratedList = new ArrayList<>();
            ministerPmjayHospitalsEmpanelledList = new ArrayList<>();
            ministerPmjayPreAuthorizationsList = new ArrayList<>();

            ministerPmjayDataCall = apiInterface.ministerPmjayData();
//        progressBar.setVisibility(View.VISIBLE);
            ministerPmjayDataCall.enqueue(new Callback<MinisterPmjayData>() {
                @Override
                public void onResponse(Call<MinisterPmjayData> call, Response<MinisterPmjayData> response) {
                    Log.i("RSpmjay", "" + response);
                    ministerPmjayDataListList.addAll(response.body().getMinisterPmjayDataListList());
                    ministerPmjayECardsGeneratedList.addAll(ministerPmjayDataListList.get(0).getMinisterPmjayECardsGeneratedList());
                    ministerPmjayHospitalsEmpanelledList.addAll(ministerPmjayDataListList.get(0).getMinisterPmjayHospitalsEmpanelledList());
                    ministerPmjayPreAuthorizationsList.addAll(ministerPmjayDataListList.get(0).getMinisterPmjayPreAuthorizationsList());

                    pmjayCusRecViewThreeAdapter = new PMJAYCusRecViewThreeAdapter(getContext(), ministerPmjayECardsGeneratedList, ministerPmjayPreAuthorizationsList, ministerPmjayHospitalsEmpanelledList, "ecard");

                    recView.setLayoutManager(mLayoutManager);
                    recView.setItemAnimator(new DefaultItemAnimator());
                    recView.setAdapter(pmjayCusRecViewThreeAdapter);
                    pmjayCusRecViewThreeAdapter.notifyDataSetChanged();

                    btnOrange.setText(String.valueOf(ministerPmjayECardsGeneratedList.get(1).getNoofecardsgenerated()));
                    btnBlue.setText(String.valueOf(ministerPmjayPreAuthorizationsList.get(1).getNoofpreauthorizationsdone()));
                    btnGreen.setText(String.valueOf(ministerPmjayHospitalsEmpanelledList.get(1).getHospitalsempanelledunderthescheme()));
                }

                @Override
                public void onFailure(Call<MinisterPmjayData> call, Throwable t) {
                    Log.e("RSerror", "value" + t);
                }

            });


            btnOrange.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    pmjayCusRecViewThreeAdapter = new PMJAYCusRecViewThreeAdapter(getContext(), ministerPmjayECardsGeneratedList, ministerPmjayPreAuthorizationsList, ministerPmjayHospitalsEmpanelledList, "ecard");

                    recView.setLayoutManager(mLayoutManager);
                    recView.setItemAnimator(new DefaultItemAnimator());
                    recView.setAdapter(pmjayCusRecViewThreeAdapter);
                    pmjayCusRecViewThreeAdapter.notifyDataSetChanged();
                }
            });

            btnBlue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    pmjayCusRecViewThreeAdapter = new PMJAYCusRecViewThreeAdapter(getContext(), ministerPmjayECardsGeneratedList, ministerPmjayPreAuthorizationsList, ministerPmjayHospitalsEmpanelledList, "preautho");
                    recView.setLayoutManager(mLayoutManager);
                    recView.setItemAnimator(new DefaultItemAnimator());
                    recView.setAdapter(pmjayCusRecViewThreeAdapter);
                    pmjayCusRecViewThreeAdapter.notifyDataSetChanged();
                }
            });

            btnGreen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    pmjayCusRecViewThreeAdapter = new PMJAYCusRecViewThreeAdapter(getContext(), ministerPmjayECardsGeneratedList, ministerPmjayPreAuthorizationsList, ministerPmjayHospitalsEmpanelledList, "hospital");

                    recView.setLayoutManager(mLayoutManager);
                    recView.setItemAnimator(new DefaultItemAnimator());
                    recView.setAdapter(pmjayCusRecViewThreeAdapter);
                    pmjayCusRecViewThreeAdapter.notifyDataSetChanged();

                }
            });





        return view;
    }


}
