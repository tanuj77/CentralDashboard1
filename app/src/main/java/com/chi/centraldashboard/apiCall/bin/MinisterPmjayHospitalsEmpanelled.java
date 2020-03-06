package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MinisterPmjayHospitalsEmpanelled {

    @SerializedName("SR NO")
    @Expose
    private String sr_no;

    @SerializedName("state_id")
    @Expose
    private String state_id;

    @SerializedName("State_Name")
    @Expose
    private String state_name;

    @SerializedName("hospitals_empanelled_scheme")
    @Expose
    private String hospitals_empanelled_scheme;

    @SerializedName("Total_hospitals_empanelled_scheme")
    @Expose
    private String hospitalsempanelledunderthescheme;

//    @SerializedName("created_at")
//    @Expose
//    private String created_at;


    public String getSr_no() {
        return sr_no;
    }

    public void setSr_no(String sr_no) {
        this.sr_no = sr_no;
    }

    public String getState_id() {
        return state_id;
    }

    public void setState_id(String state_id) {
        this.state_id = state_id;
    }

    public String getState_name() {
        return state_name;
    }

    public void setState_name(String state_name) {
        this.state_name = state_name;
    }

    public String getHospitals_empanelled_scheme() {
        return hospitals_empanelled_scheme;
    }

    public void setHospitals_empanelled_scheme(String hospitals_empanelled_scheme) {
        this.hospitals_empanelled_scheme = hospitals_empanelled_scheme;
    }

    public String getHospitalsempanelledunderthescheme() {
        return hospitalsempanelledunderthescheme;
    }

    public void setHospitalsempanelledunderthescheme(String hospitalsempanelledunderthescheme) {
        this.hospitalsempanelledunderthescheme = hospitalsempanelledunderthescheme;
    }

//    public String getCreated_at() {
//        return created_at;
//    }
//
//    public void setCreated_at(String created_at) {
//        this.created_at = created_at;
//    }
}
