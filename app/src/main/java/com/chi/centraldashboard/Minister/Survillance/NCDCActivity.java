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
import com.chi.centraldashboard.apiCall.bin.NCDCData;
import com.chi.centraldashboard.apiCall.bin.NCDCDataList;
import com.chi.centraldashboard.apiCall.bin.NCDCLeaseDeed;
import com.chi.centraldashboard.apiCall.bin.NCDCMOUSigned;
import com.chi.centraldashboard.apiCall.bin.NCDCMoneyReleased;
import com.chi.centraldashboard.apiCall.bin.NCDCTotalAmount;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NCDCActivity extends MiSurvillanceActivity {
    Button btnOrange, btnBlue, btnLGreen, btnGreen;
    android.support.v7.widget.LinearLayoutManager mLayoutManager;
    private ApiInterface apiInterface;
    private RecyclerView recyclerView;
    PbsCusRecViewThreeAdapter pbsCusRecViewThreeAdapter;
    NCDCCusRecviewFourAdapter ncdcCusRecviewFourAdapter;

    private List<NCDCDataList> ncdcDataListList;
    private List<NCDCMOUSigned> ncdcmouSignedList;
    private List<NCDCLeaseDeed> ncdcLeaseDeedList;
    private List<NCDCMoneyReleased> ncdcMoneyReleasedList;
    private List<NCDCTotalAmount> ncdcTotalAmountList;

    Call<NCDCData> ncdcDataCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_bloodbank);

        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_survillanceframe); //Remember this is the FrameLayout area within your activity_main.xml
        getLayoutInflater().inflate(R.layout.activity_ncdc, contentFrameLayout);

        btnOrange = (Button) findViewById(R.id.btn_ncdcorange);
        btnBlue = (Button) findViewById(R.id.btn_ncdcblue);
        btnLGreen = (Button) findViewById(R.id.btn_ncdclgreen);
        btnGreen = (Button) findViewById(R.id.btn_ncdcgreen);

        recyclerView = (RecyclerView) findViewById(R.id.recview_ncdc);

        mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(mLayoutManager);

        apiInterface = ApiClient.getClient().create(ApiInterface.class);

        ncdcDataListList = new ArrayList<>();
        ncdcmouSignedList = new ArrayList<>();
        ncdcLeaseDeedList = new ArrayList<>();
        ncdcMoneyReleasedList = new ArrayList<>();
        ncdcTotalAmountList = new ArrayList<>();

        ncdcDataCall = apiInterface.ncdcData();
        ncdcDataCall.enqueue(new Callback<NCDCData>() {
            @Override
            public void onResponse(Call<NCDCData> call, Response<NCDCData> response) {
                ncdcDataListList.addAll(response.body().getNcdcDataListList());
                ncdcmouSignedList.addAll(ncdcDataListList.get(0).getNcdcmouSignedList());
                ncdcLeaseDeedList.addAll(ncdcDataListList.get(0).getNcdcLeaseDeedList());
                ncdcMoneyReleasedList.addAll(ncdcDataListList.get(0).getNcdcMoneyReleasedList());
                ncdcTotalAmountList.addAll(ncdcDataListList.get(0).getNcdcTotalAmountList());

                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getApplicationContext(), ncdcmouSignedList, ncdcMoneyReleasedList, ncdcTotalAmountList, "mousigned");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();

                btnOrange.setText(ncdcmouSignedList.get(1).getTotal_MOU_Signed_Between_Govt_of_India_And_State_Govt());
                btnBlue.setText(ncdcLeaseDeedList.get(1).getTotal_Lease_Deed_Signed_Land_Transfered());
                btnLGreen.setText(ncdcMoneyReleasedList.get(1).getTotal_Money_Released_For_Construction_of_Branches_In_Lakh());
                btnGreen.setText(ncdcTotalAmountList.get(1).getTotal_Amount_In_Lakh());

            }

            @Override
            public void onFailure(Call<NCDCData> call, Throwable t) {

            }
        });
        btnOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getApplicationContext(), ncdcmouSignedList, ncdcMoneyReleasedList, ncdcTotalAmountList, "mousigned");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });

        btnLGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getApplicationContext(), ncdcmouSignedList, ncdcMoneyReleasedList, ncdcTotalAmountList, "moneyrealesed");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });
        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getApplicationContext(), ncdcmouSignedList, ncdcMoneyReleasedList, ncdcTotalAmountList, "totalamount");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });

        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ncdcCusRecviewFourAdapter = new NCDCCusRecviewFourAdapter(getApplicationContext(), ncdcLeaseDeedList, "leasedeed");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(ncdcCusRecviewFourAdapter);
                ncdcCusRecviewFourAdapter.notifyDataSetChanged();
            }
        });
    }
}
