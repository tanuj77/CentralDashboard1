package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class NVBDCP_DengueData {
    @SerializedName("Dengue")
    @Expose
    private List<NVBDCP_DengueDataList> nvbdcp_dengueDataListList = null;

    @SerializedName("NUMBER_OF_TOTAL_CASES")
    @Expose
    private List<NVBDCP_Dengue_TotalCases> nvbdcp_dengue_totalCasesList = null;

    @SerializedName("NUMBER_OF_DEATHS")
    @Expose
    private List<NVBDCP_Dengue_Deaths> nvbdcp_dengue_deathsList = null;


    @SerializedName("NO_OF_SENTINEL_SITES")
    @Expose
    private List<NVBDCP_Dengue_Sentinel> nvbdcp_dengue_sentinelList = null;


    @SerializedName("CASE_FATALITY_RATE")
    @Expose
    private List<NVBDCP_Dengue_Fatality> nvbdcp_dengue_fatalityList = null;


    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("status")
    @Expose
    private int status;

    public List<NVBDCP_DengueDataList> getNvbdcp_dengueDataListList() {
        return nvbdcp_dengueDataListList;
    }

    public void setNvbdcp_dengueDataListList(List<NVBDCP_DengueDataList> nvbdcp_dengueDataListList) {
        this.nvbdcp_dengueDataListList = nvbdcp_dengueDataListList;
    }

    public List<NVBDCP_Dengue_TotalCases> getNvbdcp_dengue_totalCasesList() {
        return nvbdcp_dengue_totalCasesList;
    }

    public void setNvbdcp_dengue_totalCasesList(List<NVBDCP_Dengue_TotalCases> nvbdcp_dengue_totalCasesList) {
        this.nvbdcp_dengue_totalCasesList = nvbdcp_dengue_totalCasesList;
    }

    public List<NVBDCP_Dengue_Deaths> getNvbdcp_dengue_deathsList() {
        return nvbdcp_dengue_deathsList;
    }

    public void setNvbdcp_dengue_deathsList(List<NVBDCP_Dengue_Deaths> nvbdcp_dengue_deathsList) {
        this.nvbdcp_dengue_deathsList = nvbdcp_dengue_deathsList;
    }

    public List<NVBDCP_Dengue_Sentinel> getNvbdcp_dengue_sentinelList() {
        return nvbdcp_dengue_sentinelList;
    }

    public void setNvbdcp_dengue_sentinelList(List<NVBDCP_Dengue_Sentinel> nvbdcp_dengue_sentinelList) {
        this.nvbdcp_dengue_sentinelList = nvbdcp_dengue_sentinelList;
    }

    public List<NVBDCP_Dengue_Fatality> getNvbdcp_dengue_fatalityList() {
        return nvbdcp_dengue_fatalityList;
    }

    public void setNvbdcp_dengue_fatalityList(List<NVBDCP_Dengue_Fatality> nvbdcp_dengue_fatalityList) {
        this.nvbdcp_dengue_fatalityList = nvbdcp_dengue_fatalityList;
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
