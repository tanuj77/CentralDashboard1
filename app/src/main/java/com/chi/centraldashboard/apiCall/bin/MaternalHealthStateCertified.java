package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MaternalHealthStateCertified {
    @SerializedName("SR_NO")
    @Expose
    private String SR_NO;

    @SerializedName("year")
    @Expose
    private String year;


    @SerializedName("quarterly")
    @Expose
    private String quarterly;

    @SerializedName("state_id")
    @Expose
    private String state_id;

    @SerializedName("State_Name")
    @Expose
    private String State_Name;


    @SerializedName("lr_and_ot_state")
    @Expose
    private String lr_and_ot_state;

    @SerializedName("Total_Labour_Rooms_and_Operation_Theatres_state")
    @Expose
    private String Total_Labour_Rooms_and_Operation_Theatres_state;

    @SerializedName("submitted_date")
    @Expose
    private String submitted_date;


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
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getQuarterly() {
        return quarterly;
    }

    public void setQuarterly(String quarterly) {
        this.quarterly = quarterly;
    }

    public String getState_id() {
        return state_id;
    }

    public void setState_id(String state_id) {
        this.state_id = state_id;
    }

    public String getState_Name() {
        return State_Name;
    }

    public void setState_Name(String state_Name) {
        State_Name = state_Name;
    }

    public String getLr_and_ot_state() {
        return lr_and_ot_state;
    }

    public void setLr_and_ot_state(String lr_and_ot_state) {
        this.lr_and_ot_state = lr_and_ot_state;
    }

    public String getTotal_Labour_Rooms_and_Operation_Theatres_state() {
        return Total_Labour_Rooms_and_Operation_Theatres_state;
    }

    public void setTotal_Labour_Rooms_and_Operation_Theatres_state(String total_Labour_Rooms_and_Operation_Theatres_state) {
        Total_Labour_Rooms_and_Operation_Theatres_state = total_Labour_Rooms_and_Operation_Theatres_state;
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
}
