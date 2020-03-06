package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ImmunizationDataList {
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
}
