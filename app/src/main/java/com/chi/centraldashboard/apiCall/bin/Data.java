package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("ID")
    @Expose
    private Integer iD;

    @SerializedName("USER_NAME")
    @Expose
    private String uSERNAME;

    @SerializedName("EMAIL_ID")
    @Expose
    private String eMAILID;

    @SerializedName("State_ID")
    @Expose
    private String sTATEID;

    @SerializedName("State_Name")
    @Expose
    private String sTATENAME;

    @SerializedName("District_ID")
    @Expose
    private String dISTRICTID;

    @SerializedName("District_Name")
    @Expose
    private String dISTRICTNAME;

    @SerializedName("role")
    @Expose
    private String rOLE;

    @SerializedName("role_value")
    @Expose
    private String rOLEVALUE;

    public Integer getID() {
        return iD;
    }

    public void setID(Integer iD) {
        this.iD = iD;
    }

    public String getUSERNAME() {
        return uSERNAME;
    }

    public void setUSERNAME(String uSERNAME) {
        this.uSERNAME = uSERNAME;
    }

    public String getEMAILID() {
        return eMAILID;
    }

    public void setEMAILID(String eMAILID) {
        this.eMAILID = eMAILID;
    }

    public String getsTATEID() {
        return sTATEID;
    }

    public void setsTATEID(String sTATEID) {
        this.sTATEID = sTATEID;
    }

    public String getsTATENAME() {
        return sTATENAME;
    }

    public void setsTATENAME(String sTATENAME) {
        this.sTATENAME = sTATENAME;
    }

    public String getdISTRICTID() {
        return dISTRICTID;
    }

    public void setdISTRICTID(String dISTRICTID) {
        this.dISTRICTID = dISTRICTID;
    }

    public String getdISTRICTNAME() {
        return dISTRICTNAME;
    }

    public void setdISTRICTNAME(String dISTRICTNAME) {
        this.dISTRICTNAME = dISTRICTNAME;
    }

    public String getrOLE() {
        return rOLE;
    }

    public void setrOLE(String rOLE) {
        this.rOLE = rOLE;
    }

    public String getrOLEVALUE() {
        return rOLEVALUE;
    }

    public void setrOLEVALUE(String rOLEVALUE) {
        this.rOLEVALUE = rOLEVALUE;
    }
}