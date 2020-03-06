package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MaternalHealthANCCheckup {
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


    @SerializedName("anccheckup")
    @Expose
    private String anccheckup;

    @SerializedName("estimate_pregnancy_anc")
    @Expose
    private String estimate_pregnancy_anc;

    @SerializedName("anccheckup_anc")
    @Expose
    private String anccheckup_anc;


    @SerializedName("Total_ANC_Checkup")
    @Expose
    private String Total_ANC_Checkup;

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

    public String getAnccheckup() {
        return anccheckup;
    }

    public void setAnccheckup(String anccheckup) {
        this.anccheckup = anccheckup;
    }

    public String getEstimate_pregnancy_anc() {
        return estimate_pregnancy_anc;
    }

    public void setEstimate_pregnancy_anc(String estimate_pregnancy_anc) {
        this.estimate_pregnancy_anc = estimate_pregnancy_anc;
    }

    public String getAnccheckup_anc() {
        return anccheckup_anc;
    }

    public void setAnccheckup_anc(String anccheckup_anc) {
        this.anccheckup_anc = anccheckup_anc;
    }

    public String getTotal_ANC_Checkup() {
        return Total_ANC_Checkup;
    }

    public void setTotal_ANC_Checkup(String total_ANC_Checkup) {
        Total_ANC_Checkup = total_ANC_Checkup;
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
