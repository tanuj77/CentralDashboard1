package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MinisterPbsDataList {
    @SerializedName("Personnel_trained_on_NCD_application")
    @Expose
    private List<MinisterPbsTrainedNcd> ministerPbsTrainedNcdList=null;

    @SerializedName("Total_Persons_enrolled_in_NCD_application")
    @Expose
    private Integer Total_Persons_enrolled_in_NCD_application;


    @SerializedName("Total_Persons_screened")
    @Expose
    private Integer Total_Persons_screened;


    public List<MinisterPbsTrainedNcd> getMinisterPbsTrainedNcdList() {
        return ministerPbsTrainedNcdList;
    }

    public void setMinisterPbsTrainedNcdList(List<MinisterPbsTrainedNcd> ministerPbsTrainedNcdList) {
        this.ministerPbsTrainedNcdList = ministerPbsTrainedNcdList;
    }

    public Integer getTotal_Persons_enrolled_in_NCD_application() {
        return Total_Persons_enrolled_in_NCD_application;
    }

    public void setTotal_Persons_enrolled_in_NCD_application(Integer total_Persons_enrolled_in_NCD_application) {
        Total_Persons_enrolled_in_NCD_application = total_Persons_enrolled_in_NCD_application;
    }

    public Integer getTotal_Persons_screened() {
        return Total_Persons_screened;
    }

    public void setTotal_Persons_screened(Integer total_Persons_screened) {
        Total_Persons_screened = total_Persons_screened;
    }
}
