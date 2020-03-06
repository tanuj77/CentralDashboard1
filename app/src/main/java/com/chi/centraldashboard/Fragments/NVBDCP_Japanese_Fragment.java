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
import com.chi.centraldashboard.apiCall.bin.NVBDCP_JapeneseData;
import com.chi.centraldashboard.apiCall.bin.NVBDCP_JapeneseDataList;
import com.chi.centraldashboard.apiCall.bin.NVBDCP_Japenese_Deaths;
import com.chi.centraldashboard.apiCall.bin.NVBDCP_Japenese_JEVaccination;
import com.chi.centraldashboard.apiCall.bin.NVBDCP_Japenese_PICUsFunctional;
import com.chi.centraldashboard.apiCall.bin.NVBDCP_Japenese_PICUsFunds;
import com.chi.centraldashboard.apiCall.bin.NVBDCP_Japenese_PMRFunctional;
import com.chi.centraldashboard.apiCall.bin.NVBDCP_Japenese_PMRFunds;
import com.chi.centraldashboard.apiCall.bin.NVBDCP_Japenese_TotalCases;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class NVBDCP_Japanese_Fragment extends Fragment {
    Button btnOrange, btnBlue, btnLGreen, btnGreen, btnBrown, btnRed, btnLemon, btnPink;
    android.support.v7.widget.LinearLayoutManager mLayoutManager;
    private ApiInterface apiInterface;
    private RecyclerView recyclerView;
    PbsCusRecViewThreeAdapter pbsCusRecViewThreeAdapter;

    private List<NVBDCP_JapeneseDataList> nvbdcp_japeneseDataListList;
    private List<NVBDCP_Japenese_TotalCases> nvbdcp_japenese_totalCasesList;
    private List<NVBDCP_Japenese_Deaths> nvbdcp_japenese_deathsList;
    private List<NVBDCP_Japenese_JEVaccination> nvbdcp_japenese_jeVaccinationList;
    private List<NVBDCP_Japenese_PICUsFunds> nvbdcp_japenese_picUsFundsList;
    private List<NVBDCP_Japenese_PICUsFunctional> nvbdcp_japenese_picUsFunctionalList;
    private List<NVBDCP_Japenese_PMRFunds> nvbdcp_japenese_pmrFundsList;
    private List<NVBDCP_Japenese_PMRFunctional> nvbdcp_japenese_pmrFunctionalList;
    Call<NVBDCP_JapeneseData> nvbdcp_japeneseDataCall;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_nvbdcp__japanese_, container, false);
        btnOrange = (Button) view.findViewById(R.id.btn_japeneseorange);
        btnBlue = (Button) view.findViewById(R.id.btn_japeneseblue);
        btnLGreen = (Button) view.findViewById(R.id.btn_japeneselgreen);
        btnGreen = (Button) view.findViewById(R.id.btn_japenesegreen);
        btnBrown = (Button) view.findViewById(R.id.btn_japenesebrown);
        btnRed = (Button) view.findViewById(R.id.btn_japenesered);
        btnLemon = (Button) view.findViewById(R.id.btn_japeneselemon);


        recyclerView = (RecyclerView) view.findViewById(R.id.recview_japenese);

        mLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(mLayoutManager);

        apiInterface = ApiClient.getClient().create(ApiInterface.class);
        nvbdcp_japeneseDataListList = new ArrayList<>();
        nvbdcp_japenese_totalCasesList = new ArrayList<>();
        nvbdcp_japenese_deathsList = new ArrayList<>();
        nvbdcp_japenese_jeVaccinationList = new ArrayList<>();
        nvbdcp_japenese_picUsFundsList = new ArrayList<>();
        nvbdcp_japenese_picUsFunctionalList = new ArrayList<>();
        nvbdcp_japenese_pmrFundsList = new ArrayList<>();
        nvbdcp_japenese_pmrFunctionalList = new ArrayList<>();
        nvbdcp_japeneseDataCall = apiInterface.nvbdcp_JapeneseData();
        nvbdcp_japeneseDataCall.enqueue(new Callback<NVBDCP_JapeneseData>() {
            @Override
            public void onResponse(Call<NVBDCP_JapeneseData> call, Response<NVBDCP_JapeneseData> response) {
                nvbdcp_japeneseDataListList.addAll(response.body().getNvbdcp_japeneseDataListList());
                nvbdcp_japenese_totalCasesList.addAll(nvbdcp_japeneseDataListList.get(0).getNvbdcp_japenese_totalCasesList());
                nvbdcp_japenese_deathsList.addAll(nvbdcp_japeneseDataListList.get(0).getNvbdcp_japenese_deathsList());
                nvbdcp_japenese_jeVaccinationList.addAll(nvbdcp_japeneseDataListList.get(0).getNvbdcp_japenese_jeVaccinationList());
                nvbdcp_japenese_picUsFundsList.addAll(nvbdcp_japeneseDataListList.get(0).getNvbdcp_japenese_picUsFundsList());
                nvbdcp_japenese_picUsFunctionalList.addAll(nvbdcp_japeneseDataListList.get(0).getNvbdcp_japenese_picUsFunctionalList());
                nvbdcp_japenese_pmrFundsList.addAll(nvbdcp_japeneseDataListList.get(0).getNvbdcp_japenese_pmrFundsList());
                nvbdcp_japenese_pmrFunctionalList.addAll(nvbdcp_japeneseDataListList.get(0).getNvbdcp_japenese_pmrFunctionalList());

                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getContext(), nvbdcp_japenese_totalCasesList, nvbdcp_japenese_deathsList, nvbdcp_japenese_jeVaccinationList, nvbdcp_japenese_picUsFundsList, nvbdcp_japenese_picUsFunctionalList,nvbdcp_japenese_pmrFundsList, nvbdcp_japenese_pmrFunctionalList,"JapeneseTotalCases");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();

                btnOrange.setText(nvbdcp_japenese_totalCasesList.get(1).getTotal_cases());
                btnBlue.setText(nvbdcp_japenese_deathsList.get(1).getTotal_Number_of_Deaths());
                btnLGreen.setText(nvbdcp_japenese_jeVaccinationList.get(1).getTotal_No_of_districts_covered_by_JE_Vaccination());
                btnGreen.setText(nvbdcp_japenese_picUsFundsList.get(1).getTotal_No_of_PICUs_for_which_funds_provided());
                btnBrown.setText(nvbdcp_japenese_picUsFunctionalList.get(1).getTotal_No_of_PICUs_functional());
                btnRed.setText(nvbdcp_japenese_pmrFundsList.get(1).getTotal_No_of_PMRs_which_funds_provided());
                btnLemon.setText(nvbdcp_japenese_pmrFunctionalList.get(1).getTotal_No_of_PMRs_functional());
            }

            @Override
            public void onFailure(Call<NVBDCP_JapeneseData> call, Throwable t) {

            }
        });

        btnOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getContext(), nvbdcp_japenese_totalCasesList, nvbdcp_japenese_deathsList, nvbdcp_japenese_jeVaccinationList, nvbdcp_japenese_picUsFundsList, nvbdcp_japenese_picUsFunctionalList,nvbdcp_japenese_pmrFundsList, nvbdcp_japenese_pmrFunctionalList,"JapeneseTotalCases");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });

        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getContext(), nvbdcp_japenese_totalCasesList, nvbdcp_japenese_deathsList, nvbdcp_japenese_jeVaccinationList, nvbdcp_japenese_picUsFundsList, nvbdcp_japenese_picUsFunctionalList,nvbdcp_japenese_pmrFundsList, nvbdcp_japenese_pmrFunctionalList,"JapeneseDeaths");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });

        btnLGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getContext(), nvbdcp_japenese_totalCasesList, nvbdcp_japenese_deathsList, nvbdcp_japenese_jeVaccinationList, nvbdcp_japenese_picUsFundsList, nvbdcp_japenese_picUsFunctionalList,nvbdcp_japenese_pmrFundsList, nvbdcp_japenese_pmrFunctionalList,"JapeneseVaccination");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });


        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getContext(), nvbdcp_japenese_totalCasesList, nvbdcp_japenese_deathsList, nvbdcp_japenese_jeVaccinationList, nvbdcp_japenese_picUsFundsList, nvbdcp_japenese_picUsFunctionalList,nvbdcp_japenese_pmrFundsList, nvbdcp_japenese_pmrFunctionalList,"JapenesePICUsFunds");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });

        btnBrown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getContext(), nvbdcp_japenese_totalCasesList, nvbdcp_japenese_deathsList, nvbdcp_japenese_jeVaccinationList, nvbdcp_japenese_picUsFundsList, nvbdcp_japenese_picUsFunctionalList,nvbdcp_japenese_pmrFundsList, nvbdcp_japenese_pmrFunctionalList,"JapenesePICUsFuncional");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });

        btnRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getContext(), nvbdcp_japenese_totalCasesList, nvbdcp_japenese_deathsList, nvbdcp_japenese_jeVaccinationList, nvbdcp_japenese_picUsFundsList, nvbdcp_japenese_picUsFunctionalList,nvbdcp_japenese_pmrFundsList, nvbdcp_japenese_pmrFunctionalList,"JapenesePMRFunds");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });


        btnLemon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getContext(), nvbdcp_japenese_totalCasesList, nvbdcp_japenese_deathsList, nvbdcp_japenese_jeVaccinationList, nvbdcp_japenese_picUsFundsList, nvbdcp_japenese_picUsFunctionalList,nvbdcp_japenese_pmrFundsList, nvbdcp_japenese_pmrFunctionalList,"JapenesePMRFuncional");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });







        return view;
    }


}
