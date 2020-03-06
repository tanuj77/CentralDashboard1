package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NCDCLeaseDeed {
    @SerializedName("SR_NO")
    @Expose
    private String SR_NO;


    @SerializedName("Year")
    @Expose
    private String Year;

    @SerializedName("Quarter")
    @Expose
    private String Quarter;

    @SerializedName("StateID")
    @Expose
    private String state;


    @SerializedName("State_Name")
    @Expose
    private String State_Name;


    @SerializedName("submitted_date")
    @Expose
    private String submitted_date;

    @SerializedName("updated_date")
    @Expose
    private String updated_date;

    @SerializedName("date")
    @Expose
    private String date;


    @SerializedName("typess")
    @Expose
    private String typess;


    @SerializedName("Total_Lease_Deed_Signed_Land_Transfered")
    @Expose
    private String Total_Lease_Deed_Signed_Land_Transfered;





    public String getSR_NO() {
        return SR_NO;
    }

    public void setSR_NO(String SR_NO) {
        this.SR_NO = SR_NO;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState_Name() {
        return State_Name;
    }

    public void setState_Name(String state_Name) {
        State_Name = state_Name;
    }

    public String getTypess() {
        return typess;
    }

    public void setTypess(String typess) {
        this.typess = typess;
    }

    public String getTotal_Lease_Deed_Signed_Land_Transfered() {
        return Total_Lease_Deed_Signed_Land_Transfered;
    }

    public void setTotal_Lease_Deed_Signed_Land_Transfered(String total_Lease_Deed_Signed_Land_Transfered) {
        Total_Lease_Deed_Signed_Land_Transfered = total_Lease_Deed_Signed_Land_Transfered;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
