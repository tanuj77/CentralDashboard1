package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MinisterFreeDSIDS {
    @SerializedName("SR_NO")
    @Expose
    private String SR_NO;


    @SerializedName("Year")
    @Expose
    private String Year;


    @SerializedName("Quarterly")
    @Expose
    private String Quarterly;

    @SerializedName("StateID")
    @Expose
    private String StateID;

    @SerializedName("State_Name")
    @Expose
    private String State_Name;

    @SerializedName("Status_of_Implementation_of_Free_Diagnostic_Services")
    @Expose
    private String Status_of_Implementation_of_Free_Diagnostic_Services;

    @SerializedName("Total_Number_of_States_UTs_implemented_Free_Diagnostics_Services")
    @Expose
    private String Total_Number_of_States_UTs_implemented_Free_Diagnostics_Services;

    @SerializedName("sumitted_date")
    @Expose
    private String sumitted_date;

    @SerializedName("updated_date")
    @Expose
    private String updated_date;


    public String getSR_NO() {
        return SR_NO;
    }

    public void setSR_NO(String SR_NO) {
        this.SR_NO = SR_NO;
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

    public String getStatus_of_Implementation_of_Free_Diagnostic_Services() {
        return Status_of_Implementation_of_Free_Diagnostic_Services;
    }

    public void setStatus_of_Implementation_of_Free_Diagnostic_Services(String status_of_Implementation_of_Free_Diagnostic_Services) {
        Status_of_Implementation_of_Free_Diagnostic_Services = status_of_Implementation_of_Free_Diagnostic_Services;
    }

    public String getTotal_Number_of_States_UTs_implemented_Free_Diagnostics_Services() {
        return Total_Number_of_States_UTs_implemented_Free_Diagnostics_Services;
    }

    public void setTotal_Number_of_States_UTs_implemented_Free_Diagnostics_Services(String total_Number_of_States_UTs_implemented_Free_Diagnostics_Services) {
        Total_Number_of_States_UTs_implemented_Free_Diagnostics_Services = total_Number_of_States_UTs_implemented_Free_Diagnostics_Services;
    }

    public String getSumitted_date() {
        return sumitted_date;
    }

    public void setSumitted_date(String sumitted_date) {
        this.sumitted_date = sumitted_date;
    }

    public String getUpdated_date() {
        return updated_date;
    }

    public void setUpdated_date(String updated_date) {
        this.updated_date = updated_date;
    }
}
