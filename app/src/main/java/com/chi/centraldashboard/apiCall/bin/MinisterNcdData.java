package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MinisterNcdData {
    @SerializedName("NCD_PBS_DATA")
    @Expose
    private List<MinisterNcdDataList> ministerNcdDataListList =null;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("status")
    @Expose
    private Integer status;


    public List<MinisterNcdDataList> getMinisterNcdDataListList() {
        return ministerNcdDataListList;
    }

    public void setMinisterNcdDataListList(List<MinisterNcdDataList> ministerNcdDataListList) {
        this.ministerNcdDataListList = ministerNcdDataListList;
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
