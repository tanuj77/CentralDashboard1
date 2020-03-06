package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MinisterDialysisPMNDP {
    @SerializedName("SR_NO")
    @Expose
    private String SR_NO;

    @SerializedName("Year")
    @Expose
    private String Year;

    @SerializedName("Quarterly")
    @Expose
    private String Quarterly;

    @SerializedName("StateID")
    @Expose
    private String StateID;

    @SerializedName("State_Name")
    @Expose
    private String State_Name;

    @SerializedName("No_of_patients_receiving_treatment")
    @Expose
    private String No_of_patients_receiving_treatment;

    @SerializedName("No_of_patients_receiving_treatment_sessions_held_under_PMNDP")
    @Expose
    private String No_of_patients_receiving_treatment_sessions_held_under_PMNDP;

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

    public String getQuarterly() {
        return Quarterly;
    }

    public void setQuarterly(String quarterly) {
        Quarterly = quarterly;
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

    public String getNo_of_patients_receiving_treatment() {
        return No_of_patients_receiving_treatment;
    }

    public void setNo_of_patients_receiving_treatment(String no_of_patients_receiving_treatment) {
        No_of_patients_receiving_treatment = no_of_patients_receiving_treatment;
    }

    public String getNo_of_patients_receiving_treatment_sessions_held_under_PMNDP() {
        return No_of_patients_receiving_treatment_sessions_held_under_PMNDP;
    }

    public void setNo_of_patients_receiving_treatment_sessions_held_under_PMNDP(String no_of_patients_receiving_treatment_sessions_held_under_PMNDP) {
        No_of_patients_receiving_treatment_sessions_held_under_PMNDP = no_of_patients_receiving_treatment_sessions_held_under_PMNDP;
    }

    public String getSubmitted_date() {
        return submitted_date;
    }

    public void setSubmitted_date(String submitted_date) {
        this.submitted_date = submitted_date;
    }
}
