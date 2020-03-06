package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MinisterEHospitalOnboarded {

    @SerializedName("SR_NO")
    @Expose
    private Integer SR_NO;

    @SerializedName("State_code")
    @Expose
    private Integer State_code;

    @SerializedName("State_Name")
    @Expose
    private String State_Name;


    @SerializedName("No_of_Hospitals_On_boarded")
    @Expose
    private Integer No_of_Hospitals_On_boarded;

    @SerializedName("Total_No_of_Hospitals_Onboarded")
    @Expose
    private String Total_No_of_Hospitals_Onboarded;


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

    public Integer getNo_of_Hospitals_On_boarded() {
        return No_of_Hospitals_On_boarded;
    }

    public void setNo_of_Hospitals_On_boarded(Integer no_of_Hospitals_On_boarded) {
        No_of_Hospitals_On_boarded = no_of_Hospitals_On_boarded;
    }

    public String getTotal_No_of_Hospitals_Onboarded() {
        return Total_No_of_Hospitals_Onboarded;
    }

    public void setTotal_No_of_Hospitals_Onboarded(String total_No_of_Hospitals_Onboarded) {
        Total_No_of_Hospitals_Onboarded = total_No_of_Hospitals_Onboarded;
    }

    public String getCreated_date() {
        return created_date;
    }

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }
}
