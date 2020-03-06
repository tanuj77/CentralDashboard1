package com.chi.centraldashboard.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.chi.centraldashboard.R;
import com.chi.centraldashboard.apiCall.ApiClient;
import com.chi.centraldashboard.apiCall.ApiInterface;
import com.chi.centraldashboard.apiCall.bin.MinisterNcdData;
import com.chi.centraldashboard.apiCall.bin.MinisterNcdDataList;
import com.chi.centraldashboard.apiCall.bin.MinisterPbsData;
import com.chi.centraldashboard.apiCall.bin.MinisterPbsDataList;
import com.chi.centraldashboard.apiCall.bin.MinisterPbsTrainedNcd;
import com.chi.centraldashboard.others.ConnectionDetector;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class NcdSnapshotFragment extends Fragment{
        Button btnOrange,btnOrange2,btnOrange3,btnOrange4,btnOrange5,btnBlue,btnBlue2,btnBlue3,btnBlue4,btnBlue5,btnGreen,btnGreen2,btnGreen3,btnGreen4;
    private ApiInterface apiInterface;
    ConnectionDetector cd;
    android.support.v7.widget.LinearLayoutManager mLayoutManager;

    private List<MinisterNcdDataList> ministerNcdDataListList;

    Call<MinisterNcdData> ministerNcdDataCall;
        public NcdSnapshotFragment() {
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

            View view = inflater.inflate(R.layout.fragment_ncd_snapshot, container, false);
            btnOrange = (Button) view.findViewById(R.id.btn_orange);
            btnOrange2 = (Button) view.findViewById(R.id.btn_orange2);
            btnOrange3 = (Button) view.findViewById(R.id.btn_orange3);
            btnOrange4 = (Button) view.findViewById(R.id.btn_orange4);
            btnOrange5 = (Button) view.findViewById(R.id.btn_orange5);
            btnBlue=(Button) view.findViewById(R.id.btn_blue);
            btnBlue2=(Button) view.findViewById(R.id.btn_blue2);
            btnBlue3=(Button) view.findViewById(R.id.btn_blue3);
            btnBlue4=(Button) view.findViewById(R.id.btn_blue4);
            btnBlue5=(Button) view.findViewById(R.id.btn_blue5);
            btnGreen = (Button) view.findViewById(R.id.btn_green);
            btnGreen2 = (Button) view.findViewById(R.id.btn_green2);
            btnGreen3 = (Button) view.findViewById(R.id.btn_green3);
            btnGreen4 = (Button) view.findViewById(R.id.btn_green4);

            apiInterface = ApiClient.getClient().create(ApiInterface.class);

            ministerNcdDataListList = new ArrayList<>();
            ministerNcdDataCall = apiInterface.ministerNcdData();
            ministerNcdDataCall.enqueue(new Callback<MinisterNcdData>() {
                @Override
                public void onResponse(Call<MinisterNcdData> call, Response<MinisterNcdData> response) {
                    ministerNcdDataListList.addAll(response.body().getMinisterNcdDataListList());

                    btnOrange.setText(String.valueOf(ministerNcdDataListList.get(0).getTotal_Persons_Enrolled()));
                    btnOrange2.setText(String.valueOf(ministerNcdDataListList.get(0).getTotal_ANM_Screened()));
                    btnOrange3.setText(String.valueOf(ministerNcdDataListList.get(0).getTotal_PHC_Screened()));
                    btnOrange4.setText(String.valueOf(ministerNcdDataListList.get(0).getTotal_Diagnosed_Breast_Cancer()));
                    btnOrange5.setText(String.valueOf(ministerNcdDataListList.get(0).getTotal_Diagnosed_Hypertension()));

                    btnBlue.setText(String.valueOf(ministerNcdDataListList.get(0).getTotal_Persons_Enrolled_over_30()));
                    btnBlue2.setText(String.valueOf(ministerNcdDataListList.get(0).getTotal_PHC_Referred_by_ASHA()));
                    btnBlue3.setText(String.valueOf(ministerNcdDataListList.get(0).getTotal_Secondary_Referred()));
                    btnBlue4.setText(String.valueOf(ministerNcdDataListList.get(0).getTotal_Diagnosed_Cervical_Cancer()));
                    btnBlue5.setText(String.valueOf(ministerNcdDataListList.get(0).getTotal_Under_Treatment()));

                    btnGreen.setText(String.valueOf(ministerNcdDataListList.get(0).getTotal_Persons_Screened()));
                    btnGreen2.setText(String.valueOf(ministerNcdDataListList.get(0).getTotal_PHC_Referred_by_ANM()));
                    btnGreen3.setText(String.valueOf(ministerNcdDataListList.get(0).getTotal_Diagnosed_Oral_Cancer()));
                    btnGreen4.setText(String.valueOf(ministerNcdDataListList.get(0).getTotal_Diagnosed_Diabetes()));
                }

                @Override
                public void onFailure(Call<MinisterNcdData> call, Throwable t) {

                }
            });

            return view;
        }

    }