package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class NLEPData {
    @SerializedName("NLEP")
    @Expose
    private List<NLEPDataList> nlepDataListList = null;

    @SerializedName("Cases_on_Record")
    @Expose
    private List<NLEP_CasesOnRecord> nlep_casesOnRecordList = null;

    @SerializedName("New_Cases_Detected")
    @Expose
    private List<NLEP_CasesDetected> nlep_casesDetectedList = null;

    @SerializedName("Grade_II_Disability_G2D_cases_Percentage_in_New_Cases")
    @Expose
    private List<NLEP_Grade2> nlep_grade2List = null;

    @SerializedName("No_of_Female_Cases_Percentage_in_New_cases")
    @Expose
    private List<NLEP_FemaleCases> nlep_femaleCasesList = null;

    @SerializedName("No_of_Child_Cases_Percentage_in_New_cases")
    @Expose
    private List<NLEP_ChildCases> nlep_childCasesList = null;


    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("status")
    @Expose
    private int status;


    public List<NLEPDataList> getNlepDataListList() {
        return nlepDataListList;
    }

    public void setNlepDataListList(List<NLEPDataList> nlepDataListList) {
        this.nlepDataListList = nlepDataListList;
    }

    public List<NLEP_CasesOnRecord> getNlep_casesOnRecordList() {
        return nlep_casesOnRecordList;
    }

    public void setNlep_casesOnRecordList(List<NLEP_CasesOnRecord> nlep_casesOnRecordList) {
        this.nlep_casesOnRecordList = nlep_casesOnRecordList;
    }

    public List<NLEP_CasesDetected> getNlep_casesDetectedList() {
        return nlep_casesDetectedList;
    }

    public void setNlep_casesDetectedList(List<NLEP_CasesDetected> nlep_casesDetectedList) {
        this.nlep_casesDetectedList = nlep_casesDetectedList;
    }

    public List<NLEP_Grade2> getNlep_grade2List() {
        return nlep_grade2List;
    }

    public void setNlep_grade2List(List<NLEP_Grade2> nlep_grade2List) {
        this.nlep_grade2List = nlep_grade2List;
    }

    public List<NLEP_FemaleCases> getNlep_femaleCasesList() {
        return nlep_femaleCasesList;
    }

    public void setNlep_femaleCasesList(List<NLEP_FemaleCases> nlep_femaleCasesList) {
        this.nlep_femaleCasesList = nlep_femaleCasesList;
    }

    public List<NLEP_ChildCases> getNlep_childCasesList() {
        return nlep_childCasesList;
    }

    public void setNlep_childCasesList(List<NLEP_ChildCases> nlep_childCasesList) {
        this.nlep_childCasesList = nlep_childCasesList;
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
