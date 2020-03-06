package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class NPPCDData {
    @SerializedName("NPPCD")
    @Expose
    private List<NPPCDDataList> nppcdDataListList = null;

    @SerializedName("Total_Number_of_Districts_under_NPPCD")
    @Expose
    private List<NPPCD_underNPPCd> nppcdUnderNPPCds = null;

    @SerializedName("Total_Number_of_District_made_Operational_under_NPPCD")
    @Expose
    private List<NPPCD_madeOperational> nppcd_madeOperationalList = null;


    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("status")
    @Expose
    private int status;


    public List<NPPCDDataList> getNppcdDataListList() {
        return nppcdDataListList;
    }

    public void setNppcdDataListList(List<NPPCDDataList> nppcdDataListList) {
        this.nppcdDataListList = nppcdDataListList;
    }

    public List<NPPCD_underNPPCd> getNppcdUnderNPPCds() {
        return nppcdUnderNPPCds;
    }

    public void setNppcdUnderNPPCds(List<NPPCD_underNPPCd> nppcdUnderNPPCds) {
        this.nppcdUnderNPPCds = nppcdUnderNPPCds;
    }

    public List<NPPCD_madeOperational> getNppcd_madeOperationalList() {
        return nppcd_madeOperationalList;
    }

    public void setNppcd_madeOperationalList(List<NPPCD_madeOperational> nppcd_madeOperationalList) {
        this.nppcd_madeOperationalList = nppcd_madeOperationalList;
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
