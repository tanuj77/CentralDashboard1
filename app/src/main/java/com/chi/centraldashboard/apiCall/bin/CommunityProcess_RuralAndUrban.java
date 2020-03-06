package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CommunityProcess_RuralAndUrban {
    @SerializedName("SR_NO")
    @Expose
    private String SR_NO;

    @SerializedName("StateID")
    @Expose
    private String state_id;

    @SerializedName("State_Name")
    @Expose
    private String State_Name;

    @SerializedName("No_of_ASHAs_in_position")
    @Expose
    private String No_of_ASHAs_in_position;


    @SerializedName("approved")
    @Expose
    private String approved;

    @SerializedName("Total_Number_of_ASHAs_in_position_against_approved_strength_Both_in_rural_and_urban_areas")
    @Expose
    private String Number_of_ASHAs_in_position_against_approved_strength_Both_in_rural_and_urban_areas;

    @SerializedName("submitted_date")
    @Expose
    private String submitted_date;



    @SerializedName("Year")
    @Expose
    private String Year;

    @SerializedName("Quarter")
    @Expose
    private String Quarter;

    @SerializedName("updated_date")
    @Expose
    private String updated_date;



    public String getSR_NO() {
        return SR_NO;
    }

    public void setSR_NO(String SR_NO) {
        this.SR_NO = SR_NO;
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

    public String getNo_of_ASHAs_in_position() {
        return No_of_ASHAs_in_position;
    }

    public void setNo_of_ASHAs_in_position(String no_of_ASHAs_in_position) {
        No_of_ASHAs_in_position = no_of_ASHAs_in_position;
    }

    public String getApproved() {
        return approved;
    }

    public void setApproved(String approved) {
        this.approved = approved;
    }

    public String getNumber_of_ASHAs_in_position_against_approved_strength_Both_in_rural_and_urban_areas() {
        return Number_of_ASHAs_in_position_against_approved_strength_Both_in_rural_and_urban_areas;
    }

    public void setNumber_of_ASHAs_in_position_against_approved_strength_Both_in_rural_and_urban_areas(String number_of_ASHAs_in_position_against_approved_strength_Both_in_rural_and_urban_areas) {
        Number_of_ASHAs_in_position_against_approved_strength_Both_in_rural_and_urban_areas = number_of_ASHAs_in_position_against_approved_strength_Both_in_rural_and_urban_areas;
    }

    public String getSubmitted_date() {
        return submitted_date;
    }

    public void setSubmitted_date(String submitted_date) {
        this.submitted_date = submitted_date;
    }


    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    public String getQuarter() {
        return Quarter;
    }

    public void setQuarter(String quarter) {
        Quarter = quarter;
    }

    public String getUpdated_date() {
        return updated_date;
    }

    public void setUpdated_date(String updated_date) {
        this.updated_date = updated_date;
    }
}
