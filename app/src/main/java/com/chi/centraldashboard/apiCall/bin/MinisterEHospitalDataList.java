package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MinisterEHospitalDataList {
    @SerializedName("No_of_Hospitals_Onboarded")
    @Expose
    private List<MinisterEHospitalOnboarded> ministerEHospitalOnboardedList=null;

    @SerializedName("No_of_Total_Registration")
    @Expose
    private List<MinisterEHospitalRegistration> ministerEHospitalRegistrationList=null;

    @SerializedName("No_of_Registration_done_Today")
    @Expose
    private List<MinisterEHospitalDoneToday> ministerEHospitalDoneTodayList=null;

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
}
