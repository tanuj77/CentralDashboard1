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
import com.chi.centraldashboard.R;
import com.chi.centraldashboard.apiCall.ApiClient;
import com.chi.centraldashboard.apiCall.ApiInterface;
import com.chi.centraldashboard.apiCall.bin.NFHSData;
import com.chi.centraldashboard.apiCall.bin.NFHSDataList;
import com.chi.centraldashboard.apiCall.bin.NFHS_12_13immunized;
import com.chi.centraldashboard.apiCall.bin.NFHS_5years_stunted;
import com.chi.centraldashboard.apiCall.bin.NFHS_5years_wasted;
import com.chi.centraldashboard.apiCall.bin.NFHS_BreastFed;
import com.chi.centraldashboard.apiCall.bin.NFHS_DeliveryAttended;
import com.chi.centraldashboard.apiCall.bin.NFHS_Households;
import com.chi.centraldashboard.apiCall.bin.NFHS_MarriedWoman;
import com.chi.centraldashboard.apiCall.bin.NFHS_PregnantWoman;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NFHSFragment extends Fragment {
    Button btnOrange, btnBlue, btnLGreen, btnGreen, btnBrown, btnRed, btnLemon, btnPink;
    android.support.v7.widget.LinearLayoutManager mLayoutManager;
    private ApiInterface apiInterface;
    private RecyclerView recyclerView;
    SugamCusRecviewSevenAdapter sugamCusRecviewSevenAdapter;
    FamilyPlaningRecviewCusFiveAdapter familyPlaningRecviewCusFiveAdapter;

    private List<NFHSDataList> nfhsDataListList;
    private List<NFHS_12_13immunized> nfhs_12_13immunizedList;
    private List<NFHS_5years_stunted> nfhs_5years_stuntedList;
    private List<NFHS_5years_wasted> nfhs_5years_wastedList;
    private List<NFHS_MarriedWoman> nfhs_marriedWomanList;
    private List<NFHS_PregnantWoman> nfhs_pregnantWomanList;
    private List<NFHS_DeliveryAttended> nfhs_deliveryAttendedList;
    private List<NFHS_Households> nfhs_householdsList;
    private List<NFHS_BreastFed> nfhs_breastFedList;
    Call<NFHSData> nfhsDataCall;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_nfh, container, false);


        btnOrange = (Button) view.findViewById(R.id.btn_nfhsorange);
        btnBlue = (Button) view.findViewById(R.id.btn_nfhsblue);
        btnLGreen = (Button) view.findViewById(R.id.btn_nfhslgreen);
        btnGreen = (Button) view.findViewById(R.id.btn_nfhsgreen);
        btnBrown = (Button) view.findViewById(R.id.btn_nfhsbrown);
        btnRed = (Button) view.findViewById(R.id.btn_nfhsred);
        btnLemon = (Button) view.findViewById(R.id.btn_nfhslemon);
        btnPink = (Button) view.findViewById(R.id.btn_nfhspink);


        recyclerView = (RecyclerView) view.findViewById(R.id.recview_nfhs);

        mLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(mLayoutManager);

        apiInterface = ApiClient.getClient().create(ApiInterface.class);
        nfhsDataListList = new ArrayList<>();
        nfhs_12_13immunizedList = new ArrayList<>();
        nfhs_5years_stuntedList = new ArrayList<>();
        nfhs_5years_wastedList = new ArrayList<>();
        nfhs_marriedWomanList = new ArrayList<>();
        nfhs_pregnantWomanList = new ArrayList<>();
        nfhs_deliveryAttendedList = new ArrayList<>();
        nfhs_householdsList = new ArrayList<>();
        nfhs_breastFedList = new ArrayList<>();
        nfhsDataCall = apiInterface.nfhsData();
        nfhsDataCall.enqueue(new Callback<NFHSData>() {
            @Override
            public void onResponse(Call<NFHSData> call, Response<NFHSData> response) {
                nfhsDataListList.addAll(response.body().getNfhsDataListList());
                nfhs_12_13immunizedList.addAll(nfhsDataListList.get(0).getNfhs_12_13immunizedList());
                nfhs_5years_stuntedList.addAll(nfhsDataListList.get(0).getNfhs_5years_stuntedList());
                nfhs_5years_wastedList.addAll(nfhsDataListList.get(0).getNfhs_5years_wastedList());
                nfhs_marriedWomanList.addAll(nfhsDataListList.get(0).getNfhs_marriedWomanList());
                nfhs_pregnantWomanList.addAll(nfhsDataListList.get(0).getNfhs_pregnantWomanList());
                nfhs_deliveryAttendedList.addAll(nfhsDataListList.get(0).getNfhs_deliveryAttendedList());
                nfhs_householdsList.addAll(nfhsDataListList.get(0).getNfhs_householdsList());
                nfhs_breastFedList.addAll(nfhsDataListList.get(0).getNfhs_breastFedList());

                sugamCusRecviewSevenAdapter = new SugamCusRecviewSevenAdapter(getContext(), nfhs_12_13immunizedList, nfhs_5years_stuntedList, nfhs_5years_wastedList, "NFHS_12_13immunized", 1);
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(sugamCusRecviewSevenAdapter);
                sugamCusRecviewSevenAdapter.notifyDataSetChanged();

                btnOrange.setText(nfhs_12_13immunizedList.get(1).getTotal_Percentage_of_children_aged_12_23_months_fully_immunized());
                btnBlue.setText(nfhs_5years_stuntedList.get(1).getTotal_Percentage_of_Children_under_5_years_who_are_stunted_height_for_age());
                btnLGreen.setText(nfhs_5years_wastedList.get(1).getTotal_Percentage_of_Children_under_5_years_who_are_wasted_weight_for_height());
                btnGreen.setText(nfhs_marriedWomanList.get(1).getTotal_Percentage_of_Currently_Married_Women_15_49_years());
                btnBrown.setText(nfhs_pregnantWomanList.get(1).getTotal_Percentage_of_pregnant_women_with_full_antenatal_care_under_NHM());
                btnRed.setText(nfhs_deliveryAttendedList.get(1).getTotal_Percentage_of_delivery_attended_by_skilled_health_professional());
                btnLemon.setText(nfhs_householdsList.get(1).getTotal_Percentage_of_households_with_any_member_covered_under_insurance());
                btnPink.setText(nfhs_breastFedList.get(1).getTotal_Percentage_of_Children_less_than_6_month_exclusively_breastfed());
            }

            @Override
            public void onFailure(Call<NFHSData> call, Throwable t) {

            }
        });


        btnOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sugamCusRecviewSevenAdapter = new SugamCusRecviewSevenAdapter(getContext(), nfhs_12_13immunizedList, nfhs_5years_stuntedList, nfhs_5years_wastedList, "NFHS_12_13immunized", 1);
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(sugamCusRecviewSevenAdapter);
                sugamCusRecviewSevenAdapter.notifyDataSetChanged();
            }
        });

        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sugamCusRecviewSevenAdapter = new SugamCusRecviewSevenAdapter(getContext(), nfhs_12_13immunizedList, nfhs_5years_stuntedList, nfhs_5years_wastedList, "NFHS_5years_stunted", 1);
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(sugamCusRecviewSevenAdapter);
                sugamCusRecviewSevenAdapter.notifyDataSetChanged();
            }
        });

        btnLGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sugamCusRecviewSevenAdapter = new SugamCusRecviewSevenAdapter(getContext(), nfhs_12_13immunizedList, nfhs_5years_stuntedList, nfhs_5years_wastedList, "NFHS_5years_wasted", 1);
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(sugamCusRecviewSevenAdapter);
                sugamCusRecviewSevenAdapter.notifyDataSetChanged();
            }
        });





        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                familyPlaningRecviewCusFiveAdapter=new FamilyPlaningRecviewCusFiveAdapter(getContext(),nfhs_marriedWomanList,nfhs_pregnantWomanList,nfhs_deliveryAttendedList,nfhs_householdsList,nfhs_breastFedList,"NFHS_MarriedWoman",1);
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(familyPlaningRecviewCusFiveAdapter);
                familyPlaningRecviewCusFiveAdapter.notifyDataSetChanged();
            }
        });

        btnBrown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                familyPlaningRecviewCusFiveAdapter=new FamilyPlaningRecviewCusFiveAdapter(getContext(),nfhs_marriedWomanList,nfhs_pregnantWomanList,nfhs_deliveryAttendedList,nfhs_householdsList,nfhs_breastFedList,"NFHS_PregnantWoman",1);
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(familyPlaningRecviewCusFiveAdapter);
                familyPlaningRecviewCusFiveAdapter.notifyDataSetChanged();
            }
        });
        btnRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                familyPlaningRecviewCusFiveAdapter=new FamilyPlaningRecviewCusFiveAdapter(getContext(),nfhs_marriedWomanList,nfhs_pregnantWomanList,nfhs_deliveryAttendedList,nfhs_householdsList,nfhs_breastFedList,"NFHS_DeliveryAttended",1);
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(familyPlaningRecviewCusFiveAdapter);
                familyPlaningRecviewCusFiveAdapter.notifyDataSetChanged();
            }
        });
        btnLemon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                familyPlaningRecviewCusFiveAdapter=new FamilyPlaningRecviewCusFiveAdapter(getContext(),nfhs_marriedWomanList,nfhs_pregnantWomanList,nfhs_deliveryAttendedList,nfhs_householdsList,nfhs_breastFedList,"NFHS_Households",1);
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(familyPlaningRecviewCusFiveAdapter);
                familyPlaningRecviewCusFiveAdapter.notifyDataSetChanged();
            }
        });

        btnPink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                familyPlaningRecviewCusFiveAdapter=new FamilyPlaningRecviewCusFiveAdapter(getContext(),nfhs_marriedWomanList,nfhs_pregnantWomanList,nfhs_deliveryAttendedList,nfhs_householdsList,nfhs_breastFedList,"NFHS_BreastFed",1);
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(familyPlaningRecviewCusFiveAdapter);
                familyPlaningRecviewCusFiveAdapter.notifyDataSetChanged();
            }
        });
        return view;

    }


}
