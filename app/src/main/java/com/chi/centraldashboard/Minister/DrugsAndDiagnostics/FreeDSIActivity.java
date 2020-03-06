package com.chi.centraldashboard.Minister.DrugsAndDiagnostics;

import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.chi.centraldashboard.R;
import com.chi.centraldashboard.apiCall.ApiClient;
import com.chi.centraldashboard.apiCall.ApiInterface;
import com.chi.centraldashboard.apiCall.bin.MinisterFreeDSIDHs;
import com.chi.centraldashboard.apiCall.bin.MinisterFreeDSIDS;
import com.chi.centraldashboard.apiCall.bin.MinisterFreeDSIData;
import com.chi.centraldashboard.apiCall.bin.MinisterFreeDSIDataList;
import com.chi.centraldashboard.apiCall.bin.MinisterFreeDSILS;
import com.chi.centraldashboard.apiCall.bin.MinisterFreeDSIRS;
import com.chi.centraldashboard.others.ConnectionDetector;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FreeDSIActivity extends MiDrugsAndDiagnostics {
    ConnectionDetector cd;
    String strNinId;
    TextView tvFiltersHeading, tvStatetop;
    Button btnDetailedStatus, btnOrange, btnBlue, btnOrange2, btnBlue2;
    private RecyclerView recView;
    private FreeDSICusRecviewThreeAdapter freeDSICusRecviewAdapter;
    android.support.v7.widget.LinearLayoutManager mLayoutManager;
    private ApiInterface apiInterface;

    private List<MinisterFreeDSIDataList> ministerFreeDSIDataListList;
    private List<MinisterFreeDSIDS> ministerFreeDSIDSList;
    private List<MinisterFreeDSILS> ministerFreeDSILSList;
    private List<MinisterFreeDSIRS> ministerFreeDSIRSList;
    private List<MinisterFreeDSIDHs> ministerFreeDSIDHsList;

    Call<MinisterFreeDSIData> ministerFreeDSIDataCall;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_nhrrdata);

        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_drugsanddiagnosticsframe); //Remember this is the FrameLayout area within your activity_main.xml
        getLayoutInflater().inflate(R.layout.activity_freedsi, contentFrameLayout);

        btnOrange = (Button) findViewById(R.id.btn_freeorange);
        btnBlue = (Button) findViewById(R.id.btn_freebblue);
        btnOrange2 = (Button) findViewById(R.id.btn_freeorange2);
        btnBlue2 = (Button) findViewById(R.id.btn_freebblue2);
        recView = (RecyclerView) findViewById(R.id.recview_freedsi);

        apiInterface = ApiClient.getClient().create(ApiInterface.class);
        mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recView.setHasFixedSize(true);
        recView.setLayoutManager(mLayoutManager);

        ministerFreeDSIDataListList = new ArrayList<>();
        ministerFreeDSIDSList = new ArrayList<>();
        ministerFreeDSILSList = new ArrayList<>();
        ministerFreeDSIRSList = new ArrayList<>();
        ministerFreeDSIDHsList = new ArrayList<>();

        ministerFreeDSIDataCall = apiInterface.ministerFreeDSIData();
        ministerFreeDSIDataCall.enqueue(new Callback<MinisterFreeDSIData>() {
            @Override
            public void onResponse(Call<MinisterFreeDSIData> call, Response<MinisterFreeDSIData> response) {
                ministerFreeDSIDataListList.addAll(response.body().getMinisterFreeDSIDataListList());
                ministerFreeDSIDSList.addAll(ministerFreeDSIDataListList.get(0).getMinisterFreeDSIDSList());
                ministerFreeDSILSList.addAll(ministerFreeDSIDataListList.get(0).getMinisterFreeDSILSList());
                ministerFreeDSIRSList.addAll(ministerFreeDSIDataListList.get(0).getMinisterFreeDSIRSList());
                ministerFreeDSIDHsList.addAll(ministerFreeDSIDataListList.get(0).getMinisterFreeDSIDHsList());


                freeDSICusRecviewAdapter = new FreeDSICusRecviewThreeAdapter(getApplicationContext(), ministerFreeDSIDSList, ministerFreeDSILSList, ministerFreeDSIRSList, ministerFreeDSIDHsList, "ds");
                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(freeDSICusRecviewAdapter);
                freeDSICusRecviewAdapter.notifyDataSetChanged();

                btnOrange.setText(ministerFreeDSIDSList.get(1).getTotal_Number_of_States_UTs_implemented_Free_Diagnostics_Services());
                btnBlue.setText(ministerFreeDSILSList.get(1).getTotal_Number_of_States_UTs_implemented_Free_Laboratory_Services());
                btnOrange2.setText(ministerFreeDSIRSList.get(1).getTotal_Number_of_States_UTs_implemented_Free_Tele_Radiology_Services());
                btnBlue2.setText(ministerFreeDSIDHsList.get(1).getTotal_Number_of_States_UTs_implemented_Free_CT_Scan_services_in_DHs());

            }

            @Override
            public void onFailure(Call<MinisterFreeDSIData> call, Throwable t) {

            }
        });
        btnOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                freeDSICusRecviewAdapter = new FreeDSICusRecviewThreeAdapter(getApplicationContext(), ministerFreeDSIDSList, ministerFreeDSILSList, ministerFreeDSIRSList, ministerFreeDSIDHsList, "ds");
                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(freeDSICusRecviewAdapter);
                freeDSICusRecviewAdapter.notifyDataSetChanged();
            }
        });

        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                freeDSICusRecviewAdapter = new FreeDSICusRecviewThreeAdapter(getApplicationContext(), ministerFreeDSIDSList, ministerFreeDSILSList, ministerFreeDSIRSList, ministerFreeDSIDHsList, "ls");
                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(freeDSICusRecviewAdapter);
                freeDSICusRecviewAdapter.notifyDataSetChanged();
            }
        });

        btnOrange2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                freeDSICusRecviewAdapter = new FreeDSICusRecviewThreeAdapter(getApplicationContext(), ministerFreeDSIDSList, ministerFreeDSILSList, ministerFreeDSIRSList, ministerFreeDSIDHsList, "rs");
                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(freeDSICusRecviewAdapter);
                freeDSICusRecviewAdapter.notifyDataSetChanged();
            }
        });

        btnBlue2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                freeDSICusRecviewAdapter = new FreeDSICusRecviewThreeAdapter(getApplicationContext(), ministerFreeDSIDSList, ministerFreeDSILSList, ministerFreeDSIRSList, ministerFreeDSIDHsList, "dhs");
                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(freeDSICusRecviewAdapter);
                freeDSICusRecviewAdapter.notifyDataSetChanged();
            }
        });

    }
}
