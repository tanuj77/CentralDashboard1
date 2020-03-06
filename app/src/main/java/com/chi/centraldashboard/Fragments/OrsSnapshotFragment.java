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

import com.chi.centraldashboard.Minister.QualityOfHealthServices.ORSCusRecViewThreeAdapter;
import com.chi.centraldashboard.R;
import com.chi.centraldashboard.apiCall.ApiClient;
import com.chi.centraldashboard.apiCall.ApiInterface;
import com.chi.centraldashboard.apiCall.bin.MinisterORSData;
import com.chi.centraldashboard.apiCall.bin.MinisterORSDataHospitalOnboarded;
import com.chi.centraldashboard.apiCall.bin.MinisterORSDataList;
import com.chi.centraldashboard.apiCall.bin.MinisterORSDataTakenToday;
import com.chi.centraldashboard.apiCall.bin.MinisterORSDataTotalAppointments;
import com.chi.centraldashboard.others.ConnectionDetector;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class OrsSnapshotFragment extends Fragment {
    private RecyclerView recView;
    private ORSCusRecViewThreeAdapter orsCusRecViewThreeAdapter;
    android.support.v7.widget.LinearLayoutManager mLayoutManager;

    private List<MinisterORSDataList> ministerORSDataListList;
    private List<MinisterORSDataHospitalOnboarded> ministerORSDataHospitalOnboardedList;
    private List<MinisterORSDataTotalAppointments> ministerORSDataTotalAppointmentsList;
    private List<MinisterORSDataTakenToday> ministerORSDataTakenTodayList;

    private ApiInterface apiInterface;
    Call<MinisterORSData> ministerORSDataCall;
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

         View view = inflater.inflate(R.layout.fragment_ors_snapshot, container, false);


        btnOrange = (Button) view.findViewById(R.id.btn_orange);
        btnBlue = (Button) view.findViewById(R.id.btn_blue);
        btnGreen = (Button) view.findViewById(R.id.btn_green);

        recView = (RecyclerView) view.findViewById(R.id.recview_orsdata);
        mLayoutManager = new LinearLayoutManager(getContext());
        recView.setHasFixedSize(true);
        recView.setLayoutManager(mLayoutManager);


        apiInterface = ApiClient.getClient().create(ApiInterface.class);


        ministerORSDataListList = new ArrayList<>();
        ministerORSDataHospitalOnboardedList = new ArrayList<>();
        ministerORSDataTotalAppointmentsList = new ArrayList<>();
        ministerORSDataTakenTodayList = new ArrayList<>();

        ministerORSDataCall = apiInterface.ministerOrsData();
        ministerORSDataCall.enqueue(new Callback<MinisterORSData>() {
            @Override
            public void onResponse(Call<MinisterORSData> call, Response<MinisterORSData> response) {
                ministerORSDataListList.addAll(response.body().getMinisterORSDataListList());
                ministerORSDataHospitalOnboardedList.addAll(ministerORSDataListList.get(0).getMinisterORSDataHospitalOnboardedList());
                ministerORSDataTotalAppointmentsList.addAll(ministerORSDataListList.get(0).getMinisterORSDataTotalAppointmentsList());
                ministerORSDataTakenTodayList.addAll(ministerORSDataListList.get(0).getMinisterORSDataTakenTodayList());

                orsCusRecViewThreeAdapter =new ORSCusRecViewThreeAdapter(getContext(),ministerORSDataHospitalOnboardedList,ministerORSDataTotalAppointmentsList,ministerORSDataTakenTodayList,"onboard");
                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(orsCusRecViewThreeAdapter);
                orsCusRecViewThreeAdapter.notifyDataSetChanged();

                btnOrange.setText(ministerORSDataHospitalOnboardedList.get(0).getTotal_No_of_Hospitals_Onboarded());
                btnBlue.setText(ministerORSDataTotalAppointmentsList.get(0).getTotal_Appointments());
                btnGreen.setText(ministerORSDataTakenTodayList.get(0).getTotal_No_Of_Appointments_Taken_Today());
            }

            @Override
            public void onFailure(Call<MinisterORSData> call, Throwable t) {
                Log.e("RSerror", "value" + t);

            }
        });




        btnOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                orsCusRecViewThreeAdapter =new ORSCusRecViewThreeAdapter(getContext(),ministerORSDataHospitalOnboardedList,ministerORSDataTotalAppointmentsList,ministerORSDataTakenTodayList,"onboard");

                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(orsCusRecViewThreeAdapter);
                orsCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });

        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                orsCusRecViewThreeAdapter =new ORSCusRecViewThreeAdapter(getContext(),ministerORSDataHospitalOnboardedList,ministerORSDataTotalAppointmentsList,ministerORSDataTakenTodayList,"appoinments");
                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(orsCusRecViewThreeAdapter);
                orsCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });

        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                orsCusRecViewThreeAdapter =new ORSCusRecViewThreeAdapter(getContext(),ministerORSDataHospitalOnboardedList,ministerORSDataTotalAppointmentsList,ministerORSDataTakenTodayList,"today");

                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(orsCusRecViewThreeAdapter);
                orsCusRecViewThreeAdapter.notifyDataSetChanged();

            }
        });



        return view;
    }


}
