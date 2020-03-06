package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NVBDCP_Dengue_TotalCases {

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

    @SerializedName("Month")
    @Expose
    private String Month;

    @SerializedName("submitted_date")
    @Expose
    private String submitted_date;

    @SerializedName("updated_date")
    @Expose
    private String updated_date;

    @SerializedName("NUMBER_OF_TOTAL_CASES")
    @Expose
    private String NUMBER_OF_TOTAL_CASES;

    @SerializedName("Total_NUMBER_OF_TOTAL_CASES")
    @Expose
    private String Total_NUMBER_OF_TOTAL_CASES;


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

    public String getMonth() {
        return Month;
    }

    public void setMonth(String month) {
        Month = month;
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

    public String getNUMBER_OF_TOTAL_CASES() {
        return NUMBER_OF_TOTAL_CASES;
    }

    public void setNUMBER_OF_TOTAL_CASES(String NUMBER_OF_TOTAL_CASES) {
        this.NUMBER_OF_TOTAL_CASES = NUMBER_OF_TOTAL_CASES;
    }

    public String getTotal_NUMBER_OF_TOTAL_CASES() {
        return Total_NUMBER_OF_TOTAL_CASES;
    }

    public void setTotal_NUMBER_OF_TOTAL_CASES(String total_NUMBER_OF_TOTAL_CASES) {
        Total_NUMBER_OF_TOTAL_CASES = total_NUMBER_OF_TOTAL_CASES;
    }
}
