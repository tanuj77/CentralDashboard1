package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MinisterSonData {
    @SerializedName("SONData")
    @Expose
    private List<MinisterSONDataList> ministerSONDataListList=null;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("status")
    @Expose
    private Integer status;


    public List<MinisterSONDataList> getMinisterSONDataListList() {
        return ministerSONDataListList;
    }

    public void setMinisterSONDataListList(List<MinisterSONDataList> ministerSONDataListList) {
        this.ministerSONDataListList = ministerSONDataListList;
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
