package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NPCDCS_Screening_Opportunistic {

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


    @SerializedName("submitted_date")
    @Expose
    private String submitted_date;


    @SerializedName("updated_date")
    @Expose
    private String updated_date;


    @SerializedName("Under_Opportunistic_Screening_Total_persons_screened")
    @Expose
    private String Under_Opportunistic_Screening_Total_persons_screened;

    @SerializedName("Total_Under_Opportunistic_Screening_Total_persons_screened")
    @Expose
    private String Total_Under_Opportunistic_Screening_Total_persons_screened;


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

    public String getUnder_Opportunistic_Screening_Total_persons_screened() {
        return Under_Opportunistic_Screening_Total_persons_screened;
    }

    public void setUnder_Opportunistic_Screening_Total_persons_screened(String under_Opportunistic_Screening_Total_persons_screened) {
        Under_Opportunistic_Screening_Total_persons_screened = under_Opportunistic_Screening_Total_persons_screened;
    }

    public String getTotal_Under_Opportunistic_Screening_Total_persons_screened() {
        return Total_Under_Opportunistic_Screening_Total_persons_screened;
    }

    public void setTotal_Under_Opportunistic_Screening_Total_persons_screened(String total_Under_Opportunistic_Screening_Total_persons_screened) {
        Total_Under_Opportunistic_Screening_Total_persons_screened = total_Under_Opportunistic_Screening_Total_persons_screened;
    }
}
