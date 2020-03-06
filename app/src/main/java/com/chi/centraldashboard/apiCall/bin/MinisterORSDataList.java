package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MinisterORSDataList {

    @SerializedName("No_of_Hospitals_Onboarded")
    @Expose
    private List<MinisterORSDataHospitalOnboarded> ministerORSDataHospitalOnboardedList=null;

    @SerializedName("No_of_Total_Appointments")
    @Expose
    private List<MinisterORSDataTotalAppointments> ministerORSDataTotalAppointmentsList=null;

    @SerializedName("No_Of_Appointments_Taken_Today")
    @Expose
    private List<MinisterORSDataTakenToday> ministerORSDataTakenTodayList=null;

    public List<MinisterORSDataHospitalOnboarded> getMinisterORSDataHospitalOnboardedList() {
        return ministerORSDataHospitalOnboardedList;
    }

    public void setMinisterORSDataHospitalOnboardedList(List<MinisterORSDataHospitalOnboarded> ministerORSDataHospitalOnboardedList) {
        this.ministerORSDataHospitalOnboardedList = ministerORSDataHospitalOnboardedList;
    }

    public List<MinisterORSDataTotalAppointments> getMinisterORSDataTotalAppointmentsList() {
        return ministerORSDataTotalAppointmentsList;
    }

    public void setMinisterORSDataTotalAppointmentsList(List<MinisterORSDataTotalAppointments> ministerORSDataTotalAppointmentsList) {
        this.ministerORSDataTotalAppointmentsList = ministerORSDataTotalAppointmentsList;
    }

    public List<MinisterORSDataTakenToday> getMinisterORSDataTakenTodayList() {
        return ministerORSDataTakenTodayList;
    }

    public void setMinisterORSDataTakenTodayList(List<MinisterORSDataTakenToday> ministerORSDataTakenTodayList) {
        this.ministerORSDataTakenTodayList = ministerORSDataTakenTodayList;
    }
}
