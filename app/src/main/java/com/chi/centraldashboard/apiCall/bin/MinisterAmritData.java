package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MinisterAmritData {
    @SerializedName("amrit")
    @Expose
    private List<MinisterAmritDataList> ministerAmritDataListList=null;

    @SerializedName("Total_number_of_pharmacies")
    @Expose
    private List<MinisterAmritPharmacies> ministerAmritPharmaciesList=null;

    @SerializedName("Number_of_patients_served")
    @Expose
    private List<MinisterAmritPatientsServed> ministerAmritPatientsServedList=null;

    @SerializedName("Value_of_drugs_dispensed_Rs_in_crore")
    @Expose
    private List<MinisterAmritDrugsDispensed> ministerAmritDrugsDispensedList=null;

    @SerializedName("Savings_to_the_patients_Rs_in_crore")
    @Expose
    private List<MinisterAmritSavingsPatients> ministerAmritSavingsPatientsList=null;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("status")
    @Expose
    private int status;


    public List<MinisterAmritDataList> getMinisterAmritDataListList() {
        return ministerAmritDataListList;
    }

    public void setMinisterAmritDataListList(List<MinisterAmritDataList> ministerAmritDataListList) {
        this.ministerAmritDataListList = ministerAmritDataListList;
    }

    public List<MinisterAmritPharmacies> getMinisterAmritPharmaciesList() {
        return ministerAmritPharmaciesList;
    }

    public void setMinisterAmritPharmaciesList(List<MinisterAmritPharmacies> ministerAmritPharmaciesList) {
        this.ministerAmritPharmaciesList = ministerAmritPharmaciesList;
    }

    public List<MinisterAmritPatientsServed> getMinisterAmritPatientsServedList() {
        return ministerAmritPatientsServedList;
    }

    public void setMinisterAmritPatientsServedList(List<MinisterAmritPatientsServed> ministerAmritPatientsServedList) {
        this.ministerAmritPatientsServedList = ministerAmritPatientsServedList;
    }

    public List<MinisterAmritDrugsDispensed> getMinisterAmritDrugsDispensedList() {
        return ministerAmritDrugsDispensedList;
    }

    public void setMinisterAmritDrugsDispensedList(List<MinisterAmritDrugsDispensed> ministerAmritDrugsDispensedList) {
        this.ministerAmritDrugsDispensedList = ministerAmritDrugsDispensedList;
    }

    public List<MinisterAmritSavingsPatients> getMinisterAmritSavingsPatientsList() {
        return ministerAmritSavingsPatientsList;
    }

    public void setMinisterAmritSavingsPatientsList(List<MinisterAmritSavingsPatients> ministerAmritSavingsPatientsList) {
        this.ministerAmritSavingsPatientsList = ministerAmritSavingsPatientsList;
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
