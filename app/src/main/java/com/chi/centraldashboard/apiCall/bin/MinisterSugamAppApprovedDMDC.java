package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MinisterSugamAppApprovedDMDC {
    @SerializedName("SR_NO")
    @Expose
    private String SR_NO;

    @SerializedName("StateCode")
    @Expose
    private String StateCode;


    @SerializedName("State_Name")
    @Expose
    private String State_Name;


    @SerializedName("Approved_for_Import_of_Drug_Medical_Devices_Cosmetics")
    @Expose
    private String Approved_for_Import_of_Drug_Medical_Devices_Cosmetics;

    @SerializedName("Total_Approved_for_Import_of_Drug_Medical_Devices_Cosmetics")
    @Expose
    private String Total_Approved_for_Import_of_Drug_Medical_Devices_Cosmetics;


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

    public String getApproved_for_Import_of_Drug_Medical_Devices_Cosmetics() {
        return Approved_for_Import_of_Drug_Medical_Devices_Cosmetics;
    }

    public void setApproved_for_Import_of_Drug_Medical_Devices_Cosmetics(String approved_for_Import_of_Drug_Medical_Devices_Cosmetics) {
        Approved_for_Import_of_Drug_Medical_Devices_Cosmetics = approved_for_Import_of_Drug_Medical_Devices_Cosmetics;
    }

    public String getTotal_Approved_for_Import_of_Drug_Medical_Devices_Cosmetics() {
        return Total_Approved_for_Import_of_Drug_Medical_Devices_Cosmetics;
    }

    public void setTotal_Approved_for_Import_of_Drug_Medical_Devices_Cosmetics(String total_Approved_for_Import_of_Drug_Medical_Devices_Cosmetics) {
        Total_Approved_for_Import_of_Drug_Medical_Devices_Cosmetics = total_Approved_for_Import_of_Drug_Medical_Devices_Cosmetics;
    }
}
