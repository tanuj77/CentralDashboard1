package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NPCDCS_Infra_CHCNCD {
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


    @SerializedName("CHC_NCD_Clinics_Functional")
    @Expose
    private String CHC_NCD_Clinics_Functional;

    @SerializedName("Total_CHC_NCD_Clinics_Functional")
    @Expose
    private String Total_CHC_NCD_Clinics_Functional;


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

    public String getCHC_NCD_Clinics_Functional() {
        return CHC_NCD_Clinics_Functional;
    }

    public void setCHC_NCD_Clinics_Functional(String CHC_NCD_Clinics_Functional) {
        this.CHC_NCD_Clinics_Functional = CHC_NCD_Clinics_Functional;
    }

    public String getTotal_CHC_NCD_Clinics_Functional() {
        return Total_CHC_NCD_Clinics_Functional;
    }

    public void setTotal_CHC_NCD_Clinics_Functional(String total_CHC_NCD_Clinics_Functional) {
        Total_CHC_NCD_Clinics_Functional = total_CHC_NCD_Clinics_Functional;
    }
}
