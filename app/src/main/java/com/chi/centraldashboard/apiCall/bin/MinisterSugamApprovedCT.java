package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MinisterSugamApprovedCT {
    @SerializedName("SR_NO")
    @Expose
    private String SR_NO;


    @SerializedName("StateCode")
    @Expose
    private String StateCode;


    @SerializedName("State_Name")
    @Expose
    private String State_Name;


    @SerializedName("Approved_for_Clinical_Trial_in_India")
    @Expose
    private String Approved_for_Clinical_Trial_in_India;

    @SerializedName("Total_Approved_for_Clinical_Trial_in_India")
    @Expose
    private String Total_Approved_for_Clinical_Trial_in_India;

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

    public String getApproved_for_Clinical_Trial_in_India() {
        return Approved_for_Clinical_Trial_in_India;
    }

    public void setApproved_for_Clinical_Trial_in_India(String approved_for_Clinical_Trial_in_India) {
        Approved_for_Clinical_Trial_in_India = approved_for_Clinical_Trial_in_India;
    }

    public String getTotal_Approved_for_Clinical_Trial_in_India() {
        return Total_Approved_for_Clinical_Trial_in_India;
    }

    public void setTotal_Approved_for_Clinical_Trial_in_India(String total_Approved_for_Clinical_Trial_in_India) {
        Total_Approved_for_Clinical_Trial_in_India = total_Approved_for_Clinical_Trial_in_India;
    }
}
