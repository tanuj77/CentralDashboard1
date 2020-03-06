package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CommunityProcess_RKSs {
    @SerializedName("SR_NO")
    @Expose
    private String SR_NO;

    @SerializedName("StateID")
    @Expose
    private String state_id;


    @SerializedName("State_Name")
    @Expose
    private String State_Name;

    @SerializedName("Number_of_RKSs")
    @Expose
    private String Number_of_RKSs;


    @SerializedName("total_number_of_PHC_CHC_SDH_DH")
    @Expose
    private String total_number_of_PHC_CHC_SDH_DH;

    @SerializedName("Total_Vacancies_of_Rogi_Kalyan_Samiti_RKSs_against_total_number_of_PHC_CHC_SDH_DH")
    @Expose
    private String Total_Vacancies_of_Rogi_Kalyan_Samiti_RKSs_against_total_number_of_PHC_CHC_SDH_DH;

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

    public String getNumber_of_RKSs() {
        return Number_of_RKSs;
    }

    public void setNumber_of_RKSs(String number_of_RKSs) {
        Number_of_RKSs = number_of_RKSs;
    }

    public String getTotal_number_of_PHC_CHC_SDH_DH() {
        return total_number_of_PHC_CHC_SDH_DH;
    }

    public void setTotal_number_of_PHC_CHC_SDH_DH(String total_number_of_PHC_CHC_SDH_DH) {
        this.total_number_of_PHC_CHC_SDH_DH = total_number_of_PHC_CHC_SDH_DH;
    }

    public String getTotal_Vacancies_of_Rogi_Kalyan_Samiti_RKSs_against_total_number_of_PHC_CHC_SDH_DH() {
        return Total_Vacancies_of_Rogi_Kalyan_Samiti_RKSs_against_total_number_of_PHC_CHC_SDH_DH;
    }

    public void setTotal_Vacancies_of_Rogi_Kalyan_Samiti_RKSs_against_total_number_of_PHC_CHC_SDH_DH(String total_Vacancies_of_Rogi_Kalyan_Samiti_RKSs_against_total_number_of_PHC_CHC_SDH_DH) {
        Total_Vacancies_of_Rogi_Kalyan_Samiti_RKSs_against_total_number_of_PHC_CHC_SDH_DH = total_Vacancies_of_Rogi_Kalyan_Samiti_RKSs_against_total_number_of_PHC_CHC_SDH_DH;
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
