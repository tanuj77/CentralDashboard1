package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MinisterRchDataList {
    @SerializedName("Total_No_of_Eligible_Couple_Registered")
    @Expose
    private String total_No_of_Eligible_Couple_Registered;

    @SerializedName("Total_No_of_Pregnant_Woman_Registered")
    @Expose
    private String total_No_of_Pregnant_Woman_Registered;

    @SerializedName("Total_No_of_Children_Registered")
    @Expose
    private String total_No_of_Children_Registered;


    @SerializedName("Total_No_of_Health_Providers")
    @Expose
    private String total_No_of_Health_Providers;


    public String getTotal_No_of_Eligible_Couple_Registered() {
        return total_No_of_Eligible_Couple_Registered;
    }

    public void setTotal_No_of_Eligible_Couple_Registered(String total_No_of_Eligible_Couple_Registered) {
        this.total_No_of_Eligible_Couple_Registered = total_No_of_Eligible_Couple_Registered;
    }

    public String getTotal_No_of_Pregnant_Woman_Registered() {
        return total_No_of_Pregnant_Woman_Registered;
    }

    public void setTotal_No_of_Pregnant_Woman_Registered(String total_No_of_Pregnant_Woman_Registered) {
        this.total_No_of_Pregnant_Woman_Registered = total_No_of_Pregnant_Woman_Registered;
    }

    public String getTotal_No_of_Children_Registered() {
        return total_No_of_Children_Registered;
    }

    public void setTotal_No_of_Children_Registered(String total_No_of_Children_Registered) {
        this.total_No_of_Children_Registered = total_No_of_Children_Registered;
    }

    public String getTotal_No_of_Health_Providers() {
        return total_No_of_Health_Providers;
    }

    public void setTotal_No_of_Health_Providers(String total_No_of_Health_Providers) {
        this.total_No_of_Health_Providers = total_No_of_Health_Providers;
    }
}
