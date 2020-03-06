package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MinisterEHospitalData {
    @SerializedName("E_HOSPITAL_Data")
    @Expose
    private List<MinisterEHospitalDataList> ministerEHospitalDataListList=null;

    @SerializedName("No_of_Hospitals_Onboarded")
    @Expose
    private List<MinisterEHospitalOnboarded> ministerEHospitalOnboardedList=null;

    @SerializedName("No_of_Total_Registration")
    @Expose
    private List<MinisterEHospitalRegistration> ministerEHospitalRegistrationList=null;

    @SerializedName("No_of_Registration_done_Today")
    @Expose
    private List<MinisterEHospitalDoneToday> ministerEHospitalDoneTodayList=null;


    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("status")
    @Expose
    private Integer status;


    public List<MinisterEHospitalDataList> getMinisterEHospitalDataListList() {
        return ministerEHospitalDataListList;
    }

    public void setMinisterEHospitalDataListList(List<MinisterEHospitalDataList> ministerEHospitalDataListList) {
        this.ministerEHospitalDataListList = ministerEHospitalDataListList;
    }

    public List<MinisterEHospitalOnboarded> getMinisterEHospitalOnboardedList() {
        return ministerEHospitalOnboardedList;
    }

    public void setMinisterEHospitalOnboardedList(List<MinisterEHospitalOnboarded> ministerEHospitalOnboardedList) {
        this.ministerEHospitalOnboardedList = ministerEHospitalOnboardedList;
    }

    public List<MinisterEHospitalRegistration> getMinisterEHospitalRegistrationList() {
        return ministerEHospitalRegistrationList;
    }

    public void setMinisterEHospitalRegistrationList(List<MinisterEHospitalRegistration> ministerEHospitalRegistrationList) {
        this.ministerEHospitalRegistrationList = ministerEHospitalRegistrationList;
    }

    public List<MinisterEHospitalDoneToday> getMinisterEHospitalDoneTodayList() {
        return ministerEHospitalDoneTodayList;
    }

    public void setMinisterEHospitalDoneTodayList(List<MinisterEHospitalDoneToday> ministerEHospitalDoneTodayList) {
        this.ministerEHospitalDoneTodayList = ministerEHospitalDoneTodayList;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
