package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DDAPIPD {

    @SerializedName("SR_NO")
    @Expose
    private String SR_NO;


    @SerializedName("year")
    @Expose
    private String year;


    @SerializedName("quarterly")
    @Expose
    private String quarterly;


    @SerializedName("StateID")
    @Expose
    private String StateID;


    @SerializedName("State_Name")
    @Expose
    private String State_Name;


    @SerializedName("Hospital_Name")
    @Expose
    private String Hospital_Name;


    @SerializedName("No_of_persons_IPD")
    @Expose
    private String No_of_persons_IPD;


    @SerializedName("Total_No_of_Patients_IPD")
    @Expose
    private String Total_No_of_Patients_IPD;


    @SerializedName("submitted_date")
    @Expose
    private String submitted_date;


    @SerializedName("updated_date")
    @Expose
    private String updated_date;


    public String getSR_NO() {
        return SR_NO;
    }

    public void setSR_NO(String SR_NO) {
        this.SR_NO = SR_NO;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getQuarterly() {
        return quarterly;
    }

    public void setQuarterly(String quarterly) {
        this.quarterly = quarterly;
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

    public String getHospital_Name() {
        return Hospital_Name;
    }

    public void setHospital_Name(String hospital_Name) {
        Hospital_Name = hospital_Name;
    }

    public String getNo_of_persons_IPD() {
        return No_of_persons_IPD;
    }

    public void setNo_of_persons_IPD(String no_of_persons_IPD) {
        No_of_persons_IPD = no_of_persons_IPD;
    }

    public String getTotal_No_of_Patients_IPD() {
        return Total_No_of_Patients_IPD;
    }

    public void setTotal_No_of_Patients_IPD(String total_No_of_Patients_IPD) {
        Total_No_of_Patients_IPD = total_No_of_Patients_IPD;
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
}
