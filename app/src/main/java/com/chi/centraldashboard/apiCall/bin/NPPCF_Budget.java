package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NPPCF_Budget {
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

    @SerializedName("Budget_Allocation_in_Rs")
    @Expose
    private String Budget_Allocation_in_Rs;


    @SerializedName("Total_Budget_Allocation_for_Tertiary_Care_Component")
    @Expose
    private String Total_Budget_Allocation_for_Tertiary_Care_Component;

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

    public String getBudget_Allocation_in_Rs() {
        return Budget_Allocation_in_Rs;
    }

    public void setBudget_Allocation_in_Rs(String budget_Allocation_in_Rs) {
        Budget_Allocation_in_Rs = budget_Allocation_in_Rs;
    }

    public String getTotal_Budget_Allocation_for_Tertiary_Care_Component() {
        return Total_Budget_Allocation_for_Tertiary_Care_Component;
    }

    public void setTotal_Budget_Allocation_for_Tertiary_Care_Component(String total_Budget_Allocation_for_Tertiary_Care_Component) {
        Total_Budget_Allocation_for_Tertiary_Care_Component = total_Budget_Allocation_for_Tertiary_Care_Component;
    }
}
