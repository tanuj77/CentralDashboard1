package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ChildHealthData {
    @SerializedName("CHILD_HEALTH")
    @Expose
    private List<ChildHealthDataList> childHealthDataListList = null;

    @SerializedName("NDD")
    @Expose
    private List<ChildHealthNDD> childHealthNDDList=null;

    @SerializedName("IDCF")
    @Expose
    private List<ChildHealthIDCF> childHealthIDCFList=null;

    @SerializedName("RBSK")
    @Expose
    private List<ChildHealthRBSK> childHealthRBSKList=null;

    @SerializedName("HBNC")
    @Expose
    private List<ChildHealthHBNC> childHealthHBNCList=null;

    @SerializedName("SNCUs")
    @Expose
    private List<ChildHealthSNCU> childHealthDataSNCUList=null;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("status")
    @Expose
    private int status;


    public List<ChildHealthDataList> getChildHealthDataListList() {
        return childHealthDataListList;
    }

    public void setChildHealthDataListList(List<ChildHealthDataList> childHealthDataListList) {
        this.childHealthDataListList = childHealthDataListList;
    }

    public List<ChildHealthNDD> getChildHealthNDDList() {
        return childHealthNDDList;
    }

    public void setChildHealthNDDList(List<ChildHealthNDD> childHealthNDDList) {
        this.childHealthNDDList = childHealthNDDList;
    }

    public List<ChildHealthIDCF> getChildHealthIDCFList() {
        return childHealthIDCFList;
    }

    public void setChildHealthIDCFList(List<ChildHealthIDCF> childHealthIDCFList) {
        this.childHealthIDCFList = childHealthIDCFList;
    }

    public List<ChildHealthRBSK> getChildHealthRBSKList() {
        return childHealthRBSKList;
    }

    public void setChildHealthRBSKList(List<ChildHealthRBSK> childHealthRBSKList) {
        this.childHealthRBSKList = childHealthRBSKList;
    }

    public List<ChildHealthHBNC> getChildHealthHBNCList() {
        return childHealthHBNCList;
    }

    public void setChildHealthHBNCList(List<ChildHealthHBNC> childHealthHBNCList) {
        this.childHealthHBNCList = childHealthHBNCList;
    }

    public List<ChildHealthSNCU> getChildHealthDataSNCUList() {
        return childHealthDataSNCUList;
    }

    public void setChildHealthDataSNCUList(List<ChildHealthSNCU> childHealthDataSNCUList) {
        this.childHealthDataSNCUList = childHealthDataSNCUList;
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
