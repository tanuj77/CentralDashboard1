package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MinisterSugamApprovedTL {
    @SerializedName("SR_NO")
    @Expose
    private String SR_NO;

    @SerializedName("StateCode")
    @Expose
    private String StateCode;


    @SerializedName("State_Name")
    @Expose
    private String State_Name;


    @SerializedName("Approved_for_Test_Licenses")
    @Expose
    private String Approved_for_Test_Licenses;


    @SerializedName("Total_Approved_for_Test_Licenses")
    @Expose
    private String Total_Approved_for_Test_Licenses;


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

    public String getApproved_for_Test_Licenses() {
        return Approved_for_Test_Licenses;
    }

    public void setApproved_for_Test_Licenses(String approved_for_Test_Licenses) {
        Approved_for_Test_Licenses = approved_for_Test_Licenses;
    }

    public String getTotal_Approved_for_Test_Licenses() {
        return Total_Approved_for_Test_Licenses;
    }

    public void setTotal_Approved_for_Test_Licenses(String total_Approved_for_Test_Licenses) {
        Total_Approved_for_Test_Licenses = total_Approved_for_Test_Licenses;
    }
}
