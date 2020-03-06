package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PCZDDataList {
    @SerializedName("Total_Health_and_Veterinary_professionals_trained")
    @Expose
    private List<PCZDTrained> pczdTrainedList = null;

    public List<PCZDTrained> getPczdTrainedList() {
        return pczdTrainedList;
    }

    public void setPczdTrainedList(List<PCZDTrained> pczdTrainedList) {
        this.pczdTrainedList = pczdTrainedList;
    }
}
