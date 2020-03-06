package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class EMRDataList {
    @SerializedName("No_of_Skill_Centres_on_National_Emergency_Life_Support")
    @Expose
    private List<EMRSkillCenters> emrSkillCentersList = null;

    @SerializedName("Number_of_personnel_trained_in_Emergency_Life_Support")
    @Expose
    private List<EMRPersonalTrained> emrPersonalTrainedList = null;

    @SerializedName("Number_of_Medical_Personnel_trained")
    @Expose
    private List<EMRMedicalPersonTrained> emrMedicalPersonTrainedList = null;


    @SerializedName("Number_of_CBRN_Medical_Management_Centres")
    @Expose
    private List<EMRCBRN> emrcbrnList = null;


    @SerializedName("Number_of_Health_Emergency_Operation_Centres")
    @Expose
    private List<EMROperationCenters> emrOperationCentersList = null;


    public List<EMRSkillCenters> getEmrSkillCentersList() {
        return emrSkillCentersList;
    }

    public void setEmrSkillCentersList(List<EMRSkillCenters> emrSkillCentersList) {
        this.emrSkillCentersList = emrSkillCentersList;
    }

    public List<EMRPersonalTrained> getEmrPersonalTrainedList() {
        return emrPersonalTrainedList;
    }

    public void setEmrPersonalTrainedList(List<EMRPersonalTrained> emrPersonalTrainedList) {
        this.emrPersonalTrainedList = emrPersonalTrainedList;
    }

    public List<EMRCBRN> getEmrcbrnList() {
        return emrcbrnList;
    }

    public void setEmrcbrnList(List<EMRCBRN> emrcbrnList) {
        this.emrcbrnList = emrcbrnList;
    }

    public List<EMROperationCenters> getEmrOperationCentersList() {
        return emrOperationCentersList;
    }

    public void setEmrOperationCentersList(List<EMROperationCenters> emrOperationCentersList) {
        this.emrOperationCentersList = emrOperationCentersList;
    }


    public List<EMRMedicalPersonTrained> getEmrMedicalPersonTrainedList() {
        return emrMedicalPersonTrainedList;
    }

    public void setEmrMedicalPersonTrainedList(List<EMRMedicalPersonTrained> emrMedicalPersonTrainedList) {
        this.emrMedicalPersonTrainedList = emrMedicalPersonTrainedList;
    }
}
