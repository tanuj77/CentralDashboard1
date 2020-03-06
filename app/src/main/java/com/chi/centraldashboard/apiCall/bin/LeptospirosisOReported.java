package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LeptospirosisOReported {
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

    @SerializedName("Number_of_Leptospirosis_outbreaks_reported")
    @Expose
    private String Number_of_Leptospirosis_outbreaks_reported;

    @SerializedName("Total_Number_of_Leptospirosis_outbreaks_reported")
    @Expose
    private String Total_Number_of_Leptospirosis_outbreaks_reported;


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

    public String getNumber_of_Leptospirosis_outbreaks_reported() {
        return Number_of_Leptospirosis_outbreaks_reported;
    }

    public void setNumber_of_Leptospirosis_outbreaks_reported(String number_of_Leptospirosis_outbreaks_reported) {
        Number_of_Leptospirosis_outbreaks_reported = number_of_Leptospirosis_outbreaks_reported;
    }

    public String getTotal_Number_of_Leptospirosis_outbreaks_reported() {
        return Total_Number_of_Leptospirosis_outbreaks_reported;
    }

    public void setTotal_Number_of_Leptospirosis_outbreaks_reported(String total_Number_of_Leptospirosis_outbreaks_reported) {
        Total_Number_of_Leptospirosis_outbreaks_reported = total_Number_of_Leptospirosis_outbreaks_reported;
    }
}
