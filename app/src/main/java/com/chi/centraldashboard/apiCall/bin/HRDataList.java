package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class HRDataList {

    @SerializedName("Vacancies_20_of_Medical_Officers_including_specialists_against_Sanctioned_Posts_Both_Regular_NRHM_Posts")
    @Expose
    private List<HRMedicalOfficerNRHM> hrMedicalOfficerNRHMList=null;


    @SerializedName("Vacancies_53_of_Staff_Nurse_against_Sanctioned_Posts_Both_Regular_and_NRHM_Posts")
    @Expose
    private List<HRStaffNurseNRHM>hrStaffNurseNRHMList=null;

    @SerializedName("Vacancies_27_of_Medical_Officer_including_specialists_against_Sanctioned_Posts_under_NUHM")
    @Expose
    private List<HRMedicalOfficerNUHM>hrMedicalOfficerNUHMList=null;


    @SerializedName("Vacancies_33_of_Staff_Nurse_against_Sanctioned_Posts_under_NUHM")
    @Expose
    private List<HRStaffNurseNUHM>hrStaffNurseNUHMList=null;


    public List<HRMedicalOfficerNRHM> getHrMedicalOfficerNRHMList() {
        return hrMedicalOfficerNRHMList;
    }

    public void setHrMedicalOfficerNRHMList(List<HRMedicalOfficerNRHM> hrMedicalOfficerNRHMList) {
        this.hrMedicalOfficerNRHMList = hrMedicalOfficerNRHMList;
    }

    public List<HRStaffNurseNRHM> getHrStaffNurseNRHMList() {
        return hrStaffNurseNRHMList;
    }

    public void setHrStaffNurseNRHMList(List<HRStaffNurseNRHM> hrStaffNurseNRHMList) {
        this.hrStaffNurseNRHMList = hrStaffNurseNRHMList;
    }

    public List<HRMedicalOfficerNUHM> getHrMedicalOfficerNUHMList() {
        return hrMedicalOfficerNUHMList;
    }

    public void setHrMedicalOfficerNUHMList(List<HRMedicalOfficerNUHM> hrMedicalOfficerNUHMList) {
        this.hrMedicalOfficerNUHMList = hrMedicalOfficerNUHMList;
    }

    public List<HRStaffNurseNUHM> getHrStaffNurseNUHMList() {
        return hrStaffNurseNUHMList;
    }

    public void setHrStaffNurseNUHMList(List<HRStaffNurseNUHM> hrStaffNurseNUHMList) {
        this.hrStaffNurseNUHMList = hrStaffNurseNUHMList;
    }
}
