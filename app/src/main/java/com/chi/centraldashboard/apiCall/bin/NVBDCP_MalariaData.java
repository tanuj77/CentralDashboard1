package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class NVBDCP_MalariaData {
    @SerializedName("Malaria")
    @Expose
    private List<NVBDCP_MalariaDataList> nvbdcp_malariaDataListList = null;

    @SerializedName("No_of_Total_Cases")
    @Expose
    private List<NVBDCP_Malaria_TotalCases> nvbdcp_malaria_totalCasesList = null;

    @SerializedName("No_of_PF_Cases")
    @Expose
    private List<NVBDCP_Malaria_PFCases> nvbdcp_malaria_pfCasesList;


    @SerializedName("No_of_Deaths")
    @Expose
    private List<NVBDCP_Malaria_Deaths> nvbdcp_malaria_deathsList = null;

    @SerializedName("LLIN_Distribution")
    @Expose
    private List<NVBDCP_Malaria_LLIN> nvbdcp_malaria_llinList = null;

    @SerializedName("title")
    @Expose
    private String title;


    @SerializedName("status")
    @Expose
    private int status;


    public List<NVBDCP_MalariaDataList> getNvbdcp_malariaDataListList() {
        return nvbdcp_malariaDataListList;
    }

    public void setNvbdcp_malariaDataListList(List<NVBDCP_MalariaDataList> nvbdcp_malariaDataListList) {
        this.nvbdcp_malariaDataListList = nvbdcp_malariaDataListList;
    }

    public List<NVBDCP_Malaria_TotalCases> getNvbdcp_malaria_totalCasesList() {
        return nvbdcp_malaria_totalCasesList;
    }

    public void setNvbdcp_malaria_totalCasesList(List<NVBDCP_Malaria_TotalCases> nvbdcp_malaria_totalCasesList) {
        this.nvbdcp_malaria_totalCasesList = nvbdcp_malaria_totalCasesList;
    }

    public List<NVBDCP_Malaria_PFCases> getNvbdcp_malaria_pfCasesList() {
        return nvbdcp_malaria_pfCasesList;
    }

    public void setNvbdcp_malaria_pfCasesList(List<NVBDCP_Malaria_PFCases> nvbdcp_malaria_pfCasesList) {
        this.nvbdcp_malaria_pfCasesList = nvbdcp_malaria_pfCasesList;
    }

    public List<NVBDCP_Malaria_Deaths> getNvbdcp_malaria_deathsList() {
        return nvbdcp_malaria_deathsList;
    }

    public void setNvbdcp_malaria_deathsList(List<NVBDCP_Malaria_Deaths> nvbdcp_malaria_deathsList) {
        this.nvbdcp_malaria_deathsList = nvbdcp_malaria_deathsList;
    }

    public List<NVBDCP_Malaria_LLIN> getNvbdcp_malaria_llinList() {
        return nvbdcp_malaria_llinList;
    }

    public void setNvbdcp_malaria_llinList(List<NVBDCP_Malaria_LLIN> nvbdcp_malaria_llinList) {
        this.nvbdcp_malaria_llinList = nvbdcp_malaria_llinList;
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
