package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class NACOData {
    @SerializedName("NACO")
    @Expose
    private List<NACODataList> nacoDataListList = null;

    @SerializedName("Number_of_HIV_Tests_Conducted")
    @Expose
    private List<NACOHIVTests> nacohivTestsList = null;

    @SerializedName("Number_of_PLHIV_on_Anti_Retroviral_Therapy_ART")
    @Expose
    private List<NACOPLHIVART> nacoplhivartList = null;

    @SerializedName("Number_of_PLHIV_Tested_for_Viral_Load")
    @Expose
    private List<NACOPLHIVViralLoad> nacoplhivViralLoadList = null;


    @SerializedName("title")
    @Expose
    private String title;


    @SerializedName("status")
    @Expose
    private int status;


    public List<NACODataList> getNacoDataListList() {
        return nacoDataListList;
    }

    public void setNacoDataListList(List<NACODataList> nacoDataListList) {
        this.nacoDataListList = nacoDataListList;
    }

    public List<NACOHIVTests> getNacohivTestsList() {
        return nacohivTestsList;
    }

    public void setNacohivTestsList(List<NACOHIVTests> nacohivTestsList) {
        this.nacohivTestsList = nacohivTestsList;
    }

    public List<NACOPLHIVART> getNacoplhivartList() {
        return nacoplhivartList;
    }

    public void setNacoplhivartList(List<NACOPLHIVART> nacoplhivartList) {
        this.nacoplhivartList = nacoplhivartList;
    }

    public List<NACOPLHIVViralLoad> getNacoplhivViralLoadList() {
        return nacoplhivViralLoadList;
    }

    public void setNacoplhivViralLoadList(List<NACOPLHIVViralLoad> nacoplhivViralLoadList) {
        this.nacoplhivViralLoadList = nacoplhivViralLoadList;
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
