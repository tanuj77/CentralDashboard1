package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MinisterPmjayData {
    @SerializedName("PmjayData")
    @Expose
    private List<MinisterPmjayDataList> ministerPmjayDataListList = null;

    @SerializedName("no_of_ecards_generated")
    @Expose
    private List<MinisterPmjayECardsGenerated> ministerPmjayECardsGeneratedList=null;

    @SerializedName("No_of_Pre_Authorizations_Done")
    @Expose
    private List<MinisterPmjayPreAuthorizations> ministerPmjayPreAuthorizationsList=null;


    @SerializedName("Total_hospitals_empanelled_scheme")
    @Expose
    private List<MinisterPmjayHospitalsEmpanelled> ministerPmjayHospitalsEmpanelledList=null;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("status")
    @Expose
    private Integer status;


    public List<MinisterPmjayDataList> getMinisterPmjayDataListList() {
        return ministerPmjayDataListList;
    }

    public void setMinisterPmjayDataListList(List<MinisterPmjayDataList> ministerPmjayDataListList) {
        this.ministerPmjayDataListList = ministerPmjayDataListList;
    }

    public List<MinisterPmjayECardsGenerated> getMinisterPmjayECardsGeneratedList() {
        return ministerPmjayECardsGeneratedList;
    }

    public void setMinisterPmjayECardsGeneratedList(List<MinisterPmjayECardsGenerated> ministerPmjayECardsGeneratedList) {
        this.ministerPmjayECardsGeneratedList = ministerPmjayECardsGeneratedList;
    }

    public List<MinisterPmjayPreAuthorizations> getMinisterPmjayPreAuthorizationsList() {
        return ministerPmjayPreAuthorizationsList;
    }

    public void setMinisterPmjayPreAuthorizationsList(List<MinisterPmjayPreAuthorizations> ministerPmjayPreAuthorizationsList) {
        this.ministerPmjayPreAuthorizationsList = ministerPmjayPreAuthorizationsList;
    }

    public List<MinisterPmjayHospitalsEmpanelled> getMinisterPmjayHospitalsEmpanelledList() {
        return ministerPmjayHospitalsEmpanelledList;
    }

    public void setMinisterPmjayHospitalsEmpanelledList(List<MinisterPmjayHospitalsEmpanelled> ministerPmjayHospitalsEmpanelledList) {
        this.ministerPmjayHospitalsEmpanelledList = ministerPmjayHospitalsEmpanelledList;
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
