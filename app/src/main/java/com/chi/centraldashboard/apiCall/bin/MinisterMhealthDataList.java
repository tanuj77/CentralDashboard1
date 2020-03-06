package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MinisterMhealthDataList {
    @SerializedName("Total_mCessation_User_Registered")
    @Expose
    private String Total_mCessation_User_Registered;

    @SerializedName("Total_mDiabetes_User_Registered")
    @Expose
    private String Total_mDiabetes_User_Registered;

    public String getTotal_mCessation_User_Registered() {
        return Total_mCessation_User_Registered;
    }

    public void setTotal_mCessation_User_Registered(String total_mCessation_User_Registered) {
        Total_mCessation_User_Registered = total_mCessation_User_Registered;
    }

    public String getTotal_mDiabetes_User_Registered() {
        return Total_mDiabetes_User_Registered;
    }

    public void setTotal_mDiabetes_User_Registered(String total_mDiabetes_User_Registered) {
        Total_mDiabetes_User_Registered = total_mDiabetes_User_Registered;
    }
}
