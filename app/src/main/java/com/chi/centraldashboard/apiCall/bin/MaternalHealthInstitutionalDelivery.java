package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MaternalHealthInstitutionalDelivery {
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


    @SerializedName("institutedelivery")
    @Expose
    private String institutedelivery;

    @SerializedName("estimate_pregnancy_id")
    @Expose
    private String estimate_pregnancy_id;

    @SerializedName("institutedelivery_id")
    @Expose
    private String institutedelivery_id;


    @SerializedName("Total_Institutional_Delivery")
    @Expose
    private String Total_Institutional_Delivery;

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

    public String getInstitutedelivery() {
        return institutedelivery;
    }

    public void setInstitutedelivery(String institutedelivery) {
        this.institutedelivery = institutedelivery;
    }

    public String getEstimate_pregnancy_id() {
        return estimate_pregnancy_id;
    }

    public void setEstimate_pregnancy_id(String estimate_pregnancy_id) {
        this.estimate_pregnancy_id = estimate_pregnancy_id;
    }

    public String getInstitutedelivery_id() {
        return institutedelivery_id;
    }

    public void setInstitutedelivery_id(String institutedelivery_id) {
        this.institutedelivery_id = institutedelivery_id;
    }

    public String getTotal_Institutional_Delivery() {
        return Total_Institutional_Delivery;
    }

    public void setTotal_Institutional_Delivery(String total_Institutional_Delivery) {
        Total_Institutional_Delivery = total_Institutional_Delivery;
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
