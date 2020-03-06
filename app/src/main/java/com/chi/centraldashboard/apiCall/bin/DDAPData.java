package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DDAPData {
    @SerializedName("Ddap")
    @Expose
    private List<DDAPDataList> ddapDataListList = null;


    @SerializedName("Total_Number_of_New_Registrations")
    @Expose
    private List<DDAPNewReg> ddapNewRegList = null;

    @SerializedName("Total_Number_of_Follow_up")
    @Expose
    private List<DDAPFollowUp> ddapFollowUpList = null;

    @SerializedName("Total_No_of_Patients_IPD")
    @Expose
    private List<DDAPIPD> ddapipdList = null;

    @SerializedName("Total_Number_of_Patients")
    @Expose
    private List<DDAPPatients> ddapPatientsList = null;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("status")
    @Expose
    private int status;


    public List<DDAPDataList> getDdapDataListList() {
        return ddapDataListList;
    }

    public void setDdapDataListList(List<DDAPDataList> ddapDataListList) {
        this.ddapDataListList = ddapDataListList;
    }

    public List<DDAPNewReg> getDdapNewRegList() {
        return ddapNewRegList;
    }

    public void setDdapNewRegList(List<DDAPNewReg> ddapNewRegList) {
        this.ddapNewRegList = ddapNewRegList;
    }

    public List<DDAPFollowUp> getDdapFollowUpList() {
        return ddapFollowUpList;
    }

    public void setDdapFollowUpList(List<DDAPFollowUp> ddapFollowUpList) {
        this.ddapFollowUpList = ddapFollowUpList;
    }

    public List<DDAPIPD> getDdapipdList() {
        return ddapipdList;
    }

    public void setDdapipdList(List<DDAPIPD> ddapipdList) {
        this.ddapipdList = ddapipdList;
    }

    public List<DDAPPatients> getDdapPatientsList() {
        return ddapPatientsList;
    }

    public void setDdapPatientsList(List<DDAPPatients> ddapPatientsList) {
        this.ddapPatientsList = ddapPatientsList;
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
