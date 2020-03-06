package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VHP_District {

    @SerializedName("SR_NO")
    @Expose
    private String SR_NO;


    @SerializedName("StateID")
    @Expose
    private String StateID;

    @SerializedName("State_Name")
    @Expose
    private String State_Name;



    @SerializedName("Year")
    @Expose
    private String Year;


    @SerializedName("Quarter")
    @Expose
    private String Quarter;

    @SerializedName("submitted_date")
    @Expose
    private String submitted_date;



    @SerializedName("updated_date")
    @Expose
    private String updated_date;


    @SerializedName("Districts_reporting_on_acute_hepatitis_surveillance")
    @Expose
    private String Districts_reporting_on_acute_hepatitis_surveillance;

    @SerializedName("Total_Districts_reporting_on_acute_hepatitis_surveillance")
    @Expose
    private String Total_Districts_reporting_on_acute_hepatitis_surveillance;


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

    public String getSubmitted_date() {
        return submitted_date;
    }

    public void setSubmitted_date(String submitted_date) {
        this.submitted_date = submitted_date;
    }

    public String getUpdated_date() {
        return updated_date;
    }

    public void setUpdated_date(String updated_date) {
        this.updated_date = updated_date;
    }

    public String getDistricts_reporting_on_acute_hepatitis_surveillance() {
        return Districts_reporting_on_acute_hepatitis_surveillance;
    }

    public void setDistricts_reporting_on_acute_hepatitis_surveillance(String districts_reporting_on_acute_hepatitis_surveillance) {
        Districts_reporting_on_acute_hepatitis_surveillance = districts_reporting_on_acute_hepatitis_surveillance;
    }

    public String getTotal_Districts_reporting_on_acute_hepatitis_surveillance() {
        return Total_Districts_reporting_on_acute_hepatitis_surveillance;
    }

    public void setTotal_Districts_reporting_on_acute_hepatitis_surveillance(String total_Districts_reporting_on_acute_hepatitis_surveillance) {
        Total_Districts_reporting_on_acute_hepatitis_surveillance = total_Districts_reporting_on_acute_hepatitis_surveillance;
    }
}
