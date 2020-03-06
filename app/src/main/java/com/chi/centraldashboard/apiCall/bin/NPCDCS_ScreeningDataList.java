package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class NPCDCS_ScreeningDataList {
    @SerializedName("Under_Opportunistic_Screening_Total_persons_screened")
    @Expose
    private List<NPCDCS_Screening_Opportunistic> npcdcs_screening_opportunisticList = null;

    @SerializedName("Under_Outreach_Screening_Total_persons_screened")
    @Expose
    private List<NPCDCS_Screening_Outreach> npcdcs_screening_outreachList = null;




    public List<NPCDCS_Screening_Opportunistic> getNpcdcs_screening_opportunisticList() {
        return npcdcs_screening_opportunisticList;
    }

    public void setNpcdcs_screening_opportunisticList(List<NPCDCS_Screening_Opportunistic> npcdcs_screening_opportunisticList) {
        this.npcdcs_screening_opportunisticList = npcdcs_screening_opportunisticList;
    }

    public List<NPCDCS_Screening_Outreach> getNpcdcs_screening_outreachList() {
        return npcdcs_screening_outreachList;
    }

    public void setNpcdcs_screening_outreachList(List<NPCDCS_Screening_Outreach> npcdcs_screening_outreachList) {
        this.npcdcs_screening_outreachList = npcdcs_screening_outreachList;
    }



}
