package com.chi.centraldashboard.Minister.HealthServiceDelivery;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.chi.centraldashboard.R;
import com.chi.centraldashboard.apiCall.bin.ChildHealthHBNC;
import com.chi.centraldashboard.apiCall.bin.ChildHealthIDCF;
import com.chi.centraldashboard.apiCall.bin.ChildHealthNDD;
import com.chi.centraldashboard.apiCall.bin.ChildHealthRBSK;
import com.chi.centraldashboard.apiCall.bin.ChildHealthSNCU;
import com.chi.centraldashboard.apiCall.bin.FamilyPlaningDoses;
import com.chi.centraldashboard.apiCall.bin.ImmunizationCoverage;
import com.chi.centraldashboard.apiCall.bin.ImmunizationFirstDose;
import com.chi.centraldashboard.apiCall.bin.ImmunizationSecondDose;
import com.chi.centraldashboard.apiCall.bin.ImmunizationVaccineCoverage;
import com.chi.centraldashboard.apiCall.bin.MaternalHealthNationallyCertified;
import com.chi.centraldashboard.apiCall.bin.MaternalHealthPHF;
import com.chi.centraldashboard.apiCall.bin.MaternalHealthPMSMA;
import com.chi.centraldashboard.apiCall.bin.MaternalHealthStateCertified;
import com.chi.centraldashboard.apiCall.bin.MinisterPmjayECardsGenerated;
import com.chi.centraldashboard.apiCall.bin.MinisterPmjayHospitalsEmpanelled;
import com.chi.centraldashboard.apiCall.bin.MinisterPmjayPreAuthorizations;

import java.util.ArrayList;
import java.util.List;

public class PMJAYCusRecViewThreeAdapter extends RecyclerView.Adapter<PMJAYCusRecViewThreeAdapter.MyViewHolder> {

    Context mCtx;
    String typeMain;
    int nouse;
    private List<MinisterPmjayECardsGenerated> ministerPmjayECardsGeneratedList;
    private List<MinisterPmjayHospitalsEmpanelled> ministerPmjayHospitalsEmpanelledList;
    private List<MinisterPmjayPreAuthorizations> ministerPmjayPreAuthorizationsList;

    private List<FamilyPlaningDoses> familyPlaningDosesList;


    private List<MaternalHealthPMSMA> pmsmaList;
    private List<MaternalHealthPHF> phfList;
    private List<MaternalHealthStateCertified> stateCertifiedList;
    private List<MaternalHealthNationallyCertified> nationallyCertifiedList;


    private List<ImmunizationCoverage> immunizationCoverageList;
    private List<ImmunizationVaccineCoverage> immunizationVaccineCoverageList;
    private List<ImmunizationFirstDose> immunizationFirstDoseList;
    private List<ImmunizationSecondDose> immunizationSecondDoseList;

    private List<ChildHealthNDD> childHealthNDDList;
    private List<ChildHealthIDCF> childHealthIDCFList;
    private List<ChildHealthRBSK> childHealthRBSKList;
    private List<ChildHealthHBNC> childHealthHBNCList;
    private List<ChildHealthSNCU> childHealthSNCUList;


    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView tvSno, tv_project, tvStateName, tvLocatoin, tvPhase, tvProjectStatus, tvOpdStatus, tvMcStatus, tvPhysicalProgress, tvCount;


        public MyViewHolder(View view) {
            super(view);

            tvSno = (TextView) view.findViewById(R.id.tv_srno);
            tv_project = (TextView) view.findViewById(R.id.tv_project);
            tvStateName = (TextView) view.findViewById(R.id.tv_statename);


        }
    }


    public PMJAYCusRecViewThreeAdapter(Context applicationContext, List<MinisterPmjayECardsGenerated> ministerPmjayECardsGeneratedList, List<MinisterPmjayPreAuthorizations> ministerPmjayPreAuthorizations, List<MinisterPmjayHospitalsEmpanelled> ministerPmjayHospitalsEmpanelleds, String type) {
        this.mCtx = applicationContext;
        this.ministerPmjayECardsGeneratedList = ministerPmjayECardsGeneratedList;
        this.ministerPmjayPreAuthorizationsList = ministerPmjayPreAuthorizations;
        this.ministerPmjayHospitalsEmpanelledList = ministerPmjayHospitalsEmpanelleds;
        this.typeMain = type;
    }

    public PMJAYCusRecViewThreeAdapter(Context baseContext, List<FamilyPlaningDoses> familyPlaningDosesList, String type) {
        this.mCtx = baseContext;
        this.familyPlaningDosesList = familyPlaningDosesList;
        this.typeMain = type;
    }

    public PMJAYCusRecViewThreeAdapter(Context applicationContext, List<MaternalHealthPMSMA> pmsmaList, List<MaternalHealthPHF> phfList, List<MaternalHealthStateCertified> stateCertifiedList, List<MaternalHealthNationallyCertified> nationallyCertifiedList, String typeMain) {
        this.mCtx = applicationContext;
        this.pmsmaList = pmsmaList;
        this.phfList = phfList;
        this.stateCertifiedList = stateCertifiedList;
        this.nationallyCertifiedList = nationallyCertifiedList;
        this.typeMain = typeMain;
    }


    public PMJAYCusRecViewThreeAdapter(Context applicationContext, List<ImmunizationCoverage> immunizationCoverageList, List<ImmunizationVaccineCoverage> immunizationVaccineCoverageList, List<ImmunizationFirstDose> immunizationFirstDoseList, List<ImmunizationSecondDose> immunizationSecondDoseList, String typeMain, int nouse) {
        this.mCtx = applicationContext;
        this.immunizationCoverageList = immunizationCoverageList;
        this.immunizationVaccineCoverageList = immunizationVaccineCoverageList;
        this.immunizationFirstDoseList = immunizationFirstDoseList;
        this.immunizationSecondDoseList = immunizationSecondDoseList;
        this.typeMain = typeMain;
        this.nouse = nouse;
    }


    public PMJAYCusRecViewThreeAdapter(Context applicationContext, List<ChildHealthNDD> childHealthNDDList, List<ChildHealthIDCF> childHealthIDCFList, List<ChildHealthRBSK> childHealthRBSKList, List<ChildHealthHBNC> childHealthHBNCList, List<ChildHealthSNCU> childHealthSNCUList, String typeMain) {

        this.mCtx = applicationContext;
        this.childHealthNDDList = childHealthNDDList;
        this.childHealthIDCFList = childHealthIDCFList;
        this.childHealthRBSKList = childHealthRBSKList;
        this.childHealthHBNCList = childHealthHBNCList;
        this.childHealthSNCUList = childHealthSNCUList;
        this.typeMain = typeMain;
    }


    @Override
    public PMJAYCusRecViewThreeAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.mpmjay_recview_row, parent, false);
        //View itemCardView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recylerview_row, parent, false);

        return new PMJAYCusRecViewThreeAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(PMJAYCusRecViewThreeAdapter.MyViewHolder holder, int position) {

        if (position % 2 == 0) {
            //holder.rootView.setBackgroundColor(Color.BLACK);
            holder.itemView.setBackgroundResource(R.color.colorFadedWhite);
//            holder.cardView.setCardBackgroundColor(Color.parseColor("#efebeb"));
        } else {
            //holder.rootView.setBackgroundColor(Color.WHITE);
            holder.itemView.setBackgroundResource(R.color.White);
            //          holder.cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
        }


        switch (typeMain) {
            case "ecard":
                final MinisterPmjayECardsGenerated newAiims = ministerPmjayECardsGeneratedList.get(position);

                holder.tvSno.setText(String.valueOf(newAiims.getSr_no()));
                holder.tv_project.setText(newAiims.getState_name());
                holder.tvStateName.setText(newAiims.getNo_ecards_generated());
                break;

            case "preautho":
                final MinisterPmjayPreAuthorizations pmjayPreAuthorizations = ministerPmjayPreAuthorizationsList.get(position);
                holder.tvSno.setText(String.valueOf(pmjayPreAuthorizations.getSr_no()));
                holder.tv_project.setText(pmjayPreAuthorizations.getState_name());
                holder.tvStateName.setText(pmjayPreAuthorizations.getNo_pre_authorizations());
                break;

            case "hospital":
                final MinisterPmjayHospitalsEmpanelled pmjayHospitalsEmpanelled = ministerPmjayHospitalsEmpanelledList.get(position);
                holder.tvSno.setText(String.valueOf(pmjayHospitalsEmpanelled.getSr_no()));
                holder.tv_project.setText(pmjayHospitalsEmpanelled.getState_name());
                holder.tvStateName.setText(pmjayHospitalsEmpanelled.getHospitals_empanelled_scheme());
                break;
            case "doses":
                final FamilyPlaningDoses doses = familyPlaningDosesList.get(position);
                holder.tvSno.setText(doses.getSR_NO());
                holder.tv_project.setText(doses.getState_Name());
                holder.tvStateName.setText(doses.getInjectable_doses());
                break;

            case "pmsma":
                final MaternalHealthPMSMA pmsma = pmsmaList.get(position);
                holder.tvSno.setText(pmsma.getSR_NO());
                holder.tv_project.setText(pmsma.getState_Name());
                holder.tvStateName.setText(pmsma.getNoofanc());
                break;

            case "phf":
                final MaternalHealthPHF phf = phfList.get(position);
                holder.tvSno.setText(phf.getSR_NO());
                holder.tv_project.setText(phf.getState_Name());
                holder.tvStateName.setText(phf.getPublic_health_facilites_no());
                break;

            case "statecertified":
                final MaternalHealthStateCertified stateCertified = stateCertifiedList.get(position);
                holder.tvSno.setText(stateCertified.getSR_NO());
                holder.tv_project.setText(stateCertified.getState_Name());
                holder.tvStateName.setText(stateCertified.getLr_and_ot_state());
                break;

            case "nationallycertified":
                final MaternalHealthNationallyCertified nationallyCertified = nationallyCertifiedList.get(position);
                holder.tvSno.setText(nationallyCertified.getSR_NO());
                holder.tv_project.setText(nationallyCertified.getState_Name());
                holder.tvStateName.setText(nationallyCertified.getLr_and_ot_national());
                break;

            case "coverage":
                final ImmunizationCoverage coverage = immunizationCoverageList.get(position);
                holder.tvSno.setText(coverage.getSR_NO());
                holder.tv_project.setText(coverage.getState_Name());
                holder.tvStateName.setText(coverage.getImmunization_coverage());
                break;

            case "vaccinecoverage":
                final ImmunizationVaccineCoverage vaccineCoverage = immunizationVaccineCoverageList.get(position);
                holder.tvSno.setText(vaccineCoverage.getSR_NO());
                holder.tv_project.setText(vaccineCoverage.getState_Name());
                holder.tvStateName.setText(vaccineCoverage.getRotavirus_vaccine_coverage());
                break;

            case "firstdose":
                final ImmunizationFirstDose firstDose = immunizationFirstDoseList.get(position);
                holder.tvSno.setText(firstDose.getSR_NO());
                holder.tv_project.setText(firstDose.getState_Name());
                holder.tvStateName.setText(firstDose.getMrone_dose_coverage());
                break;

            case "seconddose":
                final ImmunizationSecondDose secondDose = immunizationSecondDoseList.get(position);
                holder.tvSno.setText(secondDose.getSR_NO());
                holder.tv_project.setText(secondDose.getState_Name());
                holder.tvStateName.setText(secondDose.getMrsecond_dose_coverage());
                break;


            case "NDD":
                final ChildHealthNDD ndd = childHealthNDDList.get(position);
                holder.tvSno.setText(ndd.getSR_NO());
                holder.tv_project.setText(ndd.getState_Name());
                holder.tvStateName.setText(ndd.getNational_Deworming_Day_Coverage());
                break;

            case "IDCF":
                final ChildHealthIDCF idcf = childHealthIDCFList.get(position);
                holder.tvSno.setText(idcf.getSR_NO());
                holder.tv_project.setText(idcf.getState_Name());
                holder.tvStateName.setText(idcf.getIntensified_Diarrhoea_Control_Fortnight_Coverage());
                break;

            case "RBSK":
                final ChildHealthRBSK rbsk = childHealthRBSKList.get(position);
                holder.tvSno.setText(rbsk.getSR_NO());
                holder.tv_project.setText(rbsk.getState_Name());
                holder.tvStateName.setText(rbsk.getNo_of_children_screened());
                break;

            case "HBNC":
                final ChildHealthHBNC hbnc = childHealthHBNCList.get(position);
                holder.tvSno.setText(hbnc.getSR_NO());
                holder.tv_project.setText(hbnc.getState_Name());
                holder.tvStateName.setText(hbnc.getNo_of_newborns_received());
                break;

            case "SNCU":
                final ChildHealthSNCU sncu = childHealthSNCUList.get(position);
                holder.tvSno.setText(sncu.getSR_NO());
                holder.tv_project.setText(sncu.getState_Name());
                holder.tvStateName.setText(sncu.getNo_of_children_received());
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

        if (typeMain.equalsIgnoreCase("ecard") || typeMain.equals("ecard")) {
            return ministerPmjayECardsGeneratedList.size();
        } else if (typeMain.equalsIgnoreCase("preautho") || typeMain.equals("preautho")) {
            return ministerPmjayPreAuthorizationsList.size();
        } else if (typeMain.equalsIgnoreCase("hospital") || typeMain.equals("hospital")) {
            return ministerPmjayHospitalsEmpanelledList.size();
        } else if (typeMain.equalsIgnoreCase("pmsma") || typeMain.equals("pmsma")) {
            return pmsmaList.size();
        } else if (typeMain.equalsIgnoreCase("phf") || typeMain.equals("phf")) {
            return phfList.size();
        } else if (typeMain.equalsIgnoreCase("statecertified") || typeMain.equals("statecertified")) {
            return stateCertifiedList.size();
        } else if (typeMain.equalsIgnoreCase("nationallycertified") || typeMain.equals("nationallycertified")) {
            return nationallyCertifiedList.size();
        } else if (typeMain.equalsIgnoreCase("coverage") || typeMain.equals("coverage")) {
            return immunizationCoverageList.size();
        } else if (typeMain.equalsIgnoreCase("vaccinecoverage") || typeMain.equals("vaccinecoverage")) {
            return immunizationVaccineCoverageList.size();
        } else if (typeMain.equalsIgnoreCase("firstdose") || typeMain.equals("firstdose")) {
            return immunizationFirstDoseList.size();
        } else if (typeMain.equalsIgnoreCase("seconddose") || typeMain.equals("seconddose")) {
            return immunizationSecondDoseList.size();
        } else if (typeMain.equalsIgnoreCase("NDD") || typeMain.equals("NDD")) {
            return childHealthNDDList.size();
        } else if (typeMain.equalsIgnoreCase("IDCF") || typeMain.equals("IDCF")) {
            return childHealthIDCFList.size();
        } else if (typeMain.equalsIgnoreCase("RBSK") || typeMain.equals("RBSK")) {
            return childHealthRBSKList.size();
        } else if (typeMain.equalsIgnoreCase("HBNC") || typeMain.equals("HBNC")) {
            return childHealthHBNCList.size();
        } else if (typeMain.equalsIgnoreCase("SNCU") || typeMain.equals("SNCU")) {
            return childHealthSNCUList.size();
        } else {
            return familyPlaningDosesList.size();
        }
    }


    ////////////////pagiantion method///////////
    public void addData(List<MinisterPmjayECardsGenerated> facilityTypeDetailsLists) {
        for (MinisterPmjayECardsGenerated ftdl : facilityTypeDetailsLists) {
            ministerPmjayECardsGeneratedList.add(ftdl);

        }
        notifyDataSetChanged();
    }

    //////////////Search in recyclerview method//////////
    public void updateList(List<MinisterPmjayECardsGenerated> newList) {
        ministerPmjayECardsGeneratedList = new ArrayList<>();
        ministerPmjayECardsGeneratedList.addAll(newList);
        notifyDataSetChanged();
    }
}
