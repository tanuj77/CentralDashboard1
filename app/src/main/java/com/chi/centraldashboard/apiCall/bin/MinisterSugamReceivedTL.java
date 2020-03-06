package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MinisterSugamReceivedTL {

    @SerializedName("SR_NO")
    @Expose
    private String SR_NO;

    @SerializedName("StateCode")
    @Expose
    private String StateCode;

    @SerializedName("State_Name")
    @Expose
    private String State_Name;


    @SerializedName("Received_for_Test_Licenses")
    @Expose
    private String Received_for_Test_Licenses;


    @SerializedName("Total_Received_for_Test_Licenses")
    @Expose
    private String Total_Received_for_Test_Licenses;


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

    public String getReceived_for_Test_Licenses() {
        return Received_for_Test_Licenses;
    }

    public void setReceived_for_Test_Licenses(String received_for_Test_Licenses) {
        Received_for_Test_Licenses = received_for_Test_Licenses;
    }

    public String getTotal_Received_for_Test_Licenses() {
        return Total_Received_for_Test_Licenses;
    }

    public void setTotal_Received_for_Test_Licenses(String total_Received_for_Test_Licenses) {
        Total_Received_for_Test_Licenses = total_Received_for_Test_Licenses;
    }
}
