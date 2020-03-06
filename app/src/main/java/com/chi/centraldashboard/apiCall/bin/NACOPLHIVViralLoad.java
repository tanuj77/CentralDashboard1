package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NACOPLHIVViralLoad {
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

    @SerializedName("Submitted_date")
    @Expose
    private String Submitted_date;



    @SerializedName("Updated_date")
    @Expose
    private String Updated_date;

    @SerializedName("Number_of_PLHIV_Tested_for_Viral_Load")
    @Expose
    private String Number_of_PLHIV_Tested_for_Viral_Load;

    @SerializedName("Total_Number_of_PLHIV_Tested_for_Viral_Load")
    @Expose
    private String Total_Number_of_PLHIV_Tested_for_Viral_Load;


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
        return Submitted_date;
    }

    public void setSubmitted_date(String submitted_date) {
        Submitted_date = submitted_date;
    }

    public String getUpdated_date() {
        return Updated_date;
    }

    public void setUpdated_date(String updated_date) {
        Updated_date = updated_date;
    }

    public String getNumber_of_PLHIV_Tested_for_Viral_Load() {
        return Number_of_PLHIV_Tested_for_Viral_Load;
    }

    public void setNumber_of_PLHIV_Tested_for_Viral_Load(String number_of_PLHIV_Tested_for_Viral_Load) {
        Number_of_PLHIV_Tested_for_Viral_Load = number_of_PLHIV_Tested_for_Viral_Load;
    }

    public String getTotal_Number_of_PLHIV_Tested_for_Viral_Load() {
        return Total_Number_of_PLHIV_Tested_for_Viral_Load;
    }

    public void setTotal_Number_of_PLHIV_Tested_for_Viral_Load(String total_Number_of_PLHIV_Tested_for_Viral_Load) {
        Total_Number_of_PLHIV_Tested_for_Viral_Load = total_Number_of_PLHIV_Tested_for_Viral_Load;
    }
}
