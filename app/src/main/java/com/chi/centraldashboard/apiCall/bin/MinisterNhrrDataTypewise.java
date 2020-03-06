package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MinisterNhrrDataTypewise {

    @SerializedName("SR NO")
    @Expose
    private Integer sr_no;

    @SerializedName("state_name")
    @Expose
    private String state_name;

    @SerializedName("state_id")
    @Expose
    private String state_id;

    @SerializedName("state_char_code")
    @Expose
    private String state_char_code;


    @SerializedName("sc")
    @Expose
    private String sc;

    @SerializedName("phc")
    @Expose
    private String phc;

    @SerializedName("chc")
    @Expose
    private String chc;

    @SerializedName("sdh")
    @Expose
    private String sdh;


    @SerializedName("mch")
    @Expose
    private String mch;

    @SerializedName("clinic")
    @Expose
    private String clinic;

    @SerializedName("diagnostic")
    @Expose
    private String diagnostic;

    @SerializedName("bloodbank")
    @Expose
    private String bloodbank;


    @SerializedName("pharmacy")
    @Expose
    private String pharmacy;

    @SerializedName("physiotherapy")
    @Expose
    private String physiotherapy;

    @SerializedName("Distribution of HE Typewise")
    @Expose
    private String he_typewise;


    @SerializedName("created_at")
    @Expose
    private String created_at;


    public Integer getSr_no() {
        return sr_no;
    }

    public void setSr_no(Integer sr_no) {
        this.sr_no = sr_no;
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

    public String getSc() {
        return sc;
    }

    public void setSc(String sc) {
        this.sc = sc;
    }

    public String getPhc() {
        return phc;
    }

    public void setPhc(String phc) {
        this.phc = phc;
    }

    public String getChc() {
        return chc;
    }

    public void setChc(String chc) {
        this.chc = chc;
    }

    public String getSdh() {
        return sdh;
    }

    public void setSdh(String sdh) {
        this.sdh = sdh;
    }

    public String getMch() {
        return mch;
    }

    public void setMch(String mch) {
        this.mch = mch;
    }

    public String getClinic() {
        return clinic;
    }

    public void setClinic(String clinic) {
        this.clinic = clinic;
    }

    public String getDiagnostic() {
        return diagnostic;
    }

    public void setDiagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }

    public String getBloodbank() {
        return bloodbank;
    }

    public void setBloodbank(String bloodbank) {
        this.bloodbank = bloodbank;
    }

    public String getPharmacy() {
        return pharmacy;
    }

    public void setPharmacy(String pharmacy) {
        this.pharmacy = pharmacy;
    }

    public String getPhysiotherapy() {
        return physiotherapy;
    }

    public void setPhysiotherapy(String physiotherapy) {
        this.physiotherapy = physiotherapy;
    }

    public String getHe_typewise() {
        return he_typewise;
    }

    public void setHe_typewise(String he_typewise) {
        this.he_typewise = he_typewise;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }
}
