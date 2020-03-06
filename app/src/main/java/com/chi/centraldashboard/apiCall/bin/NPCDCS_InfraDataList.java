package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class NPCDCS_InfraDataList {
    @SerializedName("District_NCD_Cells_Functional")
    @Expose
    private List<NPCDCS_Infra_NCDCells> npcdcs_infra_ncdCellsList = null;

    @SerializedName("CHC_NCD_Clinics_Functional")
    @Expose
    private List<NPCDCS_Infra_CHCNCD> npcdcs_infra_chcncdList = null;


    @SerializedName("District_NCD_Clinics_Functional")
    @Expose
    private List<NPCDCS_Infra_NCDClinics> npcdcs_infra_ncdClinicsList = null;

    @SerializedName("Cardiac_Care_Units__CCU_Functional")
    @Expose
    private List<NPCDCS_Infra_CCU> npcdcs_infra_ccuList = null;

    @SerializedName("District_Day_Care_Centres_Functional")
    @Expose
    private List<NPCDCS_Infra_DayCare> npcdcs_infra_dayCareList = null;



    public List<NPCDCS_Infra_NCDCells> getNpcdcs_infra_ncdCellsList() {
        return npcdcs_infra_ncdCellsList;
    }

    public void setNpcdcs_infra_ncdCellsList(List<NPCDCS_Infra_NCDCells> npcdcs_infra_ncdCellsList) {
        this.npcdcs_infra_ncdCellsList = npcdcs_infra_ncdCellsList;
    }

    public List<NPCDCS_Infra_CHCNCD> getNpcdcs_infra_chcncdList() {
        return npcdcs_infra_chcncdList;
    }

    public void setNpcdcs_infra_chcncdList(List<NPCDCS_Infra_CHCNCD> npcdcs_infra_chcncdList) {
        this.npcdcs_infra_chcncdList = npcdcs_infra_chcncdList;
    }

    public List<NPCDCS_Infra_NCDClinics> getNpcdcs_infra_ncdClinicsList() {
        return npcdcs_infra_ncdClinicsList;
    }

    public void setNpcdcs_infra_ncdClinicsList(List<NPCDCS_Infra_NCDClinics> npcdcs_infra_ncdClinicsList) {
        this.npcdcs_infra_ncdClinicsList = npcdcs_infra_ncdClinicsList;
    }

    public List<NPCDCS_Infra_CCU> getNpcdcs_infra_ccuList() {
        return npcdcs_infra_ccuList;
    }

    public void setNpcdcs_infra_ccuList(List<NPCDCS_Infra_CCU> npcdcs_infra_ccuList) {
        this.npcdcs_infra_ccuList = npcdcs_infra_ccuList;
    }

    public List<NPCDCS_Infra_DayCare> getNpcdcs_infra_dayCareList() {
        return npcdcs_infra_dayCareList;
    }

    public void setNpcdcs_infra_dayCareList(List<NPCDCS_Infra_DayCare> npcdcs_infra_dayCareList) {
        this.npcdcs_infra_dayCareList = npcdcs_infra_dayCareList;
    }
}
