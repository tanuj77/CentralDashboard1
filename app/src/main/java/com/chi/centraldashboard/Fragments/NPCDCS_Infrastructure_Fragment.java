package com.chi.centraldashboard.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.chi.centraldashboard.Minister.Survillance.PbsCusRecViewThreeAdapter;
import com.chi.centraldashboard.R;
import com.chi.centraldashboard.apiCall.ApiClient;
import com.chi.centraldashboard.apiCall.ApiInterface;
import com.chi.centraldashboard.apiCall.bin.NPCDCS_InfraData;
import com.chi.centraldashboard.apiCall.bin.NPCDCS_InfraDataList;
import com.chi.centraldashboard.apiCall.bin.NPCDCS_Infra_CCU;
import com.chi.centraldashboard.apiCall.bin.NPCDCS_Infra_CHCNCD;
import com.chi.centraldashboard.apiCall.bin.NPCDCS_Infra_DayCare;
import com.chi.centraldashboard.apiCall.bin.NPCDCS_Infra_NCDCells;
import com.chi.centraldashboard.apiCall.bin.NPCDCS_Infra_NCDClinics;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class NPCDCS_Infrastructure_Fragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    private RecyclerView recView;
    android.support.v7.widget.LinearLayoutManager mLayoutManager;
    private ApiInterface apiInterface;

    PbsCusRecViewThreeAdapter pbsCusRecViewThreeAdapter;
    Button btnDetailedStatus, btnOrange, btnBlue, btnLGreen, btnGreen, btnBrown;

    private List<NPCDCS_InfraDataList> npcdcs_infraDataListList;
    private List<NPCDCS_Infra_NCDCells> npcdcs_infra_ncdCellsList;
    private List<NPCDCS_Infra_CHCNCD> npcdcs_infra_chcncdList;
    private List<NPCDCS_Infra_NCDClinics> npcdcs_infra_ncdClinicsList;
    private List<NPCDCS_Infra_CCU> npcdcs_infra_ccuList;
    private List<NPCDCS_Infra_DayCare> npcdcs_infra_dayCareList;
    Call<NPCDCS_InfraData> npcdcs_infraDataCall;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_npcdcs__infrastructure_, container, false);
        btnOrange = (Button) view.findViewById(R.id.btn_npcdcsorange);
        btnBlue = (Button) view.findViewById(R.id.btn_npcdcsblue);
        btnLGreen = (Button) view.findViewById(R.id.btn_npcdcslgreen);
        btnGreen = (Button) view.findViewById(R.id.btn_npcdcsgreen);
        btnBrown = (Button) view.findViewById(R.id.btn_npcdcsbrown);

        recView = (RecyclerView) view.findViewById(R.id.recview_npcdcs);
        mLayoutManager = new LinearLayoutManager(getContext());
        recView.setHasFixedSize(true);
        recView.setLayoutManager(mLayoutManager);


        apiInterface = ApiClient.getClient().create(ApiInterface.class);

        npcdcs_infraDataListList = new ArrayList<>();
        npcdcs_infra_ncdCellsList = new ArrayList<>();
        npcdcs_infra_chcncdList = new ArrayList<>();
        npcdcs_infra_ncdClinicsList = new ArrayList<>();
        npcdcs_infra_ccuList = new ArrayList<>();
        npcdcs_infra_dayCareList = new ArrayList<>();
        npcdcs_infraDataCall = apiInterface.npcdcs_InfraData();
        npcdcs_infraDataCall.enqueue(new Callback<NPCDCS_InfraData>() {
            @Override
            public void onResponse(Call<NPCDCS_InfraData> call, Response<NPCDCS_InfraData> response) {
                npcdcs_infraDataListList.addAll(response.body().getNpcdcs_infraDataListList());
                npcdcs_infra_ncdCellsList.addAll(npcdcs_infraDataListList.get(0).getNpcdcs_infra_ncdCellsList());
                npcdcs_infra_chcncdList.addAll(npcdcs_infraDataListList.get(0).getNpcdcs_infra_chcncdList());
                npcdcs_infra_ncdClinicsList.addAll(npcdcs_infraDataListList.get(0).getNpcdcs_infra_ncdClinicsList());
                npcdcs_infra_ccuList.addAll(npcdcs_infraDataListList.get(0).getNpcdcs_infra_ccuList());
                npcdcs_infra_dayCareList.addAll(npcdcs_infraDataListList.get(0).getNpcdcs_infra_dayCareList());

                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getContext(), npcdcs_infra_ncdCellsList, npcdcs_infra_chcncdList, npcdcs_infra_ncdClinicsList, npcdcs_infra_ccuList, npcdcs_infra_dayCareList, "NPCDCS_infra_ncdCells");
                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();

                btnOrange.setText(npcdcs_infra_ncdCellsList.get(1).getTotal_District_NCD_Cells_Functional());
                btnBlue.setText(npcdcs_infra_chcncdList.get(1).getTotal_CHC_NCD_Clinics_Functional());
                btnLGreen.setText(npcdcs_infra_ncdClinicsList.get(1).getTotal_District_NCD_Clinics_Functional());
                btnGreen.setText(npcdcs_infra_ccuList.get(1).getTotal_Cardiac_Care_Units__CCU_Functional());
                btnBrown.setText(npcdcs_infra_dayCareList.get(1).getTotal_District_Day_Care_Centres_Functional());

            }

            @Override
            public void onFailure(Call<NPCDCS_InfraData> call, Throwable t) {

            }
        });

        btnOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getContext(), npcdcs_infra_ncdCellsList, npcdcs_infra_chcncdList, npcdcs_infra_ncdClinicsList, npcdcs_infra_ccuList, npcdcs_infra_dayCareList, "NPCDCS_infra_ncdCells");
                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });


        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getContext(), npcdcs_infra_ncdCellsList, npcdcs_infra_chcncdList, npcdcs_infra_ncdClinicsList, npcdcs_infra_ccuList, npcdcs_infra_dayCareList, "NPCDCS_infra_chcncd");
                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });


        btnLGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getContext(), npcdcs_infra_ncdCellsList, npcdcs_infra_chcncdList, npcdcs_infra_ncdClinicsList, npcdcs_infra_ccuList, npcdcs_infra_dayCareList, "NPCDCS_infra_ncdClinics");
                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });


        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getContext(), npcdcs_infra_ncdCellsList, npcdcs_infra_chcncdList, npcdcs_infra_ncdClinicsList, npcdcs_infra_ccuList, npcdcs_infra_dayCareList, "NPCDCS_infra_ccu");
                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });


        btnBrown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getContext(), npcdcs_infra_ncdCellsList, npcdcs_infra_chcncdList, npcdcs_infra_ncdClinicsList, npcdcs_infra_ccuList, npcdcs_infra_dayCareList, "NPCDCS_infra_daycare");
                recView.setLayoutManager(mLayoutManager);
                recView.setItemAnimator(new DefaultItemAnimator());
                recView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });


        return view;
    }


}
