package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MinisterDialysisData {
    @SerializedName("dialysis")
    @Expose
    private List<MinisterDialysisDataList> ministerDialysisDataListList = null;

    @SerializedName("No_of_districts_with_functional_dialysis_units_against_the_total_districts")
    @Expose
    private List<MinisterDialysisDistrict> ministerDialysisDistrictList = null;

    @SerializedName("No_of_patients_receiving_treatment_sessions_held_under_PMNDP")
    @Expose
    private List<MinisterDialysisPMNDP> ministerDialysisPMNDPList = null;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("status")
    @Expose
    private int status;

    public List<MinisterDialysisDataList> getMinisterDialysisDataListList() {
        return ministerDialysisDataListList;
    }

    public void setMinisterDialysisDataListList(List<MinisterDialysisDataList> ministerDialysisDataListList) {
        this.ministerDialysisDataListList = ministerDialysisDataListList;
    }

    public List<MinisterDialysisDistrict> getMinisterDialysisDistrictList() {
        return ministerDialysisDistrictList;
    }

    public void setMinisterDialysisDistrictList(List<MinisterDialysisDistrict> ministerDialysisDistrictList) {
        this.ministerDialysisDistrictList = ministerDialysisDistrictList;
    }

    public List<MinisterDialysisPMNDP> getMinisterDialysisPMNDPList() {
        return ministerDialysisPMNDPList;
    }

    public void setMinisterDialysisPMNDPList(List<MinisterDialysisPMNDP> ministerDialysisPMNDPList) {
        this.ministerDialysisPMNDPList = ministerDialysisPMNDPList;
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
