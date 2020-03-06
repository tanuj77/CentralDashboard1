package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MinisterAmritSavingsPatients {
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

    @SerializedName("Savings_to_the_patients")
    @Expose
    private String Savings_to_the_patients;


    @SerializedName("Total_Savings_to_the_patients")
    @Expose
    private String Total_Savings_to_the_patients;


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

    public String getSavings_to_the_patients() {
        return Savings_to_the_patients;
    }

    public void setSavings_to_the_patients(String savings_to_the_patients) {
        Savings_to_the_patients = savings_to_the_patients;
    }

    public String getTotal_Savings_to_the_patients() {
        return Total_Savings_to_the_patients;
    }

    public void setTotal_Savings_to_the_patients(String total_Savings_to_the_patients) {
        Total_Savings_to_the_patients = total_Savings_to_the_patients;
    }

    public String getSubmitted_date() {
        return submitted_date;
    }

    public void setSubmitted_date(String submitted_date) {
        this.submitted_date = submitted_date;
    }
}
