package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VHP_Regional {

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


    @SerializedName("Regional_labs_doing_enhanced_case_reporting")
    @Expose
    private String Regional_labs_doing_enhanced_case_reporting;

    @SerializedName("Total_Regional_labs_doing_enhanced_case_reporting")
    @Expose
    private String Total_Regional_labs_doing_enhanced_case_reporting;


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

    public String getRegional_labs_doing_enhanced_case_reporting() {
        return Regional_labs_doing_enhanced_case_reporting;
    }

    public void setRegional_labs_doing_enhanced_case_reporting(String regional_labs_doing_enhanced_case_reporting) {
        Regional_labs_doing_enhanced_case_reporting = regional_labs_doing_enhanced_case_reporting;
    }

    public String getTotal_Regional_labs_doing_enhanced_case_reporting() {
        return Total_Regional_labs_doing_enhanced_case_reporting;
    }

    public void setTotal_Regional_labs_doing_enhanced_case_reporting(String total_Regional_labs_doing_enhanced_case_reporting) {
        Total_Regional_labs_doing_enhanced_case_reporting = total_Regional_labs_doing_enhanced_case_reporting;
    }
}
