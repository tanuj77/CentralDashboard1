package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MinisterAmritPharmacies {
    @SerializedName("SR_NO")
    @Expose
    private String SR_NO;


    @SerializedName("Year")
    @Expose
    private String Year;

    @SerializedName("Month")
    @Expose
    private String Month;

    @SerializedName("StateID")
    @Expose
    private String StateID;

    @SerializedName("State_Name")
    @Expose
    private String State_Name;

    @SerializedName("number_of_pharmacies")
    @Expose
    private String number_of_pharmacies;


    @SerializedName("Total_number_of_pharmacies")
    @Expose
    private String Total_number_of_pharmacies;


    @SerializedName("submitted_date")
    @Expose
    private String submitted_date;


    public String getSR_NO() {
        return SR_NO;
    }

    public void setSR_NO(String SR_NO) {
        this.SR_NO = SR_NO;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    public String getMonth() {
        return Month;
    }

    public void setMonth(String month) {
        Month = month;
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

    public String getNumber_of_pharmacies() {
        return number_of_pharmacies;
    }

    public void setNumber_of_pharmacies(String number_of_pharmacies) {
        this.number_of_pharmacies = number_of_pharmacies;
    }

    public String getTotal_number_of_pharmacies() {
        return Total_number_of_pharmacies;
    }

    public void setTotal_number_of_pharmacies(String total_number_of_pharmacies) {
        Total_number_of_pharmacies = total_number_of_pharmacies;
    }

    public String getSubmitted_date() {
        return submitted_date;
    }

    public void setSubmitted_date(String submitted_date) {
        this.submitted_date = submitted_date;
    }
}
