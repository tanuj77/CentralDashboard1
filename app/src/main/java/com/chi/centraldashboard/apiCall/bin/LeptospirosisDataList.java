package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LeptospirosisDataList {
    @SerializedName("Total_Number_of_districts_affected")
    @Expose
    private List<LeptospirosisDAffected> leptospirosisDAffectedList = null;


    @SerializedName("Total_Number_of_Leptospirosis_outbreaks_reported")
    @Expose
    private List<LeptospirosisOReported> leptospirosisOReportedList = null;


    @SerializedName("Total_laboratory_leptospirosis_casesreported")
    @Expose
    private List<LeptospirosisLCC> leptospirosisLCCList = null;



    public List<LeptospirosisDAffected> getLeptospirosisDAffectedList() {
        return leptospirosisDAffectedList;
    }

    public void setLeptospirosisDAffectedList(List<LeptospirosisDAffected> leptospirosisDAffectedList) {
        this.leptospirosisDAffectedList = leptospirosisDAffectedList;
    }

    public List<LeptospirosisOReported> getLeptospirosisOReportedList() {
        return leptospirosisOReportedList;
    }

    public void setLeptospirosisOReportedList(List<LeptospirosisOReported> leptospirosisOReportedList) {
        this.leptospirosisOReportedList = leptospirosisOReportedList;
    }

    public List<LeptospirosisLCC> getLeptospirosisLCCList() {
        return leptospirosisLCCList;
    }

    public void setLeptospirosisLCCList(List<LeptospirosisLCC> leptospirosisLCCList) {
        this.leptospirosisLCCList = leptospirosisLCCList;
    }
}
