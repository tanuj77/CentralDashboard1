package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MinisterPbsTrainedNcd {

    @SerializedName("SR_NO")
    @Expose
    private Integer SR_NO;

    @SerializedName("state_id")
    @Expose
    private Integer state_id;

    @SerializedName("State_Name")
    @Expose
    private String State_Name;

    @SerializedName("trained_NCD_appl")
    @Expose
    private String trained_NCD_appl;

    @SerializedName("Total_Personnel_trained_on_NCD_application")
    @Expose
    private Integer Total_Personnel_trained_on_NCD_application;

    @SerializedName("submitted_date")
    @Expose
    private String submitted_date;


    public Integer getSR_NO() {
        return SR_NO;
    }

    public void setSR_NO(Integer SR_NO) {
        this.SR_NO = SR_NO;
    }

    public Integer getState_id() {
        return state_id;
    }

    public void setState_id(Integer state_id) {
        this.state_id = state_id;
    }

    public String getState_Name() {
        return State_Name;
    }

    public void setState_Name(String state_Name) {
        State_Name = state_Name;
    }

    public String getTrained_NCD_appl() {
        return trained_NCD_appl;
    }

    public void setTrained_NCD_appl(String trained_NCD_appl) {
        this.trained_NCD_appl = trained_NCD_appl;
    }

    public Integer getTotal_Personnel_trained_on_NCD_application() {
        return Total_Personnel_trained_on_NCD_application;
    }

    public void setTotal_Personnel_trained_on_NCD_application(Integer total_Personnel_trained_on_NCD_application) {
        Total_Personnel_trained_on_NCD_application = total_Personnel_trained_on_NCD_application;
    }

    public String getSubmitted_date() {
        return submitted_date;
    }

    public void setSubmitted_date(String submitted_date) {
        this.submitted_date = submitted_date;
    }
}
