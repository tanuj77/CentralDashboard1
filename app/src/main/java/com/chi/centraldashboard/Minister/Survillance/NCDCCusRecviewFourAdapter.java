package com.chi.centraldashboard.Minister.Survillance;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.chi.centraldashboard.R;
import com.chi.centraldashboard.apiCall.bin.CommunityProcess_DBT;
import com.chi.centraldashboard.apiCall.bin.CommunityProcess_MAS;
import com.chi.centraldashboard.apiCall.bin.CommunityProcess_RKSs;
import com.chi.centraldashboard.apiCall.bin.CommunityProcess_RuralAndUrban;
import com.chi.centraldashboard.apiCall.bin.CommunityProcess_VHSNCs;
import com.chi.centraldashboard.apiCall.bin.DDAPDataList;
import com.chi.centraldashboard.apiCall.bin.DDAPFollowUp;
import com.chi.centraldashboard.apiCall.bin.DDAPIPD;
import com.chi.centraldashboard.apiCall.bin.DDAPNewReg;
import com.chi.centraldashboard.apiCall.bin.DDAPPatients;
import com.chi.centraldashboard.apiCall.bin.HRMedicalOfficerNRHM;
import com.chi.centraldashboard.apiCall.bin.HRMedicalOfficerNUHM;
import com.chi.centraldashboard.apiCall.bin.HRStaffNurseNRHM;
import com.chi.centraldashboard.apiCall.bin.HRStaffNurseNUHM;
import com.chi.centraldashboard.apiCall.bin.MinisterPbsTrainedNcd;
import com.chi.centraldashboard.apiCall.bin.NCDCLeaseDeed;
import com.chi.centraldashboard.apiCall.bin.NCDCMOUSigned;
import com.chi.centraldashboard.apiCall.bin.NCDCMoneyReleased;
import com.chi.centraldashboard.apiCall.bin.NCDCTotalAmount;

import java.util.ArrayList;
import java.util.List;


public class NCDCCusRecviewFourAdapter extends RecyclerView.Adapter<NCDCCusRecviewFourAdapter.MyViewHolder> {

    Context mCtx;
    String typeFlag = "nothing";
    int no_use = 0;
    private List<MinisterPbsTrainedNcd> ministerPbsTrainedNcdList;

    private List<NCDCLeaseDeed> ncdcLeaseDeedList;


    private List<DDAPNewReg> ddapNewRegList;
    private List<DDAPFollowUp> ddapFollowUpList;
    private List<DDAPIPD> ddapipdList;
    private List<DDAPPatients> ddapPatientsList;


    private List<HRMedicalOfficerNRHM> hrMedicalOfficerNRHMList;
    private List<HRStaffNurseNRHM> hrStaffNurseNRHMList;
    private List<HRMedicalOfficerNUHM> hrMedicalOfficerNUHMList;
    private List<HRStaffNurseNUHM> hrStaffNurseNUHMList;

    private List<CommunityProcess_VHSNCs> communityProcess_vhsnCsList;
    private List<CommunityProcess_RKSs> communityProcess_rkSsList;
    private List<CommunityProcess_RuralAndUrban> communityProcess_ruralAndUrbanList;
    private List<CommunityProcess_DBT> communityProcess_dbtList;
    private List<CommunityProcess_MAS> communityProcess_masList;


    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView tvSno, tv_project, tvStateName, tvDate;


        public MyViewHolder(View view) {
            super(view);

            tvSno = (TextView) view.findViewById(R.id.tv_srno);
            tvStateName = (TextView) view.findViewById(R.id.tv_statename);
            tvDate = (TextView) view.findViewById(R.id.tv_date);
            tv_project = (TextView) view.findViewById(R.id.tv_project);

        }
    }


    public NCDCCusRecviewFourAdapter(Context applicationContext, List<NCDCLeaseDeed> ncdcLeaseDeedList, String typeFlag) {
        this.mCtx = applicationContext;
        this.ncdcLeaseDeedList = ncdcLeaseDeedList;

        this.typeFlag = typeFlag;

    }

    public NCDCCusRecviewFourAdapter(Context applicationContext, List<DDAPNewReg> ddapNewRegList, List<DDAPFollowUp> ddapFollowUpList, List<DDAPIPD> ddapipdList, List<DDAPPatients> ddapPatientsList, String typeFlag) {

        this.mCtx = applicationContext;
        this.typeFlag = typeFlag;
        this.ddapNewRegList = ddapNewRegList;
        this.ddapFollowUpList = ddapFollowUpList;
        this.ddapipdList = ddapipdList;
        this.ddapPatientsList = ddapPatientsList;

    }

    public NCDCCusRecviewFourAdapter(Context applicationContext, List<HRMedicalOfficerNRHM> hrMedicalOfficerNRHMList, List<HRStaffNurseNRHM> hrStaffNurseNRHMList, List<HRMedicalOfficerNUHM> hrMedicalOfficerNUHMList, List<HRStaffNurseNUHM> hrStaffNurseNUHMList, String typeFlag, int i) {
        this.mCtx = applicationContext;
        this.hrMedicalOfficerNRHMList = hrMedicalOfficerNRHMList;
        this.hrStaffNurseNRHMList = hrStaffNurseNRHMList;
        this.hrMedicalOfficerNUHMList = hrMedicalOfficerNUHMList;
        this.hrStaffNurseNUHMList = hrStaffNurseNUHMList;
        this.typeFlag = typeFlag;
    }

    /////Community Process
    public NCDCCusRecviewFourAdapter(Context applicationContext, List<CommunityProcess_VHSNCs> communityProcess_vhsnCsList, List<CommunityProcess_RKSs> communityProcess_rkSsList, List<CommunityProcess_RuralAndUrban> communityProcess_ruralAndUrbanList, List<CommunityProcess_DBT> communityProcess_dbtList, List<CommunityProcess_MAS> communityProcess_masList, String typeFlag) {
        this.mCtx = applicationContext;
        this.typeFlag = typeFlag;
        this.communityProcess_vhsnCsList = communityProcess_vhsnCsList;
        this.communityProcess_rkSsList = communityProcess_rkSsList;
        this.communityProcess_ruralAndUrbanList = communityProcess_ruralAndUrbanList;
        this.communityProcess_dbtList = communityProcess_dbtList;
        this.communityProcess_masList = communityProcess_masList;

    }


    @Override
    public NCDCCusRecviewFourAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.mncdc_recview_row, parent, false);
        //View itemCardView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recylerview_row, parent, false);

        return new NCDCCusRecviewFourAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(NCDCCusRecviewFourAdapter.MyViewHolder holder, int position) {

        if (position % 2 == 0) {
            //holder.rootView.setBackgroundColor(Color.BLACK);
            holder.itemView.setBackgroundResource(R.color.colorFadedWhite);
//            holder.cardView.setCardBackgroundColor(Color.parseColor("#efebeb"));
        } else {
            //holder.rootView.setBackgroundColor(Color.WHITE);
            holder.itemView.setBackgroundResource(R.color.White);
            //          holder.cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
        }


        switch (typeFlag) {
            case "leasedeed":
                final NCDCLeaseDeed leaseDeed = ncdcLeaseDeedList.get(position);

                holder.tvSno.setText(String.valueOf(leaseDeed.getSR_NO()));
                holder.tvStateName.setText(leaseDeed.getState_Name());
                holder.tvDate.setText(leaseDeed.getDate());
                holder.tv_project.setText(leaseDeed.getTypess());
                break;

            case "NewReg":
                final DDAPNewReg newReg = ddapNewRegList.get(position);

                holder.tvSno.setText(newReg.getSR_NO());
                holder.tvStateName.setText(newReg.getState_Name());
                holder.tvDate.setText(newReg.getHospital_Name());
                holder.tv_project.setText(newReg.getNew_Registrations());
                break;

            case "FollowUp":
                final DDAPFollowUp followUp = ddapFollowUpList.get(position);

                holder.tvSno.setText(followUp.getSR_NO());
                holder.tvStateName.setText(followUp.getState_Name());
                holder.tvDate.setText(followUp.getHospital_Name());
                holder.tv_project.setText(followUp.getFollow_up());
                break;

            case "IPD":
                final DDAPIPD ipd = ddapipdList.get(position);

                holder.tvSno.setText(ipd.getSR_NO());
                holder.tvStateName.setText(ipd.getState_Name());
                holder.tvDate.setText(ipd.getHospital_Name());
                holder.tv_project.setText(ipd.getNo_of_persons_IPD());
                break;

            case "Patients":
                final DDAPPatients patients = ddapPatientsList.get(position);

                holder.tvSno.setText(patients.getSR_NO());
                holder.tvStateName.setText(patients.getState_Name());
                holder.tvDate.setText(patients.getHospital_Name());
                holder.tv_project.setText(patients.getTotal());
                break;

            case "MedicalOfficerNRHM":
                final HRMedicalOfficerNRHM medicalOfficerNRHM = hrMedicalOfficerNRHMList.get(position);
                holder.tvSno.setText(medicalOfficerNRHM.getSR_NO());
                holder.tvStateName.setText(medicalOfficerNRHM.getState_Name());
                holder.tvDate.setText(medicalOfficerNRHM.getVacancies_Of_Medical_Officer_NRHM());
                holder.tv_project.setText(medicalOfficerNRHM.getSanctioned_Medical_Post_NRHM());
                break;

            case "StaffNurseNRHM":
                final HRStaffNurseNRHM staffNurseNRHM = hrStaffNurseNRHMList.get(position);
                holder.tvSno.setText(staffNurseNRHM.getSR_NO());
                holder.tvStateName.setText(staffNurseNRHM.getState_Name());
                holder.tvDate.setText(staffNurseNRHM.getVacancies_Of_Medical_Officer_NRHM());
                holder.tv_project.setText(staffNurseNRHM.getSanctioned_Medical_Post_NRHM());
                break;

            case "MedicalOfficerNUHM":
                final HRMedicalOfficerNUHM medicalOfficerNUHM = hrMedicalOfficerNUHMList.get(position);
                holder.tvSno.setText(medicalOfficerNUHM.getSR_NO());
                holder.tvStateName.setText(medicalOfficerNUHM.getState_Name());
                holder.tvDate.setText(medicalOfficerNUHM.getVacancies_Of_Medical_Officer_NRHM());
                holder.tv_project.setText(medicalOfficerNUHM.getSanctioned_Medical_Post_NRHM());
                break;

            case "StaffNurseNUHM":
                final HRStaffNurseNUHM staffNurseNUHM = hrStaffNurseNUHMList.get(position);
                holder.tvSno.setText(staffNurseNUHM.getSR_NO());
                holder.tvStateName.setText(staffNurseNUHM.getState_Name());
                holder.tvDate.setText(staffNurseNUHM.getVacancies_Of_Medical_Officer_NRHM());
                holder.tv_project.setText(staffNurseNUHM.getSanctioned_Medical_Post_NRHM());
                break;

            case "CP_VHSNCs":
                final CommunityProcess_VHSNCs vhsnCs = communityProcess_vhsnCsList.get(position);
                holder.tvSno.setText(vhsnCs.getSR_NO());
                holder.tvStateName.setText(vhsnCs.getState_Name());
                holder.tvDate.setText(vhsnCs.getNumber_of_VHNSCs_formed());
                holder.tv_project.setText(vhsnCs.getNumber_of_villages());
                break;

            case "CP_RKSs":
                final CommunityProcess_RKSs rkSs = communityProcess_rkSsList.get(position);
                holder.tvSno.setText(rkSs.getSR_NO());
                holder.tvStateName.setText(rkSs.getState_Name());
                holder.tvDate.setText(rkSs.getNumber_of_RKSs());
                holder.tv_project.setText(rkSs.getTotal_number_of_PHC_CHC_SDH_DH());
                break;

            case "CP_RuralAndUrban":
                final CommunityProcess_RuralAndUrban ruralAndUrban = communityProcess_ruralAndUrbanList.get(position);
                holder.tvSno.setText(ruralAndUrban.getSR_NO());
                holder.tvStateName.setText(ruralAndUrban.getState_Name());
                holder.tvDate.setText(ruralAndUrban.getNo_of_ASHAs_in_position());
                holder.tv_project.setText(ruralAndUrban.getApproved());
                break;


            case "CP_DBT":
                final CommunityProcess_DBT dbt = communityProcess_dbtList.get(position);
                holder.tvSno.setText(dbt.getSR_NO());
                holder.tvStateName.setText(dbt.getState_Name());
                holder.tvDate.setText(dbt.getASha_As_whose_honorarium());
                holder.tv_project.setText(dbt.getNo_of_ASHAs_in_position());
                break;

            case "CP_MAS":
                final CommunityProcess_MAS mas = communityProcess_masList.get(position);
                holder.tvSno.setText(mas.getSR_NO());
                holder.tvStateName.setText(mas.getState_Name());
                holder.tvDate.setText(mas.getNumber_of_MAS_created());
                holder.tv_project.setText(mas.getNumber_of_MAS_approved());
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
        if (typeFlag.equalsIgnoreCase("NewReg") || typeFlag == "NewReg") {
            return ddapNewRegList.size();

        } else if (typeFlag.equalsIgnoreCase("FollowUp") || typeFlag == "FollowUp") {
            return ddapFollowUpList.size();
        } else if (typeFlag.equalsIgnoreCase("IPD") || typeFlag == "IPD") {
            return ddapipdList.size();
        } else if (typeFlag.equalsIgnoreCase("Patients") || typeFlag == "Patients") {
            return ddapPatientsList.size();
        } else if (typeFlag.equalsIgnoreCase("MedicalOfficerNRHM") || typeFlag == "MedicalOfficerNRHM") {
            return hrMedicalOfficerNRHMList.size();
        } else if (typeFlag.equalsIgnoreCase("StaffNurseNRHM") || typeFlag == "StaffNurseNRHM") {
            return hrStaffNurseNRHMList.size();
        } else if (typeFlag.equalsIgnoreCase("MedicalOfficerNUHM") || typeFlag == "MedicalOfficerNUHM") {
            return hrMedicalOfficerNUHMList.size();
        } else if (typeFlag.equalsIgnoreCase("StaffNurseNUHM") || typeFlag == "StaffNurseNUHM") {
            return hrStaffNurseNUHMList.size();
        } else if (typeFlag.equalsIgnoreCase("CP_VHSNCs") || typeFlag == "CP_VHSNCs") {
            return communityProcess_vhsnCsList.size();
        } else if (typeFlag.equalsIgnoreCase("CP_RKSs") || typeFlag == "CP_RKSs") {
            return communityProcess_rkSsList.size();
        } else if (typeFlag.equalsIgnoreCase("CP_RuralAndUrban") || typeFlag == "CP_RuralAndUrban") {
            return communityProcess_ruralAndUrbanList.size();
        } else if (typeFlag.equalsIgnoreCase("CP_DBT") || typeFlag == "CP_DBT") {
            return communityProcess_dbtList.size();
        } else if (typeFlag.equalsIgnoreCase("CP_MAS") || typeFlag == "CP_MAS") {
            return communityProcess_masList.size();
        } else {
            return ncdcLeaseDeedList.size();
        }
    }

    ////////////////pagiantion method///////////
    public void addData(List<MinisterPbsTrainedNcd> facilityTypeDetailsLists) {
        for (MinisterPbsTrainedNcd ftdl : facilityTypeDetailsLists) {
            ministerPbsTrainedNcdList.add(ftdl);

        }
        notifyDataSetChanged();
    }

    //////////////Search in recyclerview method//////////
    public void updateList(List<MinisterPbsTrainedNcd> newList) {
        ministerPbsTrainedNcdList = new ArrayList<>();
        ministerPbsTrainedNcdList.addAll(newList);
        notifyDataSetChanged();
    }
}
