package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class NVBDCP_ChikungunyaData {
    @SerializedName("Chikungunya")
    @Expose
    private List<NVBDCP_ChikungunyaDataList> nvbdcp_chikungunyaDataListList=null;

    @SerializedName("Total_Suspected_cases")
    @Expose
    private List<NVBDCP_Chikungunya_Suspected> nvbdcp_chikungunya_suspectedList=null;

    @SerializedName("Total_Confirmed_cases")
    @Expose
    private List<NVBDCP_Chikungunya_Confirmed>nvbdcp_chikungunya_confirmedList=null;

    @SerializedName("NO_OF_SENTINEL_SITES")
    @Expose
    private List<NVBDCP_Chikungunya_Sentinel>nvbdcp_chikungunya_sentinelList=null;



    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("status")
    @Expose
    private int status;


    public List<NVBDCP_ChikungunyaDataList> getNvbdcp_chikungunyaDataListList() {
        return nvbdcp_chikungunyaDataListList;
    }

    public void setNvbdcp_chikungunyaDataListList(List<NVBDCP_ChikungunyaDataList> nvbdcp_chikungunyaDataListList) {
        this.nvbdcp_chikungunyaDataListList = nvbdcp_chikungunyaDataListList;
    }

    public List<NVBDCP_Chikungunya_Suspected> getNvbdcp_chikungunya_suspectedList() {
        return nvbdcp_chikungunya_suspectedList;
    }

    public void setNvbdcp_chikungunya_suspectedList(List<NVBDCP_Chikungunya_Suspected> nvbdcp_chikungunya_suspectedList) {
        this.nvbdcp_chikungunya_suspectedList = nvbdcp_chikungunya_suspectedList;
    }

    public List<NVBDCP_Chikungunya_Confirmed> getNvbdcp_chikungunya_confirmedList() {
        return nvbdcp_chikungunya_confirmedList;
    }

    public void setNvbdcp_chikungunya_confirmedList(List<NVBDCP_Chikungunya_Confirmed> nvbdcp_chikungunya_confirmedList) {
        this.nvbdcp_chikungunya_confirmedList = nvbdcp_chikungunya_confirmedList;
    }

    public List<NVBDCP_Chikungunya_Sentinel> getNvbdcp_chikungunya_sentinelList() {
        return nvbdcp_chikungunya_sentinelList;
    }

    public void setNvbdcp_chikungunya_sentinelList(List<NVBDCP_Chikungunya_Sentinel> nvbdcp_chikungunya_sentinelList) {
        this.nvbdcp_chikungunya_sentinelList = nvbdcp_chikungunya_sentinelList;
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
