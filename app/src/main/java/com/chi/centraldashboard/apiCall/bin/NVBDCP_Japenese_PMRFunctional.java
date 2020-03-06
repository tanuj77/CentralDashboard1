package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NVBDCP_Japenese_PMRFunctional {
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

    @SerializedName("Month")
    @Expose
    private String Month;

    @SerializedName("submitted_date")
    @Expose
    private String submitted_date;



    @SerializedName("updated_date")
    @Expose
    private String updated_date;

    @SerializedName("NO_OF_PMRS_FUNCTIONAL")
    @Expose
    private String NO_OF_PMRS_FUNCTIONAL;

    @SerializedName("Total_No_of_PMRs_functional")
    @Expose
    private String Total_No_of_PMRs_functional;


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

    public String getMonth() {
        return Month;
    }

    public void setMonth(String month) {
        Month = month;
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

    public String getNO_OF_PMRS_FUNCTIONAL() {
        return NO_OF_PMRS_FUNCTIONAL;
    }

    public void setNO_OF_PMRS_FUNCTIONAL(String NO_OF_PMRS_FUNCTIONAL) {
        this.NO_OF_PMRS_FUNCTIONAL = NO_OF_PMRS_FUNCTIONAL;
    }

    public String getTotal_No_of_PMRs_functional() {
        return Total_No_of_PMRs_functional;
    }

    public void setTotal_No_of_PMRs_functional(String total_No_of_PMRs_functional) {
        Total_No_of_PMRs_functional = total_No_of_PMRs_functional;
    }
}
