package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class NCDCDataList {

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
}
