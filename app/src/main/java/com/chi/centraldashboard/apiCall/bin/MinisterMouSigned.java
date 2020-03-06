package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MinisterMouSigned {
    @SerializedName("SR_NO")
    @Expose
    private Integer SR_NO;

    @SerializedName("subject")
    @Expose
    private String subject;

    @SerializedName("country")
    @Expose
    private String country;

    @SerializedName("date_of_signing")
    @Expose
    private String date_of_signing;

    @SerializedName("auto_renewal")
    @Expose
    private Integer auto_renewal;

    @SerializedName("status")
    @Expose
    private Integer status;

    @SerializedName("Total_No_of_MOUs_Signed")
    @Expose
    private Integer Total_No_of_MOUs_Signed;


    public Integer getSR_NO() {
        return SR_NO;
    }

    public void setSR_NO(Integer SR_NO) {
        this.SR_NO = SR_NO;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDate_of_signing() {
        return date_of_signing;
    }

    public void setDate_of_signing(String date_of_signing) {
        this.date_of_signing = date_of_signing;
    }

    public Integer getAuto_renewal() {
        return auto_renewal;
    }

    public void setAuto_renewal(Integer auto_renewal) {
        this.auto_renewal = auto_renewal;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getTotal_No_of_MOUs_Signed() {
        return Total_No_of_MOUs_Signed;
    }

    public void setTotal_No_of_MOUs_Signed(Integer total_No_of_MOUs_Signed) {
        Total_No_of_MOUs_Signed = total_No_of_MOUs_Signed;
    }
}
