package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NLEP_FemaleCases {
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


    @SerializedName("Quarter")
    @Expose
    private String Quarter;


    @SerializedName("submitted_date")
    @Expose
    private String submitted_date;



    @SerializedName("updated_date")
    @Expose
    private String updated_date;


    @SerializedName("No_of_Female_Cases")
    @Expose
    private String No_of_Female_Cases;


    @SerializedName("New_Cases_Detected")
    @Expose
    private String New_Cases_Detected;


    @SerializedName("Female_Cases_in_Percentage")
    @Expose
    private String Female_Cases_in_Percentage;


    @SerializedName("Total_No_of_Female_Cases_Percentage_in_New_cases")
    @Expose
    private String Total_No_of_Female_Cases_Percentage_in_New_cases;


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

    public String getQuarter() {
        return Quarter;
    }

    public void setQuarter(String quarter) {
        Quarter = quarter;
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

    public String getNo_of_Female_Cases() {
        return No_of_Female_Cases;
    }

    public void setNo_of_Female_Cases(String no_of_Female_Cases) {
        No_of_Female_Cases = no_of_Female_Cases;
    }

    public String getNew_Cases_Detected() {
        return New_Cases_Detected;
    }

    public void setNew_Cases_Detected(String new_Cases_Detected) {
        New_Cases_Detected = new_Cases_Detected;
    }

    public String getFemale_Cases_in_Percentage() {
        return Female_Cases_in_Percentage;
    }

    public void setFemale_Cases_in_Percentage(String female_Cases_in_Percentage) {
        Female_Cases_in_Percentage = female_Cases_in_Percentage;
    }

    public String getTotal_No_of_Female_Cases_Percentage_in_New_cases() {
        return Total_No_of_Female_Cases_Percentage_in_New_cases;
    }

    public void setTotal_No_of_Female_Cases_Percentage_in_New_cases(String total_No_of_Female_Cases_Percentage_in_New_cases) {
        Total_No_of_Female_Cases_Percentage_in_New_cases = total_No_of_Female_Cases_Percentage_in_New_cases;
    }
}
