package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class HPEData {
    @SerializedName("HPEdata")
    @Expose
    private List<HPEDataList> hpeDataListList = null;

    @SerializedName("Total_Number_of_Products")
    @Expose
    private List<HPEProducts> hpeProductsList = null;

    @SerializedName("Total_Amount_received_during_the_month_in_Lakh")
    @Expose
    private List<HPEAmountReceived> hpeAmountReceivedList = null;

    @SerializedName("Total_Number_of_Pharma_Retail_Outlets")
    @Expose
    private List<HPEPharmaRetail> hpePharmaRetailList = null;

    @SerializedName("Total_Number_of_Labs")
    @Expose
    private List<HPELabs> hpeLabsList = null;

    @SerializedName("Total_Number_of_Hospitals")
    @Expose
    private List<HPEHospitals> hpeHospitalsList = null;

    @SerializedName("Total_Number_of_Projects_in_Hand_PMC")
    @Expose
    private List<HPEPMC> hpepmcList=null;


    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("status")
    @Expose
    private int status;

    public List<HPEDataList> getHpeDataListList() {
        return hpeDataListList;
    }

    public void setHpeDataListList(List<HPEDataList> hpeDataListList) {
        this.hpeDataListList = hpeDataListList;
    }

    public List<HPEProducts> getHpeProductsList() {
        return hpeProductsList;
    }

    public void setHpeProductsList(List<HPEProducts> hpeProductsList) {
        this.hpeProductsList = hpeProductsList;
    }

    public List<HPEAmountReceived> getHpeAmountReceivedList() {
        return hpeAmountReceivedList;
    }

    public void setHpeAmountReceivedList(List<HPEAmountReceived> hpeAmountReceivedList) {
        this.hpeAmountReceivedList = hpeAmountReceivedList;
    }

    public List<HPEPharmaRetail> getHpePharmaRetailList() {
        return hpePharmaRetailList;
    }

    public void setHpePharmaRetailList(List<HPEPharmaRetail> hpePharmaRetailList) {
        this.hpePharmaRetailList = hpePharmaRetailList;
    }

    public List<HPELabs> getHpeLabsList() {
        return hpeLabsList;
    }

    public void setHpeLabsList(List<HPELabs> hpeLabsList) {
        this.hpeLabsList = hpeLabsList;
    }

    public List<HPEHospitals> getHpeHospitalsList() {
        return hpeHospitalsList;
    }

    public void setHpeHospitalsList(List<HPEHospitals> hpeHospitalsList) {
        this.hpeHospitalsList = hpeHospitalsList;
    }

    public List<HPEPMC> getHpepmcList() {
        return hpepmcList;
    }

    public void setHpepmcList(List<HPEPMC> hpepmcList) {
        this.hpepmcList = hpepmcList;
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
