package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CEAData {
    @SerializedName("CEA")
    @Expose
    private List<CEADataList> ceaDataListList = null;

    @SerializedName("Total_Number_of_Clinical_Establishments_Registered")
    @Expose
    private List<CEARegistered> ceaRegisteredList = null;

    @SerializedName("Number_of_States_UTs_that_have_adopted_the_CEA_Act")
    @Expose
    private List<CEAAdopted> ceaAdoptedList = null;

    @SerializedName("Total_Number_of_States_UTs_that_have_Not_adopted_the_CEA_Act")
    @Expose
    private List<CEANotAdopted> ceaNotAdoptedList = null;

    @SerializedName("Total_Number_of_Standard_Treatment_Guidelines")
    @Expose
    private List<CEATreatmentGuidline> ceaTreatmentGuidlineList = null;


    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("status")
    @Expose
    private int status;


    public List<CEADataList> getCeaDataListList() {
        return ceaDataListList;
    }

    public void setCeaDataListList(List<CEADataList> ceaDataListList) {
        this.ceaDataListList = ceaDataListList;
    }

    public List<CEARegistered> getCeaRegisteredList() {
        return ceaRegisteredList;
    }

    public void setCeaRegisteredList(List<CEARegistered> ceaRegisteredList) {
        this.ceaRegisteredList = ceaRegisteredList;
    }

    public List<CEAAdopted> getCeaAdoptedList() {
        return ceaAdoptedList;
    }

    public void setCeaAdoptedList(List<CEAAdopted> ceaAdoptedList) {
        this.ceaAdoptedList = ceaAdoptedList;
    }

    public List<CEANotAdopted> getCeaNotAdoptedList() {
        return ceaNotAdoptedList;
    }

    public void setCeaNotAdoptedList(List<CEANotAdopted> ceaNotAdoptedList) {
        this.ceaNotAdoptedList = ceaNotAdoptedList;
    }

    public List<CEATreatmentGuidline> getCeaTreatmentGuidlineList() {
        return ceaTreatmentGuidlineList;
    }

    public void setCeaTreatmentGuidlineList(List<CEATreatmentGuidline> ceaTreatmentGuidlineList) {
        this.ceaTreatmentGuidlineList = ceaTreatmentGuidlineList;
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
