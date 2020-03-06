package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MinisterAtrDataList {

    @SerializedName("No_of_Pending_ATR_on_PMO_References")
    @Expose
    private List<MinisterAtrPmo> ministerAtrPmoList=null;


    @SerializedName("No_of_VIP_References")
    @Expose
    private List<MinisterAtrVip> ministerAtrVipList=null;


    @SerializedName("No_of_Parliament_Assurances")
    @Expose
    private List<MinisterAtrParliament> ministerAtrParliamentList=null;


    public List<MinisterAtrPmo> getMinisterAtrPmoList() {
        return ministerAtrPmoList;
    }

    public void setMinisterAtrPmoList(List<MinisterAtrPmo> ministerAtrPmoList) {
        this.ministerAtrPmoList = ministerAtrPmoList;
    }

    public List<MinisterAtrVip> getMinisterAtrVipList() {
        return ministerAtrVipList;
    }

    public void setMinisterAtrVipList(List<MinisterAtrVip> ministerAtrVipList) {
        this.ministerAtrVipList = ministerAtrVipList;
    }

    public List<MinisterAtrParliament> getMinisterAtrParliamentList() {
        return ministerAtrParliamentList;
    }

    public void setMinisterAtrParliamentList(List<MinisterAtrParliament> ministerAtrParliamentList) {
        this.ministerAtrParliamentList = ministerAtrParliamentList;
    }
}
