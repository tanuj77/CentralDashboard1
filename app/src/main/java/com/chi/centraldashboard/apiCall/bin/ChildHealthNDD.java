package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ChildHealthNDD {
    @SerializedName("SR_NO")
    @Expose
    private String SR_NO;

    @SerializedName("year")
    @Expose
    private String year;

    @SerializedName("biannualy")
    @Expose
    private String biannualy;

    @SerializedName("state_id")
    @Expose
    private String state_id;

    @SerializedName("State_Name")
    @Expose
    private String State_Name;

    @SerializedName("National_Deworming_Day_Coverage")
    @Expose
    private String National_Deworming_Day_Coverage;

    @SerializedName("Total_National_Deworming_Day_Coverage")
    @Expose
    private String Total_National_Deworming_Day_Coverage;

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

    public String getBiannualy() {
        return biannualy;
    }

    public void setBiannualy(String biannualy) {
        this.biannualy = biannualy;
    }

    public String getState_id() {
        return state_id;
    }

    public void setState_id(String state_id) {
        this.state_id = state_id;
    }

    public String getState_Name() {
        return State_Name;
    }

    public void setState_Name(String state_Name) {
        State_Name = state_Name;
    }

    public String getNational_Deworming_Day_Coverage() {
        return National_Deworming_Day_Coverage;
    }

    public void setNational_Deworming_Day_Coverage(String national_Deworming_Day_Coverage) {
        National_Deworming_Day_Coverage = national_Deworming_Day_Coverage;
    }

    public String getTotal_National_Deworming_Day_Coverage() {
        return Total_National_Deworming_Day_Coverage;
    }

    public void setTotal_National_Deworming_Day_Coverage(String total_National_Deworming_Day_Coverage) {
        Total_National_Deworming_Day_Coverage = total_National_Deworming_Day_Coverage;
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
