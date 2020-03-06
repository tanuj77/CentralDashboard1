package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class VHPDataList {

    @SerializedName("Regional_labs_doing_enhanced_case_reporting")
    @Expose
    private List<VHP_Regional> vhp_regionalList = null;


    @SerializedName("Districts_reporting_on_acute_hepatitis_surveillance")
    @Expose
    private List<VHP_District> vhp_districtList = null;


    public List<VHP_Regional> getVhp_regionalList() {
        return vhp_regionalList;
    }

    public void setVhp_regionalList(List<VHP_Regional> vhp_regionalList) {
        this.vhp_regionalList = vhp_regionalList;
    }

    public List<VHP_District> getVhp_districtList() {
        return vhp_districtList;
    }

    public void setVhp_districtList(List<VHP_District> vhp_districtList) {
        this.vhp_districtList = vhp_districtList;
    }
}
