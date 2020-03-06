package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NPCDCS_Infra_NCDCells {
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

    @SerializedName("District_NCD_Cells_Functional")
    @Expose
    private String District_NCD_Cells_Functional;

    @SerializedName("Total_District_NCD_Cells_Functional")
    @Expose
    private String Total_District_NCD_Cells_Functional;


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

    public String getDistrict_NCD_Cells_Functional() {
        return District_NCD_Cells_Functional;
    }

    public void setDistrict_NCD_Cells_Functional(String district_NCD_Cells_Functional) {
        District_NCD_Cells_Functional = district_NCD_Cells_Functional;
    }

    public String getTotal_District_NCD_Cells_Functional() {
        return Total_District_NCD_Cells_Functional;
    }

    public void setTotal_District_NCD_Cells_Functional(String total_District_NCD_Cells_Functional) {
        Total_District_NCD_Cells_Functional = total_District_NCD_Cells_Functional;
    }
}
