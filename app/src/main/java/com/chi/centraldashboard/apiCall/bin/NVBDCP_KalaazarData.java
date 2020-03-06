package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class NVBDCP_KalaazarData {
    @SerializedName("Kala_azar")
    @Expose
    private List<NVBDCP_KalaazarDataList>nvbdcp_kalaazarDataListList=null;

    @SerializedName("No_of_Total_Cases")
    @Expose
    private List<NVBDCP_Kalaazar_TotalCases>nvbdcp_kalaazar_totalCasesList=null;

    @SerializedName("No_of_PF_Cases")
    @Expose
    private List<NVBDCP_Kalaazar_PFCases>nvbdcp_kalaazar_pfCasesList=null;

    @SerializedName("No_of_Deaths")
    @Expose
    private List<NVBDCP_Kalaazar_Deaths>nvbdcp_kalaazar_deathsList=null;



    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("status")
    @Expose
    private int status;


    public List<NVBDCP_KalaazarDataList> getNvbdcp_kalaazarDataListList() {
        return nvbdcp_kalaazarDataListList;
    }

    public void setNvbdcp_kalaazarDataListList(List<NVBDCP_KalaazarDataList> nvbdcp_kalaazarDataListList) {
        this.nvbdcp_kalaazarDataListList = nvbdcp_kalaazarDataListList;
    }

    public List<NVBDCP_Kalaazar_TotalCases> getNvbdcp_kalaazar_totalCasesList() {
        return nvbdcp_kalaazar_totalCasesList;
    }

    public void setNvbdcp_kalaazar_totalCasesList(List<NVBDCP_Kalaazar_TotalCases> nvbdcp_kalaazar_totalCasesList) {
        this.nvbdcp_kalaazar_totalCasesList = nvbdcp_kalaazar_totalCasesList;
    }

    public List<NVBDCP_Kalaazar_PFCases> getNvbdcp_kalaazar_pfCasesList() {
        return nvbdcp_kalaazar_pfCasesList;
    }

    public void setNvbdcp_kalaazar_pfCasesList(List<NVBDCP_Kalaazar_PFCases> nvbdcp_kalaazar_pfCasesList) {
        this.nvbdcp_kalaazar_pfCasesList = nvbdcp_kalaazar_pfCasesList;
    }

    public List<NVBDCP_Kalaazar_Deaths> getNvbdcp_kalaazar_deathsList() {
        return nvbdcp_kalaazar_deathsList;
    }

    public void setNvbdcp_kalaazar_deathsList(List<NVBDCP_Kalaazar_Deaths> nvbdcp_kalaazar_deathsList) {
        this.nvbdcp_kalaazar_deathsList = nvbdcp_kalaazar_deathsList;
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
