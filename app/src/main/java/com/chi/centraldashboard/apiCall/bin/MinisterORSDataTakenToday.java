package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MinisterORSDataTakenToday {
    @SerializedName("SR_NO")
    @Expose
    private Integer SR_NO;

    @SerializedName("State_code")
    @Expose
    private Integer State_code;

    @SerializedName("State_Name")
    @Expose
    private String State_Name;

    @SerializedName("No_of_Appointments_Taken_Today")
    @Expose
    private Integer No_of_Appointments_Taken_Today;


    @SerializedName("Total_No_Of_Appointments_Taken_Today")
    @Expose
    private String Total_No_Of_Appointments_Taken_Today;

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

    public Integer getNo_of_Appointments_Taken_Today() {
        return No_of_Appointments_Taken_Today;
    }

    public void setNo_of_Appointments_Taken_Today(Integer no_of_Appointments_Taken_Today) {
        No_of_Appointments_Taken_Today = no_of_Appointments_Taken_Today;
    }

    public String getTotal_No_Of_Appointments_Taken_Today() {
        return Total_No_Of_Appointments_Taken_Today;
    }

    public void setTotal_No_Of_Appointments_Taken_Today(String total_No_Of_Appointments_Taken_Today) {
        Total_No_Of_Appointments_Taken_Today = total_No_Of_Appointments_Taken_Today;
    }

    public String getCreated_date() {
        return created_date;
    }

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }
}
