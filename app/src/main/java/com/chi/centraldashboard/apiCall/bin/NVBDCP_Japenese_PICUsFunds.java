package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NVBDCP_Japenese_PICUsFunds {
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

    @SerializedName("NO_OF_PICUS_FOR_WHICH_FUNDS_PROVIDED")
    @Expose
    private String NO_OF_PICUS_FOR_WHICH_FUNDS_PROVIDED;

    @SerializedName("Total_No_of_PICUs_for_which_funds_provided")
    @Expose
    private String Total_No_of_PICUs_for_which_funds_provided;


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

    public String getNO_OF_PICUS_FOR_WHICH_FUNDS_PROVIDED() {
        return NO_OF_PICUS_FOR_WHICH_FUNDS_PROVIDED;
    }

    public void setNO_OF_PICUS_FOR_WHICH_FUNDS_PROVIDED(String NO_OF_PICUS_FOR_WHICH_FUNDS_PROVIDED) {
        this.NO_OF_PICUS_FOR_WHICH_FUNDS_PROVIDED = NO_OF_PICUS_FOR_WHICH_FUNDS_PROVIDED;
    }

    public String getTotal_No_of_PICUs_for_which_funds_provided() {
        return Total_No_of_PICUs_for_which_funds_provided;
    }

    public void setTotal_No_of_PICUs_for_which_funds_provided(String total_No_of_PICUs_for_which_funds_provided) {
        Total_No_of_PICUs_for_which_funds_provided = total_No_of_PICUs_for_which_funds_provided;
    }
}
