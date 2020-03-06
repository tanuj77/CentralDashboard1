package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SRSData {
    @SerializedName("SRS")
    @Expose
    private List<SRSDataList> srsDataListList = null;

    @SerializedName("Crude_Birth_Rate_CBR")
    @Expose
    private List<SRS_CBR> srs_cbrList = null;


    @SerializedName("Crude_Death_Rate_CDR")
    @Expose
    private List<SRS_CDR> srs_cdrList = null;

    @SerializedName("Total_Fertility_Rate_TFR")
    @Expose
    private List<SRS_TFR> srs_tfrList = null;

    @SerializedName("Infant_Mortality_Rate_IMR")
    @Expose
    private List<SRS_IMR> srs_imrList = null;

    @SerializedName("Maternal_Mortality_Ratio_MMR")
    @Expose
    private List<SRS_MMR> srs_mmrList = null;


    @SerializedName("Under_five_mortality_rate_U5")
    @Expose
    private List<SRS_U5> srs_u5List = null;


    @SerializedName("Neonatal_mortality_rate_NMR")
    @Expose
    private List<SRS_NMR> srs_nmrList = null;


    @SerializedName("title")
    @Expose
    private String title;


    @SerializedName("status")
    @Expose
    private int status;


    public List<SRSDataList> getSrsDataListList() {
        return srsDataListList;
    }

    public void setSrsDataListList(List<SRSDataList> srsDataListList) {
        this.srsDataListList = srsDataListList;
    }

    public List<SRS_CBR> getSrs_cbrList() {
        return srs_cbrList;
    }

    public void setSrs_cbrList(List<SRS_CBR> srs_cbrList) {
        this.srs_cbrList = srs_cbrList;
    }

    public List<SRS_CDR> getSrs_cdrList() {
        return srs_cdrList;
    }

    public void setSrs_cdrList(List<SRS_CDR> srs_cdrList) {
        this.srs_cdrList = srs_cdrList;
    }

    public List<SRS_TFR> getSrs_tfrList() {
        return srs_tfrList;
    }

    public void setSrs_tfrList(List<SRS_TFR> srs_tfrList) {
        this.srs_tfrList = srs_tfrList;
    }

    public List<SRS_IMR> getSrs_imrList() {
        return srs_imrList;
    }

    public void setSrs_imrList(List<SRS_IMR> srs_imrList) {
        this.srs_imrList = srs_imrList;
    }

    public List<SRS_MMR> getSrs_mmrList() {
        return srs_mmrList;
    }

    public void setSrs_mmrList(List<SRS_MMR> srs_mmrList) {
        this.srs_mmrList = srs_mmrList;
    }

    public List<SRS_U5> getSrs_u5List() {
        return srs_u5List;
    }

    public void setSrs_u5List(List<SRS_U5> srs_u5List) {
        this.srs_u5List = srs_u5List;
    }

    public List<SRS_NMR> getSrs_nmrList() {
        return srs_nmrList;
    }

    public void setSrs_nmrList(List<SRS_NMR> srs_nmrList) {
        this.srs_nmrList = srs_nmrList;
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
