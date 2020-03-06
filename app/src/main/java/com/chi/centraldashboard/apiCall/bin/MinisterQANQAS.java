package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MinisterQANQAS {
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


    @SerializedName("nqas_facilities_count")
    @Expose
    private String nqas_facilities_count;


    @SerializedName("Total_Number_of_facilities_NQAS_Certified")
    @Expose
    private String Total_Number_of_facilities_NQAS_Certified;


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

    public String getNqas_facilities_count() {
        return nqas_facilities_count;
    }

    public void setNqas_facilities_count(String nqas_facilities_count) {
        this.nqas_facilities_count = nqas_facilities_count;
    }

    public String getTotal_Number_of_facilities_NQAS_Certified() {
        return Total_Number_of_facilities_NQAS_Certified;
    }

    public void setTotal_Number_of_facilities_NQAS_Certified(String total_Number_of_facilities_NQAS_Certified) {
        Total_Number_of_facilities_NQAS_Certified = total_Number_of_facilities_NQAS_Certified;
    }

    public String getSubmitted_date() {
        return submitted_date;
    }

    public void setSubmitted_date(String submitted_date) {
        this.submitted_date = submitted_date;
    }
}
