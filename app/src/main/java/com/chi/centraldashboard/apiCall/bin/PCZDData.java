package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PCZDData {
    @SerializedName("PCZDdata")
    @Expose
    private List<PCZDDataList> pczdDataListList = null;

    @SerializedName("Total_Health_and_Veterinary_professionals_trained")
    @Expose
    private List<PCZDTrained> pczdTrainedList = null;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("status")
    @Expose
    private int status;

    public List<PCZDDataList> getPczdDataListList() {
        return pczdDataListList;
    }

    public void setPczdDataListList(List<PCZDDataList> pczdDataListList) {
        this.pczdDataListList = pczdDataListList;
    }

    public List<PCZDTrained> getPczdTrainedList() {
        return pczdTrainedList;
    }

    public void setPczdTrainedList(List<PCZDTrained> pczdTrainedList) {
        this.pczdTrainedList = pczdTrainedList;
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
