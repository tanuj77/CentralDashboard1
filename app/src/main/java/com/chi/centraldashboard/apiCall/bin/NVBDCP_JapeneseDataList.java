package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class NVBDCP_JapeneseDataList {

    @SerializedName("Total_cases")
    @Expose
    private List<NVBDCP_Japenese_TotalCases> nvbdcp_japenese_totalCasesList=null;

    @SerializedName("Number_of_Deaths")
    @Expose
    private List<NVBDCP_Japenese_Deaths>nvbdcp_japenese_deathsList=null;

    @SerializedName("No_of_districts_covered_by_JE_Vaccination")
    @Expose
    private List<NVBDCP_Japenese_JEVaccination> nvbdcp_japenese_jeVaccinationList=null;


    @SerializedName("No_of_PICUs_for_which_funds_provided")
    @Expose
    private List<NVBDCP_Japenese_PICUsFunds> nvbdcp_japenese_picUsFundsList=null;



    @SerializedName("No_of_PICUs_functional")
    @Expose
    private List<NVBDCP_Japenese_PICUsFunctional>nvbdcp_japenese_picUsFunctionalList=null;


    @SerializedName("No_of_PMRs_which_funds_provided")
    @Expose
    private List<NVBDCP_Japenese_PMRFunds>nvbdcp_japenese_pmrFundsList=null;

    @SerializedName("No_of_PMRs_functional")
    @Expose
    private List<NVBDCP_Japenese_PMRFunctional>nvbdcp_japenese_pmrFunctionalList=null;


    public List<NVBDCP_Japenese_TotalCases> getNvbdcp_japenese_totalCasesList() {
        return nvbdcp_japenese_totalCasesList;
    }

    public void setNvbdcp_japenese_totalCasesList(List<NVBDCP_Japenese_TotalCases> nvbdcp_japenese_totalCasesList) {
        this.nvbdcp_japenese_totalCasesList = nvbdcp_japenese_totalCasesList;
    }

    public List<NVBDCP_Japenese_Deaths> getNvbdcp_japenese_deathsList() {
        return nvbdcp_japenese_deathsList;
    }

    public void setNvbdcp_japenese_deathsList(List<NVBDCP_Japenese_Deaths> nvbdcp_japenese_deathsList) {
        this.nvbdcp_japenese_deathsList = nvbdcp_japenese_deathsList;
    }

    public List<NVBDCP_Japenese_JEVaccination> getNvbdcp_japenese_jeVaccinationList() {
        return nvbdcp_japenese_jeVaccinationList;
    }

    public void setNvbdcp_japenese_jeVaccinationList(List<NVBDCP_Japenese_JEVaccination> nvbdcp_japenese_jeVaccinationList) {
        this.nvbdcp_japenese_jeVaccinationList = nvbdcp_japenese_jeVaccinationList;
    }

    public List<NVBDCP_Japenese_PICUsFunds> getNvbdcp_japenese_picUsFundsList() {
        return nvbdcp_japenese_picUsFundsList;
    }

    public void setNvbdcp_japenese_picUsFundsList(List<NVBDCP_Japenese_PICUsFunds> nvbdcp_japenese_picUsFundsList) {
        this.nvbdcp_japenese_picUsFundsList = nvbdcp_japenese_picUsFundsList;
    }

    public List<NVBDCP_Japenese_PICUsFunctional> getNvbdcp_japenese_picUsFunctionalList() {
        return nvbdcp_japenese_picUsFunctionalList;
    }

    public void setNvbdcp_japenese_picUsFunctionalList(List<NVBDCP_Japenese_PICUsFunctional> nvbdcp_japenese_picUsFunctionalList) {
        this.nvbdcp_japenese_picUsFunctionalList = nvbdcp_japenese_picUsFunctionalList;
    }

    public List<NVBDCP_Japenese_PMRFunds> getNvbdcp_japenese_pmrFundsList() {
        return nvbdcp_japenese_pmrFundsList;
    }

    public void setNvbdcp_japenese_pmrFundsList(List<NVBDCP_Japenese_PMRFunds> nvbdcp_japenese_pmrFundsList) {
        this.nvbdcp_japenese_pmrFundsList = nvbdcp_japenese_pmrFundsList;
    }

    public List<NVBDCP_Japenese_PMRFunctional> getNvbdcp_japenese_pmrFunctionalList() {
        return nvbdcp_japenese_pmrFunctionalList;
    }

    public void setNvbdcp_japenese_pmrFunctionalList(List<NVBDCP_Japenese_PMRFunctional> nvbdcp_japenese_pmrFunctionalList) {
        this.nvbdcp_japenese_pmrFunctionalList = nvbdcp_japenese_pmrFunctionalList;
    }
}
