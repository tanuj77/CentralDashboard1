package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FSSAIFood {
    @SerializedName("SR_NO")
    @Expose
    private String SR_NO;

    @SerializedName("Year")
    @Expose
    private String Year;

    @SerializedName("submitted_date")
    @Expose
    private String submitted_date;

    @SerializedName("updated_date")
    @Expose
    private String updated_date;

    @SerializedName("StateID")
    @Expose
    private String StateID;

    @SerializedName("State_Name")
    @Expose
    private String State_Name;

    @SerializedName("Central_Government_Institutes_Autonomous_Bodies_NABL")
    @Expose
    private String Central_Government_Institutes_Autonomous_Bodies_NABL;

    @SerializedName("Fssai_Own_Laboratories_NABL")
    @Expose
    private String Fssai_Own_Laboratories_NABL;


    @SerializedName("Total_Number_of_Referral_Food_Testing_Laboratories")
    @Expose
    private String Total_Number_of_Referral_Food_Testing_Laboratories;


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

    public String getCentral_Government_Institutes_Autonomous_Bodies_NABL() {
        return Central_Government_Institutes_Autonomous_Bodies_NABL;
    }

    public void setCentral_Government_Institutes_Autonomous_Bodies_NABL(String central_Government_Institutes_Autonomous_Bodies_NABL) {
        Central_Government_Institutes_Autonomous_Bodies_NABL = central_Government_Institutes_Autonomous_Bodies_NABL;
    }

    public String getFssai_Own_Laboratories_NABL() {
        return Fssai_Own_Laboratories_NABL;
    }

    public void setFssai_Own_Laboratories_NABL(String fssai_Own_Laboratories_NABL) {
        Fssai_Own_Laboratories_NABL = fssai_Own_Laboratories_NABL;
    }

    public String getTotal_Number_of_Referral_Food_Testing_Laboratories() {
        return Total_Number_of_Referral_Food_Testing_Laboratories;
    }

    public void setTotal_Number_of_Referral_Food_Testing_Laboratories(String total_Number_of_Referral_Food_Testing_Laboratories) {
        Total_Number_of_Referral_Food_Testing_Laboratories = total_Number_of_Referral_Food_Testing_Laboratories;
    }
}
