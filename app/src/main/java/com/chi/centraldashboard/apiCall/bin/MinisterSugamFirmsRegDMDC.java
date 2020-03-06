package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MinisterSugamFirmsRegDMDC {
    @SerializedName("SR_NO")
    @Expose
    private String SR_NO;


    @SerializedName("StateCode")
    @Expose
    private String StateCode;


    @SerializedName("State_Name")
    @Expose
    private String State_Name;


    @SerializedName("value")
    @Expose
    private String value;

    @SerializedName("Total_Firms_Registered_for_Import_of_Drug_Medical_Devices_Cosmetics")
    @Expose
    private String Total_Firms_Registered_for_Import_of_Drug_Medical_Devices_Cosmetics;

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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getTotal_Firms_Registered_for_Import_of_Drug_Medical_Devices_Cosmetics() {
        return Total_Firms_Registered_for_Import_of_Drug_Medical_Devices_Cosmetics;
    }

    public void setTotal_Firms_Registered_for_Import_of_Drug_Medical_Devices_Cosmetics(String total_Firms_Registered_for_Import_of_Drug_Medical_Devices_Cosmetics) {
        Total_Firms_Registered_for_Import_of_Drug_Medical_Devices_Cosmetics = total_Firms_Registered_for_Import_of_Drug_Medical_Devices_Cosmetics;
    }
}
