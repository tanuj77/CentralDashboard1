package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AmbulanceDataList {

    @SerializedName("Total_Advanced_Life_Support_ALS_Ambulances_Operational_against_Required")
    @Expose
    private List<AmbulanceALS> ambulanceALSList=null;

    @SerializedName("Total_Basic_Life_Support_BLS_Ambulances_Operational_against_Required")
    @Expose
    private List<AmbulanceBLS> ambulanceBLSList=null;

    @SerializedName("Average_response_time_call_to_scene_ALS_min_sec")
    @Expose
    private List<AmbulanceAvgALS> ambulanceAvgALSList=null;

    @SerializedName("Average_response_time_call_to_scene_BLS_min_sec")
    @Expose
    private List<AmbulanceAvgBLS> ambulanceAvgBLSList=null;


    public List<AmbulanceALS> getAmbulanceALSList() {
        return ambulanceALSList;
    }

    public void setAmbulanceALSList(List<AmbulanceALS> ambulanceALSList) {
        this.ambulanceALSList = ambulanceALSList;
    }

    public List<AmbulanceBLS> getAmbulanceBLSList() {
        return ambulanceBLSList;
    }

    public void setAmbulanceBLSList(List<AmbulanceBLS> ambulanceBLSList) {
        this.ambulanceBLSList = ambulanceBLSList;
    }

    public List<AmbulanceAvgALS> getAmbulanceAvgALSList() {
        return ambulanceAvgALSList;
    }

    public void setAmbulanceAvgALSList(List<AmbulanceAvgALS> ambulanceAvgALSList) {
        this.ambulanceAvgALSList = ambulanceAvgALSList;
    }

    public List<AmbulanceAvgBLS> getAmbulanceAvgBLSList() {
        return ambulanceAvgBLSList;
    }

    public void setAmbulanceAvgBLSList(List<AmbulanceAvgBLS> ambulanceAvgBLSList) {
        this.ambulanceAvgBLSList = ambulanceAvgBLSList;
    }
}
