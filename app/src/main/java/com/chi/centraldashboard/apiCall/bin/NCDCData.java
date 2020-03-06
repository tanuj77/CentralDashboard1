package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class NCDCData {
    @SerializedName("STRENGTHENING_OF_NCDC_BRANCHES")
    @Expose
    private List<NCDCDataList> ncdcDataListList;

    @SerializedName("MOU_Signed_Between_Govt_of_India_And_State_Govt")
    @Expose
    private List<NCDCMOUSigned> ncdcmouSignedList;

    @SerializedName("Lease_Deed_Signed_Land_Transfered")
    @Expose
    private List<NCDCLeaseDeed> ncdcLeaseDeedList;

    @SerializedName("Money_Released_For_Construction_of_Branches_In_Lakh")
    @Expose
    private List<NCDCMoneyReleased>ncdcMoneyReleasedList;


    @SerializedName("Total_Amount_In_Lakh")
    @Expose
    private List<NCDCTotalAmount>ncdcTotalAmountList;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("status")
    @Expose
    private int status;


    public List<NCDCDataList> getNcdcDataListList() {
        return ncdcDataListList;
    }

    public void setNcdcDataListList(List<NCDCDataList> ncdcDataListList) {
        this.ncdcDataListList = ncdcDataListList;
    }

    public List<NCDCMOUSigned> getNcdcmouSignedList() {
        return ncdcmouSignedList;
    }

    public void setNcdcmouSignedList(List<NCDCMOUSigned> ncdcmouSignedList) {
        this.ncdcmouSignedList = ncdcmouSignedList;
    }

    public List<NCDCLeaseDeed> getNcdcLeaseDeedList() {
        return ncdcLeaseDeedList;
    }

    public void setNcdcLeaseDeedList(List<NCDCLeaseDeed> ncdcLeaseDeedList) {
        this.ncdcLeaseDeedList = ncdcLeaseDeedList;
    }

    public List<NCDCMoneyReleased> getNcdcMoneyReleasedList() {
        return ncdcMoneyReleasedList;
    }

    public void setNcdcMoneyReleasedList(List<NCDCMoneyReleased> ncdcMoneyReleasedList) {
        this.ncdcMoneyReleasedList = ncdcMoneyReleasedList;
    }

    public List<NCDCTotalAmount> getNcdcTotalAmountList() {
        return ncdcTotalAmountList;
    }

    public void setNcdcTotalAmountList(List<NCDCTotalAmount> ncdcTotalAmountList) {
        this.ncdcTotalAmountList = ncdcTotalAmountList;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
