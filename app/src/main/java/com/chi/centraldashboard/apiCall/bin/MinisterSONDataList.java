package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MinisterSONDataList {

    @SerializedName("noof_application_son")
    @Expose
    private String noof_application_son;

    @SerializedName("issued_son")
    @Expose
    private String issued_son;

    @SerializedName("pending_son")
    @Expose
    private String pending_son;

    @SerializedName("noof_application_enc")
    @Expose
    private String noof_application_enc;


    @SerializedName("issued_enc")
    @Expose
    private String issued_enc;

    @SerializedName("pending_enc")
    @Expose
    private String pending_enc;


    public String getNoof_application_son() {
        return noof_application_son;
    }

    public void setNoof_application_son(String noof_application_son) {
        this.noof_application_son = noof_application_son;
    }

    public String getIssued_son() {
        return issued_son;
    }

    public void setIssued_son(String issued_son) {
        this.issued_son = issued_son;
    }

    public String getPending_son() {
        return pending_son;
    }

    public void setPending_son(String pending_son) {
        this.pending_son = pending_son;
    }

    public String getNoof_application_enc() {
        return noof_application_enc;
    }

    public void setNoof_application_enc(String noof_application_enc) {
        this.noof_application_enc = noof_application_enc;
    }

    public String getIssued_enc() {
        return issued_enc;
    }

    public void setIssued_enc(String issued_enc) {
        this.issued_enc = issued_enc;
    }

    public String getPending_enc() {
        return pending_enc;
    }

    public void setPending_enc(String pending_enc) {
        this.pending_enc = pending_enc;
    }
}
