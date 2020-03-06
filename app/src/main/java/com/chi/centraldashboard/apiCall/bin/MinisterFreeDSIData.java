package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MinisterFreeDSIData {
    @SerializedName("FREE_DIAGNOSTICS_SERVICES_INITIATIVE")
    @Expose
    private List<MinisterFreeDSIDataList> ministerFreeDSIDataListList=null;

    @SerializedName("Number_of_Status_of_Implementation_of_Free_Diagnostic_Services")
    @Expose
    private List<MinisterFreeDSIDS> ministerFreeDSIDSList=null;

    @SerializedName("Number_of_States_UTs_implemented_Free_Laboratory_Services")
    @Expose
    private List<MinisterFreeDSILS> ministerFreeDSILSList=null;


    @SerializedName("Number_of_States_UTs_implemented_Free_Tele_Radiology_Services")
    @Expose
    private List<MinisterFreeDSIRS> ministerFreeDSIRSList=null;

    @SerializedName("Number_of_States_UTs_implemented_Free_CT_Scan_services_in_DHs")
    @Expose
    private List<MinisterFreeDSIDHs> ministerFreeDSIDHsList=null;


    @SerializedName("title")
    @Expose
    private String title;


    @SerializedName("status")
    @Expose
    private int status;


    public List<MinisterFreeDSIDataList> getMinisterFreeDSIDataListList() {
        return ministerFreeDSIDataListList;
    }

    public void setMinisterFreeDSIDataListList(List<MinisterFreeDSIDataList> ministerFreeDSIDataListList) {
        this.ministerFreeDSIDataListList = ministerFreeDSIDataListList;
    }

    public List<MinisterFreeDSIDS> getMinisterFreeDSIDSList() {
        return ministerFreeDSIDSList;
    }

    public void setMinisterFreeDSIDSList(List<MinisterFreeDSIDS> ministerFreeDSIDSList) {
        this.ministerFreeDSIDSList = ministerFreeDSIDSList;
    }

    public List<MinisterFreeDSILS> getMinisterFreeDSILSList() {
        return ministerFreeDSILSList;
    }

    public void setMinisterFreeDSILSList(List<MinisterFreeDSILS> ministerFreeDSILSList) {
        this.ministerFreeDSILSList = ministerFreeDSILSList;
    }

    public List<MinisterFreeDSIRS> getMinisterFreeDSIRSList() {
        return ministerFreeDSIRSList;
    }

    public void setMinisterFreeDSIRSList(List<MinisterFreeDSIRS> ministerFreeDSIRSList) {
        this.ministerFreeDSIRSList = ministerFreeDSIRSList;
    }

    public List<MinisterFreeDSIDHs> getMinisterFreeDSIDHsList() {
        return ministerFreeDSIDHsList;
    }

    public void setMinisterFreeDSIDHsList(List<MinisterFreeDSIDHs> ministerFreeDSIDHsList) {
        this.ministerFreeDSIDHsList = ministerFreeDSIDHsList;
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
