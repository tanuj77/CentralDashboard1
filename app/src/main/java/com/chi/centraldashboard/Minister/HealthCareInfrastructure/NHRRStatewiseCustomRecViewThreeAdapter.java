package com.chi.centraldashboard.Minister.HealthCareInfrastructure;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.chi.centraldashboard.R;
import com.chi.centraldashboard.apiCall.bin.AmbulanceALS;
import com.chi.centraldashboard.apiCall.bin.AmbulanceAvgALS;
import com.chi.centraldashboard.apiCall.bin.AmbulanceAvgBLS;
import com.chi.centraldashboard.apiCall.bin.AmbulanceBLS;
import com.chi.centraldashboard.apiCall.bin.MinisterNhrrDataStatewise;
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

public class NHRRStatewiseCustomRecViewThreeAdapter extends RecyclerView.Adapter<NHRRStatewiseCustomRecViewThreeAdapter.MyViewHolder> {
    Context mCtx;
    String ambulanceFlag = "NHRR";
    private List<MinisterNhrrDataStatewise> statewiseListmain;


    private List<AmbulanceALS> ambulanceALSList;
    private List<AmbulanceBLS> ambulanceBLSList;
    private List<AmbulanceAvgALS> ambulanceAvgALSList;
    private List<AmbulanceAvgBLS> ambulanceAvgBLSList;


    private List<NOTP_Organs> notp_organsList;
    private List<NOTP_OrgansandTissues> notp_organsandTissuesList;
    private List<NOTP_Eyebanks> notp_eyebanksList;
    private List<NOTP_Pledged> notp_pledgedList;
    private List<NOTP_TrendsCountry> notp_trendsCountryList;
    private List<NOTP_CentralRegistry> notp_centralRegistryList;
    private List<NOTP_PatientsOrganwise> notp_patientsOrganwiseList;
    private List<NOTP_rotto> notp_rottoList;
    private List<NOTP_sotto> notp_sottoList;


    public NHRRStatewiseCustomRecViewThreeAdapter(Context applicationContext, List<NOTP_Organs> notp_organsList, List<NOTP_OrgansandTissues> notp_organsandTissuesList, List<NOTP_Eyebanks> notp_eyebanksList, List<NOTP_Pledged> notp_pledgedList, List<NOTP_TrendsCountry> notp_trendsCountryList, List<NOTP_CentralRegistry> notp_centralRegistryList, List<NOTP_PatientsOrganwise> notp_patientsOrganwiseList, List<NOTP_rotto> notp_rottoList, List<NOTP_sotto> notp_sottoList, String notp_organs) {
        this.mCtx = applicationContext;
        this.notp_organsList = notp_organsList;
        this.notp_organsandTissuesList = notp_organsandTissuesList;
        this.notp_eyebanksList = notp_eyebanksList;
        this.notp_pledgedList = notp_pledgedList;
        this.notp_trendsCountryList = notp_trendsCountryList;
        this.notp_centralRegistryList = notp_centralRegistryList;
        this.notp_patientsOrganwiseList = notp_patientsOrganwiseList;
        this.notp_rottoList = notp_rottoList;
        this.notp_sottoList = notp_sottoList;
        this.ambulanceFlag = notp_organs;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView tvSno, tvStateName, tvCount;


        public MyViewHolder(View view) {
            super(view);

            tvSno = (TextView) view.findViewById(R.id.tv_srno);
            tvStateName = (TextView) view.findViewById(R.id.tv_statename);
            tvCount = (TextView) view.findViewById(R.id.tv_count);


        }
    }


    public NHRRStatewiseCustomRecViewThreeAdapter(Context context, List<MinisterNhrrDataStatewise> statewiseList) {
        this.statewiseListmain = statewiseList;
        this.mCtx = context;
    }

    public NHRRStatewiseCustomRecViewThreeAdapter(Context context, List<AmbulanceALS> ambulanceALSList, List<AmbulanceBLS> ambulanceBLSList, List<AmbulanceAvgALS> ambulanceAvgALSList, List<AmbulanceAvgBLS> ambulanceAvgBLSList, String ambulanceFlag) {
        this.ambulanceALSList = ambulanceALSList;
        this.ambulanceBLSList = ambulanceBLSList;
        this.ambulanceAvgALSList = ambulanceAvgALSList;
        this.ambulanceAvgBLSList = ambulanceAvgBLSList;
        this.ambulanceFlag = ambulanceFlag;
        this.mCtx = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.mstatewise_recylerview_row, parent, false);
        //View itemCardView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recylerview_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        if (position % 2 == 0) {
            //holder.rootView.setBackgroundColor(Color.BLACK);
            holder.itemView.setBackgroundResource(R.color.colorFadedWhite);
//            holder.cardView.setCardBackgroundColor(Color.parseColor("#efebeb"));
        } else {
            //holder.rootView.setBackgroundColor(Color.WHITE);
            holder.itemView.setBackgroundResource(R.color.White);
            //          holder.cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
        }

//        if (position == 1) {
//            holder.tvSno.setText("S_No");
//            holder.tvStateName.setText("State Name");
//            holder.tvCount.setText("Distribution of HE State wise");
//        }


        switch (ambulanceFlag) {
            case "als":
                final AmbulanceALS als = ambulanceALSList.get(position);
                holder.tvSno.setText(als.getSR_NO());
                holder.tvStateName.setText(als.getState_Name());
                holder.tvCount.setText(als.getTotal_Advanced_Life_Support_ALS_Ambulances_Operational_against_Required());
                break;

            case "bls":
                final AmbulanceBLS bls = ambulanceBLSList.get(position);
                holder.tvSno.setText(bls.getSR_NO());
                holder.tvStateName.setText(bls.getState_Name());
                holder.tvCount.setText(bls.getTotal_Basic_Life_Support_BLS_Ambulances_Operational_against_Required());
                break;

            case "avgals":
                final AmbulanceAvgALS avgALS = ambulanceAvgALSList.get(position);
                holder.tvSno.setText(avgALS.getSR_NO());
                holder.tvStateName.setText(avgALS.getState_Name());
                holder.tvCount.setText(avgALS.getKpi_Average_response_time_call_to_scene_ALS_min_sec());
                break;

            case "avgbls":
                final AmbulanceAvgBLS avgBLS = ambulanceAvgBLSList.get(position);
                holder.tvSno.setText(avgBLS.getSR_NO());
                holder.tvStateName.setText(avgBLS.getState_Name());
                holder.tvCount.setText(avgBLS.getKpi_Average_response_time_call_to_scene_BLS_min_sec());
                break;

            case "NHRR":
                final MinisterNhrrDataStatewise statewiseList = statewiseListmain.get(position);

                holder.tvSno.setText(String.valueOf(statewiseList.getS_no()));
                holder.tvStateName.setText(statewiseList.getState_name());
                holder.tvCount.setText(statewiseList.getCount());
                break;

            case "NOTP_Organs":
                final NOTP_Organs organs = notp_organsList.get(position);

                holder.tvSno.setText(organs.getSR_NO());
                holder.tvStateName.setText(organs.getState_Name());
                // holder.tvCount.setText(organs.getCount());
                break;

            case "NOTP_OrgansAndTissues":
                final NOTP_OrgansandTissues organsandTissues = notp_organsandTissuesList.get(position);

                holder.tvSno.setText(organsandTissues.getSR_NO());
                holder.tvStateName.setText(organsandTissues.getState_Name());
                // holder.tvCount.setText(organs.getCount());
                break;

            case "NOTP_EyeBanks":
                final NOTP_Eyebanks eyebanks = notp_eyebanksList.get(position);

                holder.tvSno.setText(eyebanks.getSR_NO());
                holder.tvStateName.setText(eyebanks.getState_Name());
                holder.tvCount.setText(eyebanks.getList_of_Total_Hospitals_for_Organ_And_Tissue_Retrieval_Transplantation_and_Eye_Banks());
                break;

            case "NOTP_Pledged":
                final NOTP_Pledged pledged = notp_pledgedList.get(position);

                holder.tvSno.setText(pledged.getSR_NO());
                holder.tvStateName.setText(pledged.getState_Name());
                holder.tvCount.setText(pledged.getNumber_of_Organ_Tissue_Donors_who_have_pledged_for_Organ());
                break;

            case "NOTP_TrendsCountry":
                final NOTP_TrendsCountry trendsCountry = notp_trendsCountryList.get(position);

                holder.tvSno.setText(trendsCountry.getSR_NO());
                holder.tvStateName.setText(trendsCountry.getState_Name());
                holder.tvCount.setText(trendsCountry.getTransplant_trends_in_the_Country());
                break;


            case "NOTP_CentralRegistry":
                final NOTP_CentralRegistry registry = notp_centralRegistryList.get(position);

                holder.tvSno.setText(registry.getSR_NO());
                holder.tvStateName.setText(registry.getState_Name());
                holder.tvCount.setText(registry.getNo_of_Organ_allocation_on_Central_Registry());
                break;

            case "NOTP_PatientsOrganwise":
                final NOTP_PatientsOrganwise organwise = notp_patientsOrganwiseList.get(position);

                holder.tvSno.setText(organwise.getSR_NO());
                holder.tvStateName.setText(organwise.getState_Name());
                holder.tvCount.setText(organwise.getNo_of_Wait_List_Patients_Organ_Wise());
                break;

            case "NOTP_Rotto":
                final NOTP_rotto rotto = notp_rottoList.get(position);

                holder.tvSno.setText(rotto.getSR_NO());
                holder.tvStateName.setText(rotto.getState_Name());
                holder.tvCount.setText(rotto.getName_of_Institute());
                break;

            case "NOTP_Sotto":
                final NOTP_sotto sotto = notp_sottoList.get(position);

                holder.tvSno.setText(sotto.getSR_NO());
                holder.tvStateName.setText(sotto.getState_Name());
                holder.tvCount.setText(sotto.getName_of_Institute());
                break;


        }

    }


    @Override
    public int getItemCount() {

        if (ambulanceFlag.equalsIgnoreCase("als") || ambulanceFlag == "als") {
            return ambulanceALSList.size();
        } else if (ambulanceFlag.equalsIgnoreCase("bls") || ambulanceFlag == "bls") {
            return ambulanceBLSList.size();
        } else if (ambulanceFlag.equalsIgnoreCase("avgals") || ambulanceFlag == "avgals") {
            return ambulanceAvgALSList.size();
        }else if (ambulanceFlag.equalsIgnoreCase("avgbls") || ambulanceFlag == "avgbls") {
            return ambulanceAvgBLSList.size();
        } else if (ambulanceFlag.equalsIgnoreCase("NOTP_Organs") || ambulanceFlag == "NOTP_Organs") {
            return notp_organsList.size();
        } else if (ambulanceFlag.equalsIgnoreCase("NOTP_OrgansAndTissues") || ambulanceFlag == "NOTP_OrgansAndTissues") {
            return notp_organsandTissuesList.size();
        } else if (ambulanceFlag.equalsIgnoreCase("NOTP_EyeBanks") || ambulanceFlag == "NOTP_EyeBanks") {
            return notp_eyebanksList.size();
        } else if (ambulanceFlag.equalsIgnoreCase("NOTP_Pledged") || ambulanceFlag == "NOTP_Pledged") {
            return notp_pledgedList.size();
        } else if (ambulanceFlag.equalsIgnoreCase("NOTP_TrendsCountry") || ambulanceFlag == "NOTP_TrendsCountry") {
            return notp_trendsCountryList.size();
        } else if (ambulanceFlag.equalsIgnoreCase("NOTP_CentralRegistry") || ambulanceFlag == "NOTP_CentralRegistry") {
            return notp_centralRegistryList.size();
        } else if (ambulanceFlag.equalsIgnoreCase("NOTP_PatientsOrganwise") || ambulanceFlag == "NOTP_PatientsOrganwise") {
            return notp_patientsOrganwiseList.size();
        } else if (ambulanceFlag.equalsIgnoreCase("NOTP_Rotto") || ambulanceFlag == "NOTP_Rotto") {
            return notp_rottoList.size();
        } else if (ambulanceFlag.equalsIgnoreCase("NOTP_Sotto") || ambulanceFlag == "NOTP_Sotto") {
            return notp_sottoList.size();
        } else {
            return statewiseListmain.size();
        }
    }


    ////////////////pagiantion method///////////
    public void addData(List<MinisterNhrrDataStatewise> facilityTypeDetailsLists) {
        for (MinisterNhrrDataStatewise ftdl : facilityTypeDetailsLists) {
            statewiseListmain.add(ftdl);

        }
        notifyDataSetChanged();
    }

    //////////////Search in recyclerview method//////////
    public void updateList(List<MinisterNhrrDataStatewise> newList) {
        statewiseListmain = new ArrayList<>();
        statewiseListmain.addAll(newList);
        notifyDataSetChanged();
    }
}
