package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MinisterPmjayPreAuthorizations {
    @SerializedName("SR NO")
    @Expose
    private String sr_no;

    @SerializedName("state_id")
    @Expose
    private String state_id;

    @SerializedName("State_Name")
    @Expose
    private String state_name;

    @SerializedName("no_pre_authorizations")
    @Expose
    private String no_pre_authorizations;


    @SerializedName("Total_No_of_Pre_Authorizations_Done")
    @Expose
    private String noofpreauthorizationsdone;

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

    public String getNo_pre_authorizations() {
        return no_pre_authorizations;
    }

    public void setNo_pre_authorizations(String no_pre_authorizations) {
        this.no_pre_authorizations = no_pre_authorizations;
    }

    public String getNoofpreauthorizationsdone() {
        return noofpreauthorizationsdone;
    }

    public void setNoofpreauthorizationsdone(String noofpreauthorizationsdone) {
        this.noofpreauthorizationsdone = noofpreauthorizationsdone;
    }

//    public String getCreated_at() {
//        return created_at;
//    }
//
//    public void setCreated_at(String created_at) {
//        this.created_at = created_at;
//    }
}
