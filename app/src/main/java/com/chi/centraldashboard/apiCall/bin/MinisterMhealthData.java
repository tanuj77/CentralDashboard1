package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MinisterMhealthData {
    @SerializedName("mHealthData")
    @Expose
    private List<MinisterMhealthDataList> ministerMhealthDataLists = null;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("status")
    @Expose
    private Integer status;


    public List<MinisterMhealthDataList> getMinisterMhealthDataLists() {
        return ministerMhealthDataLists;
    }

    public void setMinisterMhealthDataLists(List<MinisterMhealthDataList> ministerMhealthDataLists) {
        this.ministerMhealthDataLists = ministerMhealthDataLists;
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
