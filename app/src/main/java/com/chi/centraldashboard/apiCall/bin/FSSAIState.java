package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FSSAIState {
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

    @SerializedName("Quarterly")
    @Expose
    private String Quarterly;

    @SerializedName("submitted_date")
    @Expose
    private String submitted_date;

    @SerializedName("updated_date")
    @Expose
    private String updated_date;

    @SerializedName("Number_of_State_Food_Laboratories_strengthened")
    @Expose
    private String Number_of_State_Food_Laboratories_strengthened;


    @SerializedName("Total_Number_of_State_Food_Laboratories_strengthened")
    @Expose
    private String Total_Number_of_State_Food_Laboratories_strengthened;


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

    public String getNumber_of_State_Food_Laboratories_strengthened() {
        return Number_of_State_Food_Laboratories_strengthened;
    }

    public void setNumber_of_State_Food_Laboratories_strengthened(String number_of_State_Food_Laboratories_strengthened) {
        Number_of_State_Food_Laboratories_strengthened = number_of_State_Food_Laboratories_strengthened;
    }

    public String getTotal_Number_of_State_Food_Laboratories_strengthened() {
        return Total_Number_of_State_Food_Laboratories_strengthened;
    }

    public void setTotal_Number_of_State_Food_Laboratories_strengthened(String total_Number_of_State_Food_Laboratories_strengthened) {
        Total_Number_of_State_Food_Laboratories_strengthened = total_Number_of_State_Food_Laboratories_strengthened;
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
}
