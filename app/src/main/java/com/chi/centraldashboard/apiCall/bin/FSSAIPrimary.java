package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FSSAIPrimary {
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

    @SerializedName("Central_Government_Institutes_Autonomous_Bodies_NABL")
    @Expose
    private String Central_Government_Institutes_Autonomous_Bodies_NABL;

    @SerializedName("State_Food_Laboratories_NABL")
    @Expose
    private String State_Food_Laboratories_NABL;

    @SerializedName("Private_Laboratories_NABL")
    @Expose
    private String Private_Laboratories_NABL;

    @SerializedName("State_Government_Laboratories_Under_Transition_Provision")
    @Expose
    private String State_Government_Laboratories_Under_Transition_Provision;

    @SerializedName("Total_Number_Primary_Food_Testing_Laboratories")
    @Expose
    private String Total_Number_Primary_Food_Testing_Laboratories;


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

    public String getCentral_Government_Institutes_Autonomous_Bodies_NABL() {
        return Central_Government_Institutes_Autonomous_Bodies_NABL;
    }

    public void setCentral_Government_Institutes_Autonomous_Bodies_NABL(String central_Government_Institutes_Autonomous_Bodies_NABL) {
        Central_Government_Institutes_Autonomous_Bodies_NABL = central_Government_Institutes_Autonomous_Bodies_NABL;
    }

    public String getState_Food_Laboratories_NABL() {
        return State_Food_Laboratories_NABL;
    }

    public void setState_Food_Laboratories_NABL(String state_Food_Laboratories_NABL) {
        State_Food_Laboratories_NABL = state_Food_Laboratories_NABL;
    }

    public String getPrivate_Laboratories_NABL() {
        return Private_Laboratories_NABL;
    }

    public void setPrivate_Laboratories_NABL(String private_Laboratories_NABL) {
        Private_Laboratories_NABL = private_Laboratories_NABL;
    }

    public String getState_Government_Laboratories_Under_Transition_Provision() {
        return State_Government_Laboratories_Under_Transition_Provision;
    }

    public void setState_Government_Laboratories_Under_Transition_Provision(String state_Government_Laboratories_Under_Transition_Provision) {
        State_Government_Laboratories_Under_Transition_Provision = state_Government_Laboratories_Under_Transition_Provision;
    }

    public String getTotal_Number_Primary_Food_Testing_Laboratories() {
        return Total_Number_Primary_Food_Testing_Laboratories;
    }

    public void setTotal_Number_Primary_Food_Testing_Laboratories(String total_Number_Primary_Food_Testing_Laboratories) {
        Total_Number_Primary_Food_Testing_Laboratories = total_Number_Primary_Food_Testing_Laboratories;
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
}
