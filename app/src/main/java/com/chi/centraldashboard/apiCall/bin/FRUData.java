package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FRUData {
    @SerializedName("fru")
    @Expose
    private List<FRUDataList> fruDataListList = null;

    @SerializedName("Number_of_Fully_Operational_FRUs_5_C_section_Month_for_CHC_and_SDH_against_required_Number_of_FRUs")
    @Expose
    private List<FRU5CSection> fru5CSectionList = null;

    @SerializedName("Number_of_Fully_Operational_FRUs_10_C_section_Month_for_DH_against_required_Number_of_FRUs")
    @Expose
    private List<FRU10CSection> fru10CSectionList = null;


    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("status")
    @Expose
    private int status;


    public List<FRUDataList> getFruDataListList() {
        return fruDataListList;
    }

    public void setFruDataListList(List<FRUDataList> fruDataListList) {
        this.fruDataListList = fruDataListList;
    }

    public List<FRU5CSection> getFru5CSectionList() {
        return fru5CSectionList;
    }

    public void setFru5CSectionList(List<FRU5CSection> fru5CSectionList) {
        this.fru5CSectionList = fru5CSectionList;
    }

    public List<FRU10CSection> getFru10CSectionList() {
        return fru10CSectionList;
    }

    public void setFru10CSectionList(List<FRU10CSection> fru10CSectionList) {
        this.fru10CSectionList = fru10CSectionList;
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
