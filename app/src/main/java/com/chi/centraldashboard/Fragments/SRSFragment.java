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

import com.chi.centraldashboard.Minister.HealthServiceDelivery.FamilyPlaningRecviewCusFiveAdapter;
import com.chi.centraldashboard.Minister.Regulations.SugamCusRecviewSevenAdapter;
import com.chi.centraldashboard.Minister.Survillance.PbsCusRecViewThreeAdapter;
import com.chi.centraldashboard.R;
import com.chi.centraldashboard.apiCall.ApiClient;
import com.chi.centraldashboard.apiCall.ApiInterface;
import com.chi.centraldashboard.apiCall.bin.SRSData;
import com.chi.centraldashboard.apiCall.bin.SRSDataList;
import com.chi.centraldashboard.apiCall.bin.SRS_CBR;
import com.chi.centraldashboard.apiCall.bin.SRS_CDR;
import com.chi.centraldashboard.apiCall.bin.SRS_IMR;
import com.chi.centraldashboard.apiCall.bin.SRS_MMR;
import com.chi.centraldashboard.apiCall.bin.SRS_NMR;
import com.chi.centraldashboard.apiCall.bin.SRS_TFR;
import com.chi.centraldashboard.apiCall.bin.SRS_U5;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SRSFragment extends Fragment {
    Button btnOrange, btnBlue, btnLGreen, btnGreen, btnBrown, btnRed, btnLemon, btnPink;
    android.support.v7.widget.LinearLayoutManager mLayoutManager;
    private ApiInterface apiInterface;
    private RecyclerView recyclerView;
    SugamCusRecviewSevenAdapter sugamCusRecviewSevenAdapter;
    FamilyPlaningRecviewCusFiveAdapter familyPlaningRecviewCusFiveAdapter;
    PbsCusRecViewThreeAdapter pbsCusRecViewThreeAdapter;

    private List<SRSDataList> srsDataListList;
    private List<SRS_CBR> srs_cbrList;
    private List<SRS_CDR> srs_cdrList;
    private List<SRS_TFR> srs_tfrList;
    private List<SRS_IMR> srs_imrList;
    private List<SRS_MMR> srs_mmrList;
    private List<SRS_U5> srs_u5List;
    private List<SRS_NMR> srs_nmrList;
    Call<SRSData> srsDataCall;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_sr, container, false);


        btnOrange = (Button) view.findViewById(R.id.btn_srsorange);
        btnBlue = (Button) view.findViewById(R.id.btn_srsblue);
        btnLGreen = (Button) view.findViewById(R.id.btn_srslgreen);
        btnGreen = (Button) view.findViewById(R.id.btn_srsgreen);
        btnBrown = (Button) view.findViewById(R.id.btn_srsbrown);
        btnRed = (Button) view.findViewById(R.id.btn_srsred);
        btnLemon = (Button) view.findViewById(R.id.btn_srslemon);


        recyclerView = (RecyclerView) view.findViewById(R.id.recview_srs);

        mLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(mLayoutManager);

        apiInterface = ApiClient.getClient().create(ApiInterface.class);

        srsDataListList = new ArrayList<>();
        srs_cbrList = new ArrayList<>();
        srs_cdrList = new ArrayList<>();
        srs_tfrList = new ArrayList<>();
        srs_imrList = new ArrayList<>();
        srs_mmrList = new ArrayList<>();
        srs_u5List = new ArrayList<>();
        srs_nmrList = new ArrayList<>();
        srsDataCall = apiInterface.srsData();
        srsDataCall.enqueue(new Callback<SRSData>() {
            @Override
            public void onResponse(Call<SRSData> call, Response<SRSData> response) {
                srsDataListList.addAll(response.body().getSrsDataListList());
                srs_cbrList.addAll(srsDataListList.get(0).getSrs_cbrList());
                srs_cdrList.addAll(srsDataListList.get(0).getSrs_cdrList());
                srs_tfrList.addAll(srsDataListList.get(0).getSrs_tfrList());
                srs_imrList.addAll(srsDataListList.get(0).getSrs_imrList());
                srs_mmrList.addAll(srsDataListList.get(0).getSrs_mmrList());
                srs_u5List.addAll(srsDataListList.get(0).getSrs_u5List());
                srs_nmrList.addAll(srsDataListList.get(0).getSrs_nmrList());

                familyPlaningRecviewCusFiveAdapter = new FamilyPlaningRecviewCusFiveAdapter(getContext(), srs_cbrList, srs_tfrList, srs_nmrList, "SRS_CBR", 1.20);
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(familyPlaningRecviewCusFiveAdapter);
                familyPlaningRecviewCusFiveAdapter.notifyDataSetChanged();


                btnOrange.setText(srs_cbrList.get(1).getTotal_Crude_Birth_Rate_CBR());
                btnBlue.setText(srs_cdrList.get(1).getTotal_Crude_Death_Rate_CDR());
                btnLGreen.setText(srs_tfrList.get(1).getTotal_Fertility_Rate_TFR());
                btnGreen.setText(srs_imrList.get(1).getTotal_Infant_Mortality_Rate_IMR());
                ;
                btnBrown.setText(srs_mmrList.get(1).getTotal_Maternal_Mortality_Ratio_MMR());
                btnRed.setText(srs_u5List.get(1).getTotal_Under_five_mortality_rate_U5());
                btnLemon.setText(srs_nmrList.get(1).getTotal_Neonatal_mortality_rate_NMR());
            }

            @Override
            public void onFailure(Call<SRSData> call, Throwable t) {

            }
        });

        btnOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                familyPlaningRecviewCusFiveAdapter = new FamilyPlaningRecviewCusFiveAdapter(getContext(), srs_cbrList, srs_tfrList, srs_nmrList, "SRS_CBR", 1.20);
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(familyPlaningRecviewCusFiveAdapter);
                familyPlaningRecviewCusFiveAdapter.notifyDataSetChanged();
            }
        });

        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sugamCusRecviewSevenAdapter = new SugamCusRecviewSevenAdapter(getContext(), srs_cdrList, srs_imrList, srs_u5List, 1.20, "SRS_CDR");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(sugamCusRecviewSevenAdapter);
                sugamCusRecviewSevenAdapter.notifyDataSetChanged();

            }
        });

        btnLGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                familyPlaningRecviewCusFiveAdapter = new FamilyPlaningRecviewCusFiveAdapter(getContext(), srs_cbrList, srs_tfrList, srs_nmrList, "SRS_TFR", 1.20);
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(familyPlaningRecviewCusFiveAdapter);
                familyPlaningRecviewCusFiveAdapter.notifyDataSetChanged();
            }
        });

        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sugamCusRecviewSevenAdapter = new SugamCusRecviewSevenAdapter(getContext(), srs_cdrList, srs_imrList, srs_u5List, 1.20, "SRS_IMR");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(sugamCusRecviewSevenAdapter);
                sugamCusRecviewSevenAdapter.notifyDataSetChanged();
            }
        });

        btnBrown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pbsCusRecViewThreeAdapter = new PbsCusRecViewThreeAdapter(getContext(), srs_mmrList, "SRS_MMR", 1);
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(pbsCusRecViewThreeAdapter);
                pbsCusRecViewThreeAdapter.notifyDataSetChanged();
            }
        });

        btnRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sugamCusRecviewSevenAdapter = new SugamCusRecviewSevenAdapter(getContext(), srs_cdrList, srs_imrList, srs_u5List, 1.20, "SRS_U5");
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(sugamCusRecviewSevenAdapter);
                sugamCusRecviewSevenAdapter.notifyDataSetChanged();
            }
        });


        btnLemon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                familyPlaningRecviewCusFiveAdapter = new FamilyPlaningRecviewCusFiveAdapter(getContext(), srs_cbrList, srs_tfrList, srs_nmrList, "SRS_NMR", 1.20);
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(familyPlaningRecviewCusFiveAdapter);
                familyPlaningRecviewCusFiveAdapter.notifyDataSetChanged();
            }
        });
        return view;
    }


}
