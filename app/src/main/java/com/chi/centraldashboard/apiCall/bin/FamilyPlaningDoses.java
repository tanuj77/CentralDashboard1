package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FamilyPlaningDoses {
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

    @SerializedName("injectable_doses")
    @Expose
    private String injectable_doses;

    @SerializedName("Total_Number_of_Injectable_Doses_Given")
    @Expose
    private String Total_Number_of_Injectable_Doses_Given;

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

    public String getInjectable_doses() {
        return injectable_doses;
    }

    public void setInjectable_doses(String injectable_doses) {
        this.injectable_doses = injectable_doses;
    }

    public String getNumber_of_Injectable_Doses_Given() {
        return Total_Number_of_Injectable_Doses_Given;
    }

    public void setNumber_of_Injectable_Doses_Given(String Total_Number_of_Injectable_Doses_Given) {
        Total_Number_of_Injectable_Doses_Given = Total_Number_of_Injectable_Doses_Given;
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
