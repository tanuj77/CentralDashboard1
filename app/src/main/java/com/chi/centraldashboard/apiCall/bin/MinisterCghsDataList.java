package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class    MinisterCghsDataList {
    @SerializedName("No. of empanelled Health Care Organisations ")
    @Expose
    private String no_of_empanelled_HealthCareOrg;

    @SerializedName("MRC Claims Pending > 30 days")
    @Expose
    private String mrc_claims_pending;

    public String getNo_of_empanelled_HealthCareOrg() {
        return no_of_empanelled_HealthCareOrg;
    }

    public void setNo_of_empanelled_HealthCareOrg(String no_of_empanelled_HealthCareOrg) {
        this.no_of_empanelled_HealthCareOrg = no_of_empanelled_HealthCareOrg;
    }

    public String getMrc_claims_pending() {
        return mrc_claims_pending;
    }

    public void setMrc_claims_pending(String mrc_claims_pending) {
        this.mrc_claims_pending = mrc_claims_pending;
    }
}
