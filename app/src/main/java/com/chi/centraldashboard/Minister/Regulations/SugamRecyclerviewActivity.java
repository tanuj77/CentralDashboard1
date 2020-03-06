package com.chi.centraldashboard.Minister.Regulations;

import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.FrameLayout;

import com.chi.centraldashboard.R;
import com.chi.centraldashboard.apiCall.ApiClient;
import com.chi.centraldashboard.apiCall.ApiInterface;
import com.chi.centraldashboard.apiCall.bin.MinisterSugamAppApprovedDMDC;
import com.chi.centraldashboard.apiCall.bin.MinisterSugamAppApprovedPersonalUse;
import com.chi.centraldashboard.apiCall.bin.MinisterSugamAppReceivedDMDC;
import com.chi.centraldashboard.apiCall.bin.MinisterSugamAppReceivedPersonalUse;
import com.chi.centraldashboard.apiCall.bin.MinisterSugamApprovedCT;
import com.chi.centraldashboard.apiCall.bin.MinisterSugamApprovedTL;
import com.chi.centraldashboard.apiCall.bin.MinisterSugamCDSCO;
import com.chi.centraldashboard.apiCall.bin.MinisterSugamConductingCT;
import com.chi.centraldashboard.apiCall.bin.MinisterSugamData;
import com.chi.centraldashboard.apiCall.bin.MinisterSugamDataList;
import com.chi.centraldashboard.apiCall.bin.MinisterSugamFirmsRegDMDC;
import com.chi.centraldashboard.apiCall.bin.MinisterSugamFormulationData;
import com.chi.centraldashboard.apiCall.bin.MinisterSugamManufacturingSite;
import com.chi.centraldashboard.apiCall.bin.MinisterSugamReceivedTL;
import com.chi.centraldashboard.others.ConnectionDetector;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SugamRecyclerviewActivity extends MiRegulations {
    private RecyclerView recyclerView;
    android.support.v7.widget.LinearLayoutManager mLayoutManager;

    private ApiInterface apiInterface;
    ConnectionDetector cd;
    private SugamCusRecviewSevenAdapter sugamCusRecviewSevenAdapter;
    private SugamCusRecviewThreeAdapter sugamCusRecviewThreeAdapter;


    private List<MinisterSugamDataList> ministerSugamDataListList;
    private List<MinisterSugamManufacturingSite> ministerSugamManufacturingSiteList;
    private List<MinisterSugamFormulationData> ministerSugamFormulationDataList;
    private List<MinisterSugamCDSCO> ministerSugamCDSCOList;
    private List<MinisterSugamFirmsRegDMDC> ministerSugamFirmsRegDMDCList;
    private List<MinisterSugamReceivedTL> ministerSugamReceivedTLList;
    private List<MinisterSugamApprovedTL> ministerSugamApprovedTLList;
    private List<MinisterSugamAppReceivedDMDC> ministerSugamAppReceivedDMDCList;
    private List<MinisterSugamAppApprovedDMDC> ministerSugamAppApprovedDMDCList;
    private List<MinisterSugamConductingCT> ministerSugamConductingCTList;
    private List<MinisterSugamApprovedCT> ministerSugamApprovedCTList;
    private List<MinisterSugamAppReceivedPersonalUse> ministerSugamAppReceivedPersonalUseList;
    private List<MinisterSugamAppApprovedPersonalUse> ministerSugamAppApprovedPersonalUseList;


    Call<MinisterSugamData> ministerSugamDataCall;
    String valueFlag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_regulationsframe); //Remember this is the FrameLayout area within your activity_main.xml
        getLayoutInflater().inflate(R.layout.activity_sugamrecyclerview, contentFrameLayout);

        valueFlag = getIntent().getStringExtra("RSkey");
//        Toast.makeText(SugamRecyclerviewActivity.this, loadsPosition, Toast.LENGTH_LONG).show();

        recyclerView = (RecyclerView) findViewById(R.id.recview_sugamact);

        mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(mLayoutManager);


        apiInterface = ApiClient.getClient().create(ApiInterface.class);

        ministerSugamDataListList = new ArrayList<>();
        ministerSugamManufacturingSiteList = new ArrayList<>();
        ministerSugamFormulationDataList = new ArrayList<>();
        ministerSugamCDSCOList = new ArrayList<>();
        ministerSugamFirmsRegDMDCList = new ArrayList<>();
        ministerSugamReceivedTLList = new ArrayList<>();
        ministerSugamApprovedTLList = new ArrayList<>();
        ministerSugamAppReceivedDMDCList = new ArrayList<>();
        ministerSugamAppApprovedDMDCList = new ArrayList<>();
        ministerSugamConductingCTList = new ArrayList<>();
        ministerSugamApprovedCTList = new ArrayList<>();
        ministerSugamAppReceivedPersonalUseList = new ArrayList<>();
        ministerSugamAppApprovedPersonalUseList = new ArrayList<>();


        ministerSugamDataCall = apiInterface.ministerSugamData();
        ministerSugamDataCall.enqueue(new Callback<MinisterSugamData>() {
            @Override
            public void onResponse(Call<MinisterSugamData> call, Response<MinisterSugamData> response) {
                Log.i("RSsugam", "" + response);
                ministerSugamDataListList.addAll(response.body().getMinisterSugamDataListList());
                ministerSugamManufacturingSiteList.addAll(ministerSugamDataListList.get(0).getMinisterSugamManufacturingSiteList());
                ministerSugamFormulationDataList.addAll(ministerSugamDataListList.get(0).getMinisterSugamFormulationDataList());
                ministerSugamCDSCOList.addAll(ministerSugamDataListList.get(0).getMinisterSugamCDSCOList());

                ministerSugamFirmsRegDMDCList.addAll(ministerSugamDataListList.get(0).getMinisterSugamFirmsRegDMDCList());
                ministerSugamReceivedTLList.addAll(ministerSugamDataListList.get(0).getMinisterSugamReceivedTLList());
                ministerSugamApprovedTLList.addAll(ministerSugamDataListList.get(0).getMinisterSugamApprovedTLList());
                ministerSugamAppReceivedDMDCList.addAll(ministerSugamDataListList.get(0).getMinisterSugamAppReceivedDMDCList());
                ministerSugamAppApprovedDMDCList.addAll(ministerSugamDataListList.get(0).getMinisterSugamAppApprovedDMDCList());
                ministerSugamConductingCTList.addAll(ministerSugamDataListList.get(0).getMinisterSugamConductingCTList());
                ministerSugamApprovedCTList.addAll(ministerSugamDataListList.get(0).getMinisterSugamApprovedCTList());
                ministerSugamAppReceivedPersonalUseList.addAll(ministerSugamDataListList.get(0).getMinisterSugamAppReceivedPersonalUseList());
                ministerSugamAppApprovedPersonalUseList.addAll(ministerSugamDataListList.get(0).getMinisterSugamAppApprovedPersonalUseList());


//                sugamCusRecviewSevenAdapter = new SugamCusRecviewSevenAdapter(getContext(), ministerSugamManufacturingSiteList, ministerSugamFormulationDataList, ministerSugamCDSCOList, "manufacturing");
//
//                recyclerView.setLayoutManager(mLayoutManager);
//                recyclerView.setItemAnimator(new DefaultItemAnimator());
//                recyclerView.setAdapter(sugamCusRecviewSevenAdapter);
//                sugamCusRecviewSevenAdapter.notifyDataSetChanged();

                Log.i("RSsssssssssssugam", "" + ministerSugamFormulationDataList);

                if (valueFlag.equalsIgnoreCase("manufacturing") || valueFlag == "manufacturing") {
                    sugamCusRecviewSevenAdapter = new SugamCusRecviewSevenAdapter(getApplicationContext(), ministerSugamManufacturingSiteList, ministerSugamFormulationDataList, ministerSugamCDSCOList, "manufacturing");

                    recyclerView.setLayoutManager(mLayoutManager);
                    recyclerView.setItemAnimator(new DefaultItemAnimator());
                    recyclerView.setAdapter(sugamCusRecviewSevenAdapter);
                    //        sugamCusRecviewSevenAdapter.notifyDataSetChanged();
                }
                if (valueFlag.equalsIgnoreCase("formulation") || valueFlag == "formulation") {
                    sugamCusRecviewSevenAdapter = new SugamCusRecviewSevenAdapter(getApplicationContext(), ministerSugamManufacturingSiteList, ministerSugamFormulationDataList, ministerSugamCDSCOList, "formulation");

                    recyclerView.setLayoutManager(mLayoutManager);
                    recyclerView.setItemAnimator(new DefaultItemAnimator());
                    recyclerView.setAdapter(sugamCusRecviewSevenAdapter);
                    //      sugamCusRecviewSevenAdapter.notifyDataSetChanged();
                }
                if (valueFlag.equalsIgnoreCase("cdsco") || valueFlag == "cdsco") {
                    sugamCusRecviewSevenAdapter = new SugamCusRecviewSevenAdapter(getApplicationContext(), ministerSugamManufacturingSiteList, ministerSugamFormulationDataList, ministerSugamCDSCOList, "cdsco");

                    recyclerView.setLayoutManager(mLayoutManager);
                    recyclerView.setItemAnimator(new DefaultItemAnimator());
                    recyclerView.setAdapter(sugamCusRecviewSevenAdapter);
                    //    sugamCusRecviewSevenAdapter.notifyDataSetChanged();
                }



                if (valueFlag.equalsIgnoreCase("regimportDMDC") || valueFlag == "regimportDMDC") {
                    sugamCusRecviewThreeAdapter = new SugamCusRecviewThreeAdapter(getApplicationContext(), ministerSugamFirmsRegDMDCList, ministerSugamReceivedTLList, ministerSugamApprovedTLList,ministerSugamAppReceivedDMDCList, ministerSugamAppApprovedDMDCList,ministerSugamConductingCTList,ministerSugamApprovedCTList,ministerSugamAppReceivedPersonalUseList,ministerSugamAppApprovedPersonalUseList,"regimportDMDC");

                    recyclerView.setLayoutManager(mLayoutManager);
                    recyclerView.setItemAnimator(new DefaultItemAnimator());
                    recyclerView.setAdapter(sugamCusRecviewThreeAdapter);
                    //    sugamCusRecviewSevenAdapter.notifyDataSetChanged();
                }
                if (valueFlag.equalsIgnoreCase("appreceivedTL") || valueFlag == "appreceivedTL") {
                    sugamCusRecviewThreeAdapter = new SugamCusRecviewThreeAdapter(getApplicationContext(), ministerSugamFirmsRegDMDCList, ministerSugamReceivedTLList, ministerSugamApprovedTLList,ministerSugamAppReceivedDMDCList, ministerSugamAppApprovedDMDCList,ministerSugamConductingCTList,ministerSugamApprovedCTList,ministerSugamAppReceivedPersonalUseList,ministerSugamAppApprovedPersonalUseList,"appreceivedTL");

                    recyclerView.setLayoutManager(mLayoutManager);
                    recyclerView.setItemAnimator(new DefaultItemAnimator());
                    recyclerView.setAdapter(sugamCusRecviewThreeAdapter);
                    //    sugamCusRecviewSevenAdapter.notifyDataSetChanged();
                }
                if (valueFlag.equalsIgnoreCase("appapprovedTL") || valueFlag == "appapprovedTL") {
                    sugamCusRecviewThreeAdapter = new SugamCusRecviewThreeAdapter(getApplicationContext(), ministerSugamFirmsRegDMDCList, ministerSugamReceivedTLList, ministerSugamApprovedTLList,ministerSugamAppReceivedDMDCList, ministerSugamAppApprovedDMDCList,ministerSugamConductingCTList,ministerSugamApprovedCTList,ministerSugamAppReceivedPersonalUseList,ministerSugamAppApprovedPersonalUseList,"appapprovedTL");

                    recyclerView.setLayoutManager(mLayoutManager);
                    recyclerView.setItemAnimator(new DefaultItemAnimator());
                    recyclerView.setAdapter(sugamCusRecviewThreeAdapter);
                    //    sugamCusRecviewSevenAdapter.notifyDataSetChanged();
                }
                if (valueFlag.equalsIgnoreCase("receivedDMDC") || valueFlag == "receivedDMDC") {
                    sugamCusRecviewThreeAdapter = new SugamCusRecviewThreeAdapter(getApplicationContext(), ministerSugamFirmsRegDMDCList, ministerSugamReceivedTLList, ministerSugamApprovedTLList,ministerSugamAppReceivedDMDCList, ministerSugamAppApprovedDMDCList,ministerSugamConductingCTList,ministerSugamApprovedCTList,ministerSugamAppReceivedPersonalUseList,ministerSugamAppApprovedPersonalUseList,"receivedDMDC");

                    recyclerView.setLayoutManager(mLayoutManager);
                    recyclerView.setItemAnimator(new DefaultItemAnimator());
                    recyclerView.setAdapter(sugamCusRecviewThreeAdapter);
                    //    sugamCusRecviewSevenAdapter.notifyDataSetChanged();
                }
                if (valueFlag.equalsIgnoreCase("approvedDMDC") || valueFlag == "approvedDMDC") {
                    sugamCusRecviewThreeAdapter = new SugamCusRecviewThreeAdapter(getApplicationContext(), ministerSugamFirmsRegDMDCList, ministerSugamReceivedTLList, ministerSugamApprovedTLList,ministerSugamAppReceivedDMDCList, ministerSugamAppApprovedDMDCList,ministerSugamConductingCTList,ministerSugamApprovedCTList,ministerSugamAppReceivedPersonalUseList,ministerSugamAppApprovedPersonalUseList,"approvedDMDC");

                    recyclerView.setLayoutManager(mLayoutManager);
                    recyclerView.setItemAnimator(new DefaultItemAnimator());
                    recyclerView.setAdapter(sugamCusRecviewThreeAdapter);
                    //    sugamCusRecviewSevenAdapter.notifyDataSetChanged();
                }
                if (valueFlag.equalsIgnoreCase("receivedCT") || valueFlag == "receivedCT") {
                    sugamCusRecviewThreeAdapter = new SugamCusRecviewThreeAdapter(getApplicationContext(), ministerSugamFirmsRegDMDCList, ministerSugamReceivedTLList, ministerSugamApprovedTLList,ministerSugamAppReceivedDMDCList, ministerSugamAppApprovedDMDCList,ministerSugamConductingCTList,ministerSugamApprovedCTList,ministerSugamAppReceivedPersonalUseList,ministerSugamAppApprovedPersonalUseList,"receivedCT");

                    recyclerView.setLayoutManager(mLayoutManager);
                    recyclerView.setItemAnimator(new DefaultItemAnimator());
                    recyclerView.setAdapter(sugamCusRecviewThreeAdapter);
                    //    sugamCusRecviewSevenAdapter.notifyDataSetChanged();
                }
                if (valueFlag.equalsIgnoreCase("approvedCT") || valueFlag == "approvedCT") {
                    sugamCusRecviewThreeAdapter = new SugamCusRecviewThreeAdapter(getApplicationContext(), ministerSugamFirmsRegDMDCList, ministerSugamReceivedTLList, ministerSugamApprovedTLList,ministerSugamAppReceivedDMDCList, ministerSugamAppApprovedDMDCList,ministerSugamConductingCTList,ministerSugamApprovedCTList,ministerSugamAppReceivedPersonalUseList,ministerSugamAppApprovedPersonalUseList,"approvedCT");

                    recyclerView.setLayoutManager(mLayoutManager);
                    recyclerView.setItemAnimator(new DefaultItemAnimator());
                    recyclerView.setAdapter(sugamCusRecviewThreeAdapter);
                    //    sugamCusRecviewSevenAdapter.notifyDataSetChanged();
                }
                if (valueFlag.equalsIgnoreCase("receivedPersonalUse") || valueFlag == "receivedPersonalUse") {
                    sugamCusRecviewThreeAdapter = new SugamCusRecviewThreeAdapter(getApplicationContext(), ministerSugamFirmsRegDMDCList, ministerSugamReceivedTLList, ministerSugamApprovedTLList,ministerSugamAppReceivedDMDCList, ministerSugamAppApprovedDMDCList,ministerSugamConductingCTList,ministerSugamApprovedCTList,ministerSugamAppReceivedPersonalUseList,ministerSugamAppApprovedPersonalUseList,"receivedPersonalUse");

                    recyclerView.setLayoutManager(mLayoutManager);
                    recyclerView.setItemAnimator(new DefaultItemAnimator());
                    recyclerView.setAdapter(sugamCusRecviewThreeAdapter);
                    //    sugamCusRecviewSevenAdapter.notifyDataSetChanged();
                }
                if (valueFlag.equalsIgnoreCase("approvedPersonalUse") || valueFlag == "approvedPersonalUse") {
                    sugamCusRecviewThreeAdapter = new SugamCusRecviewThreeAdapter(getApplicationContext(), ministerSugamFirmsRegDMDCList, ministerSugamReceivedTLList, ministerSugamApprovedTLList,ministerSugamAppReceivedDMDCList, ministerSugamAppApprovedDMDCList,ministerSugamConductingCTList,ministerSugamApprovedCTList,ministerSugamAppReceivedPersonalUseList,ministerSugamAppApprovedPersonalUseList,"approvedPersonalUse");

                    recyclerView.setLayoutManager(mLayoutManager);
                    recyclerView.setItemAnimator(new DefaultItemAnimator());
                    recyclerView.setAdapter(sugamCusRecviewThreeAdapter);
                    //    sugamCusRecviewSevenAdapter.notifyDataSetChanged();
                }



            }

            @Override
            public void onFailure(Call<MinisterSugamData> call, Throwable t) {

            }
        });
    }
}

