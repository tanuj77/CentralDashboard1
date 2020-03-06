package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ImmunizationData {
    @SerializedName("IMMUNIZATION")
    @Expose
    private List<ImmunizationDataList> immunizationDataListList = null;

    @SerializedName("Immunization_Coverage")
    @Expose
    private List<ImmunizationCoverage> immunizationCoverageList=null;

    @SerializedName("Vaccine_Coverage")
    @Expose
    private List<ImmunizationVaccineCoverage> immunizationVaccineCoverageList=null;

    @SerializedName("firstst_Dose_Coverage")
    @Expose
    private List<ImmunizationFirstDose> immunizationFirstDoseList=null;

    @SerializedName("second_Dose_Coverage")
    @Expose
    private List<ImmunizationSecondDose>immunizationSecondDoseList=null;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("status")
    @Expose
    private int status;


    public List<ImmunizationDataList> getImmunizationDataListList() {
        return immunizationDataListList;
    }

    public void setImmunizationDataListList(List<ImmunizationDataList> immunizationDataListList) {
        this.immunizationDataListList = immunizationDataListList;
    }

    public List<ImmunizationCoverage> getImmunizationCoverageList() {
        return immunizationCoverageList;
    }

    public void setImmunizationCoverageList(List<ImmunizationCoverage> immunizationCoverageList) {
        this.immunizationCoverageList = immunizationCoverageList;
    }

    public List<ImmunizationVaccineCoverage> getImmunizationVaccineCoverageList() {
        return immunizationVaccineCoverageList;
    }

    public void setImmunizationVaccineCoverageList(List<ImmunizationVaccineCoverage> immunizationVaccineCoverageList) {
        this.immunizationVaccineCoverageList = immunizationVaccineCoverageList;
    }

    public List<ImmunizationFirstDose> getImmunizationFirstDoseList() {
        return immunizationFirstDoseList;
    }

    public void setImmunizationFirstDoseList(List<ImmunizationFirstDose> immunizationFirstDoseList) {
        this.immunizationFirstDoseList = immunizationFirstDoseList;
    }

    public List<ImmunizationSecondDose> getImmunizationSecondDoseList() {
        return immunizationSecondDoseList;
    }

    public void setImmunizationSecondDoseList(List<ImmunizationSecondDose> immunizationSecondDoseList) {
        this.immunizationSecondDoseList = immunizationSecondDoseList;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
