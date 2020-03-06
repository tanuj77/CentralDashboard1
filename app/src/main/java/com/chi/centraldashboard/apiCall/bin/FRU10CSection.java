package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FRU10CSection {
    @SerializedName("SR_NO")
    @Expose
    private String SR_NO;



    @SerializedName("StateID")
    @Expose
    private String StateID;


    @SerializedName("State_Name")
    @Expose
    private String State_Name;

    @SerializedName("No_of_fully_operational_FRU_for_DH")
    @Expose
    private String No_of_fully_operational_FRU_for_DH;


    @SerializedName("Required_No_of_FRUs")
    @Expose
    private String Required_No_of_FRUs;


    @SerializedName("Number_of_Fully_Operational_FRUs_10_C_section_Month_for_DH_against_required_Number_of_FRUs")
    @Expose
    private String frus_10c_Section;



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

    public String getNo_of_fully_operational_FRU_for_DH() {
        return No_of_fully_operational_FRU_for_DH;
    }

    public void setNo_of_fully_operational_FRU_for_DH(String no_of_fully_operational_FRU_for_DH) {
        No_of_fully_operational_FRU_for_DH = no_of_fully_operational_FRU_for_DH;
    }

    public String getRequired_No_of_FRUs() {
        return Required_No_of_FRUs;
    }

    public void setRequired_No_of_FRUs(String required_No_of_FRUs) {
        Required_No_of_FRUs = required_No_of_FRUs;
    }

    public String getFrus_10c_Section() {
        return frus_10c_Section;
    }

    public void setFrus_10c_Section(String frus_10c_Section) {
        this.frus_10c_Section = frus_10c_Section;
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
