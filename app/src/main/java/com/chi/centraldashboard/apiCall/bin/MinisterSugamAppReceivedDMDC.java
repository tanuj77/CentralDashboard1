package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MinisterSugamAppReceivedDMDC {

    @SerializedName("SR_NO")
    @Expose
    private String SR_NO;


    @SerializedName("StateCode")
    @Expose
    private String StateCode;


    @SerializedName("State_Name")
    @Expose
    private String State_Name;

    @SerializedName("Received_for_Import_of_Drug_Medical_Devices_Cosmetics")
    @Expose
    private String Received_for_Import_of_Drug_Medical_Devices_Cosmetics;

    @SerializedName("Total_Received_for_Import_of_Drug_Medical_Devices_Cosmetics")
    @Expose
    private String Total_Received_for_Import_of_Drug_Medical_Devices_Cosmetics;


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

    public String getReceived_for_Import_of_Drug_Medical_Devices_Cosmetics() {
        return Received_for_Import_of_Drug_Medical_Devices_Cosmetics;
    }

    public void setReceived_for_Import_of_Drug_Medical_Devices_Cosmetics(String received_for_Import_of_Drug_Medical_Devices_Cosmetics) {
        Received_for_Import_of_Drug_Medical_Devices_Cosmetics = received_for_Import_of_Drug_Medical_Devices_Cosmetics;
    }

    public String getTotal_Received_for_Import_of_Drug_Medical_Devices_Cosmetics() {
        return Total_Received_for_Import_of_Drug_Medical_Devices_Cosmetics;
    }

    public void setTotal_Received_for_Import_of_Drug_Medical_Devices_Cosmetics(String total_Received_for_Import_of_Drug_Medical_Devices_Cosmetics) {
        Total_Received_for_Import_of_Drug_Medical_Devices_Cosmetics = total_Received_for_Import_of_Drug_Medical_Devices_Cosmetics;
    }
}
