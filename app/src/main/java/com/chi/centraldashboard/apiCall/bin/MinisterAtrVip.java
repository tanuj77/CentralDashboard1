package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MinisterAtrVip {
    @SerializedName("SR_NO")
    @Expose
    private String SR_NO;


    @SerializedName("devesion")
    @Expose
    private String devesion;


    @SerializedName("name")
    @Expose
    private String name;


    @SerializedName("date")
    @Expose
    private String date;


    @SerializedName("No_of_VIP_References")
    @Expose
    private String No_of_VIP_References;

    @SerializedName("submitted_date")
    @Expose
    private String submitted_date;


    @SerializedName("updated_date")
    @Expose
    private String updated_date;


    public String getSR_NO() {
        return SR_NO;
    }

    public void setSR_NO(String SR_NO) {
        this.SR_NO = SR_NO;
    }

    public String getDevesion() {
        return devesion;
    }

    public void setDevesion(String devesion) {
        this.devesion = devesion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNo_of_VIP_References() {
        return No_of_VIP_References;
    }

    public void setNo_of_VIP_References(String no_of_VIP_References) {
        No_of_VIP_References = no_of_VIP_References;
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
}
