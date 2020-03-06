package com.chi.centraldashboard.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.chi.centraldashboard.R;
import com.chi.centraldashboard.apiCall.ApiClient;
import com.chi.centraldashboard.apiCall.ApiInterface;
import com.chi.centraldashboard.apiCall.bin.MinisterMhealthData;
import com.chi.centraldashboard.apiCall.bin.MinisterMhealthDataList;
import com.chi.centraldashboard.others.ConnectionDetector;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MhealthSnapshotFragment extends Fragment {
    ConnectionDetector cd;

    Button btnOrange, btnBlue, btnDetailedStatus;

    private static RelativeLayout bottomLayout;
    android.support.v7.widget.LinearLayoutManager mLayoutManager;
    private List<MinisterMhealthDataList> ministerMhealthDataListList;

    private ApiInterface apiInterface;
    Call<MinisterMhealthData> ministerMhealthDataCall;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_mhealth_snapshot, container, false);

        btnOrange = (Button) view.findViewById(R.id.btn_orange);
        btnBlue = (Button) view.findViewById(R.id.btn_blue);


        // recView = (RecyclerView) findViewById(R.id.recview_cghsdata);
//        mLayoutManager = new LinearLayoutManager(getApplicationContext());
//        recView.setHasFixedSize(true);
//        recView.setLayoutManager(mLayoutManager);

        apiInterface = ApiClient.getClient().create(ApiInterface.class);




        ministerMhealthDataListList = new ArrayList<>();
        ministerMhealthDataCall = apiInterface.ministerMhealthData();
        ministerMhealthDataCall.enqueue(new Callback<MinisterMhealthData>() {
            @Override
            public void onResponse(Call<MinisterMhealthData> call, Response<MinisterMhealthData> response) {
                ministerMhealthDataListList.addAll(response.body().getMinisterMhealthDataLists());
                btnOrange.setText(ministerMhealthDataListList.get(0).getTotal_mCessation_User_Registered());
                btnBlue.setText(ministerMhealthDataListList.get(0).getTotal_mDiabetes_User_Registered());
            }

            @Override
            public void onFailure(Call<MinisterMhealthData> call, Throwable t) {

            }
        });

        return view;
    }


}
