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
import com.chi.centraldashboard.apiCall.bin.LeptospirosisDAffected;
import com.chi.centraldashboard.apiCall.bin.LeptospirosisData;
import com.chi.centraldashboard.apiCall.bin.LeptospirosisDataList;
import com.chi.centraldashboard.apiCall.bin.LeptospirosisLCC;
import com.chi.centraldashboard.apiCall.bin.LeptospirosisOReported;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LeptospirosisActivity extends MiSurvillanceActivity {

    Button btnOrange, btnBlue, btnLGreen, btnGreen, btnBrown, btnRed, btnLemon, btnPink;
    android.support.v7.widget.LinearLayoutManager mLayoutManager;
    private ApiInterface apiInterface;
    private RecyclerView recyclerView;
    PbsCusRecViewThreeAdapter pbsCusRecViewThreeAdapter;

    private List<LeptospirosisDataList> leptospirosisDataListList;
    private List<LeptospirosisDAffected> leptospirosisDAffectedList;
    private List<LeptospirosisOReported> leptospirosisOReportedList;
    private List<LeptospirosisLCC> leptospirosisLCCList;

    Call<LeptospirosisData> leptospirosisDataCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_bloodbank);

        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_survillanceframe); //Remember this is the FrameLayout area within your activity_main.xml
        getLayoutInflater().inflate(R.layout.activity_leptospirosis, contentFrameLayout);

        btnOrange = (Button) findViewById(R.id.btn_leptoorange);
        btnBlue = (Button) findViewById(R.id.btn_leptoblue);
        btnLGreen = (Button) findViewById(R.id.btn_leptogreen);
        recyclerView = (RecyclerView) findViewById(R.id.recview_lepto);

        mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(mLayoutManager);

        apiInterface = ApiClient.getClient().create(ApiInterface.class);

        leptospirosisDataListList = new ArrayList<>();
        leptospirosisDAffectedList = new ArrayList<>();
        leptospirosisOReportedList = new ArrayList<>();
        leptospirosisLCCList = new ArrayList<>();
        leptospirosisDataCall = apiInterface.leptospirosisData();
        leptospirosisDataCall.enqueue(new Callback<LeptospirosisData>() {
            @Override
            public void onResponse(Call<LeptospirosisData> call, Response<LeptospirosisData> response) {
                leptospirosisDataListList.addAll(response.body().getLeptospirosisDataListList());
                leptospirosisDAffectedList.addAll(leptospirosisDataListList.get(0).getLeptospirosisDAffectedList());
                leptospirosisOReportedList.addAll(leptospirosisDataListList.get(0).getLeptospirosisOReportedList());
                leptospirosisLCCList.addAll(leptospirosisDataListList.get(0).getLeptospirosisLCCList());

                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getApplicationContext(), leptospirosisDAffectedList, leptospirosisOReportedList, leptospirosisLCCList, "DistrictsAffected", 1);
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();

                btnOrange.setText(leptospirosisDAffectedList.get(1).getTotal_Number_of_districts_affected());
                btnBlue.setText(leptospirosisOReportedList.get(1).getTotal_Number_of_Leptospirosis_outbreaks_reported());
                btnLGreen.setText(leptospirosisLCCList.get(1).getTotal_laboratory_leptospirosis_casesreported());
            }

            @Override
            public void onFailure(Call<LeptospirosisData> call, Throwable t) {

            }
        });

        btnOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getApplicationContext(), leptospirosisDAffectedList, leptospirosisOReportedList, leptospirosisLCCList, "DistrictsAffected", 1);
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();

            }
        });

        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getApplicationContext(), leptospirosisDAffectedList, leptospirosisOReportedList, leptospirosisLCCList, "OutbreakReported", 1);
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });

        btnLGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getApplicationContext(), leptospirosisDAffectedList, leptospirosisOReportedList, leptospirosisLCCList, "LaboratoryConfirmed", 1);
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });
    }
}
