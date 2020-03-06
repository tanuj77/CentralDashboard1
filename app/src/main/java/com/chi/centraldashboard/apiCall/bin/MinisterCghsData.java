package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MinisterCghsData {
    @SerializedName("CGHSData")
    @Expose
    private List<MinisterCghsDataList> ministerCghsDataListList=null;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("status")
    @Expose
    private Integer status;

    public List<MinisterCghsDataList> getMinisterCghsDataListList() {
        return ministerCghsDataListList;
    }

    public void setMinisterCghsDataListList(List<MinisterCghsDataList> ministerCghsDataListList) {
        this.ministerCghsDataListList = ministerCghsDataListList;
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
