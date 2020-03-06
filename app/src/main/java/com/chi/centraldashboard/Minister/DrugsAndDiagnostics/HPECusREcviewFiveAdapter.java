package com.chi.centraldashboard.Minister.DrugsAndDiagnostics;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.chi.centraldashboard.R;
import com.chi.centraldashboard.apiCall.bin.FSSAILicensing;
import com.chi.centraldashboard.apiCall.bin.FSSAIManPower;
import com.chi.centraldashboard.apiCall.bin.HPEAmountReceived;
import com.chi.centraldashboard.apiCall.bin.HPEHospitals;
import com.chi.centraldashboard.apiCall.bin.HPELabs;
import com.chi.centraldashboard.apiCall.bin.HPEPMC;
import com.chi.centraldashboard.apiCall.bin.HPEPharmaRetail;
import com.chi.centraldashboard.apiCall.bin.HPEProducts;
import com.chi.centraldashboard.apiCall.bin.MinisterAmritDrugsDispensed;
import com.chi.centraldashboard.apiCall.bin.MinisterAmritPatientsServed;
import com.chi.centraldashboard.apiCall.bin.MinisterAmritPharmacies;
import com.chi.centraldashboard.apiCall.bin.MinisterAmritSavingsPatients;

import java.util.ArrayList;
import java.util.List;


public class HPECusREcviewFiveAdapter extends RecyclerView.Adapter<HPECusREcviewFiveAdapter.MyViewHolder> {
    Context mCtx;

    private List<HPEProducts> hpeProductsList;
    private List<HPEAmountReceived> hpeAmountReceivedList;
    private List<HPEPharmaRetail> hpePharmaRetailList;
    private List<HPELabs> hpeLabsList;
    private List<HPEHospitals> hpeHospitalsList;
    private List<HPEPMC> hpepmcList;

    String flagType;

    private List<FSSAIManPower> fssaiManPowerList;
    private List<FSSAILicensing> fssaiLicensingList;


    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView tv_nu1, tv_nu2, tv_nu3, tv_nu4, tv_nu5;


        public MyViewHolder(View view) {
            super(view);

            tv_nu1 = (TextView) view.findViewById(R.id.tv_hpe1);
            tv_nu2 = (TextView) view.findViewById(R.id.tv_hpe2);
            tv_nu3 = (TextView) view.findViewById(R.id.tv_hpe3);
            tv_nu4 = (TextView) view.findViewById(R.id.tv_hpe4);
            tv_nu5 = (TextView) view.findViewById(R.id.tv_hpe5);


        }
    }


    public HPECusREcviewFiveAdapter(Context applicationContext, List<HPEProducts> hpeProductsList, List<HPEAmountReceived> hpeAmountReceivedList, List<HPEPharmaRetail> hpePharmaRetailList, List<HPELabs> hpeLabsList, List<HPEHospitals> hpeHospitalsList, List<HPEPMC> hpepmcList, String flagType) {

        this.mCtx = applicationContext;
        this.hpeProductsList = hpeProductsList;
        this.hpeAmountReceivedList = hpeAmountReceivedList;
        this.hpePharmaRetailList = hpePharmaRetailList;
        this.hpeLabsList = hpeLabsList;
        this.hpeHospitalsList = hpeHospitalsList;
        this.hpepmcList = hpepmcList;

        this.flagType = flagType;
    }

    public HPECusREcviewFiveAdapter(Context applicationContext, List<FSSAIManPower> fssaiManPowerList, List<FSSAILicensing> fssaiLicensingList, String flagType) {
        this.mCtx = applicationContext;
        this.fssaiManPowerList = fssaiManPowerList;
        this.fssaiLicensingList = fssaiLicensingList;
        this.flagType = flagType;
    }


    @Override
    public HPECusREcviewFiveAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.mhpe_recview_row, parent, false);
        //View itemCardView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recylerview_row, parent, false);

        return new HPECusREcviewFiveAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(HPECusREcviewFiveAdapter.MyViewHolder holder, int position) {

        if (position % 2 == 0) {
            //holder.rootView.setBackgroundColor(Color.BLACK);
            holder.itemView.setBackgroundResource(R.color.colorFadedWhite);
//            holder.cardView.setCardBackgroundColor(Color.parseColor("#efebeb"));
        } else {
            //holder.rootView.setBackgroundColor(Color.WHITE);
            holder.itemView.setBackgroundResource(R.color.White);
            //          holder.cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
        }

        switch (flagType) {


            case "Product":
                final HPEProducts products = hpeProductsList.get(position);

                holder.tv_nu1.setText(products.getSR_NO());
                holder.tv_nu2.setText(products.getNumber_of_Products());

                break;
            case "AmountReceived":
                final HPEAmountReceived amountReceived = hpeAmountReceivedList.get(position);

                holder.tv_nu1.setText(amountReceived.getSR_NO());
                holder.tv_nu2.setText(amountReceived.getName_of_Category());
                holder.tv_nu3.setText(amountReceived.getTotal_Amount_received_during_the_month_in_Lakh());

                break;
            case "PharmaRetail":
                final HPEPharmaRetail pharmaRetail = hpePharmaRetailList.get(position);

                holder.tv_nu1.setText(pharmaRetail.getSR_NO());
                holder.tv_nu2.setText(pharmaRetail.getState_Name());
                holder.tv_nu3.setText(pharmaRetail.getNumber_of_Pharma_Retail_AMRIT_Outlets());
                holder.tv_nu4.setText(pharmaRetail.getNumber_of_Pharma_Retail_Other_Outlets());

                break;

            case "Labs":
                final HPELabs labs = hpeLabsList.get(position);

                holder.tv_nu1.setText(labs.getSR_NO());
                holder.tv_nu2.setText(labs.getState_Name());
                holder.tv_nu3.setText(labs.getName_of_Center());
                holder.tv_nu4.setText(labs.getTotal_No_of_Labs());
                holder.tv_nu5.setText(labs.getTotal_No_of_Imaging_Centres());
                break;
            case "Hospital":
                final HPEHospitals hospitals = hpeHospitalsList.get(position);

                holder.tv_nu1.setText(hospitals.getSR_NO());
                holder.tv_nu2.setText(hospitals.getState_Name());
                holder.tv_nu3.setText(hospitals.getNumber_of_Hospitals());
                break;

            case "PMC":
                final HPEPMC hpepmc = hpepmcList.get(position);

                holder.tv_nu1.setText(hpepmc.getSR_NO());
                holder.tv_nu2.setText(hpepmc.getState_Name());
                holder.tv_nu3.setText(hpepmc.getCategory_Name());
                holder.tv_nu4.setText(hpepmc.getTotal_No_of_Projects_in_Hand_PMC());
                break;

            case "FSSAIManPower":
                final FSSAIManPower manPower = fssaiManPowerList.get(position);

                holder.tv_nu1.setText(manPower.getSR_NO());
                holder.tv_nu2.setText(manPower.getName_of_Post());
                holder.tv_nu3.setText(manPower.getTotal_Number_of_Posts_Sanctioned());
                holder.tv_nu4.setText(manPower.getTotal_Number_of_Filledup());
                holder.tv_nu5.setText(manPower.getTotal_Number_of_Vacancy());
                break;


            case "FSSAILicensing":
                final FSSAILicensing licensing = fssaiLicensingList.get(position);

                holder.tv_nu1.setText(licensing.getSR_NO());
                holder.tv_nu2.setText(licensing.getState_Name());
                holder.tv_nu3.setText(licensing.getNumber_Of_Licenses_Issued_To_FBOs_Center());
                holder.tv_nu4.setText(licensing.getNumber_Of_Licenses_Issued_To_FBOs_State());
                holder.tv_nu5.setText(licensing.getTotal_Number_Of_FBOs_Registered());
                break;
        }


    }

//    @Override
//    public NHRRStatewiseCustomRecViewThreeAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
//        return null;
//    }

//    @Override
//    public void onBindViewHolder(@NonNull NHRRStatewiseCustomRecViewThreeAdapter.MyViewHolder myViewHolder, int i) {
//
//    }

    @Override
    public int getItemCount() {
        if (flagType.equalsIgnoreCase("AmountReceived") || flagType == "AmountReceived") {
            return hpeAmountReceivedList.size();
        } else if (flagType.equalsIgnoreCase("PharmaRetail") || flagType == "PharmaRetail") {
            return hpePharmaRetailList.size();
        } else if (flagType.equalsIgnoreCase("Labs") || flagType == "Labs") {
            return hpeLabsList.size();
        } else if (flagType.equalsIgnoreCase("Hospital") || flagType == "Hospital") {
            return hpeHospitalsList.size();
        } else if (flagType.equalsIgnoreCase("PMC") || flagType == "PMC") {
            return hpepmcList.size();
        } else if (flagType.equalsIgnoreCase("FSSAIManPower") || flagType == "FSSAIManPower") {
            return fssaiManPowerList.size();
        } else if (flagType.equalsIgnoreCase("FSSAILicensing") || flagType == "FSSAILicensing") {
            return fssaiLicensingList.size();
        } else {
            return hpeProductsList.size();
        }
    }


    ////////////////pagiantion method///////////
//    public void addData(List<MinisterAmritPharmacies> ministerAmritPharmaciesList) {
//        for (MinisterAmritPharmacies ftdl : ministerAmritPharmaciesList) {
//            ministerAmritPharmaciesList.add(ftdl);
//
//        }
//        notifyDataSetChanged();
//    }
//
//    //////////////Search in recyclerview method//////////
//    public void updateList(List<MinisterAmritPharmacies> newList) {
//        ministerAmritPharmaciesList = new ArrayList<>();
//        ministerAmritPharmaciesList.addAll(newList);
//        notifyDataSetChanged();
//    }
}

