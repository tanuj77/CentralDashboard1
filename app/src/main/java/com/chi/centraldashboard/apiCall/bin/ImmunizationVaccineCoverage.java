package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ImmunizationVaccineCoverage {
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


    @SerializedName("rotavirus_vaccine_coverage")
    @Expose
    private String rotavirus_vaccine_coverage;


    @SerializedName("Total_rotavirus_vaccine_coverage")
    @Expose
    private String Total_rotavirus_vaccine_coverage;


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

    public String getRotavirus_vaccine_coverage() {
        return rotavirus_vaccine_coverage;
    }

    public void setRotavirus_vaccine_coverage(String rotavirus_vaccine_coverage) {
        this.rotavirus_vaccine_coverage = rotavirus_vaccine_coverage;
    }

    public String getTotal_rotavirus_vaccine_coverage() {
        return Total_rotavirus_vaccine_coverage;
    }

    public void setTotal_rotavirus_vaccine_coverage(String total_rotavirus_vaccine_coverage) {
        Total_rotavirus_vaccine_coverage = total_rotavirus_vaccine_coverage;
    }
}
