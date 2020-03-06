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
import com.chi.centraldashboard.apiCall.bin.MinisterCghsData;
import com.chi.centraldashboard.apiCall.bin.MinisterCghsDataList;
import com.chi.centraldashboard.others.ConnectionDetector;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CghsSnapshotFragment extends Fragment {
    ConnectionDetector cd;

    Button btnOrange, btnBlue, btnDetailedStatus;

    private static RelativeLayout bottomLayout;
    android.support.v7.widget.LinearLayoutManager mLayoutManager;
    private List<MinisterCghsDataList> ministerCghsDataListList;

    private ApiInterface apiInterface;
    Call<MinisterCghsData> ministerCghsDataCall;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_cghs_snapshot, container, false);


        btnOrange = (Button) view.findViewById(R.id.btn_orange);
        btnBlue = (Button) view.findViewById(R.id.btn_blue);


        // recView = (RecyclerView) findViewById(R.id.recview_cghsdata);
//        mLayoutManager = new LinearLayoutManager(getApplicationContext());
//        recView.setHasFixedSize(true);
//        recView.setLayoutManager(mLayoutManager);

        apiInterface = ApiClient.getClient().create(ApiInterface.class);





        ministerCghsDataListList = new ArrayList<>();
        ministerCghsDataCall = apiInterface.ministerCghsData();
        ministerCghsDataCall.enqueue(new Callback<MinisterCghsData>() {
            @Override
            public void onResponse(Call<MinisterCghsData> call, Response<MinisterCghsData> response) {
                ministerCghsDataListList.addAll(response.body().getMinisterCghsDataListList());
                btnOrange.setText(ministerCghsDataListList.get(0).getNo_of_empanelled_HealthCareOrg());
                btnBlue.setText(ministerCghsDataListList.get(0).getMrc_claims_pending());
            }

            @Override
            public void onFailure(Call<MinisterCghsData> call, Throwable t) {

            }
        });





        return view;
    }


}
