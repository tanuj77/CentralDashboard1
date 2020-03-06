package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MaternalHealthAntenatalCare {
    @SerializedName("SR_NO")
    @Expose
    private String SR_NO;

    @SerializedName("year")
    @Expose
    private String year;


    @SerializedName("quarterly")
    @Expose
    private String quarterly;

    @SerializedName("state_id")
    @Expose
    private String state_id;

    @SerializedName("State_Name")
    @Expose
    private String State_Name;


    @SerializedName("firsttrimester")
    @Expose
    private String firsttrimester;

    @SerializedName("estimate_pregnancy_w")
    @Expose
    private String estimate_pregnancy_w;

    @SerializedName("firsttrimester_w")
    @Expose
    private String firsttrimester_w;


    @SerializedName("Total_Antenatal_Care")
    @Expose
    private String Total_Antenatal_Care;

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

    public String getFirsttrimester() {
        return firsttrimester;
    }

    public void setFirsttrimester(String firsttrimester) {
        this.firsttrimester = firsttrimester;
    }

    public String getEstimate_pregnancy_w() {
        return estimate_pregnancy_w;
    }

    public void setEstimate_pregnancy_w(String estimate_pregnancy_w) {
        this.estimate_pregnancy_w = estimate_pregnancy_w;
    }

    public String getFirsttrimester_w() {
        return firsttrimester_w;
    }

    public void setFirsttrimester_w(String firsttrimester_w) {
        this.firsttrimester_w = firsttrimester_w;
    }

    public String getTotal_Antenatal_Care() {
        return Total_Antenatal_Care;
    }

    public void setTotal_Antenatal_Care(String total_Antenatal_Care) {
        Total_Antenatal_Care = total_Antenatal_Care;
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
