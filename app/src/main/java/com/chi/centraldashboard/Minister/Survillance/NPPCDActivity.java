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
import com.chi.centraldashboard.apiCall.bin.NPPCDData;
import com.chi.centraldashboard.apiCall.bin.NPPCDDataList;
import com.chi.centraldashboard.apiCall.bin.NPPCD_madeOperational;
import com.chi.centraldashboard.apiCall.bin.NPPCD_underNPPCd;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NPPCDActivity extends MiSurvillanceActivity {
    Button btnOrange, btnBlue;
    android.support.v7.widget.LinearLayoutManager mLayoutManager;
    private ApiInterface apiInterface;
    private RecyclerView recyclerView;
    PbsCusRecViewThreeAdapter pbsCusRecViewThreeAdapter;

    private List<NPPCDDataList> nppcdDataListList;
    private List<NPPCD_underNPPCd> nppcdUnderNPPCds;
    private List<NPPCD_madeOperational> nppcd_madeOperationalList;
    Call<NPPCDData> nppcdDataCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_bloodbank);

        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_survillanceframe); //Remember this is the FrameLayout area within your activity_main.xml
        getLayoutInflater().inflate(R.layout.activity_nppcd, contentFrameLayout);

        btnOrange = (Button) findViewById(R.id.btn_nppcdorange);
        btnBlue = (Button) findViewById(R.id.btn_nppcdblue);

        recyclerView = (RecyclerView) findViewById(R.id.recview_nppcd);

        mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(mLayoutManager);

        apiInterface = ApiClient.getClient().create(ApiInterface.class);
        nppcdDataListList = new ArrayList<>();
        nppcdUnderNPPCds = new ArrayList<>();
        nppcd_madeOperationalList = new ArrayList<>();
        nppcdDataCall = apiInterface.nppcdData();
        nppcdDataCall.enqueue(new Callback<NPPCDData>() {
            @Override
            public void onResponse(Call<NPPCDData> call, Response<NPPCDData> response) {
                nppcdDataListList.addAll(response.body().getNppcdDataListList());
                nppcdUnderNPPCds.addAll(nppcdDataListList.get(0).getNppcdUnderNPPCds());
                nppcd_madeOperationalList.addAll(nppcdDataListList.get(0).getNppcd_madeOperationalList());

                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getApplicationContext(), nppcdUnderNPPCds, nppcd_madeOperationalList, "NPPCDundernppcd", 1.2);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();

                btnOrange.setText(nppcdUnderNPPCds.get(1).getTotal_Number_of_Districts_under_NPPCD());
                btnBlue.setText(nppcd_madeOperationalList.get(1).getTotal_Number_of_District_made_Operational_under_NPPCD());
            }

            @Override
            public void onFailure(Call<NPPCDData> call, Throwable t) {

            }
        });
        btnOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getApplicationContext(), nppcdUnderNPPCds, nppcd_madeOperationalList, "NPPCDundernppcd", 1.2);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();

            }
        });

        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getApplicationContext(), nppcdUnderNPPCds, nppcd_madeOperationalList, "NPPCDmadeoperational", 1.2);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();

            }
        });
    }
}
