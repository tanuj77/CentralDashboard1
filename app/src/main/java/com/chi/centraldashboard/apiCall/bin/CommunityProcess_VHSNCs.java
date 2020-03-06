package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CommunityProcess_VHSNCs {
    @SerializedName("SR_NO")
    @Expose
    private String SR_NO;

    @SerializedName("StateID")
    @Expose
    private String state_id;

    @SerializedName("State_Name")
    @Expose
    private String State_Name;

    @SerializedName("Number_of_VHNSCs_formed")
    @Expose
    private String Number_of_VHNSCs_formed;


    @SerializedName("number_of_villages")
    @Expose
    private String number_of_villages;

    @SerializedName("Total_Number_of_VHSNCs_formed_against_number_of_revenue_villages")
    @Expose
    private String Total_Number_of_VHSNCs_formed_against_number_of_revenue_villages;

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

    public String getNumber_of_VHNSCs_formed() {
        return Number_of_VHNSCs_formed;
    }

    public void setNumber_of_VHNSCs_formed(String number_of_VHNSCs_formed) {
        Number_of_VHNSCs_formed = number_of_VHNSCs_formed;
    }

    public String getNumber_of_villages() {
        return number_of_villages;
    }

    public void setNumber_of_villages(String number_of_villages) {
        this.number_of_villages = number_of_villages;
    }

    public String getTotal_Number_of_VHSNCs_formed_against_number_of_revenue_villages() {
        return Total_Number_of_VHSNCs_formed_against_number_of_revenue_villages;
    }

    public void setTotal_Number_of_VHSNCs_formed_against_number_of_revenue_villages(String total_Number_of_VHSNCs_formed_against_number_of_revenue_villages) {
        Total_Number_of_VHSNCs_formed_against_number_of_revenue_villages = total_Number_of_VHSNCs_formed_against_number_of_revenue_villages;
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
