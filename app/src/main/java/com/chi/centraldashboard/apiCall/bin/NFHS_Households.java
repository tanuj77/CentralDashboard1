package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NFHS_Households {
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

    @SerializedName("Rural")
    @Expose
    private String Rural;

    @SerializedName("Urban")
    @Expose
    private String Urban;

    @SerializedName("Total")
    @Expose
    private String Total;

    @SerializedName("Total_Percentage_of_households_with_any_member_covered_under_insurance")
    @Expose
    private String Total_Percentage_of_households_with_any_member_covered_under_insurance;


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

    public String getRural() {
        return Rural;
    }

    public void setRural(String rural) {
        Rural = rural;
    }

    public String getUrban() {
        return Urban;
    }

    public void setUrban(String urban) {
        Urban = urban;
    }

    public String getTotal() {
        return Total;
    }

    public void setTotal(String total) {
        Total = total;
    }

    public String getTotal_Percentage_of_households_with_any_member_covered_under_insurance() {
        return Total_Percentage_of_households_with_any_member_covered_under_insurance;
    }

    public void setTotal_Percentage_of_households_with_any_member_covered_under_insurance(String total_Percentage_of_households_with_any_member_covered_under_insurance) {
        Total_Percentage_of_households_with_any_member_covered_under_insurance = total_Percentage_of_households_with_any_member_covered_under_insurance;
    }
}
