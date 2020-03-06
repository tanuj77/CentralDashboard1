package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class NPPCFDataList {

    @SerializedName("Number_of_Districts_cumulative_covered_under_NPPCF")
    @Expose
    private List<NPPCF_Districts> nppcf_districtsList = null;

    @SerializedName("Budget_Allocation_for_Tertiary_Care_Component")
    @Expose
    private List<NPPCF_Budget> nppcf_budgetList = null;


    public List<NPPCF_Districts> getNppcf_districtsList() {
        return nppcf_districtsList;
    }

    public void setNppcf_districtsList(List<NPPCF_Districts> nppcf_districtsList) {
        this.nppcf_districtsList = nppcf_districtsList;
    }

    public List<NPPCF_Budget> getNppcf_budgetList() {
        return nppcf_budgetList;
    }

    public void setNppcf_budgetList(List<NPPCF_Budget> nppcf_budgetList) {
        this.nppcf_budgetList = nppcf_budgetList;
    }
}
