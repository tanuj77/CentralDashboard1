package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NLEP_Grade2 {
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


    @SerializedName("No_of_G2D_cases")
    @Expose
    private String No_of_G2D_cases;


    @SerializedName("New_Cases_Detected")
    @Expose
    private String New_Cases_Detected;


    @SerializedName("Grade_II_Disability_G2D_cases_in_Percentage")
    @Expose
    private String Grade_II_Disability_G2D_cases_in_Percentage;


    @SerializedName("Total_Grade_II_Disability_G2D_cases_Percentage_in_New_Cases")
    @Expose
    private String Total_Grade_II_Disability_G2D_cases_Percentage_in_New_Cases;


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

    public String getNo_of_G2D_cases() {
        return No_of_G2D_cases;
    }

    public void setNo_of_G2D_cases(String no_of_G2D_cases) {
        No_of_G2D_cases = no_of_G2D_cases;
    }

    public String getNew_Cases_Detected() {
        return New_Cases_Detected;
    }

    public void setNew_Cases_Detected(String new_Cases_Detected) {
        New_Cases_Detected = new_Cases_Detected;
    }

    public String getGrade_II_Disability_G2D_cases_in_Percentage() {
        return Grade_II_Disability_G2D_cases_in_Percentage;
    }

    public void setGrade_II_Disability_G2D_cases_in_Percentage(String grade_II_Disability_G2D_cases_in_Percentage) {
        Grade_II_Disability_G2D_cases_in_Percentage = grade_II_Disability_G2D_cases_in_Percentage;
    }

    public String getTotal_Grade_II_Disability_G2D_cases_Percentage_in_New_Cases() {
        return Total_Grade_II_Disability_G2D_cases_Percentage_in_New_Cases;
    }

    public void setTotal_Grade_II_Disability_G2D_cases_Percentage_in_New_Cases(String total_Grade_II_Disability_G2D_cases_Percentage_in_New_Cases) {
        Total_Grade_II_Disability_G2D_cases_Percentage_in_New_Cases = total_Grade_II_Disability_G2D_cases_Percentage_in_New_Cases;
    }
}
