package com.chi.centraldashboard.Minister.Survillance;

import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.chi.centraldashboard.R;
import com.chi.centraldashboard.apiCall.ApiClient;
import com.chi.centraldashboard.apiCall.ApiInterface;
import com.chi.centraldashboard.apiCall.bin.AMRData;
import com.chi.centraldashboard.apiCall.bin.AMRDataList;
import com.chi.centraldashboard.apiCall.bin.AMRProgramme;
import com.chi.centraldashboard.apiCall.bin.AMRSurveillance;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AMRContainmentActivity extends MiSurvillanceActivity {
    Button btnOrange, btnBlue;
    android.support.v7.widget.LinearLayoutManager mLayoutManager;
    private ApiInterface apiInterface;
    private RecyclerView recyclerView;
    PbsCusRecViewThreeAdapter pbsCusRecViewThreeAdapter;
    private List<AMRDataList> amrDataListList;
    private List<AMRProgramme> amrProgrammeList;
    private List<AMRSurveillance> amrSurveillanceList;
    Call<AMRData> amrDataCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_bloodbank);

        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_survillanceframe); //Remember this is the FrameLayout area within your activity_main.xml
        getLayoutInflater().inflate(R.layout.activity_amr, contentFrameLayout);

        btnOrange = (Button) findViewById(R.id.btn_amrorange);
        btnBlue = (Button) findViewById(R.id.btn_amrblue);


        recyclerView = (RecyclerView) findViewById(R.id.recview_amr);

        mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(mLayoutManager);

        apiInterface = ApiClient.getClient().create(ApiInterface.class);
        amrDataListList = new ArrayList<>();
        amrProgrammeList = new ArrayList<>();
        amrSurveillanceList = new ArrayList<>();
        amrDataCall = apiInterface.amrData();
        amrDataCall.enqueue(new Callback<AMRData>() {
            @Override
            public void onResponse(Call<AMRData> call, Response<AMRData> response) {
                amrDataListList.addAll(response.body().getAmrDataListList());
                amrProgrammeList.addAll(amrDataListList.get(0).getAmrProgrammeList());
                amrSurveillanceList.addAll(amrDataListList.get(0).getAmrSurveillanceList());

                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getApplicationContext(), amrProgrammeList, amrSurveillanceList, "AMRProgramme");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();

                btnOrange.setText(amrProgrammeList.get(1).getTotal_Labs_enrolled_under_the_AMR_Programme());
                btnBlue.setText(amrSurveillanceList.get(1).getTotal_Labs_reporting_AMR_surveillance_data());
            }

            @Override
            public void onFailure(Call<AMRData> call, Throwable t) {

            }
        });

        btnOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getApplicationContext(), amrProgrammeList, amrSurveillanceList, "AMRProgramme");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });

        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getApplicationContext(), amrProgrammeList, amrSurveillanceList, "AMRSurveillance");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });
    }

}
