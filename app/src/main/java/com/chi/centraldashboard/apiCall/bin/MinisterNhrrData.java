package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MinisterNhrrData {
    @SerializedName("NHRRData")
    @Expose
    private List<MinisterNhrrDataList> ministerNhrrDataListList = null;

    @SerializedName("Statewise")
    @Expose
    private List<MinisterNhrrDataStatewise> ministerNhrrDataStatewisetList = null;

    @SerializedName("Typewise")
    @Expose
    private List<MinisterNhrrDataTypewise> ministerNhrrDataTypewiseList = null;


    @SerializedName("title")
    @Expose
    private String message;

    @SerializedName("status")
    @Expose
    private Integer status;

    public List<MinisterNhrrDataList> getMinisterNhrrDataListList() {
        return ministerNhrrDataListList;
    }

    public void setMinisterNhrrDataListList(List<MinisterNhrrDataList> ministerNhrrDataListList) {
        this.ministerNhrrDataListList = ministerNhrrDataListList;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }


    public List<MinisterNhrrDataStatewise> getMinisterNhrrDataStatewisetList() {
        return ministerNhrrDataStatewisetList;
    }

    public void setMinisterNhrrDataStatewisetList(List<MinisterNhrrDataStatewise> ministerNhrrDataStatewisetList) {
        this.ministerNhrrDataStatewisetList = ministerNhrrDataStatewisetList;
    }

    public List<MinisterNhrrDataTypewise> getMinisterNhrrDataTypewiseList() {
        return ministerNhrrDataTypewiseList;
    }

    public void setMinisterNhrrDataTypewiseList(List<MinisterNhrrDataTypewise> ministerNhrrDataTypewiseList) {
        this.ministerNhrrDataTypewiseList = ministerNhrrDataTypewiseList;
    }
}
