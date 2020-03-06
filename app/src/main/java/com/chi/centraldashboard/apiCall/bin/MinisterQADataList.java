package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MinisterQADataList {
    @SerializedName("Number_of_facilities_NQAS_Certified")
    @Expose
    private List<MinisterQANQAS> ministerQANQASList=null;

    @SerializedName("Number_of_facilities_LaQshya_Certified")
    @Expose
    private List<MinisterQALaQshya> ministerQALaQshyaList=null;


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
}
