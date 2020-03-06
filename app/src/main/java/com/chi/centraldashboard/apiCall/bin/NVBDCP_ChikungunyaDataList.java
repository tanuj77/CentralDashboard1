package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class NVBDCP_ChikungunyaDataList {
    @SerializedName("Total_Suspected_cases")
    @Expose
    private List<NVBDCP_Chikungunya_Suspected> nvbdcp_chikungunya_suspectedList=null;

    @SerializedName("Total_Confirmed_cases")
    @Expose
    private List<NVBDCP_Chikungunya_Confirmed>nvbdcp_chikungunya_confirmedList=null;

    @SerializedName("NO_OF_SENTINEL_SITES")
    @Expose
    private List<NVBDCP_Chikungunya_Sentinel>nvbdcp_chikungunya_sentinelList=null;


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
}
