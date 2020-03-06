package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class NOTPDataList {
    @SerializedName("Number_of_States_UTs_that_have_Adopted")
    @Expose
    private List<NOTP_Organs> notp_organsList = null;

    @SerializedName("Number_of_States_UTs_that_have_Adopted_Transplantation_of_Human_Organs_and_Tissues_Act")
    @Expose
    private List<NOTP_OrgansandTissues> notp_organsandTissuesList = null;

    @SerializedName("Hospitals_for_Organ_And_Tissue_Retrieval_Transplantation_and_Eye_Banks")
    @Expose
    private List<NOTP_Eyebanks> notp_eyebanksList = null;

    @SerializedName("Number_of_Organ_Tissue_Donors_who_have_pledged_for_Organ")
    @Expose
    private List<NOTP_Pledged> notp_pledgedList = null;


    @SerializedName("Transplant_trends_in_the_Country")
    @Expose
    private List<NOTP_TrendsCountry> notp_trendsCountryList = null;

    @SerializedName("No_of_Organ_allocation_on_Central_Registry")
    @Expose
    private List<NOTP_CentralRegistry> notp_centralRegistryList = null;

    @SerializedName("No_of_Wait_List_Patients_Organ_Wise")
    @Expose
    private List<NOTP_PatientsOrganwise> notp_patientsOrganwiseList=null;

    @SerializedName("Number_of_Regional_Organ_Tissue_Transplant_Organisation_Rotto")
    @Expose
    private List<NOTP_rotto>notp_rottoList=null;

    @SerializedName("Number_of_State_Organ_Tissue_Transplant_Organisation_Sotto")
    @Expose
    private List<NOTP_sotto> notp_sottoList=null;


    public List<NOTP_Organs> getNotp_organsList() {
        return notp_organsList;
    }

    public void setNotp_organsList(List<NOTP_Organs> notp_organsList) {
        this.notp_organsList = notp_organsList;
    }

    public List<NOTP_OrgansandTissues> getNotp_organsandTissuesList() {
        return notp_organsandTissuesList;
    }

    public void setNotp_organsandTissuesList(List<NOTP_OrgansandTissues> notp_organsandTissuesList) {
        this.notp_organsandTissuesList = notp_organsandTissuesList;
    }

    public List<NOTP_Eyebanks> getNotp_eyebanksList() {
        return notp_eyebanksList;
    }

    public void setNotp_eyebanksList(List<NOTP_Eyebanks> notp_eyebanksList) {
        this.notp_eyebanksList = notp_eyebanksList;
    }

    public List<NOTP_Pledged> getNotp_pledgedList() {
        return notp_pledgedList;
    }

    public void setNotp_pledgedList(List<NOTP_Pledged> notp_pledgedList) {
        this.notp_pledgedList = notp_pledgedList;
    }

    public List<NOTP_TrendsCountry> getNotp_trendsCountryList() {
        return notp_trendsCountryList;
    }

    public void setNotp_trendsCountryList(List<NOTP_TrendsCountry> notp_trendsCountryList) {
        this.notp_trendsCountryList = notp_trendsCountryList;
    }

    public List<NOTP_CentralRegistry> getNotp_centralRegistryList() {
        return notp_centralRegistryList;
    }

    public void setNotp_centralRegistryList(List<NOTP_CentralRegistry> notp_centralRegistryList) {
        this.notp_centralRegistryList = notp_centralRegistryList;
    }

    public List<NOTP_PatientsOrganwise> getNotp_patientsOrganwiseList() {
        return notp_patientsOrganwiseList;
    }

    public void setNotp_patientsOrganwiseList(List<NOTP_PatientsOrganwise> notp_patientsOrganwiseList) {
        this.notp_patientsOrganwiseList = notp_patientsOrganwiseList;
    }

    public List<NOTP_rotto> getNotp_rottoList() {
        return notp_rottoList;
    }

    public void setNotp_rottoList(List<NOTP_rotto> notp_rottoList) {
        this.notp_rottoList = notp_rottoList;
    }

    public List<NOTP_sotto> getNotp_sottoList() {
        return notp_sottoList;
    }

    public void setNotp_sottoList(List<NOTP_sotto> notp_sottoList) {
        this.notp_sottoList = notp_sottoList;
    }
}
