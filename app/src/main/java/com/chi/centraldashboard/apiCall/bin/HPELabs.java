package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HPELabs {

    @SerializedName("SR_NO")
    @Expose
    private String SR_NO;


    @SerializedName("Year")
    @Expose
    private String Year;

    @SerializedName("Month")
    @Expose
    private String Month;


    @SerializedName("created_date")
    @Expose
    private String created_date;


    @SerializedName("updated_date")
    @Expose
    private String updated_date;

    @SerializedName("StateID")
    @Expose
    private String StateID;


    @SerializedName("State_Name")
    @Expose
    private String State_Name;


    @SerializedName("Name_of_Center")
    @Expose
    private String Name_of_Center;

    @SerializedName("Total_No_of_Labs")
    @Expose
    private String Total_No_of_Labs;


    @SerializedName("Total_No_of_Imaging_Centres")
    @Expose
    private String Total_No_of_Imaging_Centres;


    @SerializedName("Total_Number_of_Labs")
    @Expose
    private String Total_Number_of_Labs;


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

    public String getCreated_date() {
        return created_date;
    }

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }

    public String getUpdated_date() {
        return updated_date;
    }

    public void setUpdated_date(String updated_date) {
        this.updated_date = updated_date;
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

    public String getName_of_Center() {
        return Name_of_Center;
    }

    public void setName_of_Center(String name_of_Center) {
        Name_of_Center = name_of_Center;
    }

    public String getTotal_No_of_Labs() {
        return Total_No_of_Labs;
    }

    public void setTotal_No_of_Labs(String total_No_of_Labs) {
        Total_No_of_Labs = total_No_of_Labs;
    }

    public String getTotal_No_of_Imaging_Centres() {
        return Total_No_of_Imaging_Centres;
    }

    public void setTotal_No_of_Imaging_Centres(String total_No_of_Imaging_Centres) {
        Total_No_of_Imaging_Centres = total_No_of_Imaging_Centres;
    }

    public String getTotal_Number_of_Labs() {
        return Total_Number_of_Labs;
    }

    public void setTotal_Number_of_Labs(String total_Number_of_Labs) {
        Total_Number_of_Labs = total_Number_of_Labs;
    }
}
