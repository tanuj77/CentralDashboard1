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

import com.chi.centraldashboard.Minister.QualityOfHealthServices.EHospitalCusRecViewThreeAdapter;
import com.chi.centraldashboard.R;
import com.chi.centraldashboard.apiCall.ApiClient;
import com.chi.centraldashboard.apiCall.ApiInterface;
import com.chi.centraldashboard.apiCall.bin.MinisterEHospitalData;
import com.chi.centraldashboard.apiCall.bin.MinisterEHospitalDataList;
import com.chi.centraldashboard.apiCall.bin.MinisterEHospitalDoneToday;
import com.chi.centraldashboard.apiCall.bin.MinisterEHospitalOnboarded;
import com.chi.centraldashboard.apiCall.bin.MinisterEHospitalRegistration;
import com.chi.centraldashboard.others.ConnectionDetector;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class EhospitalSnapshotFragment extends Fragment {
    private RecyclerView recView;
    android.support.v7.widget.LinearLayoutManager mLayoutManager;
    private EHospitalCusRecViewThreeAdapter eHospitalCusRecViewThreeAdapter;

    private List<MinisterEHospitalDataList> ministerEHospitalDataListList;
    private List<MinisterEHospitalRegistration> ministerEHospitalRegistrationList;
    private List<MinisterEHospitalOnboarded> ministerEHospitalOnboardedList;
    private List<MinisterEHospitalDoneToday> ministerEHospitalDoneTodayList;

    private ApiInterface apiInterface;
    Call<MinisterEHospitalData> ministerEHospitalDataCall;
    ConnectionDetector cd;

    Button btnDetailedStatus,btnOrange, btnBlue, btnGreen;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_ehospital_snapshot, container, false);

        btnOrange = (Button) view.findViewById(R.id.btn_orange);
        btnBlue = (Button) view.findViewById(R.id.btn_blue);
        btnGreen = (Button) view.findViewById(R.id.btn_green);

        recView = (RecyclerView) view.findViewById(R.id.recview_pmjaydata);
        mLayoutManager = new LinearLayoutManager(getContext());
        recView.setHasFixedSize(true);
        recView.setLayoutManager(mLayoutManager);



        apiInterface = ApiClient.getClient().create(ApiInterface.class);



        ministerEHospitalDataListList=new ArrayList<>();
        ministerEHospitalRegistrationList=new ArrayList<>();
        ministerEHospitalOnboardedList=new ArrayList<>();
        ministerEHospitalDoneTodayList=new ArrayList<>();

        ministerEHospitalDataCall = apiInterface.ministerEhospitalData();
        ministerEHospitalDataCall.enqueue(new Callback<MinisterEHospitalData>() {
            @Override
            public void onResponse(Call<MinisterEHospitalData> call, Response<MinisterEHospitalData> response) {
                ministerEHospitalDataListList.addAll(response.body().getMinisterEHospitalDataListList());
                ministerEHospitalRegistrationList.addAll(ministerEHospitalDataListList.get(0).getMinisterEHospitalRegistrationList());
                ministerEHospitalOnboardedList.addAll(ministerEHospitalDataListList.get(0).getMinisterEHospitalOnboardedList());
                ministerEHospitalDoneTodayList.addAll(ministerEHospitalDataListList.get(0).getMinisterEHospitalDoneTodayList());

                eHospitalCusRecViewThreeAdapter =new EHospitalCusRecViewThreeAdapter(getContext(),ministerEHospitalOnboardedList,ministerEHospitalRegistrationList,ministerEHospitalDoneTodayList,"onboard");
                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(eHospitalCusRecViewThreeAdapter);
                eHospitalCusRecViewThreeAdapter.notifyDataSetChanged();


                btnOrange.setText(ministerEHospitalOnboardedList.get(0).getTotal_No_of_Hospitals_Onboarded());
                btnBlue.setText(ministerEHospitalRegistrationList.get(0).getTotal_Registration());
                btnGreen.setText(ministerEHospitalDoneTodayList.get(0).getTotal_No_of_Registration_done_Today());
            }

            @Override
            public void onFailure(Call<MinisterEHospitalData> call, Throwable t) {
                Log.e("RSerror", "value" + t);
            }
        });




        btnOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                eHospitalCusRecViewThreeAdapter =new EHospitalCusRecViewThreeAdapter(getContext(),ministerEHospitalOnboardedList,ministerEHospitalRegistrationList,ministerEHospitalDoneTodayList,"onboard");

                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(eHospitalCusRecViewThreeAdapter);
                eHospitalCusRecViewThreeAdapter.notifyDataSetChanged();

            }
        });

        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                eHospitalCusRecViewThreeAdapter =new EHospitalCusRecViewThreeAdapter(getContext(),ministerEHospitalOnboardedList,ministerEHospitalRegistrationList,ministerEHospitalDoneTodayList,"registration");
                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(eHospitalCusRecViewThreeAdapter);
                eHospitalCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });

        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eHospitalCusRecViewThreeAdapter =new EHospitalCusRecViewThreeAdapter(getContext(),ministerEHospitalOnboardedList,ministerEHospitalRegistrationList,ministerEHospitalDoneTodayList,"today");

                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(eHospitalCusRecViewThreeAdapter);
                eHospitalCusRecViewThreeAdapter.notifyDataSetChanged();

            }
        });



        return view;
    }


}
