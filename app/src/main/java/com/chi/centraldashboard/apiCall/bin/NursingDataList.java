package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class NursingDataList {

    @SerializedName("Total_Number_of_State_Wise_Nursing_Institute")
    @Expose
    private List<NursingStateWise> nursingStateWiseList = null;

    @SerializedName("Total_Number_of_Central_Sector_Schemes_Development_of_Nursing_Services")
    @Expose
    private List<NursingCentralSector> nursingCentralSectorList = null;

    @SerializedName("Total_Number_of_Courses")
    @Expose
    private List<NursingCourses> nursingCoursesList = null;

    @SerializedName("Total_Number_of_National_Nursing_Institute")
    @Expose
    private List<NursingNationalInstitute> nursingNationalInstituteList = null;

    @SerializedName("Annual_Admission_Capacity_Seats")
    @Expose
    private List<NursingSeats> nursingSeatsList = null;

    @SerializedName("Total_Number_of_Central_Sponsored_Upgradation_strengthening_of_Nursing_Services_ANM_GNM")
    @Expose
    private List<NursingUpgradation> nursingUpgradationList = null;

    @SerializedName("Nursing_Institute")
    @Expose
    private List<NursingInstitute> nursingInstituteList = null;


    public List<NursingStateWise> getNursingStateWiseList() {
        return nursingStateWiseList;
    }

    public void setNursingStateWiseList(List<NursingStateWise> nursingStateWiseList) {
        this.nursingStateWiseList = nursingStateWiseList;
    }

    public List<NursingCentralSector> getNursingCentralSectorList() {
        return nursingCentralSectorList;
    }

    public void setNursingCentralSectorList(List<NursingCentralSector> nursingCentralSectorList) {
        this.nursingCentralSectorList = nursingCentralSectorList;
    }

    public List<NursingCourses> getNursingCoursesList() {
        return nursingCoursesList;
    }

    public void setNursingCoursesList(List<NursingCourses> nursingCoursesList) {
        this.nursingCoursesList = nursingCoursesList;
    }

    public List<NursingNationalInstitute> getNursingNationalInstituteList() {
        return nursingNationalInstituteList;
    }

    public void setNursingNationalInstituteList(List<NursingNationalInstitute> nursingNationalInstituteList) {
        this.nursingNationalInstituteList = nursingNationalInstituteList;
    }

    public List<NursingSeats> getNursingSeatsList() {
        return nursingSeatsList;
    }

    public void setNursingSeatsList(List<NursingSeats> nursingSeatsList) {
        this.nursingSeatsList = nursingSeatsList;
    }

    public List<NursingUpgradation> getNursingUpgradationList() {
        return nursingUpgradationList;
    }

    public void setNursingUpgradationList(List<NursingUpgradation> nursingUpgradationList) {
        this.nursingUpgradationList = nursingUpgradationList;
    }

    public List<NursingInstitute> getNursingInstituteList() {
        return nursingInstituteList;
    }

    public void setNursingInstituteList(List<NursingInstitute> nursingInstituteList) {
        this.nursingInstituteList = nursingInstituteList;
    }
}
