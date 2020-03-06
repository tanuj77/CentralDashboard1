package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MinisterPmssyDataList {
    @SerializedName("New AIIMS Announced")
    @Expose
    private List<MinisterPmssyDataNewAiims> ministerPmssyDataNewAiimsList = null;


    @SerializedName("Medical College Upgradation")
    @Expose
    private List<MinisterPmssyDataMedicalCollege> ministerPmssyDataMedicalCollegeList = null;

    public List<MinisterPmssyDataNewAiims> getMinisterPmssyDataNewAiimsList() {
        return ministerPmssyDataNewAiimsList;
    }

    public void setMinisterPmssyDataNewAiimsList(List<MinisterPmssyDataNewAiims> ministerPmssyDataNewAiimsList) {
        this.ministerPmssyDataNewAiimsList = ministerPmssyDataNewAiimsList;
    }

    public List<MinisterPmssyDataMedicalCollege> getMinisterPmssyDataMedicalCollegeList() {
        return ministerPmssyDataMedicalCollegeList;
    }

    public void setMinisterPmssyDataMedicalCollegeList(List<MinisterPmssyDataMedicalCollege> ministerPmssyDataMedicalCollegeList) {
        this.ministerPmssyDataMedicalCollegeList = ministerPmssyDataMedicalCollegeList;
    }
}
