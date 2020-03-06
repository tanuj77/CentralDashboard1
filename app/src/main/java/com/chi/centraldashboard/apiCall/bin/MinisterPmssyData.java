package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MinisterPmssyData {
    @SerializedName("PmssyData")
    @Expose
    private List<MinisterPmssyDataList> ministerPmssyDataListList = null;

    @SerializedName("New AIIMS Announced")
    @Expose
    private List<MinisterPmssyDataNewAiims> ministerPmssyDataNewAiimsList = null;

    @SerializedName("Medical College Upgradation")
    @Expose
    private List<MinisterPmssyDataMedicalCollege> ministerPmssyDataMedicalCollegeList = null;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("status")
    @Expose
    private Integer status;

    public List<MinisterPmssyDataList> getMinisterPmssyDataListList() {
        return ministerPmssyDataListList;
    }

    public void setMinisterPmssyDataListList(List<MinisterPmssyDataList> ministerPmssyDataListList) {
        this.ministerPmssyDataListList = ministerPmssyDataListList;
    }

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
