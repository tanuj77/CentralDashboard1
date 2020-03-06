package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CommunityProcess_MAS {
    @SerializedName("SR_NO")
    @Expose
    private String SR_NO;

    @SerializedName("StateID")
    @Expose
    private String state_id;

    @SerializedName("State_Name")
    @Expose
    private String State_Name;

    @SerializedName("number_of_MAS_created")
    @Expose
    private String number_of_MAS_created;


    @SerializedName("number_of_MAS_approved")
    @Expose
    private String number_of_MAS_approved;

    @SerializedName("Total_Percentage_of_MAS_created_against_approved")
    @Expose
    private String Total_Percentage_of_MAS_created_against_approved;

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

    public String getNumber_of_MAS_created() {
        return number_of_MAS_created;
    }

    public void setNumber_of_MAS_created(String number_of_MAS_created) {
        this.number_of_MAS_created = number_of_MAS_created;
    }

    public String getNumber_of_MAS_approved() {
        return number_of_MAS_approved;
    }

    public void setNumber_of_MAS_approved(String number_of_MAS_approved) {
        this.number_of_MAS_approved = number_of_MAS_approved;
    }

    public String getTotal_Percentage_of_MAS_created_against_approved() {
        return Total_Percentage_of_MAS_created_against_approved;
    }

    public void setTotal_Percentage_of_MAS_created_against_approved(String total_Percentage_of_MAS_created_against_approved) {
        Total_Percentage_of_MAS_created_against_approved = total_Percentage_of_MAS_created_against_approved;
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
