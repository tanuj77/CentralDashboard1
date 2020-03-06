package com.chi.centraldashboard.Minister.Survillance;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.chi.centraldashboard.R;
import com.chi.centraldashboard.apiCall.bin.AMRProgramme;
import com.chi.centraldashboard.apiCall.bin.AMRSurveillance;
import com.chi.centraldashboard.apiCall.bin.LeptospirosisDAffected;
import com.chi.centraldashboard.apiCall.bin.LeptospirosisLCC;
import com.chi.centraldashboard.apiCall.bin.LeptospirosisOReported;
import com.chi.centraldashboard.apiCall.bin.MinisterPbsTrainedNcd;
import com.chi.centraldashboard.apiCall.bin.NACOHIVTests;
import com.chi.centraldashboard.apiCall.bin.NACOPLHIVART;
import com.chi.centraldashboard.apiCall.bin.NACOPLHIVViralLoad;
import com.chi.centraldashboard.apiCall.bin.NCDCMOUSigned;
import com.chi.centraldashboard.apiCall.bin.NCDCMoneyReleased;
import com.chi.centraldashboard.apiCall.bin.NCDCTotalAmount;
import com.chi.centraldashboard.apiCall.bin.NLEP_CasesDetected;
import com.chi.centraldashboard.apiCall.bin.NLEP_CasesOnRecord;
import com.chi.centraldashboard.apiCall.bin.NPCDCS_Infra_CCU;
import com.chi.centraldashboard.apiCall.bin.NPCDCS_Infra_CHCNCD;
import com.chi.centraldashboard.apiCall.bin.NPCDCS_Infra_DayCare;
import com.chi.centraldashboard.apiCall.bin.NPCDCS_Infra_NCDCells;
import com.chi.centraldashboard.apiCall.bin.NPCDCS_Infra_NCDClinics;
import com.chi.centraldashboard.apiCall.bin.NPCDCS_Screening_Opportunistic;
import com.chi.centraldashboard.apiCall.bin.NPCDCS_Screening_Outreach;
import com.chi.centraldashboard.apiCall.bin.NPPCD_madeOperational;
import com.chi.centraldashboard.apiCall.bin.NPPCD_underNPPCd;
import com.chi.centraldashboard.apiCall.bin.NPPCF_Budget;
import com.chi.centraldashboard.apiCall.bin.NPPCF_Districts;
import com.chi.centraldashboard.apiCall.bin.NTCPCOTPA;
import com.chi.centraldashboard.apiCall.bin.NTCPFineImposed;
import com.chi.centraldashboard.apiCall.bin.NTCPPersonQuit;
import com.chi.centraldashboard.apiCall.bin.NTCPQuitline;
import com.chi.centraldashboard.apiCall.bin.NTCPQuitters;
import com.chi.centraldashboard.apiCall.bin.NTCPTCC;
import com.chi.centraldashboard.apiCall.bin.NTCPTCServices;
import com.chi.centraldashboard.apiCall.bin.NTCPUnderNTCP;
import com.chi.centraldashboard.apiCall.bin.NVBDCP_Chikungunya_Confirmed;
import com.chi.centraldashboard.apiCall.bin.NVBDCP_Chikungunya_Sentinel;
import com.chi.centraldashboard.apiCall.bin.NVBDCP_Chikungunya_Suspected;
import com.chi.centraldashboard.apiCall.bin.NVBDCP_Dengue_Deaths;
import com.chi.centraldashboard.apiCall.bin.NVBDCP_Dengue_Fatality;
import com.chi.centraldashboard.apiCall.bin.NVBDCP_Dengue_Sentinel;
import com.chi.centraldashboard.apiCall.bin.NVBDCP_Dengue_TotalCases;
import com.chi.centraldashboard.apiCall.bin.NVBDCP_Japenese_Deaths;
import com.chi.centraldashboard.apiCall.bin.NVBDCP_Japenese_JEVaccination;
import com.chi.centraldashboard.apiCall.bin.NVBDCP_Japenese_PICUsFunctional;
import com.chi.centraldashboard.apiCall.bin.NVBDCP_Japenese_PICUsFunds;
import com.chi.centraldashboard.apiCall.bin.NVBDCP_Japenese_PMRFunctional;
import com.chi.centraldashboard.apiCall.bin.NVBDCP_Japenese_PMRFunds;
import com.chi.centraldashboard.apiCall.bin.NVBDCP_Japenese_TotalCases;
import com.chi.centraldashboard.apiCall.bin.NVBDCP_Kalaazar_Deaths;
import com.chi.centraldashboard.apiCall.bin.NVBDCP_Kalaazar_PFCases;
import com.chi.centraldashboard.apiCall.bin.NVBDCP_Kalaazar_TotalCases;
import com.chi.centraldashboard.apiCall.bin.NVBDCP_Lymphatic_Endemic;
import com.chi.centraldashboard.apiCall.bin.NVBDCP_Lymphatic_IDA;
import com.chi.centraldashboard.apiCall.bin.NVBDCP_Lymphatic_MDA;
import com.chi.centraldashboard.apiCall.bin.NVBDCP_Lymphatic_TAS;
import com.chi.centraldashboard.apiCall.bin.NVBDCP_Malaria_Deaths;
import com.chi.centraldashboard.apiCall.bin.NVBDCP_Malaria_LLIN;
import com.chi.centraldashboard.apiCall.bin.NVBDCP_Malaria_PFCases;
import com.chi.centraldashboard.apiCall.bin.NVBDCP_Malaria_TotalCases;
import com.chi.centraldashboard.apiCall.bin.SRS_MMR;
import com.chi.centraldashboard.apiCall.bin.VHP_District;
import com.chi.centraldashboard.apiCall.bin.VHP_Regional;

import java.util.ArrayList;
import java.util.List;

public class PbsCusRecViewThreeAdapter extends RecyclerView.Adapter<PbsCusRecViewThreeAdapter.MyViewHolder> {

    Context mCtx;
    String typeFlag = "nothing";
    int no_use = 0;
    private List<MinisterPbsTrainedNcd> ministerPbsTrainedNcdList;

    private List<NCDCMOUSigned> ncdcmouSignedList;
    private List<NCDCMoneyReleased> ncdcMoneyReleasedList;
    private List<NCDCTotalAmount> ncdcTotalAmountList;


    private List<NTCPQuitline> ntcpQuitlineList;
    private List<NTCPQuitters> ntcpQuittersList;
    private List<NTCPPersonQuit> ntcpPersonQuitList;
    private List<NTCPUnderNTCP> ntcpUnderNTCPList;
    private List<NTCPCOTPA> ntcpcotpaList;
    private List<NTCPFineImposed> ntcpFineImposedList;
    private List<NTCPTCC> ntcptccList;
    private List<NTCPTCServices> ntcptcServicesList;

    private List<LeptospirosisDAffected> leptospirosisDAffectedList;
    private List<LeptospirosisOReported> leptospirosisOReportedList;
    private List<LeptospirosisLCC> leptospirosisLCCList;


    private List<NACOHIVTests> nacohivTestsList;
    private List<NACOPLHIVART> nacoplhivartList;
    private List<NACOPLHIVViralLoad> nacoplhivViralLoadList;

    private List<AMRProgramme> amrProgrammeList;
    private List<AMRSurveillance> amrSurveillanceList;

    private List<NVBDCP_Malaria_TotalCases> nvbdcp_malaria_totalCasesList;
    private List<NVBDCP_Malaria_PFCases> nvbdcp_malaria_pfCasesList;
    private List<NVBDCP_Malaria_Deaths> nvbdcp_malaria_deathsList;
    private List<NVBDCP_Malaria_LLIN> nvbdcp_malaria_llinList;

    private List<NVBDCP_Kalaazar_TotalCases> nvbdcp_kalaazar_totalCasesList;
    private List<NVBDCP_Kalaazar_PFCases> nvbdcp_kalaazar_pfCasesList;
    private List<NVBDCP_Kalaazar_Deaths> nvbdcp_kalaazar_deathsList;

    private List<NVBDCP_Lymphatic_Endemic> nvbdcp_lymphatic_endemicList;
    private List<NVBDCP_Lymphatic_TAS> nvbdcp_lymphatic_tasList;
    private List<NVBDCP_Lymphatic_MDA> nvbdcp_lymphatic_mdaList;
    private List<NVBDCP_Lymphatic_IDA> nvbdcp_lymphatic_idaList;

    private List<NVBDCP_Dengue_TotalCases> nvbdcp_dengue_totalCasesList;
    private List<NVBDCP_Dengue_Deaths> nvbdcp_dengue_deathsList;
    private List<NVBDCP_Dengue_Sentinel> nvbdcp_dengue_sentinelList;
    private List<NVBDCP_Dengue_Fatality> nvbdcp_dengue_fatalityList;

    private List<NVBDCP_Chikungunya_Suspected> nvbdcp_chikungunya_suspectedList;
    private List<NVBDCP_Chikungunya_Confirmed> nvbdcp_chikungunya_confirmedList;
    private List<NVBDCP_Chikungunya_Sentinel> nvbdcp_chikungunya_sentinelList;

    private List<NVBDCP_Japenese_TotalCases> nvbdcp_japenese_totalCasesList;
    private List<NVBDCP_Japenese_Deaths> nvbdcp_japenese_deathsList;
    private List<NVBDCP_Japenese_JEVaccination> nvbdcp_japenese_jeVaccinationList;
    private List<NVBDCP_Japenese_PICUsFunds> nvbdcp_japenese_picUsFundsList;
    private List<NVBDCP_Japenese_PICUsFunctional> nvbdcp_japenese_picUsFunctionalList;
    private List<NVBDCP_Japenese_PMRFunds> nvbdcp_japenese_pmrFundsList;
    private List<NVBDCP_Japenese_PMRFunctional> nvbdcp_japenese_pmrFunctionalList;


    private List<NPCDCS_Infra_NCDCells> npcdcs_infra_ncdCellsList;
    private List<NPCDCS_Infra_CHCNCD> npcdcs_infra_chcncdList;
    private List<NPCDCS_Infra_NCDClinics> npcdcs_infra_ncdClinicsList;
    private List<NPCDCS_Infra_CCU> npcdcs_infra_ccuList;
    private List<NPCDCS_Infra_DayCare> npcdcs_infra_dayCareList;

    private List<NPCDCS_Screening_Opportunistic> npcdcs_screening_opportunisticList;
    private List<NPCDCS_Screening_Outreach> npcdcs_screening_outreachList;

    private List<NPPCD_underNPPCd> nppcdUnderNPPCds;
    private List<NPPCD_madeOperational> nppcd_madeOperationalList;

    private List<NPPCF_Districts> nppcf_districtsList;
    private List<NPPCF_Budget> nppcf_budgetList;

    private List<VHP_Regional> vhp_regionalList;
    private List<VHP_District> vhp_districtList;

    private List<NLEP_CasesOnRecord> nlep_casesOnRecordList;
    private List<NLEP_CasesDetected> nlep_casesDetectedList;

    private List<SRS_MMR> srs_mmrList;




    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView tvSno, tv_project, tvStateName;


        public MyViewHolder(View view) {
            super(view);

            tvSno = (TextView) view.findViewById(R.id.tv_srno);
            tvStateName = (TextView) view.findViewById(R.id.tv_statename);
            tv_project = (TextView) view.findViewById(R.id.tv_project);

        }
    }


    public PbsCusRecViewThreeAdapter(Context applicationContext, List<MinisterPbsTrainedNcd> ministerPbsTrainedNcdList, String typeFlag) {
        this.mCtx = applicationContext;
        this.ministerPbsTrainedNcdList = ministerPbsTrainedNcdList;
        this.typeFlag = typeFlag;

    }

    public PbsCusRecViewThreeAdapter(Context applicationContext, List<NCDCMOUSigned> ncdcmouSignedList, List<NCDCMoneyReleased> ncdcMoneyReleasedList, List<NCDCTotalAmount> ncdcTotalAmountList, String typeFlag) {
        this.mCtx = applicationContext;
        this.ncdcmouSignedList = ncdcmouSignedList;
        this.ncdcMoneyReleasedList = ncdcMoneyReleasedList;
        this.ncdcTotalAmountList = ncdcTotalAmountList;
        this.typeFlag = typeFlag;

    }

    public PbsCusRecViewThreeAdapter(Context applicationContext, List<NTCPQuitline> ntcpQuitlineList, List<NTCPQuitters> ntcpQuittersList, List<NTCPPersonQuit> ntcpPersonQuitList, List<NTCPUnderNTCP> ntcpUnderNTCPList, List<NTCPCOTPA> ntcpcotpaList, List<NTCPFineImposed> ntcpFineImposedList, List<NTCPTCC> ntcptccList, List<NTCPTCServices> ntcptcServicesList, String typeFlag) {
        this.mCtx = applicationContext;
        this.ntcpQuitlineList = ntcpQuitlineList;
        this.ntcpQuittersList = ntcpQuittersList;
        this.ntcpPersonQuitList = ntcpPersonQuitList;
        this.ntcpUnderNTCPList = ntcpUnderNTCPList;
        this.ntcpcotpaList = ntcpcotpaList;
        this.ntcpFineImposedList = ntcpFineImposedList;
        this.ntcptccList = ntcptccList;
        this.ntcptcServicesList = ntcptcServicesList;
        this.typeFlag = typeFlag;
    }

    public PbsCusRecViewThreeAdapter(Context applicationContext, List<LeptospirosisDAffected> leptospirosisDAffectedList, List<LeptospirosisOReported> leptospirosisOReportedList, List<LeptospirosisLCC> leptospirosisLCCList, String typeFlag, int i) {
        this.mCtx = applicationContext;
        this.leptospirosisDAffectedList = leptospirosisDAffectedList;
        this.leptospirosisOReportedList = leptospirosisOReportedList;
        this.leptospirosisLCCList = leptospirosisLCCList;
        this.typeFlag = typeFlag;
        this.no_use = i;

    }

    public PbsCusRecViewThreeAdapter(Context applicationContext, List<NACOHIVTests> nacohivTestsList, List<NACOPLHIVART> nacoplhivartList, List<NACOPLHIVViralLoad> nacoplhivViralLoadList, String typeFlag, double v) {
        this.mCtx = applicationContext;
        this.typeFlag = typeFlag;
        this.nacohivTestsList = nacohivTestsList;
        this.nacoplhivartList = nacoplhivartList;
        this.nacoplhivViralLoadList = nacoplhivViralLoadList;
    }

    public PbsCusRecViewThreeAdapter(Context applicationContext, List<AMRProgramme> amrProgrammeList, List<AMRSurveillance> amrSurveillanceList, String typeFlag) {
        this.mCtx = applicationContext;
        this.typeFlag = typeFlag;
        this.amrProgrammeList = amrProgrammeList;
        this.amrSurveillanceList = amrSurveillanceList;
    }


    public PbsCusRecViewThreeAdapter(Context context, List<NVBDCP_Malaria_TotalCases> nvbdcp_malaria_totalCasesList, List<NVBDCP_Malaria_PFCases> nvbdcp_malaria_pfCasesList, List<NVBDCP_Malaria_Deaths> nvbdcp_malaria_deathsList, List<NVBDCP_Malaria_LLIN> nvbdcp_malaria_llinList, String typeFlag, int i) {
        this.mCtx = context;
        this.typeFlag = typeFlag;
        this.nvbdcp_malaria_totalCasesList = nvbdcp_malaria_totalCasesList;
        this.nvbdcp_malaria_pfCasesList = nvbdcp_malaria_pfCasesList;
        this.nvbdcp_malaria_deathsList = nvbdcp_malaria_deathsList;
        this.nvbdcp_malaria_llinList = nvbdcp_malaria_llinList;
    }

    public PbsCusRecViewThreeAdapter(Context context, List<NVBDCP_Kalaazar_TotalCases> nvbdcp_kalaazar_totalCasesList, List<NVBDCP_Kalaazar_PFCases> nvbdcp_kalaazar_pfCasesList, List<NVBDCP_Kalaazar_Deaths> nvbdcp_kalaazar_deathsList, String typeFlag, String faltu) {
        this.mCtx = context;
        this.typeFlag = typeFlag;
        this.nvbdcp_kalaazar_totalCasesList = nvbdcp_kalaazar_totalCasesList;
        this.nvbdcp_kalaazar_pfCasesList = nvbdcp_kalaazar_pfCasesList;
        this.nvbdcp_kalaazar_deathsList = nvbdcp_kalaazar_deathsList;
    }

    /////nvbdcpLymphatic
    public PbsCusRecViewThreeAdapter(Context context, List<NVBDCP_Lymphatic_Endemic> nvbdcp_lymphatic_endemicList, List<NVBDCP_Lymphatic_TAS> nvbdcp_lymphatic_tasList, List<NVBDCP_Lymphatic_MDA> nvbdcp_lymphatic_mdaList, List<NVBDCP_Lymphatic_IDA> nvbdcp_lymphatic_idaList, String typeFlag, String faltu) {
        this.mCtx = context;
        this.typeFlag = typeFlag;
        this.nvbdcp_lymphatic_endemicList = nvbdcp_lymphatic_endemicList;
        this.nvbdcp_lymphatic_tasList = nvbdcp_lymphatic_tasList;
        this.nvbdcp_lymphatic_mdaList = nvbdcp_lymphatic_mdaList;
        this.nvbdcp_lymphatic_idaList = nvbdcp_lymphatic_idaList;
    }

    /////nvdcpDengue
    public PbsCusRecViewThreeAdapter(Context context, List<NVBDCP_Dengue_TotalCases> nvbdcp_dengue_totalCasesList, List<NVBDCP_Dengue_Deaths> nvbdcp_dengue_deathsList, List<NVBDCP_Dengue_Sentinel> nvbdcp_dengue_sentinelList, List<NVBDCP_Dengue_Fatality> nvbdcp_dengue_fatalityList, double v, String typeFlag) {
        this.mCtx = context;
        this.typeFlag = typeFlag;
        this.nvbdcp_dengue_totalCasesList = nvbdcp_dengue_totalCasesList;
        this.nvbdcp_dengue_deathsList = nvbdcp_dengue_deathsList;
        this.nvbdcp_dengue_sentinelList = nvbdcp_dengue_sentinelList;
        this.nvbdcp_dengue_fatalityList = nvbdcp_dengue_fatalityList;

    }

    ////nvdcpChkungunya
    public PbsCusRecViewThreeAdapter(Context context, List<NVBDCP_Chikungunya_Suspected> nvbdcp_chikungunya_suspectedList, List<NVBDCP_Chikungunya_Confirmed> nvbdcp_chikungunya_confirmedList, List<NVBDCP_Chikungunya_Sentinel> nvbdcp_chikungunya_sentinelList, double v, String typeFlag) {
        this.mCtx = context;
        this.typeFlag = typeFlag;
        this.nvbdcp_chikungunya_suspectedList = nvbdcp_chikungunya_suspectedList;
        this.nvbdcp_chikungunya_confirmedList = nvbdcp_chikungunya_confirmedList;
        this.nvbdcp_chikungunya_sentinelList = nvbdcp_chikungunya_sentinelList;
    }


    /////nvbdcp japense
    public PbsCusRecViewThreeAdapter(Context context, List<NVBDCP_Japenese_TotalCases> nvbdcp_japenese_totalCasesList, List<NVBDCP_Japenese_Deaths> nvbdcp_japenese_deathsList, List<NVBDCP_Japenese_JEVaccination> nvbdcp_japenese_jeVaccinationList, List<NVBDCP_Japenese_PICUsFunds> nvbdcp_japenese_picUsFundsList, List<NVBDCP_Japenese_PICUsFunctional> nvbdcp_japenese_picUsFunctionalList, List<NVBDCP_Japenese_PMRFunds> nvbdcp_japenese_pmrFundsList, List<NVBDCP_Japenese_PMRFunctional> nvbdcp_japenese_pmrFunctionalList, String typeFlag) {
        this.mCtx = context;
        this.typeFlag = typeFlag;
        this.nvbdcp_japenese_totalCasesList = nvbdcp_japenese_totalCasesList;
        this.nvbdcp_japenese_deathsList = nvbdcp_japenese_deathsList;
        this.nvbdcp_japenese_jeVaccinationList = nvbdcp_japenese_jeVaccinationList;
        this.nvbdcp_japenese_picUsFundsList = nvbdcp_japenese_picUsFundsList;
        this.nvbdcp_japenese_picUsFunctionalList = nvbdcp_japenese_picUsFunctionalList;
        this.nvbdcp_japenese_pmrFundsList = nvbdcp_japenese_pmrFundsList;
        this.nvbdcp_japenese_pmrFunctionalList = nvbdcp_japenese_pmrFunctionalList;
    }

    ////NPCDCS Infra
    public PbsCusRecViewThreeAdapter(Context context, List<NPCDCS_Infra_NCDCells> npcdcs_infra_ncdCellsList, List<NPCDCS_Infra_CHCNCD> npcdcs_infra_chcncdList, List<NPCDCS_Infra_NCDClinics> npcdcs_infra_ncdClinicsList, List<NPCDCS_Infra_CCU> npcdcs_infra_ccuList, List<NPCDCS_Infra_DayCare> npcdcs_infra_dayCareList, String typeFlag) {
        this.mCtx = context;
        this.npcdcs_infra_ncdCellsList = npcdcs_infra_ncdCellsList;
        this.npcdcs_infra_chcncdList = npcdcs_infra_chcncdList;
        this.npcdcs_infra_ncdClinicsList = npcdcs_infra_ncdClinicsList;
        this.npcdcs_infra_ccuList = npcdcs_infra_ccuList;
        this.npcdcs_infra_dayCareList = npcdcs_infra_dayCareList;
        this.typeFlag = typeFlag;
    }

    /////NPCDCS Screening
    public PbsCusRecViewThreeAdapter(Context context, List<NPCDCS_Screening_Opportunistic> npcdcs_screening_opportunisticList, List<NPCDCS_Screening_Outreach> npcdcs_screening_outreachList, String typeFlag, int i) {
        this.mCtx = context;
        this.npcdcs_screening_opportunisticList = npcdcs_screening_opportunisticList;
        this.npcdcs_screening_outreachList = npcdcs_screening_outreachList;
        this.typeFlag = typeFlag;
    }

    ///////////NPPCD
    public PbsCusRecViewThreeAdapter(Context applicationContext, List<NPPCD_underNPPCd> nppcdUnderNPPCds, List<NPPCD_madeOperational> nppcd_madeOperationalList, String typeFlag, double v) {
        this.mCtx = applicationContext;
        this.typeFlag = typeFlag;
        this.nppcdUnderNPPCds = nppcdUnderNPPCds;
        this.nppcd_madeOperationalList = nppcd_madeOperationalList;

    }


    //////////////NPPCF
    public PbsCusRecViewThreeAdapter(Context applicationContext, List<NPPCF_Districts> nppcf_districtsList, List<NPPCF_Budget> nppcf_budgetList, String typeFlag, double v, int i) {
        this.mCtx = applicationContext;
        this.typeFlag = typeFlag;
        this.nppcf_districtsList = nppcf_districtsList;
        this.nppcf_budgetList = nppcf_budgetList;

    }

    ////////VHP
    public PbsCusRecViewThreeAdapter(Context applicationContext, List<VHP_Regional> vhp_regionalList, List<VHP_District> vhp_districtList, String typeFlag, double v, double v1) {
        this.mCtx = applicationContext;
        this.vhp_regionalList = vhp_regionalList;
        this.vhp_districtList = vhp_districtList;
        this.typeFlag = typeFlag;

    }


    //////NLEP
    public PbsCusRecViewThreeAdapter(Context applicationContext, List<NLEP_CasesOnRecord> nlep_casesOnRecordList, List<NLEP_CasesDetected> nlep_casesDetectedList, int i, String typeFlag) {
        this.mCtx = applicationContext;
        this.nlep_casesOnRecordList = nlep_casesOnRecordList;
        this.nlep_casesDetectedList = nlep_casesDetectedList;
        this.typeFlag = typeFlag;
    }

    /////SRS
    public PbsCusRecViewThreeAdapter(Context context, List<SRS_MMR> srs_mmrList, String typeFlag,int i) {
        this.mCtx = context;
        this.srs_mmrList = srs_mmrList;
        this.typeFlag = typeFlag;
    }


    @Override
    public PbsCusRecViewThreeAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.mpbs_recview_row, parent, false);
        //View itemCardView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recylerview_row, parent, false);

        return new PbsCusRecViewThreeAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(PbsCusRecViewThreeAdapter.MyViewHolder holder, int position) {

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
            case "pbs":
                final MinisterPbsTrainedNcd trainedNcd = ministerPbsTrainedNcdList.get(position);

                holder.tvSno.setText(String.valueOf(trainedNcd.getSR_NO()));
                holder.tvStateName.setText(trainedNcd.getState_Name());
                holder.tv_project.setText(trainedNcd.getTrained_NCD_appl());
                break;
            case "mousigned":
                final NCDCMOUSigned ncdcmouSigned = ncdcmouSignedList.get(position);

                holder.tvSno.setText(ncdcmouSigned.getSR_NO());
                holder.tvStateName.setText(ncdcmouSigned.getState_Name());
                holder.tv_project.setText(ncdcmouSigned.getDate());
                break;

            case "moneyrealesed":
                final NCDCMoneyReleased moneyReleased = ncdcMoneyReleasedList.get(position);

                holder.tvSno.setText(moneyReleased.getSR_NO());
                holder.tvStateName.setText(moneyReleased.getState_Name());
                holder.tv_project.setText(moneyReleased.getAmount());
                break;

            case "totalamount":
                final NCDCTotalAmount totalAmount = ncdcTotalAmountList.get(position);

                holder.tvSno.setText(totalAmount.getSR_NO());
                holder.tvStateName.setText(totalAmount.getState_Name());
                holder.tv_project.setText(totalAmount.getTotal());
                break;

            case "QuitLine":
                final NTCPQuitline quitline = ntcpQuitlineList.get(position);

                holder.tvSno.setText(quitline.getSR_NO());
                holder.tvStateName.setText(quitline.getState_Name());
                holder.tv_project.setText(quitline.getNo_of_calls_landing_at_Quitline());
                break;


            case "Quitters":
                final NTCPQuitters quitters = ntcpQuittersList.get(position);

                holder.tvSno.setText(quitters.getSR_NO());
                holder.tvStateName.setText(quitters.getState_Name());
                holder.tv_project.setText(quitters.getNo_of_registered_Quitters());
                break;

            case "PersonQuit":
                final NTCPPersonQuit personQuit = ntcpPersonQuitList.get(position);

                holder.tvSno.setText(personQuit.getSR_NO());
                holder.tvStateName.setText(personQuit.getState_Name());
                holder.tv_project.setText(personQuit.getNo_of_persons_who_have_quit());
                break;

            case "NtcpUnderNTCP":
                final NTCPUnderNTCP ntcpUnderNTCP = ntcpUnderNTCPList.get(position);

                holder.tvSno.setText(ntcpUnderNTCP.getSR_NO());
                holder.tvStateName.setText(ntcpUnderNTCP.getState_Name());
                holder.tv_project.setText(ntcpUnderNTCP.getTotal_number_of_districts_under_NTCP());
                break;

            case "Ntcpcotpa":
                final NTCPCOTPA ntcpcotpa = ntcpcotpaList.get(position);

                holder.tvSno.setText(ntcpcotpa.getSR_NO());
                holder.tvStateName.setText(ntcpcotpa.getState_Name());
                holder.tv_project.setText(ntcpcotpa.getNo_of_persons_fined_COTPA());
                break;

            case "FineImposed":
                final NTCPFineImposed fineImposed = ntcpFineImposedList.get(position);

                holder.tvSno.setText(fineImposed.getSR_NO());
                holder.tvStateName.setText(fineImposed.getState_Name());
                holder.tv_project.setText(fineImposed.getAmount_of_fine_imposed());
                break;

            case "Ntcptcc":
                final NTCPTCC ntcptcc = ntcptccList.get(position);

                holder.tvSno.setText(ntcptcc.getSR_NO());
                holder.tvStateName.setText(ntcptcc.getState_Name());
                holder.tv_project.setText(ntcptcc.getTotal_No_of_TCCS_Under_NTCP());
                break;

            case "NtcptcServices":
                final NTCPTCServices ntcptcServices = ntcptcServicesList.get(position);

                holder.tvSno.setText(ntcptcServices.getSR_NO());
                holder.tvStateName.setText(ntcptcServices.getState_Name());
                holder.tv_project.setText(ntcptcServices.getNo_of_persons_who_availed_TC_services());
                break;

            case "DistrictsAffected":
                final LeptospirosisDAffected dAffected = leptospirosisDAffectedList.get(position);

                holder.tvSno.setText(dAffected.getSR_NO());
                holder.tvStateName.setText(dAffected.getState_Name());
                holder.tv_project.setText(dAffected.getNumber_of_districts_affected());
                break;


            case "OutbreakReported":
                final LeptospirosisOReported oReported = leptospirosisOReportedList.get(position);

                holder.tvSno.setText(oReported.getSR_NO());
                holder.tvStateName.setText(oReported.getState_Name());
                holder.tv_project.setText(oReported.getNumber_of_Leptospirosis_outbreaks_reported());
                break;

            case "LaboratoryConfirmed":
                final LeptospirosisLCC lcc = leptospirosisLCCList.get(position);

                holder.tvSno.setText(lcc.getSR_NO());
                holder.tvStateName.setText(lcc.getState_Name());
                holder.tv_project.setText(lcc.getLaboratory_leptospirosis_casesreported());
                break;

            case "NACOTests":
                final NACOHIVTests tests = nacohivTestsList.get(position);

                holder.tvSno.setText(tests.getSR_NO());
                holder.tvStateName.setText(tests.getState_Name());
                holder.tv_project.setText(tests.getTotal_Number_of_HIV_Tests_Conducted());
                break;

            case "NACOart":
                final NACOPLHIVART art = nacoplhivartList.get(position);

                holder.tvSno.setText(art.getSR_NO());
                holder.tvStateName.setText(art.getState_Name());
                holder.tv_project.setText(art.getTotal_Number_of_PLHIV_on_Anti_Retroviral_Therapy_ART());
                break;


            case "NACOViral":
                final NACOPLHIVViralLoad viralLoad = nacoplhivViralLoadList.get(position);

                holder.tvSno.setText(viralLoad.getSR_NO());
                holder.tvStateName.setText(viralLoad.getState_Name());
                holder.tv_project.setText(viralLoad.getTotal_Number_of_PLHIV_Tested_for_Viral_Load());
                break;

            case "AMRProgramme":
                final AMRProgramme amrProgramme = amrProgrammeList.get(position);
                holder.tvSno.setText(amrProgramme.getSR_NO());
                holder.tvStateName.setText(amrProgramme.getState_Name());
                holder.tv_project.setText(amrProgramme.getLabs_enrolled_under_the_AMR_Programme());
                break;

            case "AMRSurveillance":
                final AMRSurveillance amrSurveillance = amrSurveillanceList.get(position);
                holder.tvSno.setText(amrSurveillance.getSR_NO());
                holder.tvStateName.setText(amrSurveillance.getState_Name());
                holder.tv_project.setText(amrSurveillance.getLabs_reporting_AMR_surveillance_data());
                break;

            case "MalariaTotalCases":
                final NVBDCP_Malaria_TotalCases totalCases = nvbdcp_malaria_totalCasesList.get(position);
                holder.tvSno.setText(totalCases.getSR_NO());
                holder.tvStateName.setText(totalCases.getState_Name());
                holder.tv_project.setText(totalCases.getNO_OF_TOTAL_CASES());
                break;

            case "MalariaPFCases":
                final NVBDCP_Malaria_PFCases pfCases = nvbdcp_malaria_pfCasesList.get(position);
                holder.tvSno.setText(pfCases.getSR_NO());
                holder.tvStateName.setText(pfCases.getState_Name());
                holder.tv_project.setText(pfCases.getNO_OF_PF_CASES());
                break;
            case "MalariaDeath":
                final NVBDCP_Malaria_Deaths deaths = nvbdcp_malaria_deathsList.get(position);
                holder.tvSno.setText(deaths.getSR_NO());
                holder.tvStateName.setText(deaths.getState_Name());
                holder.tv_project.setText(deaths.getNO_OF_DEATHS());
                break;
            case "MalariaLlin":
                final NVBDCP_Malaria_LLIN Llin = nvbdcp_malaria_llinList.get(position);
                holder.tvSno.setText(Llin.getSR_NO());
                holder.tvStateName.setText(Llin.getState_Name());
                holder.tv_project.setText(Llin.getLLIN_Distribution());
                break;

            case "KalaazarTotalCases":
                final NVBDCP_Kalaazar_TotalCases totalCases1 = nvbdcp_kalaazar_totalCasesList.get(position);
                holder.tvSno.setText(totalCases1.getSR_NO());
                holder.tvStateName.setText(totalCases1.getState_Name());
                holder.tv_project.setText(totalCases1.getTotal_No_of_Total_Cases());
                break;

            case "KalaazarPFCases":
                final NVBDCP_Kalaazar_PFCases pfCases1 = nvbdcp_kalaazar_pfCasesList.get(position);
                holder.tvSno.setText(pfCases1.getSR_NO());
                holder.tvStateName.setText(pfCases1.getState_Name());
                holder.tv_project.setText(pfCases1.getTotal_NO_OF_POPULATION());
                break;

            case "KalaazarDeath":
                final NVBDCP_Kalaazar_Deaths deaths1 = nvbdcp_kalaazar_deathsList.get(position);
                holder.tvSno.setText(deaths1.getSR_NO());
                holder.tvStateName.setText(deaths1.getState_Name());
                holder.tv_project.setText(deaths1.getTotal_No_of_Deaths());
                break;

            case "LymphaticEndemic":
                final NVBDCP_Lymphatic_Endemic endemic = nvbdcp_lymphatic_endemicList.get(position);
                holder.tvSno.setText(endemic.getSR_NO());
                holder.tvStateName.setText(endemic.getState_Name());
                holder.tv_project.setText(endemic.getTotal_Endemic_Districts());
                break;

            case "LymphaticTAS":
                final NVBDCP_Lymphatic_TAS tas = nvbdcp_lymphatic_tasList.get(position);
                holder.tvSno.setText(tas.getSR_NO());
                holder.tvStateName.setText(tas.getState_Name());
                holder.tv_project.setText(tas.getTotal_Number_of_Districts_cleared_TAS());
                break;

            case "LymphaticMDA":
                final NVBDCP_Lymphatic_MDA mda = nvbdcp_lymphatic_mdaList.get(position);
                holder.tvSno.setText(mda.getSR_NO());
                holder.tvStateName.setText(mda.getState_Name());
                holder.tv_project.setText(mda.getTotal_Number_of_Districts_proposed_for_next_MDA());
                break;

            case "LymphaticIDA":
                final NVBDCP_Lymphatic_IDA ida = nvbdcp_lymphatic_idaList.get(position);
                holder.tvSno.setText(ida.getSR_NO());
                holder.tvStateName.setText(ida.getState_Name());
                holder.tv_project.setText(ida.getTotal_Number_of_Districts_proposed_for_next_IDA());
                break;

            case "DengueTotalCases":
                final NVBDCP_Dengue_TotalCases totalCases2 = nvbdcp_dengue_totalCasesList.get(position);
                holder.tvSno.setText(totalCases2.getSR_NO());
                holder.tvStateName.setText(totalCases2.getState_Name());
                holder.tv_project.setText(totalCases2.getTotal_NUMBER_OF_TOTAL_CASES());
                break;

            case "DengueDeath":
                final NVBDCP_Dengue_Deaths dengue_deaths = nvbdcp_dengue_deathsList.get(position);
                holder.tvSno.setText(dengue_deaths.getSR_NO());
                holder.tvStateName.setText(dengue_deaths.getState_Name());
                holder.tv_project.setText(dengue_deaths.getTotal_NUMBER_OF_DEATHS());
                break;
            case "DengueSentine":
                final NVBDCP_Dengue_Sentinel sentinel = nvbdcp_dengue_sentinelList.get(position);
                holder.tvSno.setText(sentinel.getSR_NO());
                holder.tvStateName.setText(sentinel.getState_Name());
                holder.tv_project.setText(sentinel.getTotal_NO_OF_SENTINEL_SITES());
                break;
            case "DengueFatality":
                final NVBDCP_Dengue_Fatality fatality = nvbdcp_dengue_fatalityList.get(position);
                holder.tvSno.setText(fatality.getSR_NO());
                holder.tvStateName.setText(fatality.getState_Name());
                holder.tv_project.setText(fatality.getTotal_CASE_FATALITY_RATE());
                break;

            case "ChikungunyaSuspected":
                final NVBDCP_Chikungunya_Suspected suspected = nvbdcp_chikungunya_suspectedList.get(position);
                holder.tvSno.setText(suspected.getSR_NO());
                holder.tvStateName.setText(suspected.getState_Name());
                holder.tv_project.setText(suspected.getTotal_Suspected_cases());
                break;

            case "ChikungunyaConfirmed":
                final NVBDCP_Chikungunya_Confirmed confirmed = nvbdcp_chikungunya_confirmedList.get(position);
                holder.tvSno.setText(confirmed.getSR_NO());
                holder.tvStateName.setText(confirmed.getState_Name());
                holder.tv_project.setText(confirmed.getTotal_Confirmed_cases());
                break;

            case "ChikungunyaSentine":
                final NVBDCP_Chikungunya_Sentinel sentinel1 = nvbdcp_chikungunya_sentinelList.get(position);
                holder.tvSno.setText(sentinel1.getSR_NO());
                holder.tvStateName.setText(sentinel1.getState_Name());
                holder.tv_project.setText(sentinel1.getTotal_No_of_Sentinel_Sites());
                break;

            case "JapeneseTotalCases":
                final NVBDCP_Japenese_TotalCases totalCases3 = nvbdcp_japenese_totalCasesList.get(position);
                holder.tvSno.setText(totalCases3.getSR_NO());
                holder.tvStateName.setText(totalCases3.getState_Name());
                holder.tv_project.setText(totalCases3.getNO_OF_TOTAL_CASES());
                break;

            case "JapeneseDeaths":
                final NVBDCP_Japenese_Deaths deaths2 = nvbdcp_japenese_deathsList.get(position);
                holder.tvSno.setText(deaths2.getSR_NO());
                holder.tvStateName.setText(deaths2.getState_Name());
                holder.tv_project.setText(deaths2.getNO_OF_DEATHS());
                break;

            case "JapeneseVaccination":
                final NVBDCP_Japenese_JEVaccination vaccination = nvbdcp_japenese_jeVaccinationList.get(position);
                holder.tvSno.setText(vaccination.getSR_NO());
                holder.tvStateName.setText(vaccination.getState_Name());
                holder.tv_project.setText(vaccination.getNO_OF_DISTRICTS_COVERED_BY_JE_VACCINATION());
                break;

            case "JapenesePICUsFunds":
                final NVBDCP_Japenese_PICUsFunds picUsFunds = nvbdcp_japenese_picUsFundsList.get(position);
                holder.tvSno.setText(picUsFunds.getSR_NO());
                holder.tvStateName.setText(picUsFunds.getState_Name());
                holder.tv_project.setText(picUsFunds.getNO_OF_PICUS_FOR_WHICH_FUNDS_PROVIDED());
                break;

            case "JapenesePICUsFuncional":
                final NVBDCP_Japenese_PICUsFunctional picUsFunctional = nvbdcp_japenese_picUsFunctionalList.get(position);
                holder.tvSno.setText(picUsFunctional.getSR_NO());
                holder.tvStateName.setText(picUsFunctional.getState_Name());
                holder.tv_project.setText(picUsFunctional.getNO_OF_PICUS_FUNCTIONAL());
                break;


            case "JapenesePMRFunds":
                final NVBDCP_Japenese_PMRFunds pmrFunds = nvbdcp_japenese_pmrFundsList.get(position);
                holder.tvSno.setText(pmrFunds.getSR_NO());
                holder.tvStateName.setText(pmrFunds.getState_Name());
                holder.tv_project.setText(pmrFunds.getNO_OF_PMRS_WHICH_FUNDS_PROVIDED());
                break;

            case "JapenesePMRFuncional":
                final NVBDCP_Japenese_PMRFunctional pmrFunctional = nvbdcp_japenese_pmrFunctionalList.get(position);
                holder.tvSno.setText(pmrFunctional.getSR_NO());
                holder.tvStateName.setText(pmrFunctional.getState_Name());
                holder.tv_project.setText(pmrFunctional.getNO_OF_PMRS_FUNCTIONAL());
                break;

            case "NPCDCS_infra_ncdCells":
                final NPCDCS_Infra_NCDCells infra_ncdCells = npcdcs_infra_ncdCellsList.get(position);
                holder.tvSno.setText(infra_ncdCells.getSR_NO());
                holder.tvStateName.setText(infra_ncdCells.getState_Name());
                holder.tv_project.setText(infra_ncdCells.getDistrict_NCD_Cells_Functional());
                break;

            case "NPCDCS_infra_chcncd":
                final NPCDCS_Infra_CHCNCD infra_chcncd = npcdcs_infra_chcncdList.get(position);
                holder.tvSno.setText(infra_chcncd.getSR_NO());
                holder.tvStateName.setText(infra_chcncd.getState_Name());
                holder.tv_project.setText(infra_chcncd.getCHC_NCD_Clinics_Functional());
                break;


            case "NPCDCS_infra_ncdClinics":
                final NPCDCS_Infra_NCDClinics infra_ncdClinics = npcdcs_infra_ncdClinicsList.get(position);
                holder.tvSno.setText(infra_ncdClinics.getSR_NO());
                holder.tvStateName.setText(infra_ncdClinics.getState_Name());
                holder.tv_project.setText(infra_ncdClinics.getDistrict_NCD_Clinics_Functional());
                break;

            case "NPCDCS_infra_ccu":
                final NPCDCS_Infra_CCU infra_ccu = npcdcs_infra_ccuList.get(position);
                holder.tvSno.setText(infra_ccu.getSR_NO());
                holder.tvStateName.setText(infra_ccu.getState_Name());
                holder.tv_project.setText(infra_ccu.getCardiac_Care_Units__CCU_Functional());
                break;

            case "NPCDCS_infra_daycare":
                final NPCDCS_Infra_DayCare infra_dayCare = npcdcs_infra_dayCareList.get(position);
                holder.tvSno.setText(infra_dayCare.getSR_NO());
                holder.tvStateName.setText(infra_dayCare.getState_Name());
                holder.tv_project.setText(infra_dayCare.getDistrict_Day_Care_Centres_Functional());
                break;

            case "NPCDCS_screening_opportunistic":
                final NPCDCS_Screening_Opportunistic screening_opportunistic = npcdcs_screening_opportunisticList.get(position);
                holder.tvSno.setText(screening_opportunistic.getSR_NO());
                holder.tvStateName.setText(screening_opportunistic.getState_Name());
                holder.tv_project.setText(screening_opportunistic.getTotal_Under_Opportunistic_Screening_Total_persons_screened());
                break;

            case "NPCDCS_screening_outreach":
                final NPCDCS_Screening_Outreach screening_outreach = npcdcs_screening_outreachList.get(position);
                holder.tvSno.setText(screening_outreach.getSR_NO());
                holder.tvStateName.setText(screening_outreach.getState_Name());
                holder.tv_project.setText(screening_outreach.getTotal_Under_Outreach_Screening_Total_persons_screened());
                break;

            case "NPPCDundernppcd":
                final NPPCD_underNPPCd underNPPCd = nppcdUnderNPPCds.get(position);
                holder.tvSno.setText(underNPPCd.getSR_NO());
                holder.tvStateName.setText(underNPPCd.getState_Name());
                holder.tv_project.setText(underNPPCd.getNumber_of_Districts_under_NPPCD());
                break;

            case "NPPCDmadeoperational":
                final NPPCD_madeOperational madeOperational = nppcd_madeOperationalList.get(position);
                holder.tvSno.setText(madeOperational.getSR_NO());
                holder.tvStateName.setText(madeOperational.getState_Name());
                holder.tv_project.setText(madeOperational.getNumber_of_District_made_Operational_under_NPPCD());
                break;

            case "NPPCF_district":
                final NPPCF_Districts districts = nppcf_districtsList.get(position);
                holder.tvSno.setText(districts.getSR_NO());
                holder.tvStateName.setText(districts.getState_Name());
                holder.tv_project.setText(districts.getNumber_of_Districts());
                break;

            case "NPPCF_budget":
                final NPPCF_Budget budget = nppcf_budgetList.get(position);
                holder.tvSno.setText(budget.getSR_NO());
                holder.tvStateName.setText(budget.getState_Name());
                holder.tv_project.setText(budget.getBudget_Allocation_in_Rs());
                break;

            case "VHP_regional":
                final VHP_Regional regional = vhp_regionalList.get(position);
                holder.tvSno.setText(regional.getSR_NO());
                holder.tvStateName.setText(regional.getState_Name());
                holder.tv_project.setText(regional.getRegional_labs_doing_enhanced_case_reporting());
                break;

            case "VHP_districts":
                final VHP_District district = vhp_districtList.get(position);
                holder.tvSno.setText(district.getSR_NO());
                holder.tvStateName.setText(district.getState_Name());
                holder.tv_project.setText(district.getDistricts_reporting_on_acute_hepatitis_surveillance());
                break;


            case "CasesOnRecord":
                final NLEP_CasesOnRecord casesOnRecord = nlep_casesOnRecordList.get(position);
                holder.tvSno.setText(casesOnRecord.getSR_NO());
                holder.tvStateName.setText(casesOnRecord.getState_Name());
                holder.tv_project.setText(casesOnRecord.getCases_on_Record());
                break;


            case "CasesDetected":
                final NLEP_CasesDetected casesDetected = nlep_casesDetectedList.get(position);
                holder.tvSno.setText(casesDetected.getSR_NO());
                holder.tvStateName.setText(casesDetected.getState_Name());
                holder.tv_project.setText(casesDetected.getNew_Cases_Detected());
                break;

            case "SRS_MMR":
                final SRS_MMR mmr = srs_mmrList.get(position);
                holder.tvSno.setText(mmr.getSR_NO());
                holder.tvStateName.setText(mmr.getState_Name());
                holder.tv_project.setText(mmr.getTotal());
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
        if (typeFlag.equalsIgnoreCase("mousigned") || typeFlag == "mousigned") {
            return ncdcmouSignedList.size();

        } else if (typeFlag.equalsIgnoreCase("moneyrealesed") || typeFlag == "moneyrealesed") {
            return ncdcMoneyReleasedList.size();
        } else if (typeFlag.equalsIgnoreCase("totalamount") || typeFlag == "totalamount") {
            return ncdcTotalAmountList.size();
        } else if (typeFlag.equalsIgnoreCase("QuitLine") || typeFlag == "QuitLine") {
            return ntcpQuitlineList.size();
        } else if (typeFlag.equalsIgnoreCase("Quitters") || typeFlag == "Quitters") {
            return ntcpQuittersList.size();
        } else if (typeFlag.equalsIgnoreCase("PersonQuit") || typeFlag == "PersonQuit") {
            return ntcpPersonQuitList.size();
        } else if (typeFlag.equalsIgnoreCase("NtcpUnderNTCP") || typeFlag == "NtcpUnderNTCP") {
            return ntcpUnderNTCPList.size();
        } else if (typeFlag.equalsIgnoreCase("Ntcpcotpa") || typeFlag == "Ntcpcotpa") {
            return ntcpcotpaList.size();
        } else if (typeFlag.equalsIgnoreCase("FineImposed") || typeFlag == "FineImposed") {
            return ntcpFineImposedList.size();
        } else if (typeFlag.equalsIgnoreCase("Ntcptcc") || typeFlag == "Ntcptcc") {
            return ntcptccList.size();
        } else if (typeFlag.equalsIgnoreCase("NtcptcServices") || typeFlag == "NtcptcServices") {
            return ntcptcServicesList.size();
        } else if (typeFlag.equalsIgnoreCase("DistrictsAffected") || typeFlag == "DistrictsAffected") {
            return leptospirosisDAffectedList.size();
        } else if (typeFlag.equalsIgnoreCase("OutbreakReported") || typeFlag == "OutbreakReported") {
            return leptospirosisOReportedList.size();
        } else if (typeFlag.equalsIgnoreCase("LaboratoryConfirmed") || typeFlag == "LaboratoryConfirmed") {
            return leptospirosisLCCList.size();
        } else if (typeFlag.equalsIgnoreCase("NACOTests") || typeFlag == "NACOTests") {
            return nacohivTestsList.size();
        } else if (typeFlag.equalsIgnoreCase("NACOart") || typeFlag == "NACOart") {
            return nacoplhivartList.size();
        } else if (typeFlag.equalsIgnoreCase("NACOViral") || typeFlag == "NACOViral") {
            return nacoplhivViralLoadList.size();
        } else if (typeFlag.equalsIgnoreCase("AMRProgramme") || typeFlag == "AMRProgramme") {
            return amrProgrammeList.size();
        } else if (typeFlag.equalsIgnoreCase("AMRSurveillance") || typeFlag == "AMRSurveillance") {
            return amrSurveillanceList.size();
        } else if (typeFlag.equalsIgnoreCase("MalariaTotalCases") || typeFlag == "MalariaTotalCases") {
            return nvbdcp_malaria_totalCasesList.size();
        } else if (typeFlag.equalsIgnoreCase("MalariaPFCases") || typeFlag == "MalariaPFCases") {
            return nvbdcp_malaria_pfCasesList.size();
        } else if (typeFlag.equalsIgnoreCase("MalariaDeath") || typeFlag == "MalariaDeath") {
            return nvbdcp_malaria_deathsList.size();
        } else if (typeFlag.equalsIgnoreCase("MalariaLlin") || typeFlag == "MalariaLlin") {
            return nvbdcp_malaria_llinList.size();
        } else if (typeFlag.equalsIgnoreCase("KalaazarTotalCases") || typeFlag == "KalaazarTotalCases") {
            return nvbdcp_kalaazar_totalCasesList.size();
        } else if (typeFlag.equalsIgnoreCase("KalaazarPFCases") || typeFlag == "KalaazarPFCases") {
            return nvbdcp_kalaazar_pfCasesList.size();
        } else if (typeFlag.equalsIgnoreCase("KalaazarDeath") || typeFlag == "KalaazarDeath") {
            return nvbdcp_kalaazar_deathsList.size();
        } else if (typeFlag.equalsIgnoreCase("LymphaticEndemic") || typeFlag == "LymphaticEndemic") {
            return nvbdcp_lymphatic_endemicList.size();
        } else if (typeFlag.equalsIgnoreCase("LymphaticTAS") || typeFlag == "LymphaticTAS") {
            return nvbdcp_lymphatic_tasList.size();
        } else if (typeFlag.equalsIgnoreCase("LymphaticMDA") || typeFlag == "LymphaticMDA") {
            return nvbdcp_lymphatic_mdaList.size();
        } else if (typeFlag.equalsIgnoreCase("LymphaticIDA") || typeFlag == "LymphaticIDA") {
            return nvbdcp_lymphatic_idaList.size();
        } else if (typeFlag.equalsIgnoreCase("DengueTotalCases") || typeFlag == "DengueTotalCases") {
            return nvbdcp_dengue_totalCasesList.size();
        } else if (typeFlag.equalsIgnoreCase("DengueDeath") || typeFlag == "DengueDeath") {
            return nvbdcp_dengue_deathsList.size();
        } else if (typeFlag.equalsIgnoreCase("DengueSentine") || typeFlag == "DengueSentine") {
            return nvbdcp_dengue_sentinelList.size();
        } else if (typeFlag.equalsIgnoreCase("DengueFatality") || typeFlag == "DengueFatality") {
            return nvbdcp_dengue_fatalityList.size();
        } else if (typeFlag.equalsIgnoreCase("ChikungunyaSuspected") || typeFlag == "ChikungunyaSuspected") {
            return nvbdcp_chikungunya_suspectedList.size();
        } else if (typeFlag.equalsIgnoreCase("ChikungunyaConfirmed") || typeFlag == "ChikungunyaConfirmed") {
            return nvbdcp_chikungunya_confirmedList.size();
        } else if (typeFlag.equalsIgnoreCase("ChikungunyaSentine") || typeFlag == "ChikungunyaSentine") {
            return nvbdcp_chikungunya_sentinelList.size();
        } else if (typeFlag.equalsIgnoreCase("JapeneseTotalCases") || typeFlag == "JapeneseTotalCases") {
            return nvbdcp_japenese_totalCasesList.size();
        } else if (typeFlag.equalsIgnoreCase("JapeneseDeaths") || typeFlag == "JapeneseDeaths") {
            return nvbdcp_japenese_deathsList.size();
        } else if (typeFlag.equalsIgnoreCase("JapeneseVaccination") || typeFlag == "JapeneseVaccination") {
            return nvbdcp_japenese_jeVaccinationList.size();
        } else if (typeFlag.equalsIgnoreCase("JapenesePICUsFunds") || typeFlag == "JapenesePICUsFunds") {
            return nvbdcp_japenese_picUsFundsList.size();
        } else if (typeFlag.equalsIgnoreCase("JapenesePICUsFuncional") || typeFlag == "JapenesePICUsFuncional") {
            return nvbdcp_japenese_picUsFunctionalList.size();
        } else if (typeFlag.equalsIgnoreCase("JapenesePMRFunds") || typeFlag == "JapenesePMRFunds") {
            return nvbdcp_japenese_pmrFundsList.size();
        } else if (typeFlag.equalsIgnoreCase("JapenesePMRFuncional") || typeFlag == "JapenesePMRFuncional") {
            return nvbdcp_japenese_pmrFunctionalList.size();
        } else if (typeFlag.equalsIgnoreCase("NPCDCS_infra_ncdCells") || typeFlag == "NPCDCS_infra_ncdCells") {
            return npcdcs_infra_ncdCellsList.size();
        } else if (typeFlag.equalsIgnoreCase("NPCDCS_infra_chcncd") || typeFlag == "NPCDCS_infra_chcncd") {
            return npcdcs_infra_chcncdList.size();
        } else if (typeFlag.equalsIgnoreCase("NPCDCS_infra_ncdClinics") || typeFlag == "NPCDCS_infra_ncdClinics") {
            return npcdcs_infra_ncdClinicsList.size();
        } else if (typeFlag.equalsIgnoreCase("NPCDCS_infra_ccu") || typeFlag == "NPCDCS_infra_ccu") {
            return npcdcs_infra_ccuList.size();
        } else if (typeFlag.equalsIgnoreCase("NPCDCS_infra_daycare") || typeFlag == "NPCDCS_infra_daycare") {
            return npcdcs_infra_dayCareList.size();
        } else if (typeFlag.equalsIgnoreCase("NPCDCS_screening_opportunistic") || typeFlag == "NPCDCS_screening_opportunistic") {
            return npcdcs_screening_opportunisticList.size();
        } else if (typeFlag.equalsIgnoreCase("NPCDCS_screening_outreach") || typeFlag == "NPCDCS_screening_outreach") {
            return npcdcs_screening_outreachList.size();
        } else if (typeFlag.equalsIgnoreCase("NPPCDundernppcd") || typeFlag == "NPPCDundernppcd") {
            return nppcdUnderNPPCds.size();
        } else if (typeFlag.equalsIgnoreCase("NPPCDmadeoperational") || typeFlag == "NPPCDmadeoperational") {
            return nppcd_madeOperationalList.size();
        } else if (typeFlag.equalsIgnoreCase("NPPCF_district") || typeFlag == "NPPCF_district") {
            return nppcf_districtsList.size();
        } else if (typeFlag.equalsIgnoreCase("NPPCF_budget") || typeFlag == "NPPCF_budget") {
            return nppcf_budgetList.size();
        } else if (typeFlag.equalsIgnoreCase("VHP_regional") || typeFlag == "VHP_regional") {
            return vhp_regionalList.size();
        } else if (typeFlag.equalsIgnoreCase("VHP_districts") || typeFlag == "VHP_districts") {
            return vhp_districtList.size();
        } else if (typeFlag.equalsIgnoreCase("CasesOnRecord") || typeFlag == "CasesOnRecord") {
            return nlep_casesOnRecordList.size();
        } else if (typeFlag.equalsIgnoreCase("CasesDetected") || typeFlag == "CasesDetected") {
            return nlep_casesDetectedList.size();
        }else if (typeFlag.equalsIgnoreCase("SRS_MMR") || typeFlag == "SRS_MMR") {
            return srs_mmrList.size();
        } else {

            return ministerPbsTrainedNcdList.size();
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
