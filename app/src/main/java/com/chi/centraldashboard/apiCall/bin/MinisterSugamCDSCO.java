package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MinisterSugamCDSCO {
    @SerializedName("SR_NO")
    @Expose
    private String SR_NO;


    @SerializedName("Division")
    @Expose
    private String Division;


    @SerializedName("Total_New_Applications_in_CDSCO")
    @Expose
    private String Total_New_Applications_in_CDSCO;

    @SerializedName("Total_Under_Process_Applications_in_CDSCO")
    @Expose
    private String Total_Under_Process_Applications_in_CDSCO;

    @SerializedName("Total_Raised_Applications_in_CDSCO")
    @Expose
    private String Total_Raised_Applications_in_CDSCO;

    @SerializedName("Total_Approved_Applications_in_CDSCO")
    @Expose
    private String Total_Approved_Applications_in_CDSCO;

    @SerializedName("Total_Rejected_Applications_in_CDSCO")
    @Expose
    private String Total_Rejected_Applications_in_CDSCO;


    @SerializedName("Sum_Application_in_CDSCO")
    @Expose
    private String Sum_Application_in_CDSCO;


    public String getSR_NO() {
        return SR_NO;
    }

    public void setSR_NO(String SR_NO) {
        this.SR_NO = SR_NO;
    }

    public String getDivision() {
        return Division;
    }

    public void setDivision(String division) {
        Division = division;
    }

    public String getTotal_New_Applications_in_CDSCO() {
        return Total_New_Applications_in_CDSCO;
    }

    public void setTotal_New_Applications_in_CDSCO(String total_New_Applications_in_CDSCO) {
        Total_New_Applications_in_CDSCO = total_New_Applications_in_CDSCO;
    }

    public String getTotal_Under_Process_Applications_in_CDSCO() {
        return Total_Under_Process_Applications_in_CDSCO;
    }

    public void setTotal_Under_Process_Applications_in_CDSCO(String total_Under_Process_Applications_in_CDSCO) {
        Total_Under_Process_Applications_in_CDSCO = total_Under_Process_Applications_in_CDSCO;
    }

    public String getTotal_Raised_Applications_in_CDSCO() {
        return Total_Raised_Applications_in_CDSCO;
    }

    public void setTotal_Raised_Applications_in_CDSCO(String total_Raised_Applications_in_CDSCO) {
        Total_Raised_Applications_in_CDSCO = total_Raised_Applications_in_CDSCO;
    }

    public String getTotal_Approved_Applications_in_CDSCO() {
        return Total_Approved_Applications_in_CDSCO;
    }

    public void setTotal_Approved_Applications_in_CDSCO(String total_Approved_Applications_in_CDSCO) {
        Total_Approved_Applications_in_CDSCO = total_Approved_Applications_in_CDSCO;
    }

    public String getTotal_Rejected_Applications_in_CDSCO() {
        return Total_Rejected_Applications_in_CDSCO;
    }

    public void setTotal_Rejected_Applications_in_CDSCO(String total_Rejected_Applications_in_CDSCO) {
        Total_Rejected_Applications_in_CDSCO = total_Rejected_Applications_in_CDSCO;
    }

    public String getSum_Application_in_CDSCO() {
        return Sum_Application_in_CDSCO;
    }

    public void setSum_Application_in_CDSCO(String sum_Application_in_CDSCO) {
        Sum_Application_in_CDSCO = sum_Application_in_CDSCO;
    }
}
