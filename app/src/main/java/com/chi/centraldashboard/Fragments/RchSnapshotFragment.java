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
import com.chi.centraldashboard.apiCall.bin.MinisterRchData;
import com.chi.centraldashboard.apiCall.bin.MinisterRchDataList;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class RchSnapshotFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match

    Button btnDetailedStatus,btnOrange, btnBlue, btnLgreen,btnGreen;

    private static RelativeLayout bottomLayout;
    android.support.v7.widget.LinearLayoutManager mLayoutManager;
    private List<MinisterRchDataList> ministerRchDataListList;

    private ApiInterface apiInterface;
    Call<MinisterRchData> ministerRchDataCall;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_rch_snapshot, container, false);


        btnOrange = (Button) view.findViewById(R.id.btn_orange);
        btnBlue = (Button) view.findViewById(R.id.btn_blue);
        btnLgreen=(Button) view.findViewById(R.id.btn_lgreen);
        btnGreen=(Button) view.findViewById(R.id.btn_green);


        // recView = (RecyclerView) findViewById(R.id.recview_cghsdata);
//        mLayoutManager = new LinearLayoutManager(getApplicationContext());
//        recView.setHasFixedSize(true);
//        recView.setLayoutManager(mLayoutManager);

        apiInterface = ApiClient.getClient().create(ApiInterface.class);




        ministerRchDataListList = new ArrayList<>();
        ministerRchDataCall = apiInterface.ministerRchData();
        ministerRchDataCall.enqueue(new Callback<MinisterRchData>() {
            @Override
            public void onResponse(Call<MinisterRchData> call, Response<MinisterRchData> response) {
                ministerRchDataListList.addAll(response.body().getMinisterRchDataListList());
                btnOrange.setText(ministerRchDataListList.get(0).getTotal_No_of_Eligible_Couple_Registered());
                btnBlue.setText(ministerRchDataListList.get(0).getTotal_No_of_Pregnant_Woman_Registered());
                btnLgreen.setText(ministerRchDataListList.get(0).getTotal_No_of_Children_Registered());
                btnGreen.setText(ministerRchDataListList.get(0).getTotal_No_of_Health_Providers());
            }

            @Override
            public void onFailure(Call<MinisterRchData> call, Throwable t) {

            }
        });


        return view;
    }

}
