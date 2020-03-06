package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AmbulanceAvgALS {
    @SerializedName("SR_NO")
    @Expose
    private String SR_NO;


    @SerializedName("StateID")
    @Expose
    private String StateID;

    @SerializedName("State_Name")
    @Expose
    private String State_Name;


    @SerializedName("Average_Response_Time_call_to_scene_ALS_min_sec")
    @Expose
    private String Average_Response_Time_call_to_scene_ALS_min_sec;

    @SerializedName("kpi_Average_response_time_call_to_scene_ALS_min_sec")
    @Expose
    private String kpi_Average_response_time_call_to_scene_ALS_min_sec;

    @SerializedName("updated_date")
    @Expose
    private String updated_date;

    @SerializedName("submitted_date")
    @Expose
    private String submitted_date;

    @SerializedName("Year")
    @Expose
    private String Year;

    @SerializedName("Quarter")
    @Expose
    private String Quarter;


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

    public String getAverage_Response_Time_call_to_scene_ALS_min_sec() {
        return Average_Response_Time_call_to_scene_ALS_min_sec;
    }

    public void setAverage_Response_Time_call_to_scene_ALS_min_sec(String average_Response_Time_call_to_scene_ALS_min_sec) {
        Average_Response_Time_call_to_scene_ALS_min_sec = average_Response_Time_call_to_scene_ALS_min_sec;
    }

    public String getKpi_Average_response_time_call_to_scene_ALS_min_sec() {
        return kpi_Average_response_time_call_to_scene_ALS_min_sec;
    }

    public void setKpi_Average_response_time_call_to_scene_ALS_min_sec(String kpi_Average_response_time_call_to_scene_ALS_min_sec) {
        this.kpi_Average_response_time_call_to_scene_ALS_min_sec = kpi_Average_response_time_call_to_scene_ALS_min_sec;
    }

    public String getUpdated_date() {
        return updated_date;
    }

    public void setUpdated_date(String updated_date) {
        this.updated_date = updated_date;
    }

    public String getSubmitted_date() {
        return submitted_date;
    }

    public void setSubmitted_date(String submitted_date) {
        this.submitted_date = submitted_date;
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
}
