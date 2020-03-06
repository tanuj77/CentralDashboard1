package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MinisterORSDataTotalAppointments {
    @SerializedName("SR_NO")
    @Expose
    private Integer SR_NO;

    @SerializedName("State_code")
    @Expose
    private Integer State_code;

    @SerializedName("State_Name")
    @Expose
    private String State_Name;

    @SerializedName("No_of_Total_Appointments")
    @Expose
    private Integer No_of_Total_Appointments;

    @SerializedName("Total_Appointments")
    @Expose
    private String Total_Appointments;


    @SerializedName("created_date")
    @Expose
    private String created_date;

    public Integer getSR_NO() {
        return SR_NO;
    }

    public void setSR_NO(Integer SR_NO) {
        this.SR_NO = SR_NO;
    }

    public Integer getState_code() {
        return State_code;
    }

    public void setState_code(Integer state_code) {
        State_code = state_code;
    }

    public String getState_Name() {
        return State_Name;
    }

    public void setState_Name(String state_Name) {
        State_Name = state_Name;
    }

    public Integer getNo_of_Total_Appointments() {
        return No_of_Total_Appointments;
    }

    public void setNo_of_Total_Appointments(Integer no_of_Total_Appointments) {
        No_of_Total_Appointments = no_of_Total_Appointments;
    }

    public String getTotal_Appointments() {
        return Total_Appointments;
    }

    public void setTotal_Appointments(String Total_Appointments) {
        Total_Appointments = Total_Appointments;
    }

    public String getCreated_date() {
        return created_date;
    }

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }
}
