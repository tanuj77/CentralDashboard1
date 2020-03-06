package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StateDataList {
    @SerializedName("SR NO")
    @Expose
    private Integer sr_no;

    @SerializedName("State_ID")
    @Expose
    private String state_id;

    @SerializedName("state_char_code")
    @Expose
    private String state_char_code;

    @SerializedName("State_Name")
    @Expose
    private String state_name;


    public Integer getSr_no() {
        return sr_no;
    }

    public void setSr_no(Integer sr_no) {
        this.sr_no = sr_no;
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

    public String getState_name() {
        return state_name;
    }

    public void setState_name(String state_name) {
        this.state_name = state_name;
    }
}
