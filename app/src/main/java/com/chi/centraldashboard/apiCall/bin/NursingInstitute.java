package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NursingInstitute {

    @SerializedName("SR_NO")
    @Expose
    private String SR_NO;

    @SerializedName("year")
    @Expose
    private String year;

    @SerializedName("Indian_Nursing_Councile")
    @Expose
    private String Indian_Nursing_Councile;

    @SerializedName("RAK_College_of_Nursing_est_1946")
    @Expose
    private String RAK_College_of_Nursing_est_1946;


    @SerializedName("Lady_Reading_Health_School_est_1918")
    @Expose
    private String Lady_Reading_Health_School_est_1918;

    @SerializedName("Nursing_Institute")
    @Expose
    private String Nursing_Institute;

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

    public String getIndian_Nursing_Councile() {
        return Indian_Nursing_Councile;
    }

    public void setIndian_Nursing_Councile(String indian_Nursing_Councile) {
        Indian_Nursing_Councile = indian_Nursing_Councile;
    }

    public String getRAK_College_of_Nursing_est_1946() {
        return RAK_College_of_Nursing_est_1946;
    }

    public void setRAK_College_of_Nursing_est_1946(String RAK_College_of_Nursing_est_1946) {
        this.RAK_College_of_Nursing_est_1946 = RAK_College_of_Nursing_est_1946;
    }

    public String getLady_Reading_Health_School_est_1918() {
        return Lady_Reading_Health_School_est_1918;
    }

    public void setLady_Reading_Health_School_est_1918(String lady_Reading_Health_School_est_1918) {
        Lady_Reading_Health_School_est_1918 = lady_Reading_Health_School_est_1918;
    }

    public String getNursing_Institute() {
        return Nursing_Institute;
    }

    public void setNursing_Institute(String nursing_Institute) {
        Nursing_Institute = nursing_Institute;
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
