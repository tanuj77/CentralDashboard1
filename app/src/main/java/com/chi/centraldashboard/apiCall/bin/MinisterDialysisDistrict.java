package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MinisterDialysisDistrict {
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

    @SerializedName("No_of_districts_with_functional_dialysis_units")
    @Expose
    private String No_of_districts_with_functional_dialysis_units;

    @SerializedName("units_against_the_total_districts")
    @Expose
    private String units_against_the_total_districts;

    @SerializedName("Total_No_of_districts_with_functional_dialysis_units_against_the_total_districts")
    @Expose
    private String Total_No_of_districts_with_functional_dialysis_units_against_the_total_districts;

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

    public String getNo_of_districts_with_functional_dialysis_units() {
        return No_of_districts_with_functional_dialysis_units;
    }

    public void setNo_of_districts_with_functional_dialysis_units(String no_of_districts_with_functional_dialysis_units) {
        No_of_districts_with_functional_dialysis_units = no_of_districts_with_functional_dialysis_units;
    }

    public String getUnits_against_the_total_districts() {
        return units_against_the_total_districts;
    }

    public void setUnits_against_the_total_districts(String units_against_the_total_districts) {
        this.units_against_the_total_districts = units_against_the_total_districts;
    }

    public String getTotal_No_of_districts_with_functional_dialysis_units_against_the_total_districts() {
        return Total_No_of_districts_with_functional_dialysis_units_against_the_total_districts;
    }

    public void setTotal_No_of_districts_with_functional_dialysis_units_against_the_total_districts(String total_No_of_districts_with_functional_dialysis_units_against_the_total_districts) {
        Total_No_of_districts_with_functional_dialysis_units_against_the_total_districts = total_No_of_districts_with_functional_dialysis_units_against_the_total_districts;
    }

    public String getSubmitted_date() {
        return submitted_date;
    }

    public void setSubmitted_date(String submitted_date) {
        this.submitted_date = submitted_date;
    }
}
