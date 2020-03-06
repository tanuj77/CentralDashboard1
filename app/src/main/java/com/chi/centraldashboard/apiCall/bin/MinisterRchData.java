package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MinisterRchData {
    @SerializedName("RCHData")
    @Expose
    private List<MinisterRchDataList> ministerRchDataListList=null;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("status")
    @Expose
    private Integer status;


    public List<MinisterRchDataList> getMinisterRchDataListList() {
        return ministerRchDataListList;
    }

    public void setMinisterRchDataListList(List<MinisterRchDataList> ministerRchDataListList) {
        this.ministerRchDataListList = ministerRchDataListList;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
