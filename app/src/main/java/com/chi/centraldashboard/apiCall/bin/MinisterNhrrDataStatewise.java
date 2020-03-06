package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MinisterNhrrDataStatewise {
    @SerializedName("SR NO")
    @Expose
    private Integer s_no;

    @SerializedName("state_name")
    @Expose
    private String state_name;

    @SerializedName("state_id")
    @Expose
    private String state_id;


    @SerializedName("state_char_code")
    @Expose
    private String state_char_code;

    @SerializedName("count")
    @Expose
    private String count;


    @SerializedName("Distribution of HE State wise")
    @Expose
    private String he_statewise;

    @SerializedName("created_at")
    @Expose
    private String created_at;



    public Integer getS_no() {
        return s_no;
    }

    public void setS_no(Integer s_no) {
        this.s_no = s_no;
    }

    public String getState_name() {
        return state_name;
    }

    public void setState_name(String state_name) {
        this.state_name = state_name;
    }

    public String getState_id() {
        return state_id;
    }

    public void setState_id(String state_id) {
        this.state_id = state_id;
    }

    public String getState_char_code() {
        return state_char_code;
    }

    public void setState_char_code(String state_char_code) {
        this.state_char_code = state_char_code;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getHe_statewise() {
        return he_statewise;
    }

    public void setHe_statewise(String he_statewise) {
        this.he_statewise = he_statewise;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }
}
