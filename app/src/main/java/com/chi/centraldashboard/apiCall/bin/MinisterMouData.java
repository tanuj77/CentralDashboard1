package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MinisterMouData {
    @SerializedName("MOUData")
    @Expose
    private List<MinisterMouDataList> ministerMouDataListList=null;

    @SerializedName("No_of_MOUs_Signed")
    @Expose
    private List<MinisterMouSigned> ministerMouSignedList = null;

    @SerializedName("No_of_Active_MOUs")
    @Expose
    private List<MinisterMouActive> ministerActiveMouList = null;

    @SerializedName("No_of_Inactive_MOUs")
    @Expose
    private List<MinisterMouInactive> ministerInactiveMouList=null;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("status")
    @Expose
    private Integer status;

    public List<MinisterMouDataList> getMinisterMouDataListList() {
        return ministerMouDataListList;
    }

    public void setMinisterMouDataListList(List<MinisterMouDataList> ministerMouDataListList) {
        this.ministerMouDataListList = ministerMouDataListList;
    }

    public List<MinisterMouSigned> getMinisterMouSignedList() {
        return ministerMouSignedList;
    }

    public void setMinisterMouSignedList(List<MinisterMouSigned> ministerMouSignedList) {
        this.ministerMouSignedList = ministerMouSignedList;
    }

    public List<MinisterMouActive> getMinisterActiveMouList() {
        return ministerActiveMouList;
    }

    public void setMinisterActiveMouList(List<MinisterMouActive> ministerActiveMouList) {
        this.ministerActiveMouList = ministerActiveMouList;
    }

    public List<MinisterMouInactive> getMinisterInactiveMouList() {
        return ministerInactiveMouList;
    }

    public void setMinisterInactiveMouList(List<MinisterMouInactive> ministerInactiveMouList) {
        this.ministerInactiveMouList = ministerInactiveMouList;
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
