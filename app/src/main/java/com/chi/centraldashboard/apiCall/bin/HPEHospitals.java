package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HPEHospitals {

    @SerializedName("SR_NO")
    @Expose
    private String SR_NO;

    @SerializedName("Year")
    @Expose
    private String Year;

    @SerializedName("Month")
    @Expose
    private String Month;

    @SerializedName("created_date")
    @Expose
    private String created_date;


    @SerializedName("updated_date")
    @Expose
    private String updated_date;


    @SerializedName("StateID")
    @Expose
    private String StateID;

    @SerializedName("State_Name")
    @Expose
    private String State_Name;

    @SerializedName("Number_of_Hospitals")
    @Expose
    private String Number_of_Hospitals;

    @SerializedName("Total_Number_of_Hospitals")
    @Expose
    private String Total_Number_of_Hospitals;


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

    public String getCreated_date() {
        return created_date;
    }

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }

    public String getUpdated_date() {
        return updated_date;
    }

    public void setUpdated_date(String updated_date) {
        this.updated_date = updated_date;
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

    public String getNumber_of_Hospitals() {
        return Number_of_Hospitals;
    }

    public void setNumber_of_Hospitals(String number_of_Hospitals) {
        Number_of_Hospitals = number_of_Hospitals;
    }

    public String getTotal_Number_of_Hospitals() {
        return Total_Number_of_Hospitals;
    }

    public void setTotal_Number_of_Hospitals(String total_Number_of_Hospitals) {
        Total_Number_of_Hospitals = total_Number_of_Hospitals;
    }
}
