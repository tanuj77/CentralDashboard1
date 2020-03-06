package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NOTP_OrgansandTissues {
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


    @SerializedName("submitted_date")
    @Expose
    private String submitted_date;

    @SerializedName("updated_date")
    @Expose
    private String updated_date;


    @SerializedName("Total_Number_of_States_UTs_that_have_Adopted_Transplantation_of_Human_Organs_and_Tissues_Act")
    @Expose
    private String Total_Number_of_States_UTs_that_have_Adopted_Transplantation_of_Human_Organs_and_Tissues_Act;


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

    public String getTotal_Number_of_States_UTs_that_have_Adopted_Transplantation_of_Human_Organs_and_Tissues_Act() {
        return Total_Number_of_States_UTs_that_have_Adopted_Transplantation_of_Human_Organs_and_Tissues_Act;
    }

    public void setTotal_Number_of_States_UTs_that_have_Adopted_Transplantation_of_Human_Organs_and_Tissues_Act(String total_Number_of_States_UTs_that_have_Adopted_Transplantation_of_Human_Organs_and_Tissues_Act) {
        Total_Number_of_States_UTs_that_have_Adopted_Transplantation_of_Human_Organs_and_Tissues_Act = total_Number_of_States_UTs_that_have_Adopted_Transplantation_of_Human_Organs_and_Tissues_Act;
    }
}
