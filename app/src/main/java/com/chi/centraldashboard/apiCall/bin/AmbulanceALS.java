package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AmbulanceALS {
    @SerializedName("SR_NO")
    @Expose
    private String SR_NO;

    @SerializedName("StateID")
    @Expose
    private String StateID;

    @SerializedName("State_Name")
    @Expose
    private String State_Name;

    @SerializedName("No_of_Advanced_Life_Support_ALS_Ambulances_Operational_Against_Required")
    @Expose
    private String No_of_Advanced_Life_Support_ALS_Ambulances_Operational_Against_Required;

    @SerializedName("Total_Advanced_Life_Support_ALS_Ambulances_Operational_against_Required")
    @Expose
    private String Total_Advanced_Life_Support_ALS_Ambulances_Operational_against_Required;

    @SerializedName("updated_date")
    @Expose
    private String updated_date;

    @SerializedName("submitted_date")
    @Expose
    private String submitted_date;

    @SerializedName("Year")
    @Expose
    private String Year;

    @SerializedName("Quarter")
    @Expose
    private String Quarter;


    public String getSR_NO() {
        return SR_NO;
    }

    public void setSR_NO(String SR_NO) {
        this.SR_NO = SR_NO;
    }

    public String getStateID() {
        return StateID;
    }

    public void setStateID(String stateID) {
        StateID = stateID;
    }

    public String getState_Name() {
        return State_Name;
    }

    public void setState_Name(String state_Name) {
        State_Name = state_Name;
    }

    public String getNo_of_Advanced_Life_Support_ALS_Ambulances_Operational_Against_Required() {
        return No_of_Advanced_Life_Support_ALS_Ambulances_Operational_Against_Required;
    }

    public void setNo_of_Advanced_Life_Support_ALS_Ambulances_Operational_Against_Required(String no_of_Advanced_Life_Support_ALS_Ambulances_Operational_Against_Required) {
        No_of_Advanced_Life_Support_ALS_Ambulances_Operational_Against_Required = no_of_Advanced_Life_Support_ALS_Ambulances_Operational_Against_Required;
    }

    public String getTotal_Advanced_Life_Support_ALS_Ambulances_Operational_against_Required() {
        return Total_Advanced_Life_Support_ALS_Ambulances_Operational_against_Required;
    }

    public void setTotal_Advanced_Life_Support_ALS_Ambulances_Operational_against_Required(String total_Advanced_Life_Support_ALS_Ambulances_Operational_against_Required) {
        Total_Advanced_Life_Support_ALS_Ambulances_Operational_against_Required = total_Advanced_Life_Support_ALS_Ambulances_Operational_against_Required;
    }

    public String getUpdated_date() {
        return updated_date;
    }

    public void setUpdated_date(String updated_date) {
        this.updated_date = updated_date;
    }

    public String getSubmitted_date() {
        return submitted_date;
    }

    public void setSubmitted_date(String submitted_date) {
        this.submitted_date = submitted_date;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    public String getQuarter() {
        return Quarter;
    }

    public void setQuarter(String quarter) {
        Quarter = quarter;
    }
}
