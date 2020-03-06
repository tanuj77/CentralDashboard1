package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FamilyPlaningPPIUCD {
    @SerializedName("SR_NO")
    @Expose
    private String SR_NO;

    @SerializedName("year")
    @Expose
    private String year;

    @SerializedName("quarterly")
    @Expose
    private String quarterly;

    @SerializedName("state_id")
    @Expose
    private String state_id;

    @SerializedName("State_Name")
    @Expose
    private String State_Name;

    @SerializedName("ppiucd_insertion_no")
    @Expose
    private String ppiucd_insertion_no;

    @SerializedName("institution_delivery")
    @Expose
    private String total_institution_delivery;

    @SerializedName("acceptance_rate_100_beds")
    @Expose
    private String acceptance_rate_100_beds;

    @SerializedName("Total_Post_Partum_Intrauterine_Copper_Device_PPIUCD_Acceptance_Rate_Public")
    @Expose
    private String Total_Post_Partum_Intrauterine_Copper_Device_PPIUCD_Acceptance_Rate_Public;

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

    public String getQuarterly() {
        return quarterly;
    }

    public void setQuarterly(String quarterly) {
        this.quarterly = quarterly;
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

    public String getPpiucd_insertion_no() {
        return ppiucd_insertion_no;
    }

    public void setPpiucd_insertion_no(String ppiucd_insertion_no) {
        this.ppiucd_insertion_no = ppiucd_insertion_no;
    }

    public String getTotal_institution_delivery() {
        return total_institution_delivery;
    }

    public void setTotal_institution_delivery(String total_institution_delivery) {
        this.total_institution_delivery = total_institution_delivery;
    }

    public String getAcceptance_rate_100_beds() {
        return acceptance_rate_100_beds;
    }

    public void setAcceptance_rate_100_beds(String acceptance_rate_100_beds) {
        this.acceptance_rate_100_beds = acceptance_rate_100_beds;
    }

    public String getPost_Partum_Intrauterine_Copper_Device_PPIUCD_Acceptance_Rate_Public() {
        return Total_Post_Partum_Intrauterine_Copper_Device_PPIUCD_Acceptance_Rate_Public;
    }

    public void setPost_Partum_Intrauterine_Copper_Device_PPIUCD_Acceptance_Rate_Public(String Total_Post_Partum_Intrauterine_Copper_Device_PPIUCD_Acceptance_Rate_Public) {
        Total_Post_Partum_Intrauterine_Copper_Device_PPIUCD_Acceptance_Rate_Public = Total_Post_Partum_Intrauterine_Copper_Device_PPIUCD_Acceptance_Rate_Public;
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
