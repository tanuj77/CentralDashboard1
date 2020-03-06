package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CEARegistered {
    @SerializedName("SR_NO")
    @Expose
    private String SR_NO;

    @SerializedName("StateID")
    @Expose
    private String StateID;

    @SerializedName("State_Name")
    @Expose
    private String State_Name;

    @SerializedName("Year")
    @Expose
    private String Year;


    @SerializedName("submitted_date")
    @Expose
    private String submitted_date;

    @SerializedName("updated_date")
    @Expose
    private String updated_date;

    @SerializedName("allopathy")
    @Expose
    private String allopathy;

    @SerializedName("ayurveda")
    @Expose
    private String ayurveda;

    @SerializedName("unani")
    @Expose
    private String unani;

    @SerializedName("siddha")
    @Expose
    private String siddha;

    @SerializedName("homoeopathy")
    @Expose
    private String homoeopathy;

    @SerializedName("yoga")
    @Expose
    private String yoga;


    @SerializedName("naturapathy")
    @Expose
    private String naturapathy;

    @SerializedName("sowa")
    @Expose
    private String sowa;

    @SerializedName("total")
    @Expose
    private String total;

    @SerializedName("Total_Number_of_Clinical_Establishments_Registered")
    @Expose
    private String Total_Number_of_Clinical_Establishments_Registered;


    public String getSR_NO() {
        return SR_NO;
    }

    public void setSR_NO(String SR_NO) {
        this.SR_NO = SR_NO;
    }

    public String getStateID() {
        return StateID;
    }

    public void setStateID(String stateID) {
        StateID = stateID;
    }

    public String getState_Name() {
        return State_Name;
    }

    public void setState_Name(String state_Name) {
        State_Name = state_Name;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    public String getSubmitted_date() {
        return submitted_date;
    }

    public void setSubmitted_date(String submitted_date) {
        this.submitted_date = submitted_date;
    }

    public String getUpdated_date() {
        return updated_date;
    }

    public void setUpdated_date(String updated_date) {
        this.updated_date = updated_date;
    }

    public String getAllopathy() {
        return allopathy;
    }

    public void setAllopathy(String allopathy) {
        this.allopathy = allopathy;
    }

    public String getAyurveda() {
        return ayurveda;
    }

    public void setAyurveda(String ayurveda) {
        this.ayurveda = ayurveda;
    }

    public String getUnani() {
        return unani;
    }

    public void setUnani(String unani) {
        this.unani = unani;
    }

    public String getSiddha() {
        return siddha;
    }

    public void setSiddha(String siddha) {
        this.siddha = siddha;
    }

    public String getHomoeopathy() {
        return homoeopathy;
    }

    public void setHomoeopathy(String homoeopathy) {
        this.homoeopathy = homoeopathy;
    }

    public String getYoga() {
        return yoga;
    }

    public void setYoga(String yoga) {
        this.yoga = yoga;
    }

    public String getNaturapathy() {
        return naturapathy;
    }

    public void setNaturapathy(String naturapathy) {
        this.naturapathy = naturapathy;
    }

    public String getSowa() {
        return sowa;
    }

    public void setSowa(String sowa) {
        this.sowa = sowa;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getTotal_Number_of_Clinical_Establishments_Registered() {
        return Total_Number_of_Clinical_Establishments_Registered;
    }

    public void setTotal_Number_of_Clinical_Establishments_Registered(String total_Number_of_Clinical_Establishments_Registered) {
        Total_Number_of_Clinical_Establishments_Registered = total_Number_of_Clinical_Establishments_Registered;
    }
}
