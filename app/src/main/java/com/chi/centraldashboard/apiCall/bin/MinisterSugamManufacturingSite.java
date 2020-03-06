package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MinisterSugamManufacturingSite {
    @SerializedName("SR_NO")
    @Expose
    private String SR_NO;

    @SerializedName("StateID")
    @Expose
    private String StateID;

    @SerializedName("State_Name")
    @Expose
    private String State_Name;


    @SerializedName("TotalApplication1")
    @Expose
    private String TotalApplication1;


    @SerializedName("Submitted")
    @Expose
    private String Submitted;

    @SerializedName("Approved")
    @Expose
    private String Approved;

    @SerializedName("Rejected")
    @Expose
    private String Rejected;

    @SerializedName("Total_Number_of_Manufacturing_Site")
    @Expose
    private String Total_Number_of_Manufacturing_Site;


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

    public String getTotalApplication1() {
        return TotalApplication1;
    }

    public void setTotalApplication1(String totalApplication1) {
        TotalApplication1 = totalApplication1;
    }

    public String getSubmitted() {
        return Submitted;
    }

    public void setSubmitted(String submitted) {
        Submitted = submitted;
    }

    public String getApproved() {
        return Approved;
    }

    public void setApproved(String approved) {
        Approved = approved;
    }

    public String getRejected() {
        return Rejected;
    }

    public void setRejected(String rejected) {
        Rejected = rejected;
    }

    public String getTotal_Number_of_Manufacturing_Site() {
        return Total_Number_of_Manufacturing_Site;
    }

    public void setTotal_Number_of_Manufacturing_Site(String total_Number_of_Manufacturing_Site) {
        Total_Number_of_Manufacturing_Site = total_Number_of_Manufacturing_Site;
    }
}
