package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MinisterDialysisDataList {
    @SerializedName("No_of_districts_with_functional_dialysis_units_against_the_total_districts")
    @Expose
    private List<MinisterDialysisDistrict> ministerDialysisDistrictList = null;

    @SerializedName("No_of_patients_receiving_treatment_sessions_held_under_PMNDP")
    @Expose
    private List<MinisterDialysisPMNDP> ministerDialysisPMNDPList = null;


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
}
