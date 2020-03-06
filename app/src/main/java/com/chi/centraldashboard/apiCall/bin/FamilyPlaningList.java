package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FamilyPlaningList {
    @SerializedName("Post_Partum_Intrauterine_Copper_Device_PPIUCD_Acceptance_Rate_Public")
    @Expose
    private List<FamilyPlaningPPIUCD> familyPlaningPPIUCDList=null;

    @SerializedName("Number_of_Injectable_Doses_Given")
    @Expose
    private List<FamilyPlaningDoses> familyPlaningDosesList=null;


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
}
