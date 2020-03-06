package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class NACODataList {
    @SerializedName("Number_of_HIV_Tests_Conducted")
    @Expose
    private List<NACOHIVTests> nacohivTestsList = null;

    @SerializedName("Number_of_PLHIV_on_Anti_Retroviral_Therapy_ART")
    @Expose
    private List<NACOPLHIVART> nacoplhivartList = null;

    @SerializedName("Number_of_PLHIV_Tested_for_Viral_Load")
    @Expose
    private List<NACOPLHIVViralLoad> nacoplhivViralLoadList = null;


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
}
