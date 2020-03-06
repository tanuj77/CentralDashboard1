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
import com.chi.centraldashboard.apiCall.bin.NACOData;
import com.chi.centraldashboard.apiCall.bin.NACODataList;
import com.chi.centraldashboard.apiCall.bin.NACOHIVTests;
import com.chi.centraldashboard.apiCall.bin.NACOPLHIVART;
import com.chi.centraldashboard.apiCall.bin.NACOPLHIVViralLoad;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NACOActivity extends MiSurvillanceActivity {
    Button btnOrange, btnBlue, btnLGreen;
    android.support.v7.widget.LinearLayoutManager mLayoutManager;
    private ApiInterface apiInterface;
    private RecyclerView recyclerView;
    PbsCusRecViewThreeAdapter pbsCusRecViewThreeAdapter;
    NCDCCusRecviewFourAdapter ncdcCusRecviewFourAdapter;

    private List<NACODataList> nacoDataListList;
    private List<NACOHIVTests> nacohivTestsList;
    private List<NACOPLHIVART> nacoplhivartList;
    private List<NACOPLHIVViralLoad> nacoplhivViralLoadList;

    Call<NACOData> nacoDataCall;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_bloodbank);

        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_survillanceframe); //Remember this is the FrameLayout area within your activity_main.xml
        getLayoutInflater().inflate(R.layout.activity_naco, contentFrameLayout);

        btnOrange = (Button) findViewById(R.id.btn_nacoorange);
        btnBlue = (Button) findViewById(R.id.btn_nacoblue);
        btnLGreen = (Button) findViewById(R.id.btn_nacogreen);


        recyclerView = (RecyclerView) findViewById(R.id.recview_naco);

        mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(mLayoutManager);

        apiInterface = ApiClient.getClient().create(ApiInterface.class);
        nacoDataListList = new ArrayList<>();
        nacohivTestsList = new ArrayList<>();
        nacoplhivartList = new ArrayList<>();
        nacoplhivViralLoadList = new ArrayList<>();
        nacoDataCall = apiInterface.nacoData();
        nacoDataCall.enqueue(new Callback<NACOData>() {
            @Override
            public void onResponse(Call<NACOData> call, Response<NACOData> response) {
                nacoDataListList.addAll(response.body().getNacoDataListList());
                nacohivTestsList.addAll(nacoDataListList.get(0).getNacohivTestsList());
                nacoplhivartList.addAll(nacoDataListList.get(0).getNacoplhivartList());
                nacoplhivViralLoadList.addAll(nacoDataListList.get(0).getNacoplhivViralLoadList());


                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getApplicationContext(), nacohivTestsList, nacoplhivartList, nacoplhivViralLoadList, "NACOTests", 1.2);
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();

                btnOrange.setText(nacohivTestsList.get(1).getTotal_Number_of_HIV_Tests_Conducted());
                btnBlue.setText(nacoplhivartList.get(1).getTotal_Number_of_PLHIV_on_Anti_Retroviral_Therapy_ART());
                btnLGreen.setText(nacoplhivViralLoadList.get(1).getTotal_Number_of_PLHIV_Tested_for_Viral_Load());
            }

            @Override
            public void onFailure(Call<NACOData> call, Throwable t) {

            }
        });

        btnOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getApplicationContext(), nacohivTestsList, nacoplhivartList, nacoplhivViralLoadList, "NACOTests", 1.2);
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });
        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getApplicationContext(), nacohivTestsList, nacoplhivartList, nacoplhivViralLoadList, "NACOart", 1.2);
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });

        btnLGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getApplicationContext(), nacohivTestsList, nacoplhivartList, nacoplhivViralLoadList, "NACOViral",1.2);
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });
    }
}
