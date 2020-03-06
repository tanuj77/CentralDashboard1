package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MinisterAmritPatientsServed {
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

    @SerializedName("Number_of_patients_served")
    @Expose
    private String Number_of_patients_served;


    @SerializedName("Total_Number_of_patients_served")
    @Expose
    private String Total_Number_of_patients_served;


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

    public String getNumber_of_patients_served() {
        return Number_of_patients_served;
    }

    public void setNumber_of_patients_served(String number_of_patients_served) {
        Number_of_patients_served = number_of_patients_served;
    }

    public String getTotal_Number_of_patients_served() {
        return Total_Number_of_patients_served;
    }

    public void setTotal_Number_of_patients_served(String total_Number_of_patients_served) {
        Total_Number_of_patients_served = total_Number_of_patients_served;
    }

    public String getSubmitted_date() {
        return submitted_date;
    }

    public void setSubmitted_date(String submitted_date) {
        this.submitted_date = submitted_date;
    }
}
