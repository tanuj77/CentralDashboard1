package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MinisterPmssyDataMedicalCollege {

    @SerializedName("SR NO")
    @Expose
    private Integer s_no;

    @SerializedName("state")
    @Expose
    private String state;

    @SerializedName("project")
    @Expose
    private String project;

    @SerializedName("location")
    @Expose
    private String location;

    @SerializedName("phase")
    @Expose
    private String phase;

    @SerializedName("approvedcost")
    @Expose
    private String approvedcost;

    @SerializedName("project_status")
    @Expose
    private String project_status;

    @SerializedName("phy_progress")
    @Expose
    private String phy_progress;



    @SerializedName("Medical College Upgradation")
    @Expose
    private String medical_college_upgradation;

    @SerializedName("created_at")
    @Expose
    private String created_at;


    public Integer getS_no() {
        return s_no;
    }

    public void setS_no(Integer s_no) {
        this.s_no = s_no;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public String getApprovedcost() {
        return approvedcost;
    }

    public void setApprovedcost(String approvedcost) {
        this.approvedcost = approvedcost;
    }

    public String getProject_status() {
        return project_status;
    }

    public void setProject_status(String project_status) {
        this.project_status = project_status;
    }

    public String getPhy_progress() {
        return phy_progress;
    }

    public void setPhy_progress(String phy_progress) {
        this.phy_progress = phy_progress;
    }

    public String getMedical_college_upgradation() {
        return medical_college_upgradation;
    }

    public void setMedical_college_upgradation(String medical_college_upgradation) {
        this.medical_college_upgradation = medical_college_upgradation;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }
}
