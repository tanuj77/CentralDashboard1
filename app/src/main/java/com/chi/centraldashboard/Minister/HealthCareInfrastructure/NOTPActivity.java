package com.chi.centraldashboard.Minister.HealthCareInfrastructure;

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
import com.chi.centraldashboard.apiCall.bin.NOTPData;
import com.chi.centraldashboard.apiCall.bin.NOTPDataList;
import com.chi.centraldashboard.apiCall.bin.NOTP_CentralRegistry;
import com.chi.centraldashboard.apiCall.bin.NOTP_Eyebanks;
import com.chi.centraldashboard.apiCall.bin.NOTP_Organs;
import com.chi.centraldashboard.apiCall.bin.NOTP_OrgansandTissues;
import com.chi.centraldashboard.apiCall.bin.NOTP_PatientsOrganwise;
import com.chi.centraldashboard.apiCall.bin.NOTP_Pledged;
import com.chi.centraldashboard.apiCall.bin.NOTP_TrendsCountry;
import com.chi.centraldashboard.apiCall.bin.NOTP_rotto;
import com.chi.centraldashboard.apiCall.bin.NOTP_sotto;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NOTPActivity extends MiHealthCareInfrastructureActivity {
    Button btnOrange, btnBlue, btnLGreen, btnGreen, btnBrown, btnRed, btnLemon, btnPink, btn_darkOrange;
    android.support.v7.widget.LinearLayoutManager mLayoutManager;
    private ApiInterface apiInterface;
    private RecyclerView recyclerView;

    NHRRStatewiseCustomRecViewThreeAdapter nhrrStatewiseCustomRecViewThreeAdapter;

    private List<NOTPDataList> notpDataListList;
    private List<NOTP_Organs> notp_organsList;
    private List<NOTP_OrgansandTissues> notp_organsandTissuesList;
    private List<NOTP_Eyebanks> notp_eyebanksList;
    private List<NOTP_Pledged> notp_pledgedList;
    private List<NOTP_TrendsCountry> notp_trendsCountryList;
    private List<NOTP_CentralRegistry> notp_centralRegistryList;
    private List<NOTP_PatientsOrganwise> notp_patientsOrganwiseList;
    private List<NOTP_rotto> notp_rottoList;
    private List<NOTP_sotto> notp_sottoList;

    Call<NOTPData> notpDataCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_bloodbank);

        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_healthcareinfraframe); //Remember this is the FrameLayout area within your activity_main.xml
        getLayoutInflater().inflate(R.layout.activity_notp, contentFrameLayout);


        btnOrange = (Button) findViewById(R.id.btn_notporange);
        btnBlue = (Button) findViewById(R.id.btn_notpblue);
        btnLGreen = (Button) findViewById(R.id.btn_notplgreen);
        btnGreen = (Button) findViewById(R.id.btn_notpgreen);
        btnBrown = (Button) findViewById(R.id.btn_notpbrown);
        btnRed = (Button) findViewById(R.id.btn_notpred);
        btnLemon = (Button) findViewById(R.id.btn_notplemon);
        btnPink = (Button) findViewById(R.id.btn_notppink);
        btn_darkOrange = (Button) findViewById(R.id.btn_notpdarkorange);


        recyclerView = (RecyclerView) findViewById(R.id.recview_notp);

        mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(mLayoutManager);

        apiInterface = ApiClient.getClient().create(ApiInterface.class);
        notpDataListList = new ArrayList<>();
        notp_organsList = new ArrayList<>();
        notp_organsandTissuesList = new ArrayList<>();
        notp_eyebanksList = new ArrayList<>();
        notp_pledgedList = new ArrayList<>();
        notp_trendsCountryList = new ArrayList<>();
        notp_centralRegistryList = new ArrayList<>();
        notp_patientsOrganwiseList = new ArrayList<>();
        notp_rottoList = new ArrayList<>();
        notp_sottoList = new ArrayList<>();
        notpDataCall = apiInterface.notpData();
        notpDataCall.enqueue(new Callback<NOTPData>() {
            @Override
            public void onResponse(Call<NOTPData> call, Response<NOTPData> response) {
                notpDataListList.addAll(response.body().getNotpDataListList());
                notp_organsList.addAll(notpDataListList.get(0).getNotp_organsList());
                notp_organsandTissuesList.addAll(notpDataListList.get(0).getNotp_organsandTissuesList());
                notp_eyebanksList.addAll(notpDataListList.get(0).getNotp_eyebanksList());
                notp_pledgedList.addAll(notpDataListList.get(0).getNotp_pledgedList());
                notp_trendsCountryList.addAll(notpDataListList.get(0).getNotp_trendsCountryList());
                notp_centralRegistryList.addAll(notpDataListList.get(0).getNotp_centralRegistryList());
                notp_patientsOrganwiseList.addAll(notpDataListList.get(0).getNotp_patientsOrganwiseList());
                notp_rottoList.addAll(notpDataListList.get(0).getNotp_rottoList());
                notp_sottoList.addAll(notpDataListList.get(0).getNotp_sottoList());

                recyclerView.setVisibility(View.VISIBLE);
                nhrrStatewiseCustomRecViewThreeAdapter = new NHRRStatewiseCustomRecViewThreeAdapter(getApplicationContext(), notp_organsList, notp_organsandTissuesList, notp_eyebanksList, notp_pledgedList, notp_trendsCountryList, notp_centralRegistryList, notp_patientsOrganwiseList, notp_rottoList, notp_sottoList, "NOTP_Organs");

                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(nhrrStatewiseCustomRecViewThreeAdapter);
                nhrrStatewiseCustomRecViewThreeAdapter.notifyDataSetChanged();

                btnOrange.setText(notp_organsList.get(1).getTotal_Number_of_States_UTs_that_have_Adopted());
                btnBlue.setText(notp_organsandTissuesList.get(1).getTotal_Number_of_States_UTs_that_have_Adopted_Transplantation_of_Human_Organs_and_Tissues_Act());
                btnLGreen.setText(notp_eyebanksList.get(1).getTotal_Hospitals_for_Organ_And_Tissue_Retrieval_Transplantation_and_Eye_Banks());
                btnGreen.setText(notp_pledgedList.get(1).getTotal_Number_of_Organ_Tissue_Donors_who_have_pledged_for_Organ());
                btnBrown.setText(notp_trendsCountryList.get(1).getTotal_Transplant_trends_in_the_Country());
                btnRed.setText(notp_centralRegistryList.get(1).getTotal_No_of_Organ_allocation_on_Central_Registry());
                btnLemon.setText(notp_patientsOrganwiseList.get(1).getTotal_No_of_Wait_List_Patients_Organ_Wise());
                btnPink.setText(notp_rottoList.get(1).getTotal_Number_of_Regional_Organ_Tissue_Transplant_Organisation_Rotto());
                btn_darkOrange.setText(notp_sottoList.get(1).getTotal_Number_of_State_Organ_Tissue_Transplant_Organisation_Sotto());


            }

            @Override
            public void onFailure(Call<NOTPData> call, Throwable t) {

            }
        });
        btnOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerView.setVisibility(View.VISIBLE);
                nhrrStatewiseCustomRecViewThreeAdapter = new NHRRStatewiseCustomRecViewThreeAdapter(getApplicationContext(), notp_organsList, notp_organsandTissuesList, notp_eyebanksList, notp_pledgedList, notp_trendsCountryList, notp_centralRegistryList, notp_patientsOrganwiseList, notp_rottoList, notp_sottoList, "NOTP_Organs");

                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(nhrrStatewiseCustomRecViewThreeAdapter);
                nhrrStatewiseCustomRecViewThreeAdapter.notifyDataSetChanged();
            }
        });
        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerView.setVisibility(View.VISIBLE);
                nhrrStatewiseCustomRecViewThreeAdapter = new NHRRStatewiseCustomRecViewThreeAdapter(getApplicationContext(), notp_organsList, notp_organsandTissuesList, notp_eyebanksList, notp_pledgedList, notp_trendsCountryList, notp_centralRegistryList, notp_patientsOrganwiseList, notp_rottoList, notp_sottoList, "NOTP_OrgansAndTissues");

                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(nhrrStatewiseCustomRecViewThreeAdapter);
                nhrrStatewiseCustomRecViewThreeAdapter.notifyDataSetChanged();
            }
        });
        btnLGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerView.setVisibility(View.VISIBLE);
                nhrrStatewiseCustomRecViewThreeAdapter = new NHRRStatewiseCustomRecViewThreeAdapter(getApplicationContext(), notp_organsList, notp_organsandTissuesList, notp_eyebanksList, notp_pledgedList, notp_trendsCountryList, notp_centralRegistryList, notp_patientsOrganwiseList, notp_rottoList, notp_sottoList, "NOTP_EyeBanks");

                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(nhrrStatewiseCustomRecViewThreeAdapter);
                nhrrStatewiseCustomRecViewThreeAdapter.notifyDataSetChanged();
            }
        });
        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerView.setVisibility(View.VISIBLE);
                nhrrStatewiseCustomRecViewThreeAdapter = new NHRRStatewiseCustomRecViewThreeAdapter(getApplicationContext(), notp_organsList, notp_organsandTissuesList, notp_eyebanksList, notp_pledgedList, notp_trendsCountryList, notp_centralRegistryList, notp_patientsOrganwiseList, notp_rottoList, notp_sottoList, "NOTP_Pledged");

                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(nhrrStatewiseCustomRecViewThreeAdapter);
                nhrrStatewiseCustomRecViewThreeAdapter.notifyDataSetChanged();
            }
        });
        btnBrown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerView.setVisibility(View.VISIBLE);
                nhrrStatewiseCustomRecViewThreeAdapter = new NHRRStatewiseCustomRecViewThreeAdapter(getApplicationContext(), notp_organsList, notp_organsandTissuesList, notp_eyebanksList, notp_pledgedList, notp_trendsCountryList, notp_centralRegistryList, notp_patientsOrganwiseList, notp_rottoList, notp_sottoList, "NOTP_TrendsCountry");

                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(nhrrStatewiseCustomRecViewThreeAdapter);
                nhrrStatewiseCustomRecViewThreeAdapter.notifyDataSetChanged();
            }
        });
        btnRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerView.setVisibility(View.INVISIBLE);
                nhrrStatewiseCustomRecViewThreeAdapter = new NHRRStatewiseCustomRecViewThreeAdapter(getApplicationContext(), notp_organsList, notp_organsandTissuesList, notp_eyebanksList, notp_pledgedList, notp_trendsCountryList, notp_centralRegistryList, notp_patientsOrganwiseList, notp_rottoList, notp_sottoList, "NOTP_CentralRegistry");

                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(nhrrStatewiseCustomRecViewThreeAdapter);
                nhrrStatewiseCustomRecViewThreeAdapter.notifyDataSetChanged();
            }
        });
        btnLemon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerView.setVisibility(View.VISIBLE);
                nhrrStatewiseCustomRecViewThreeAdapter = new NHRRStatewiseCustomRecViewThreeAdapter(getApplicationContext(), notp_organsList, notp_organsandTissuesList, notp_eyebanksList, notp_pledgedList, notp_trendsCountryList, notp_centralRegistryList, notp_patientsOrganwiseList, notp_rottoList, notp_sottoList, "NOTP_PatientsOrganwise");

                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(nhrrStatewiseCustomRecViewThreeAdapter);
                nhrrStatewiseCustomRecViewThreeAdapter.notifyDataSetChanged();
            }
        });
        btnPink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerView.setVisibility(View.VISIBLE);
                nhrrStatewiseCustomRecViewThreeAdapter = new NHRRStatewiseCustomRecViewThreeAdapter(getApplicationContext(), notp_organsList, notp_organsandTissuesList, notp_eyebanksList, notp_pledgedList, notp_trendsCountryList, notp_centralRegistryList, notp_patientsOrganwiseList, notp_rottoList, notp_sottoList, "NOTP_Rotto");

                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(nhrrStatewiseCustomRecViewThreeAdapter);
                nhrrStatewiseCustomRecViewThreeAdapter.notifyDataSetChanged();
            }
        });
        btn_darkOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerView.setVisibility(View.VISIBLE);
                nhrrStatewiseCustomRecViewThreeAdapter = new NHRRStatewiseCustomRecViewThreeAdapter(getApplicationContext(), notp_organsList, notp_organsandTissuesList, notp_eyebanksList, notp_pledgedList, notp_trendsCountryList, notp_centralRegistryList, notp_patientsOrganwiseList, notp_rottoList, notp_sottoList, "NOTP_Sotto");

                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(nhrrStatewiseCustomRecViewThreeAdapter);
                nhrrStatewiseCustomRecViewThreeAdapter.notifyDataSetChanged();
            }
        });
    }
}
