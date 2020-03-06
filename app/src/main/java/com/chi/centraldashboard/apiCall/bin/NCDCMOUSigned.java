package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NCDCMOUSigned {
    @SerializedName("SR_NO")
    @Expose
    private String SR_NO;


    @SerializedName("StateID")
    @Expose
    private String state;


    @SerializedName("State_Name")
    @Expose
    private String State_Name;

    @SerializedName("Year")
    @Expose
    private String Year;

    @SerializedName("Quarter")
    @Expose
    private String Quarter;

    @SerializedName("submitted_date")
    @Expose
    private String submitted_date;

    @SerializedName("updated_date")
    @Expose
    private String updated_date;

    @SerializedName("date")
    @Expose
    private String date;


    @SerializedName("Total_MOU_Signed_Between_Govt_of_India_And_State_Govt")
    @Expose
    private String Total_MOU_Signed_Between_Govt_of_India_And_State_Govt;


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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTotal_MOU_Signed_Between_Govt_of_India_And_State_Govt() {
        return Total_MOU_Signed_Between_Govt_of_India_And_State_Govt;
    }

    public void setTotal_MOU_Signed_Between_Govt_of_India_And_State_Govt(String total_MOU_Signed_Between_Govt_of_India_And_State_Govt) {
        Total_MOU_Signed_Between_Govt_of_India_And_State_Govt = total_MOU_Signed_Between_Govt_of_India_And_State_Govt;
    }

    public String getSubmitted_date() {
        return submitted_date;
    }

    public void setSubmitted_date(String submitted_date) {
        this.submitted_date = submitted_date;
    }
}
