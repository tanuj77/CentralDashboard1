package com.chi.centraldashboard.Minister.HealthCareInfrastructure;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.chi.centraldashboard.R;
import com.chi.centraldashboard.apiCall.bin.FRU10CSection;
import com.chi.centraldashboard.apiCall.bin.FRU5CSection;
import com.chi.centraldashboard.apiCall.bin.FSSAIFood;
import com.chi.centraldashboard.apiCall.bin.MinisterBloodBankBSU;
import com.chi.centraldashboard.apiCall.bin.MinisterBloodBankDH;


import java.util.ArrayList;
import java.util.List;

public class BloodBankCusRecviewFourAdapter extends RecyclerView.Adapter<BloodBankCusRecviewFourAdapter.MyViewHolder> {
    Context mCtx;
    private List<MinisterBloodBankDH> ministerBloodBankDHList;
    private List<MinisterBloodBankBSU> ministerBloodBankBSUList;

    private List<FRU5CSection> fru5CSectionList;
    private List<FRU10CSection> fru10CSectionList;

    private List<FSSAIFood> fssaiFoodList;

    String flagType = "nothing";
    int fruType = 0;


    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView tvSno, tv_bloodbank, tvStateName, tvDistrictHospital;


        public MyViewHolder(View view) {
            super(view);

            tvSno = (TextView) view.findViewById(R.id.tv_bbsrno);
            tvStateName = (TextView) view.findViewById(R.id.tv_bbstatename);
            tv_bloodbank = (TextView) view.findViewById(R.id.tv_bloodbank);
            tvDistrictHospital = (TextView) view.findViewById(R.id.tv_districthospitL);
        }
    }


    @Override
    public BloodBankCusRecviewFourAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.mbloodbank_recview_row, parent, false);
        //View itemCardView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recylerview_row, parent, false);

        return new BloodBankCusRecviewFourAdapter.MyViewHolder(itemView);
    }


    public BloodBankCusRecviewFourAdapter(Context context, List<MinisterBloodBankDH> ministerBloodBankDHList, List<MinisterBloodBankBSU> ministerBloodBankBSUList, String flagType) {
        this.ministerBloodBankDHList = ministerBloodBankDHList;
        this.ministerBloodBankBSUList = ministerBloodBankBSUList;
        this.flagType = flagType;
        this.mCtx = context;
    }

    public BloodBankCusRecviewFourAdapter(Context context, List<FRU5CSection> fru5CSectionList, List<FRU10CSection> fru10CSectionList, int fruType) {

        this.mCtx = context;
        this.fru5CSectionList = fru5CSectionList;
        this.fru10CSectionList = fru10CSectionList;
        this.fruType = fruType;
    }

    public BloodBankCusRecviewFourAdapter(Context applicationContext, List<FSSAIFood> fssaiFoodList, String flagType) {
        this.mCtx = applicationContext;
        this.fssaiFoodList = fssaiFoodList;
        this.flagType = flagType;
    }


    @Override
    public void onBindViewHolder(BloodBankCusRecviewFourAdapter.MyViewHolder holder, int position) {

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
            case "dh":
                final MinisterBloodBankDH ministerBloodBankDH = ministerBloodBankDHList.get(position);

                holder.tvSno.setText(ministerBloodBankDH.getSR_NO());
                holder.tvStateName.setText(ministerBloodBankDH.getState_Name());
                holder.tv_bloodbank.setText(ministerBloodBankDH.getNo_of_functional_blood_banks());
                holder.tvDistrictHospital.setText(ministerBloodBankDH.getDh_morethanhundred_beds());
                break;

            case "bsu":
                final MinisterBloodBankBSU ministerBloodBankBSU = ministerBloodBankBSUList.get(position);

                holder.tvSno.setText(ministerBloodBankBSU.getSR_NO());
                holder.tvStateName.setText(ministerBloodBankBSU.getState_Name());
                holder.tv_bloodbank.setText(ministerBloodBankBSU.getNo_of_functional_blood_banks());
                holder.tvDistrictHospital.setText(ministerBloodBankBSU.getNo_of_functional_fru());
                break;

            case "FSSAIfood":
                final FSSAIFood fssaiFood = fssaiFoodList.get(position);

                holder.tvSno.setText(fssaiFood.getSR_NO());
                holder.tvStateName.setText(fssaiFood.getState_Name());
                holder.tv_bloodbank.setText(fssaiFood.getCentral_Government_Institutes_Autonomous_Bodies_NABL());
                holder.tvDistrictHospital.setText(fssaiFood.getFssai_Own_Laboratories_NABL());
                break;

        }

        switch (fruType) {
            case 5:
                final FRU5CSection fru5CSection = fru5CSectionList.get(position);

                holder.tvSno.setText(fru5CSection.getSR_NO());
                holder.tvStateName.setText(fru5CSection.getState_Name());
                holder.tv_bloodbank.setText(fru5CSection.getNo_of_fully_operational_FRU_for_CHC_and_SDH());
                holder.tvDistrictHospital.setText(fru5CSection.getRequired_No_of_FRUs());
                break;

            case 10:
                final FRU10CSection fru10CSection = fru10CSectionList.get(position);
                holder.tvSno.setText(fru10CSection.getSR_NO());
                holder.tvStateName.setText(fru10CSection.getState_Name());
                holder.tv_bloodbank.setText(fru10CSection.getNo_of_fully_operational_FRU_for_DH());
                holder.tvDistrictHospital.setText(fru10CSection.getRequired_No_of_FRUs());
                break;
        }


    }


    @Override
    public int getItemCount() {


        if (flagType.equalsIgnoreCase("dh") || flagType == "dh") {
            return ministerBloodBankDHList.size();
        } else if (flagType.equalsIgnoreCase("bsu") || flagType == "bsu") {
            return ministerBloodBankBSUList.size();
        } else if (flagType.equalsIgnoreCase("FSSAIfood") || flagType == "FSSAIfood") {
            return fssaiFoodList.size();
        } else if (fruType == 5) {
            return fru5CSectionList.size();
        } else {
            return fru10CSectionList.size();
        }
    }


    ////////////////pagiantion method///////////
    public void addData(List<MinisterBloodBankDH> ministerBloodBankDHList) {
        for (MinisterBloodBankDH ftdl : ministerBloodBankDHList) {
            ministerBloodBankDHList.add(ftdl);

        }
        notifyDataSetChanged();
    }

    //////////////Search in recyclerview method//////////
    public void updateList(List<MinisterBloodBankDH> newList) {
        ministerBloodBankDHList = new ArrayList<>();
        ministerBloodBankDHList.addAll(newList);
        notifyDataSetChanged();
    }
}
