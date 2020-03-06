package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class StateData {
    @SerializedName("stateData")
    @Expose
    private List<StateDataList> stateDataListList = null;

    @SerializedName("title")
    @Expose
    private String title;


    @SerializedName("status")
    @Expose
    private Integer status;


    public List<StateDataList> getStateDataListList() {
        return stateDataListList;
    }

    public void setStateDataListList(List<StateDataList> stateDataListList) {
        this.stateDataListList = stateDataListList;
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
