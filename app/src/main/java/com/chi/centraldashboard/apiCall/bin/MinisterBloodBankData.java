package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MinisterBloodBankData {
    @SerializedName("BLOOD_BANK")
    @Expose
    private List<MinisterBloodBankDataList> ministerBloodBankDataListList=null;

    @SerializedName("No_of_functional_Blood_Banks_against_the_target_of_District_Hospitals_having_100_beds")
    @Expose
    private List<MinisterBloodBankDH> ministerBloodBankDHList =null;
    @SerializedName("No_of_functional_Blood_Banks_against_no_of_functional_Bloodbanks_BSUs")
    @Expose
    private List<MinisterBloodBankBSU> ministerBloodBankBSUList =null;


    @SerializedName("title")
    private String title;

    @SerializedName("status")
    @Expose
    private int status;


    public List<MinisterBloodBankDataList> getMinisterBloodBankDataListList() {
        return ministerBloodBankDataListList;
    }

    public void setMinisterBloodBankDataListList(List<MinisterBloodBankDataList> ministerBloodBankDataListList) {
        this.ministerBloodBankDataListList = ministerBloodBankDataListList;
    }

    public List<MinisterBloodBankBSU> getMinisterBloodBankBSUList() {
        return ministerBloodBankBSUList;
    }

    public void setMinisterBloodBankBSUList(List<MinisterBloodBankBSU> ministerBloodBankBSUList) {
        this.ministerBloodBankBSUList = ministerBloodBankBSUList;
    }

    public List<MinisterBloodBankDH> getMinisterBloodBankDHList() {
        return ministerBloodBankDHList;
    }

    public void setMinisterBloodBankDHList(List<MinisterBloodBankDH> ministerBloodBankDHList) {
        this.ministerBloodBankDHList = ministerBloodBankDHList;
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
