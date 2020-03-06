package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class NVBDCP_LymphaticDataList {

    @SerializedName("Endemic_Districts")
    @Expose
    private List<NVBDCP_Lymphatic_Endemic> nvbdcp_lymphatic_endemicList=null;

    @SerializedName("Number_of_Districts_cleared_TAS")
    @Expose
    private List<NVBDCP_Lymphatic_TAS> nvbdcp_lymphatic_tasList=null;

    @SerializedName("Number_of_Districts_proposed_for_next_MDA")
    @Expose
    private List<NVBDCP_Lymphatic_MDA>nvbdcp_lymphatic_mdaList=null;

    @SerializedName("Number_of_Districts_proposed_for_next_IDA")
    @Expose
    private List<NVBDCP_Lymphatic_IDA>nvbdcp_lymphatic_idaList=null;


    public List<NVBDCP_Lymphatic_Endemic> getNvbdcp_lymphatic_endemicList() {
        return nvbdcp_lymphatic_endemicList;
    }

    public void setNvbdcp_lymphatic_endemicList(List<NVBDCP_Lymphatic_Endemic> nvbdcp_lymphatic_endemicList) {
        this.nvbdcp_lymphatic_endemicList = nvbdcp_lymphatic_endemicList;
    }

    public List<NVBDCP_Lymphatic_TAS> getNvbdcp_lymphatic_tasList() {
        return nvbdcp_lymphatic_tasList;
    }

    public void setNvbdcp_lymphatic_tasList(List<NVBDCP_Lymphatic_TAS> nvbdcp_lymphatic_tasList) {
        this.nvbdcp_lymphatic_tasList = nvbdcp_lymphatic_tasList;
    }

    public List<NVBDCP_Lymphatic_MDA> getNvbdcp_lymphatic_mdaList() {
        return nvbdcp_lymphatic_mdaList;
    }

    public void setNvbdcp_lymphatic_mdaList(List<NVBDCP_Lymphatic_MDA> nvbdcp_lymphatic_mdaList) {
        this.nvbdcp_lymphatic_mdaList = nvbdcp_lymphatic_mdaList;
    }

    public List<NVBDCP_Lymphatic_IDA> getNvbdcp_lymphatic_idaList() {
        return nvbdcp_lymphatic_idaList;
    }

    public void setNvbdcp_lymphatic_idaList(List<NVBDCP_Lymphatic_IDA> nvbdcp_lymphatic_idaList) {
        this.nvbdcp_lymphatic_idaList = nvbdcp_lymphatic_idaList;
    }
}
