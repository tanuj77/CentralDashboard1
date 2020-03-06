package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RTIDataList {
    @SerializedName("RTI_Applications_Received")
    @Expose
    private String RTI_Applications_Received;

    @SerializedName("RTI_Application_Disposed_Off")
    @Expose
    private String RTI_Application_Disposed_Off;

    @SerializedName("First_Appeal_Received")
    @Expose
    private String First_Appeal_Received;

    @SerializedName("First_Appeal_Disposed_Off")
    @Expose
    private String First_Appeal_Disposed_Off;


    public String getRTI_Applications_Received() {
        return RTI_Applications_Received;
    }

    public void setRTI_Applications_Received(String RTI_Applications_Received) {
        this.RTI_Applications_Received = RTI_Applications_Received;
    }

    public String getRTI_Application_Disposed_Off() {
        return RTI_Application_Disposed_Off;
    }

    public void setRTI_Application_Disposed_Off(String RTI_Application_Disposed_Off) {
        this.RTI_Application_Disposed_Off = RTI_Application_Disposed_Off;
    }

    public String getFirst_Appeal_Received() {
        return First_Appeal_Received;
    }

    public void setFirst_Appeal_Received(String first_Appeal_Received) {
        First_Appeal_Received = first_Appeal_Received;
    }

    public String getFirst_Appeal_Disposed_Off() {
        return First_Appeal_Disposed_Off;
    }

    public void setFirst_Appeal_Disposed_Off(String first_Appeal_Disposed_Off) {
        First_Appeal_Disposed_Off = first_Appeal_Disposed_Off;
    }
}
