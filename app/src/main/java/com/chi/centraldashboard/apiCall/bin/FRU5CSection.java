package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FRU5CSection {

    @SerializedName("SR_NO")
    @Expose
    private String SR_NO;



    @SerializedName("StateID")
    @Expose
    private String StateID;


    @SerializedName("State_Name")
    @Expose
    private String State_Name;

    @SerializedName("No_of_fully_operational_FRU_for_CHC_and_SDH")
    @Expose
    private String No_of_fully_operational_FRU_for_CHC_and_SDH;


    @SerializedName("Required_No_of_FRUs")
    @Expose
    private String Required_No_of_FRUs;


    @SerializedName("Number_of_Fully_Operational_FRUs_5_C_section_Month_for_CHC_and_SDH_against_required_Number_of_FRUs_Required")
    @Expose
    private String frus5c;



    @SerializedName("updated_date")
    @Expose
    private String updated_date;


    @SerializedName("date_added")
    @Expose
    private String date_added;

    @SerializedName("Year")
    @Expose
    private String Year;


    @SerializedName("Quarter")
    @Expose
    private String Quarter;


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

    public String getNo_of_fully_operational_FRU_for_CHC_and_SDH() {
        return No_of_fully_operational_FRU_for_CHC_and_SDH;
    }

    public void setNo_of_fully_operational_FRU_for_CHC_and_SDH(String no_of_fully_operational_FRU_for_CHC_and_SDH) {
        No_of_fully_operational_FRU_for_CHC_and_SDH = no_of_fully_operational_FRU_for_CHC_and_SDH;
    }

    public String getRequired_No_of_FRUs() {
        return Required_No_of_FRUs;
    }

    public void setRequired_No_of_FRUs(String required_No_of_FRUs) {
        Required_No_of_FRUs = required_No_of_FRUs;
    }

    public String getFrus5c() {
        return frus5c;
    }

    public void setFrus5c(String frus5c) {
        this.frus5c = frus5c;
    }

    public String getUpdated_date() {
        return updated_date;
    }

    public void setUpdated_date(String updated_date) {
        this.updated_date = updated_date;
    }

    public String getDate_added() {
        return date_added;
    }

    public void setDate_added(String date_added) {
        this.date_added = date_added;
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
}
