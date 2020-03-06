package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LeptospirosisDAffected {

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

    @SerializedName("month")
    @Expose
    private String month;

    @SerializedName("updated_date")
    @Expose
    private String updated_date;

    @SerializedName("Number_of_districts_affected")
    @Expose
    private String Number_of_districts_affected;

    @SerializedName("Total_Number_of_districts_affected")
    @Expose
    private String Total_Number_of_districts_affected;


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
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getUpdated_date() {
        return updated_date;
    }

    public void setUpdated_date(String updated_date) {
        this.updated_date = updated_date;
    }

    public String getNumber_of_districts_affected() {
        return Number_of_districts_affected;
    }

    public void setNumber_of_districts_affected(String number_of_districts_affected) {
        Number_of_districts_affected = number_of_districts_affected;
    }

    public String getTotal_Number_of_districts_affected() {
        return Total_Number_of_districts_affected;
    }

    public void setTotal_Number_of_districts_affected(String total_Number_of_districts_affected) {
        Total_Number_of_districts_affected = total_Number_of_districts_affected;
    }
}
