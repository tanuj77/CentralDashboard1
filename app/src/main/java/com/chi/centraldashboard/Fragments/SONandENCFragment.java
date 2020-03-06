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
import com.chi.centraldashboard.apiCall.bin.MinisterSONDataList;
import com.chi.centraldashboard.apiCall.bin.MinisterSonData;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class SONandENCFragment extends Fragment {
    Button btnOrange, btnBlue, btnGreen, btnOrange2, btnBlue2, btnGreen2;
    private List<MinisterSONDataList> ministerSONDataListList;
    private Call<MinisterSonData> ministerSonDataCall;
    private ApiInterface apiInterface;

    public SONandENCFragment() {
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

        View view = inflater.inflate(R.layout.fragment_enc, container, false);

        btnOrange = (Button) view.findViewById(R.id.btn_orange);
        btnBlue = (Button) view.findViewById(R.id.btn_blue);
        btnGreen = (Button) view.findViewById(R.id.btn_green);
        btnOrange2 = (Button) view.findViewById(R.id.btn_orange2);
        btnBlue2 = (Button) view.findViewById(R.id.btn_blue2);
        btnGreen2 = (Button) view.findViewById(R.id.btn_green2);


        apiInterface = ApiClient.getClient().create(ApiInterface.class);
        ministerSONDataListList = new ArrayList<>();

        ministerSonDataCall=apiInterface.ministerSonData();
        ministerSonDataCall.enqueue(new Callback<MinisterSonData>() {
            @Override
            public void onResponse(Call<MinisterSonData> call, Response<MinisterSonData> response) {
                ministerSONDataListList.addAll(response.body().getMinisterSONDataListList());

                btnOrange.setText(ministerSONDataListList.get(0).getNoof_application_son());
                btnBlue.setText(ministerSONDataListList.get(0).getIssued_son());
                btnGreen.setText(ministerSONDataListList.get(0).getPending_son());
                btnOrange2.setText(ministerSONDataListList.get(0).getNoof_application_enc());
                btnBlue2.setText(ministerSONDataListList.get(0).getIssued_enc());
                btnGreen2.setText(ministerSONDataListList.get(0).getPending_enc());
            }

            @Override
            public void onFailure(Call<MinisterSonData> call, Throwable t) {

            }
        });


        return view;
    }

}