package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NTCPPersonQuit {
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

    @SerializedName("Quarterly")
    @Expose
    private String Quarterly;

    @SerializedName("submitted_date")
    @Expose
    private String submitted_date;

    @SerializedName("updated_date")
    @Expose
    private String updated_date;

    @SerializedName("No_of_persons_who_have_quit")
    @Expose
    private String No_of_persons_who_have_quit;

    @SerializedName("Total_No_of_persons_who_have_quit")
    @Expose
    private String Total_No_of_persons_who_have_quit;


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

    public String getQuarterly() {
        return Quarterly;
    }

    public void setQuarterly(String quarterly) {
        Quarterly = quarterly;
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

    public String getNo_of_persons_who_have_quit() {
        return No_of_persons_who_have_quit;
    }

    public void setNo_of_persons_who_have_quit(String no_of_persons_who_have_quit) {
        No_of_persons_who_have_quit = no_of_persons_who_have_quit;
    }

    public String getTotal_No_of_persons_who_have_quit() {
        return Total_No_of_persons_who_have_quit;
    }

    public void setTotal_No_of_persons_who_have_quit(String total_No_of_persons_who_have_quit) {
        Total_No_of_persons_who_have_quit = total_No_of_persons_who_have_quit;
    }
}
