package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FSSAILicensing {

    @SerializedName("SR_NO")
    @Expose
    private String SR_NO;

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

    @SerializedName("StateID")
    @Expose
    private String StateID;


    @SerializedName("State_Name")
    @Expose
    private String State_Name;

    @SerializedName("Number_Of_Licenses_Issued_To_FBOs_Center")
    @Expose
    private String Number_Of_Licenses_Issued_To_FBOs_Center;

    @SerializedName("Number_Of_Licenses_Issued_To_FBOs_State")
    @Expose
    private String Number_Of_Licenses_Issued_To_FBOs_State;

    @SerializedName("Total_Number_Of_FBOs_Registered")
    @Expose
    private String Total_Number_Of_FBOs_Registered;


    @SerializedName("Total_Number_Licensing_and_Registration_of_FBOs")
    @Expose
    private String Total_Number_Licensing_and_Registration_of_FBOs;


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

    public String getNumber_Of_Licenses_Issued_To_FBOs_Center() {
        return Number_Of_Licenses_Issued_To_FBOs_Center;
    }

    public void setNumber_Of_Licenses_Issued_To_FBOs_Center(String number_Of_Licenses_Issued_To_FBOs_Center) {
        Number_Of_Licenses_Issued_To_FBOs_Center = number_Of_Licenses_Issued_To_FBOs_Center;
    }

    public String getNumber_Of_Licenses_Issued_To_FBOs_State() {
        return Number_Of_Licenses_Issued_To_FBOs_State;
    }

    public void setNumber_Of_Licenses_Issued_To_FBOs_State(String number_Of_Licenses_Issued_To_FBOs_State) {
        Number_Of_Licenses_Issued_To_FBOs_State = number_Of_Licenses_Issued_To_FBOs_State;
    }

    public String getTotal_Number_Of_FBOs_Registered() {
        return Total_Number_Of_FBOs_Registered;
    }

    public void setTotal_Number_Of_FBOs_Registered(String total_Number_Of_FBOs_Registered) {
        Total_Number_Of_FBOs_Registered = total_Number_Of_FBOs_Registered;
    }

    public String getTotal_Number_Licensing_and_Registration_of_FBOs() {
        return Total_Number_Licensing_and_Registration_of_FBOs;
    }

    public void setTotal_Number_Licensing_and_Registration_of_FBOs(String total_Number_Licensing_and_Registration_of_FBOs) {
        Total_Number_Licensing_and_Registration_of_FBOs = total_Number_Licensing_and_Registration_of_FBOs;
    }
}
