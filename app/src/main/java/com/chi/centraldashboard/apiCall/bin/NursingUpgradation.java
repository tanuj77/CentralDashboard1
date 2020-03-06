package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NursingUpgradation {

    @SerializedName("SR_NO")
    @Expose
    private String SR_NO;

    @SerializedName("year")
    @Expose
    private String year;

    @SerializedName("Approved")
    @Expose
    private String Approved;


    @SerializedName("Functional")
    @Expose
    private String Functional;

    @SerializedName("Total_Number_of_Central_Sponsored_Upgradation_strengthening_of_Nursing_Services_ANM_GNM")
    @Expose
    private String Total_Number_of_Central_Sponsored_Upgradation_strengthening_of_Nursing_Services_ANM_GNM;

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

    public String getApproved() {
        return Approved;
    }

    public void setApproved(String approved) {
        Approved = approved;
    }

    public String getFunctional() {
        return Functional;
    }

    public void setFunctional(String functional) {
        Functional = functional;
    }

    public String getTotal_Number_of_Central_Sponsored_Upgradation_strengthening_of_Nursing_Services_ANM_GNM() {
        return Total_Number_of_Central_Sponsored_Upgradation_strengthening_of_Nursing_Services_ANM_GNM;
    }

    public void setTotal_Number_of_Central_Sponsored_Upgradation_strengthening_of_Nursing_Services_ANM_GNM(String total_Number_of_Central_Sponsored_Upgradation_strengthening_of_Nursing_Services_ANM_GNM) {
        Total_Number_of_Central_Sponsored_Upgradation_strengthening_of_Nursing_Services_ANM_GNM = total_Number_of_Central_Sponsored_Upgradation_strengthening_of_Nursing_Services_ANM_GNM;
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
