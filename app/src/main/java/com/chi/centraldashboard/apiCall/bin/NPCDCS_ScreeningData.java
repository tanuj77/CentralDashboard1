package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class NPCDCS_ScreeningData {
    @SerializedName("NPCDCS_Cumulative_Screening_data_for_current_year_2019_20")
    @Expose
    private List<NPCDCS_ScreeningDataList> npcdcs_screeningDataListList = null;

    @SerializedName("Under_Opportunistic_Screening_Total_persons_screened")
    @Expose
    private List<NPCDCS_Screening_Opportunistic> npcdcs_screening_opportunisticList = null;

    @SerializedName("Under_Outreach_Screening_Total_persons_screened")
    @Expose
    private List<NPCDCS_Screening_Outreach> npcdcs_screening_outreachList = null;


    @SerializedName("title")
    @Expose
    private String title;


    @SerializedName("status")
    @Expose
    private int status;


    public List<NPCDCS_ScreeningDataList> getNpcdcs_screeningDataListList() {
        return npcdcs_screeningDataListList;
    }

    public void setNpcdcs_screeningDataListList(List<NPCDCS_ScreeningDataList> npcdcs_screeningDataListList) {
        this.npcdcs_screeningDataListList = npcdcs_screeningDataListList;
    }

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
