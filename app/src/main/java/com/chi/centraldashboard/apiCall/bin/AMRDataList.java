package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AMRDataList {
    @SerializedName("Total_Labs_enrolled_under_the_AMR_Programme")
    @Expose
    private List<AMRProgramme> amrProgrammeList = null;

    @SerializedName("Total_Labs_reporting_AMR_surveillance_data")
    @Expose
    private List<AMRSurveillance> amrSurveillanceList = null;


    public List<AMRProgramme> getAmrProgrammeList() {
        return amrProgrammeList;
    }

    public void setAmrProgrammeList(List<AMRProgramme> amrProgrammeList) {
        this.amrProgrammeList = amrProgrammeList;
    }

    public List<AMRSurveillance> getAmrSurveillanceList() {
        return amrSurveillanceList;
    }

    public void setAmrSurveillanceList(List<AMRSurveillance> amrSurveillanceList) {
        this.amrSurveillanceList = amrSurveillanceList;
    }
}
