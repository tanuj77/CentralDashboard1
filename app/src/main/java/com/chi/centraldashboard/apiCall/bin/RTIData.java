package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RTIData {

    @SerializedName("Rti_Cell")
    @Expose
    private List<RTIDataList> rtiDataListList=null;

    @SerializedName("title")
    @Expose
    private String title;


    @SerializedName("status")
    @Expose
    private int status;


    public List<RTIDataList> getRtiDataListList() {
        return rtiDataListList;
    }

    public void setRtiDataListList(List<RTIDataList> rtiDataListList) {
        this.rtiDataListList = rtiDataListList;
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
