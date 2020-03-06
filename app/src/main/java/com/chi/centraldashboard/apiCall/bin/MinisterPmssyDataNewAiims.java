package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MinisterPmssyDataNewAiims {
    @SerializedName("SR NO")
    @Expose
    private Integer s_no;

    @SerializedName("project")
    @Expose
    private String  project;


    @SerializedName("state")
    @Expose
    private String state;

    @SerializedName("location")
    @Expose
    private String  location;

    @SerializedName("phase")
    @Expose
    private String phase;

    @SerializedName("project_status")
    @Expose
    private String project_status;

    @SerializedName("opd_status")
    @Expose
    private String opd_status;

    @SerializedName("mc_status")
    @Expose
    private String mc_status;

    @SerializedName("phy_progress")
    @Expose
    private String phy_progress;


    @SerializedName("New AIIMS Announced")
    @Expose
    private String new_aiims_announced;

    @SerializedName("created_at")
    @Expose
    private String created_at;


    public Integer getS_no() {
        return s_no;
    }

    public void setS_no(Integer s_no) {
        this.s_no = s_no;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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

    public String getProject_status() {
        return project_status;
    }

    public void setProject_status(String project_status) {
        this.project_status = project_status;
    }

    public String getOpd_status() {
        return opd_status;
    }

    public void setOpd_status(String opd_status) {
        this.opd_status = opd_status;
    }

    public String getMc_status() {
        return mc_status;
    }

    public void setMc_status(String mc_status) {
        this.mc_status = mc_status;
    }

    public String getPhy_progress() {
        return phy_progress;
    }

    public void setPhy_progress(String phy_progress) {
        this.phy_progress = phy_progress;
    }

    public String getNew_aiims_announced() {
        return new_aiims_announced;
    }

    public void setNew_aiims_announced(String new_aiims_announced) {
        this.new_aiims_announced = new_aiims_announced;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }
}
