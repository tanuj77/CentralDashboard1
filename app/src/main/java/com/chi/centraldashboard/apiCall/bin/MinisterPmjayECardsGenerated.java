package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MinisterPmjayECardsGenerated {

    @SerializedName("SR NO")
    @Expose
    private String sr_no;

    @SerializedName("state_id")
    @Expose
    private String state_id;

    @SerializedName("State_Name")
    @Expose
    private String state_name;

    @SerializedName("no_of_ecards_generated")
    @Expose
    private String no_ecards_generated;


    @SerializedName("Total_No_of_E_Cards_Generated")
    @Expose
    private String noofecardsgenerated;

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

    public String getNo_ecards_generated() {
        return no_ecards_generated;
    }

    public void setNo_ecards_generated(String no_ecards_generated) {
        this.no_ecards_generated = no_ecards_generated;
    }

    public String getNoofecardsgenerated() {
        return noofecardsgenerated;
    }

    public void setNoofecardsgenerated(String noofecardsgenerated) {
        this.noofecardsgenerated = noofecardsgenerated;
    }

//    public String getCreated_at() {
//        return created_at;
//    }
//
//    public void setCreated_at(String created_at) {
//        this.created_at = created_at;
//    }
}
