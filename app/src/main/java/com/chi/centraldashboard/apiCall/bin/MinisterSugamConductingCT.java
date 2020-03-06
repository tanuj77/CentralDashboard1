package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MinisterSugamConductingCT {
    @SerializedName("SR_NO")
    @Expose
    private String SR_NO;


    @SerializedName("StateCode")
    @Expose
    private String StateCode;


    @SerializedName("State_Name")
    @Expose
    private String State_Name;


    @SerializedName("Received_for_Conducting_Clinical_Trial_in_India")
    @Expose
    private String Received_for_Conducting_Clinical_Trial_in_India;


    @SerializedName("Total_Received_for_Conducting_Clinical_Trial_in_India")
    @Expose
    private String Total_Received_for_Conducting_Clinical_Trial_in_India;


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

    public String getReceived_for_Conducting_Clinical_Trial_in_India() {
        return Received_for_Conducting_Clinical_Trial_in_India;
    }

    public void setReceived_for_Conducting_Clinical_Trial_in_India(String received_for_Conducting_Clinical_Trial_in_India) {
        Received_for_Conducting_Clinical_Trial_in_India = received_for_Conducting_Clinical_Trial_in_India;
    }

    public String getTotal_Received_for_Conducting_Clinical_Trial_in_India() {
        return Total_Received_for_Conducting_Clinical_Trial_in_India;
    }

    public void setTotal_Received_for_Conducting_Clinical_Trial_in_India(String total_Received_for_Conducting_Clinical_Trial_in_India) {
        Total_Received_for_Conducting_Clinical_Trial_in_India = total_Received_for_Conducting_Clinical_Trial_in_India;
    }
}
