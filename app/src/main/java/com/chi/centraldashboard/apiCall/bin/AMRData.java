package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AMRData {
    @SerializedName("AmrData")
    @Expose
    private List<AMRDataList> amrDataListList = null;

    @SerializedName("Total_Labs_enrolled_under_the_AMR_Programme")
    @Expose
    private List<AMRProgramme> amrProgrammeList = null;

    @SerializedName("Total_Labs_reporting_AMR_surveillance_data")
    @Expose
    private List<AMRSurveillance> amrSurveillanceList = null;


    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("status")
    @Expose
    private int status;


    public List<AMRDataList> getAmrDataListList() {
        return amrDataListList;
    }

    public void setAmrDataListList(List<AMRDataList> amrDataListList) {
        this.amrDataListList = amrDataListList;
    }

    public List<AMRSurveillance> getAmrSurveillanceList() {
        return amrSurveillanceList;
    }

    public void setAmrSurveillanceList(List<AMRSurveillance> amrSurveillanceList) {
        this.amrSurveillanceList = amrSurveillanceList;
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
