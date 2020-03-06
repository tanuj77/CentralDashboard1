package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MinisterPbsData {
    @SerializedName("PBS/NCD")
    @Expose
    private List<MinisterPbsDataList>ministerPbsDataListList = null;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("status")
    @Expose
    private Integer status;


    public List<MinisterPbsDataList> getMinisterPbsDataListList() {
        return ministerPbsDataListList;
    }

    public void setMinisterPbsDataListList(List<MinisterPbsDataList> ministerPbsDataListList) {
        this.ministerPbsDataListList = ministerPbsDataListList;
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
