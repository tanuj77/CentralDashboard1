package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NTCPCOTPA {
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

    @SerializedName("Quarterly")
    @Expose
    private String Quarterly;

    @SerializedName("submitted_date")
    @Expose
    private String submitted_date;

    @SerializedName("updated_date")
    @Expose
    private String updated_date;

    @SerializedName("No_of_persons_fined_COTPA")
    @Expose
    private String No_of_persons_fined_COTPA;

    @SerializedName("Total_No_of_persons_fined_COTPA")
    @Expose
    private String Total_No_of_persons_fined_COTPA;


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

    public String getQuarterly() {
        return Quarterly;
    }

    public void setQuarterly(String quarterly) {
        Quarterly = quarterly;
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

    public String getNo_of_persons_fined_COTPA() {
        return No_of_persons_fined_COTPA;
    }

    public void setNo_of_persons_fined_COTPA(String no_of_persons_fined_COTPA) {
        No_of_persons_fined_COTPA = no_of_persons_fined_COTPA;
    }

    public String getTotal_No_of_persons_fined_COTPA() {
        return Total_No_of_persons_fined_COTPA;
    }

    public void setTotal_No_of_persons_fined_COTPA(String total_No_of_persons_fined_COTPA) {
        Total_No_of_persons_fined_COTPA = total_No_of_persons_fined_COTPA;
    }
}
