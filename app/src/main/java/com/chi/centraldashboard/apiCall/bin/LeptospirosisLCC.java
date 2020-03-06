package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LeptospirosisLCC {
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

    @SerializedName("updated_date")
    @Expose
    private String updated_date;

    @SerializedName("laboratory_leptospirosis_casesreported")
    @Expose
    private String laboratory_leptospirosis_casesreported;

    @SerializedName("Total_laboratory_leptospirosis_casesreported")
    @Expose
    private String Total_laboratory_leptospirosis_casesreported;


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

    public String getUpdated_date() {
        return updated_date;
    }

    public void setUpdated_date(String updated_date) {
        this.updated_date = updated_date;
    }

    public String getLaboratory_leptospirosis_casesreported() {
        return laboratory_leptospirosis_casesreported;
    }

    public void setLaboratory_leptospirosis_casesreported(String laboratory_leptospirosis_casesreported) {
        this.laboratory_leptospirosis_casesreported = laboratory_leptospirosis_casesreported;
    }

    public String getTotal_laboratory_leptospirosis_casesreported() {
        return Total_laboratory_leptospirosis_casesreported;
    }

    public void setTotal_laboratory_leptospirosis_casesreported(String total_laboratory_leptospirosis_casesreported) {
        Total_laboratory_leptospirosis_casesreported = total_laboratory_leptospirosis_casesreported;
    }
}
