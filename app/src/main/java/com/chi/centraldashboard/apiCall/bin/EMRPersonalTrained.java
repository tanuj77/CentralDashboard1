package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EMRPersonalTrained {
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

    @SerializedName("submitted_date")
    @Expose
    private String submitted_date;

    @SerializedName("updated_date")
    @Expose
    private String updated_date;


    @SerializedName("No_of_Doctors_Trained")
    @Expose
    private String doctors;

    @SerializedName("No_of_Nurses_Trained")
    @Expose
    private String nurses;

    @SerializedName("No_of_Paramedics_Trained")
    @Expose
    private String paramedics;

    @SerializedName("Total_Number_of_personnel_trained_in_Emergency_Life_Support")
    @Expose
    private String Total_Number_of_personnel_trained_in_Emergency_Life_Support;


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

    public String getDoctors() {
        return doctors;
    }

    public void setDoctors(String doctors) {
        this.doctors = doctors;
    }

    public String getNurses() {
        return nurses;
    }

    public void setNurses(String nurses) {
        this.nurses = nurses;
    }

    public String getParamedics() {
        return paramedics;
    }

    public void setParamedics(String paramedics) {
        this.paramedics = paramedics;
    }

    public String getTotal_Number_of_personnel_trained_in_Emergency_Life_Support() {
        return Total_Number_of_personnel_trained_in_Emergency_Life_Support;
    }

    public void setTotal_Number_of_personnel_trained_in_Emergency_Life_Support(String total_Number_of_personnel_trained_in_Emergency_Life_Support) {
        Total_Number_of_personnel_trained_in_Emergency_Life_Support = total_Number_of_personnel_trained_in_Emergency_Life_Support;
    }
}
