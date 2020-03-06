package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MinisterAmritDrugsDispensed {
    @SerializedName("SR_NO")
    @Expose
    private String SR_NO;


    @SerializedName("Year")
    @Expose
    private String Year;

    @SerializedName("Month")
    @Expose
    private String Month;

    @SerializedName("StateID")
    @Expose
    private String StateID;

    @SerializedName("State_Name")
    @Expose
    private String State_Name;

    @SerializedName("Value_of_drugs_dispensed")
    @Expose
    private String Value_of_drugs_dispensed;


    @SerializedName("Total_Value_of_drugs_dispensed")
    @Expose
    private String Total_Value_of_drugs_dispensed;


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

    public String getMonth() {
        return Month;
    }

    public void setMonth(String month) {
        Month = month;
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

    public String getValue_of_drugs_dispensed() {
        return Value_of_drugs_dispensed;
    }

    public void setValue_of_drugs_dispensed(String value_of_drugs_dispensed) {
        Value_of_drugs_dispensed = value_of_drugs_dispensed;
    }

    public String getTotal_Value_of_drugs_dispensed() {
        return Total_Value_of_drugs_dispensed;
    }

    public void setTotal_Value_of_drugs_dispensed(String total_Value_of_drugs_dispensed) {
        Total_Value_of_drugs_dispensed = total_Value_of_drugs_dispensed;
    }

    public String getSubmitted_date() {
        return submitted_date;
    }

    public void setSubmitted_date(String submitted_date) {
        this.submitted_date = submitted_date;
    }
}
