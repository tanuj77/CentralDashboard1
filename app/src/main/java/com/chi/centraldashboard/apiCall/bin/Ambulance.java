package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Ambulance {
    @SerializedName("ambl")
    @Expose
    private List<AmbulanceDataList> ambulanceDataListList=null;

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


    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("status")
    @Expose
    private int status;


    public List<AmbulanceDataList> getAmbulanceDataListList() {
        return ambulanceDataListList;
    }

    public void setAmbulanceDataListList(List<AmbulanceDataList> ambulanceDataListList) {
        this.ambulanceDataListList = ambulanceDataListList;
    }

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
