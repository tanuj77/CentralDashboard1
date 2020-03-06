package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CommunityProcess_DBT {
    @SerializedName("SR_NO")
    @Expose
    private String SR_NO;

    @SerializedName("StateID")
    @Expose
    private String state_id;

    @SerializedName("State_Name")
    @Expose
    private String State_Name;

    @SerializedName("Number_of_ASHA_Honorarium_who_Paid_through_DBT")
    @Expose
    private String ASha_As_whose_honorarium;


    @SerializedName("No_of_ASHAs_in_position")
    @Expose
    private String No_of_ASHAs_in_position;

    @SerializedName("Total_Percentage_of_ASHAs_whose_Honorarium_is_Paid_through_DBT")
    @Expose
    private String Total_Percentage_of_ASHAs_whose_Honorarium_is_Paid_through_DBT;

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

    public String getASha_As_whose_honorarium() {
        return ASha_As_whose_honorarium;
    }

    public void setASha_As_whose_honorarium(String ASha_As_whose_honorarium) {
        this.ASha_As_whose_honorarium = ASha_As_whose_honorarium;
    }

    public String getNo_of_ASHAs_in_position() {
        return No_of_ASHAs_in_position;
    }

    public void setNo_of_ASHAs_in_position(String no_of_ASHAs_in_position) {
        No_of_ASHAs_in_position = no_of_ASHAs_in_position;
    }

    public String getTotal_Percentage_of_ASHAs_whose_Honorarium_is_Paid_through_DBT() {
        return Total_Percentage_of_ASHAs_whose_Honorarium_is_Paid_through_DBT;
    }

    public void setTotal_Percentage_of_ASHAs_whose_Honorarium_is_Paid_through_DBT(String total_Percentage_of_ASHAs_whose_Honorarium_is_Paid_through_DBT) {
        Total_Percentage_of_ASHAs_whose_Honorarium_is_Paid_through_DBT = total_Percentage_of_ASHAs_whose_Honorarium_is_Paid_through_DBT;
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
