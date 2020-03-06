package com.chi.centraldashboard.Minister.HumanResouces;

import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.chi.centraldashboard.Minister.Survillance.NCDCCusRecviewFourAdapter;
import com.chi.centraldashboard.R;
import com.chi.centraldashboard.apiCall.ApiClient;
import com.chi.centraldashboard.apiCall.ApiInterface;
import com.chi.centraldashboard.apiCall.bin.CommunityProcessData;
import com.chi.centraldashboard.apiCall.bin.CommunityProcessDataList;
import com.chi.centraldashboard.apiCall.bin.CommunityProcess_DBT;
import com.chi.centraldashboard.apiCall.bin.CommunityProcess_MAS;
import com.chi.centraldashboard.apiCall.bin.CommunityProcess_RKSs;
import com.chi.centraldashboard.apiCall.bin.CommunityProcess_RuralAndUrban;
import com.chi.centraldashboard.apiCall.bin.CommunityProcess_VHSNCs;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CommunityProcessActivity extends MiHumanResource {


    Button btnOrange, btnBlue, btnLGreen, btnGreen, btnBrown;

    private NCDCCusRecviewFourAdapter ncdcCusRecviewFourAdapter;
    android.support.v7.widget.LinearLayoutManager mLayoutManager;
    private ApiInterface apiInterface;

    RecyclerView recView;

    private List<CommunityProcessDataList> communityProcessDataListList;
    private List<CommunityProcess_VHSNCs> communityProcess_vhsnCsList;
    private List<CommunityProcess_RKSs> communityProcess_rkSsList;
    private List<CommunityProcess_RuralAndUrban> communityProcess_ruralAndUrbanList;
    private List<CommunityProcess_DBT> communityProcess_dbtList;
    private List<CommunityProcess_MAS> communityProcess_masList;
    Call<CommunityProcessData> communityProcessDataCall;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //  setContentView(R.layout.activity_communityprocess);

        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_hrframe); //Remember this is the FrameLayout area within your activity_main.xml
        getLayoutInflater().inflate(R.layout.activity_communityprocess, contentFrameLayout);

        btnOrange = (Button) findViewById(R.id.btn_cporange);
        btnBlue = (Button) findViewById(R.id.btn_cpblue);
        btnLGreen = (Button) findViewById(R.id.btn_cplgreen);
        btnGreen = (Button) findViewById(R.id.btn_cpgreen);
        btnBrown = (Button) findViewById(R.id.btn_cpbrown);

        recView = (RecyclerView) findViewById(R.id.recview_cp);


        mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recView.setHasFixedSize(true);
        recView.setLayoutManager(mLayoutManager);

        apiInterface = ApiClient.getClient().create(ApiInterface.class);
        communityProcessDataListList = new ArrayList<>();
        communityProcess_vhsnCsList = new ArrayList<>();
        communityProcess_rkSsList = new ArrayList<>();
        communityProcess_ruralAndUrbanList = new ArrayList<>();
        communityProcess_dbtList = new ArrayList<>();
        communityProcess_masList = new ArrayList<>();
        communityProcessDataCall = apiInterface.communityprocessData();
        communityProcessDataCall.enqueue(new Callback<CommunityProcessData>() {
            @Override
            public void onResponse(Call<CommunityProcessData> call, Response<CommunityProcessData> response) {
                communityProcessDataListList.addAll(response.body().getCommunityProcessDataListList());
                communityProcess_vhsnCsList.addAll(communityProcessDataListList.get(0).getCommunityProcess_vhsnCsList());
                communityProcess_rkSsList.addAll(communityProcessDataListList.get(0).getCommunityProcess_rkSsList());
                communityProcess_ruralAndUrbanList.addAll(communityProcessDataListList.get(0).getCommunityProcess_ruralAndUrbanList());
                communityProcess_dbtList.addAll(communityProcessDataListList.get(0).getCommunityProcess_dbtList());
                communityProcess_masList.addAll(communityProcessDataListList.get(0).getCommunityProcess_masList());

                ncdcCusRecviewFourAdapter = new NCDCCusRecviewFourAdapter(getApplicationContext(), communityProcess_vhsnCsList, communityProcess_rkSsList, communityProcess_ruralAndUrbanList, communityProcess_dbtList, communityProcess_masList, "CP_VHSNCs");
                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(ncdcCusRecviewFourAdapter);
                ncdcCusRecviewFourAdapter.notifyDataSetChanged();

                btnOrange.setText(communityProcess_vhsnCsList.get(1).getTotal_Number_of_VHSNCs_formed_against_number_of_revenue_villages());
                btnBlue.setText(communityProcess_rkSsList.get(1).getTotal_Vacancies_of_Rogi_Kalyan_Samiti_RKSs_against_total_number_of_PHC_CHC_SDH_DH());
                btnLGreen.setText(communityProcess_ruralAndUrbanList.get(1).getNumber_of_ASHAs_in_position_against_approved_strength_Both_in_rural_and_urban_areas());
                btnGreen.setText(communityProcess_dbtList.get(1).getTotal_Percentage_of_ASHAs_whose_Honorarium_is_Paid_through_DBT());
                btnBrown.setText(communityProcess_masList.get(1).getTotal_Percentage_of_MAS_created_against_approved());

            }

            @Override
            public void onFailure(Call<CommunityProcessData> call, Throwable t) {

            }
        });
        btnOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ncdcCusRecviewFourAdapter = new NCDCCusRecviewFourAdapter(getApplicationContext(), communityProcess_vhsnCsList, communityProcess_rkSsList, communityProcess_ruralAndUrbanList, communityProcess_dbtList, communityProcess_masList, "CP_VHSNCs");
                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(ncdcCusRecviewFourAdapter);
                ncdcCusRecviewFourAdapter.notifyDataSetChanged();
            }
        });

        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ncdcCusRecviewFourAdapter = new NCDCCusRecviewFourAdapter(getApplicationContext(), communityProcess_vhsnCsList, communityProcess_rkSsList, communityProcess_ruralAndUrbanList, communityProcess_dbtList, communityProcess_masList, "CP_RKSs");
                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(ncdcCusRecviewFourAdapter);
                ncdcCusRecviewFourAdapter.notifyDataSetChanged();
            }
        });

        btnLGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ncdcCusRecviewFourAdapter = new NCDCCusRecviewFourAdapter(getApplicationContext(), communityProcess_vhsnCsList, communityProcess_rkSsList, communityProcess_ruralAndUrbanList, communityProcess_dbtList, communityProcess_masList, "CP_RuralAndUrban");
                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(ncdcCusRecviewFourAdapter);
                ncdcCusRecviewFourAdapter.notifyDataSetChanged();
            }
        });

        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ncdcCusRecviewFourAdapter = new NCDCCusRecviewFourAdapter(getApplicationContext(), communityProcess_vhsnCsList, communityProcess_rkSsList, communityProcess_ruralAndUrbanList, communityProcess_dbtList, communityProcess_masList, "CP_DBT");
                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(ncdcCusRecviewFourAdapter);
                ncdcCusRecviewFourAdapter.notifyDataSetChanged();
            }
        });

        btnBrown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ncdcCusRecviewFourAdapter = new NCDCCusRecviewFourAdapter(getApplicationContext(), communityProcess_vhsnCsList, communityProcess_rkSsList, communityProcess_ruralAndUrbanList, communityProcess_dbtList, communityProcess_masList, "CP_MAS");
                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(ncdcCusRecviewFourAdapter);
                ncdcCusRecviewFourAdapter.notifyDataSetChanged();
            }
        });
    }
}
