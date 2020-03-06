package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MinisterQAData {
    @SerializedName("QUALITY_ASSURANCE")
    @Expose
    private List<MinisterQADataList> ministerQADataListList=null;

    @SerializedName("Number_of_facilities_NQAS_Certified")
    @Expose
    private List<MinisterQANQAS> ministerQANQASList=null;

    @SerializedName("Number_of_facilities_LaQshya_Certified")
    @Expose
    private List<MinisterQALaQshya> ministerQALaQshyaList=null;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("status")
    @Expose
    private int status;


    public List<MinisterQADataList> getMinisterQADataListList() {
        return ministerQADataListList;
    }

    public void setMinisterQADataListList(List<MinisterQADataList> ministerQADataListList) {
        this.ministerQADataListList = ministerQADataListList;
    }

    public List<MinisterQANQAS> getMinisterQANQASList() {
        return ministerQANQASList;
    }

    public void setMinisterQANQASList(List<MinisterQANQAS> ministerQANQASList) {
        this.ministerQANQASList = ministerQANQASList;
    }

    public List<MinisterQALaQshya> getMinisterQALaQshyaList() {
        return ministerQALaQshyaList;
    }

    public void setMinisterQALaQshyaList(List<MinisterQALaQshya> ministerQALaQshyaList) {
        this.ministerQALaQshyaList = ministerQALaQshyaList;
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
