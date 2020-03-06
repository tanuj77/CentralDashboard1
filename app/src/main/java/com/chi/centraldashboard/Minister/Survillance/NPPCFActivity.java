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
import com.chi.centraldashboard.apiCall.bin.NPPCFData;
import com.chi.centraldashboard.apiCall.bin.NPPCFDataList;
import com.chi.centraldashboard.apiCall.bin.NPPCF_Budget;
import com.chi.centraldashboard.apiCall.bin.NPPCF_Districts;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NPPCFActivity extends MiSurvillanceActivity {
    Button btnOrange, btnBlue;
    android.support.v7.widget.LinearLayoutManager mLayoutManager;
    private ApiInterface apiInterface;
    private RecyclerView recyclerView;
    PbsCusRecViewThreeAdapter pbsCusRecViewThreeAdapter;

    private List<NPPCFDataList> nppcfDataListList;
    private List<NPPCF_Districts> nppcf_districtsList;
    private List<NPPCF_Budget> nppcf_budgetList;
    Call<NPPCFData> nppcfDataCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_bloodbank);

        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_survillanceframe); //Remember this is the FrameLayout area within your activity_main.xml
        getLayoutInflater().inflate(R.layout.activity_nppcf, contentFrameLayout);

        btnOrange = (Button) findViewById(R.id.btn_nppcforange);
        btnBlue = (Button) findViewById(R.id.btn_nppcfblue);

        recyclerView = (RecyclerView) findViewById(R.id.recview_nppcf);

        mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(mLayoutManager);

        apiInterface = ApiClient.getClient().create(ApiInterface.class);

        nppcfDataListList = new ArrayList<>();
        nppcf_districtsList = new ArrayList<>();
        nppcf_budgetList = new ArrayList<>();
        nppcfDataCall = apiInterface.nppcfData();
        nppcfDataCall.enqueue(new Callback<NPPCFData>() {
            @Override
            public void onResponse(Call<NPPCFData> call, Response<NPPCFData> response) {
                nppcfDataListList.addAll(response.body().getNppcfDataListList());
                nppcf_districtsList.addAll(nppcfDataListList.get(0).getNppcf_districtsList());
                nppcf_budgetList.addAll(nppcfDataListList.get(0).getNppcf_budgetList());

                recyclerView.setVisibility(View.VISIBLE);
                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getApplicationContext(), nppcf_districtsList, nppcf_budgetList, "NPPCF_district", 1.2, 1);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();

                btnOrange.setText(nppcf_districtsList.get(1).getTotal_Number_of_Districts_cumulative_covered_under_NPPCF());
                btnBlue.setText(nppcf_budgetList.get(1).getTotal_Budget_Allocation_for_Tertiary_Care_Component());

            }

            @Override
            public void onFailure(Call<NPPCFData> call, Throwable t) {

            }
        });

        btnOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerView.setVisibility(View.VISIBLE);
                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getApplicationContext(), nppcf_districtsList, nppcf_budgetList, "NPPCF_district", 1.2, 1);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });

        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // boolean check= nppcf_budgetList.get(1).getSR_NO().equalsIgnoreCase("");

                if (nppcf_budgetList.get(1).getSR_NO().equalsIgnoreCase("")) {
                    recyclerView.setVisibility(View.INVISIBLE);
                } else {

                    pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getApplicationContext(), nppcf_districtsList, nppcf_budgetList, "NPPCF_budget", 1.2, 1);
                    recyclerView.setItemAnimator(new DefaultItemAnimator());
                    recyclerView.setAdapter(pbsCusRecViewThreeAdapter);
                    pbsCusRecViewThreeAdapter.notifyDataSetChanged();
                }
            }
        });
    }
}
