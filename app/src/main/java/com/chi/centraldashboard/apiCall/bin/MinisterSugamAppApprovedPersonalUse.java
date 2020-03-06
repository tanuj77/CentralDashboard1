package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MinisterSugamAppApprovedPersonalUse {

    @SerializedName("SR_NO")
    @Expose
    private String SR_NO;

    @SerializedName("StateCode")
    @Expose
    private String StateCode;


    @SerializedName("State_Name")
    @Expose
    private String State_Name;


    @SerializedName("Approved_for_Import_of_Life_Saving_Drugs_for_Personal_Use")
    @Expose
    private String Approved_for_Import_of_Life_Saving_Drugs_for_Personal_Use;


    @SerializedName("Total_Approved_for_Import_of_Life_Saving_Drugs_for_Personal_Use")
    @Expose
    private String Total_Approved_for_Import_of_Life_Saving_Drugs_for_Personal_Use;


    public String getSR_NO() {
        return SR_NO;
    }

    public void setSR_NO(String SR_NO) {
        this.SR_NO = SR_NO;
    }

    public String getStateCode() {
        return StateCode;
    }

    public void setStateCode(String stateCode) {
        StateCode = stateCode;
    }

    public String getState_Name() {
        return State_Name;
    }

    public void setState_Name(String state_Name) {
        State_Name = state_Name;
    }

    public String getApproved_for_Import_of_Life_Saving_Drugs_for_Personal_Use() {
        return Approved_for_Import_of_Life_Saving_Drugs_for_Personal_Use;
    }

    public void setApproved_for_Import_of_Life_Saving_Drugs_for_Personal_Use(String approved_for_Import_of_Life_Saving_Drugs_for_Personal_Use) {
        Approved_for_Import_of_Life_Saving_Drugs_for_Personal_Use = approved_for_Import_of_Life_Saving_Drugs_for_Personal_Use;
    }

    public String getTotal_Approved_for_Import_of_Life_Saving_Drugs_for_Personal_Use() {
        return Total_Approved_for_Import_of_Life_Saving_Drugs_for_Personal_Use;
    }

    public void setTotal_Approved_for_Import_of_Life_Saving_Drugs_for_Personal_Use(String total_Approved_for_Import_of_Life_Saving_Drugs_for_Personal_Use) {
        Total_Approved_for_Import_of_Life_Saving_Drugs_for_Personal_Use = total_Approved_for_Import_of_Life_Saving_Drugs_for_Personal_Use;
    }
}
