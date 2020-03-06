package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MinisterEHospitalRegistration {

    @SerializedName("SR_NO")
    @Expose
    private Integer SR_NO;

    @SerializedName("State_code")
    @Expose
    private Integer State_code;

    @SerializedName("State_Name")
    @Expose
    private String State_Name;


    @SerializedName("No_of_Total_Registration")
    @Expose
    private Integer No_of_Total_Registration;

    @SerializedName("Total_Registration")
    @Expose
    private String Total_Registration;


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

    public Integer getNo_of_Total_Registration() {
        return No_of_Total_Registration;
    }

    public void setNo_of_Total_Registration(Integer no_of_Total_Registration) {
        No_of_Total_Registration = no_of_Total_Registration;
    }

    public String getTotal_Registration() {
        return Total_Registration;
    }

    public void setTotal_Registration(String total_Registration) {
        Total_Registration = total_Registration;
    }

    public String getCreated_date() {
        return created_date;
    }

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }
}
