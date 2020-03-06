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
import com.chi.centraldashboard.apiCall.NTCPData;
import com.chi.centraldashboard.apiCall.bin.NTCPCOTPA;
import com.chi.centraldashboard.apiCall.bin.NTCPDataList;
import com.chi.centraldashboard.apiCall.bin.NTCPFineImposed;
import com.chi.centraldashboard.apiCall.bin.NTCPPersonQuit;
import com.chi.centraldashboard.apiCall.bin.NTCPQuitline;
import com.chi.centraldashboard.apiCall.bin.NTCPQuitters;
import com.chi.centraldashboard.apiCall.bin.NTCPTCC;
import com.chi.centraldashboard.apiCall.bin.NTCPTCServices;
import com.chi.centraldashboard.apiCall.bin.NTCPUnderNTCP;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NTCPActivity extends MiSurvillanceActivity {
    Button btnOrange, btnBlue, btnLGreen, btnGreen, btnBrown, btnRed, btnLemon, btnPink;
    android.support.v7.widget.LinearLayoutManager mLayoutManager;
    private ApiInterface apiInterface;
    private RecyclerView recyclerView;
    PbsCusRecViewThreeAdapter pbsCusRecViewThreeAdapter;

    private List<NTCPDataList> ntcpDataListList;
    private List<NTCPQuitline> ntcpQuitlineList;
    private List<NTCPQuitters> ntcpQuittersList;
    private List<NTCPPersonQuit> ntcpPersonQuitList;
    private List<NTCPUnderNTCP> ntcpUnderNTCPList;
    private List<NTCPCOTPA> ntcpcotpaList;
    private List<NTCPFineImposed> ntcpFineImposedList;
    private List<NTCPTCC> ntcptccList;
    private List<NTCPTCServices> ntcptcServicesList;

    Call<NTCPData> ntcpDataCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_bloodbank);

        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_survillanceframe); //Remember this is the FrameLayout area within your activity_main.xml
        getLayoutInflater().inflate(R.layout.activity_ntcp, contentFrameLayout);

        btnOrange = (Button) findViewById(R.id.btn_ntcporange);
        btnBlue = (Button) findViewById(R.id.btn_ntcpblue);
        btnLGreen = (Button) findViewById(R.id.btn_ntcplgreen);
        btnGreen = (Button) findViewById(R.id.btn_ntcpgreen);
        btnBrown = (Button) findViewById(R.id.btn_ntcpbrown);
        btnRed = (Button) findViewById(R.id.btn_ntcpred);
        btnLemon = (Button) findViewById(R.id.btn_ntcplemon);
        btnPink = (Button) findViewById(R.id.btn_ntcppink);


        recyclerView = (RecyclerView) findViewById(R.id.recview_ntcp);

        mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(mLayoutManager);

        apiInterface = ApiClient.getClient().create(ApiInterface.class);
        ntcpDataListList = new ArrayList<>();
        ntcpQuitlineList = new ArrayList<>();
        ntcpQuittersList = new ArrayList<>();
        ntcpPersonQuitList = new ArrayList<>();
        ntcpUnderNTCPList = new ArrayList<>();
        ntcpcotpaList = new ArrayList<>();
        ntcpFineImposedList = new ArrayList<>();
        ntcptccList = new ArrayList<>();
        ntcptcServicesList = new ArrayList<>();

        ntcpDataCall = apiInterface.ntcpData();
        ntcpDataCall.enqueue(new Callback<NTCPData>() {
            @Override
            public void onResponse(Call<NTCPData> call, Response<NTCPData> response) {
                ntcpDataListList.addAll(response.body().getNtcpDataListList());
                ntcpQuitlineList.addAll(ntcpDataListList.get(0).getNtcpQuitlineList());
                ntcpQuittersList.addAll(ntcpDataListList.get(0).getNtcpQuittersList());
                ntcpPersonQuitList.addAll(ntcpDataListList.get(0).getNtcpPersonQuitList());
                ntcpUnderNTCPList.addAll(ntcpDataListList.get(0).getNtcpUnderNTCPList());
                ntcpcotpaList.addAll(ntcpDataListList.get(0).getNtcpcotpaList());
                ntcpFineImposedList.addAll(ntcpDataListList.get(0).getNtcpFineImposedList());
                ntcptccList.addAll(ntcpDataListList.get(0).getNtcptccList());
                ntcptcServicesList.addAll(ntcpDataListList.get(0).getNtcptcServicesList());

                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getApplicationContext(), ntcpQuitlineList, ntcpQuittersList, ntcpPersonQuitList,ntcpUnderNTCPList,ntcpcotpaList,ntcpFineImposedList,ntcptccList,ntcptcServicesList,"QuitLine");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();


                btnOrange.setText(ntcpQuitlineList.get(1).getTotal_No_of_calls_Landed_at_Quitline());
                btnBlue.setText(ntcpQuittersList.get(1).getTotal_No_of_registered_Quitters());
                btnLGreen.setText(ntcpPersonQuitList.get(1).getTotal_No_of_persons_who_have_quit());
                btnGreen.setText(ntcpUnderNTCPList.get(1).getTotal_number_of_districts_under_NTCP());
                btnBrown.setText(ntcpcotpaList.get(1).getTotal_No_of_persons_fined_COTPA());
                btnRed.setText(ntcpFineImposedList.get(1).getTotal_Amount_of_fine_imposed());
                btnLemon.setText(ntcptccList.get(1).getTotal_No_of_TCCS_Under_NTCP());
                btnPink.setText(ntcptcServicesList.get(1).getTotal_No_of_persons_who_availed_TC_services());

            }

            @Override
            public void onFailure(Call<NTCPData> call, Throwable t) {

            }
        });

        btnOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getApplicationContext(), ntcpQuitlineList, ntcpQuittersList, ntcpPersonQuitList,ntcpUnderNTCPList,ntcpcotpaList,ntcpFineImposedList,ntcptccList,ntcptcServicesList,"QuitLine");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });

        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getApplicationContext(), ntcpQuitlineList, ntcpQuittersList, ntcpPersonQuitList,ntcpUnderNTCPList,ntcpcotpaList,ntcpFineImposedList,ntcptccList,ntcptcServicesList,"Quitters");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });

        btnLGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getApplicationContext(), ntcpQuitlineList, ntcpQuittersList, ntcpPersonQuitList,ntcpUnderNTCPList,ntcpcotpaList,ntcpFineImposedList,ntcptccList,ntcptcServicesList,"PersonQuit");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });

        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getApplicationContext(), ntcpQuitlineList, ntcpQuittersList, ntcpPersonQuitList,ntcpUnderNTCPList,ntcpcotpaList,ntcpFineImposedList,ntcptccList,ntcptcServicesList,"NtcpUnderNTCP");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });

        btnBrown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getApplicationContext(), ntcpQuitlineList, ntcpQuittersList, ntcpPersonQuitList,ntcpUnderNTCPList,ntcpcotpaList,ntcpFineImposedList,ntcptccList,ntcptcServicesList,"Ntcpcotpa");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });

        btnRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getApplicationContext(), ntcpQuitlineList, ntcpQuittersList, ntcpPersonQuitList,ntcpUnderNTCPList,ntcpcotpaList,ntcpFineImposedList,ntcptccList,ntcptcServicesList,"FineImposed");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });

        btnLemon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getApplicationContext(), ntcpQuitlineList, ntcpQuittersList, ntcpPersonQuitList,ntcpUnderNTCPList,ntcpcotpaList,ntcpFineImposedList,ntcptccList,ntcptcServicesList,"Ntcptcc");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });

        btnPink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getApplicationContext(), ntcpQuitlineList, ntcpQuittersList, ntcpPersonQuitList,ntcpUnderNTCPList,ntcpcotpaList,ntcpFineImposedList,ntcptccList,ntcptcServicesList,"NtcptcServices");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });
    }
}
