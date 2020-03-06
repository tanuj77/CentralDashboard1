package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FamilyPlaningData {
    @SerializedName("FAMILY_PLANNING")
    @Expose
    private List<FamilyPlaningList> familyPlaningListList=null;

    @SerializedName("Post_Partum_Intrauterine_Copper_Device_PPIUCD_Acceptance_Rate_Public")
    @Expose
    private List<FamilyPlaningPPIUCD> familyPlaningPPIUCDList=null;

    @SerializedName("Number_of_Injectable_Doses_Given")
    @Expose
    private List<FamilyPlaningDoses> familyPlaningDosesList=null;

    @SerializedName("title")
    @Expose
    private String title;


    @SerializedName("status")
    @Expose
    private int status;


    public List<FamilyPlaningList> getFamilyPlaningListList() {
        return familyPlaningListList;
    }

    public void setFamilyPlaningListList(List<FamilyPlaningList> familyPlaningListList) {
        this.familyPlaningListList = familyPlaningListList;
    }

    public List<FamilyPlaningPPIUCD> getFamilyPlaningPPIUCDList() {
        return familyPlaningPPIUCDList;
    }

    public void setFamilyPlaningPPIUCDList(List<FamilyPlaningPPIUCD> familyPlaningPPIUCDList) {
        this.familyPlaningPPIUCDList = familyPlaningPPIUCDList;
    }

    public List<FamilyPlaningDoses> getFamilyPlaningDosesList() {
        return familyPlaningDosesList;
    }

    public void setFamilyPlaningDosesList(List<FamilyPlaningDoses> familyPlaningDosesList) {
        this.familyPlaningDosesList = familyPlaningDosesList;
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
