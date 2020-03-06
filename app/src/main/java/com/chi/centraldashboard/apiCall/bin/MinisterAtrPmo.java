package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MinisterAtrPmo {
    @SerializedName("SR_NO")
    @Expose
    private String SR_NO;


    @SerializedName("Name_Of_Section")
    @Expose
    private String Name_Of_Section;


    @SerializedName("No_of_Pending_ATR_on_PMO_References")
    @Expose
    private String No_of_Pending_ATR_on_PMO_References;


    @SerializedName("date1")
    @Expose
    private String date1;


    @SerializedName("Total_No_of_Pending_ATR_on_PMO_References")
    @Expose
    private String Total_No_of_Pending_ATR_on_PMO_References;

    @SerializedName("submitted_date")
    @Expose
    private String submitted_date;


    @SerializedName("updated_date")
    @Expose
    private String updated_date;


    public String getSR_NO() {
        return SR_NO;
    }

    public void setSR_NO(String SR_NO) {
        this.SR_NO = SR_NO;
    }

    public String getName_Of_Section() {
        return Name_Of_Section;
    }

    public void setName_Of_Section(String name_Of_Section) {
        Name_Of_Section = name_Of_Section;
    }

    public String getNo_of_Pending_ATR_on_PMO_References() {
        return No_of_Pending_ATR_on_PMO_References;
    }

    public void setNo_of_Pending_ATR_on_PMO_References(String no_of_Pending_ATR_on_PMO_References) {
        No_of_Pending_ATR_on_PMO_References = no_of_Pending_ATR_on_PMO_References;
    }

    public String getDate1() {
        return date1;
    }

    public void setDate1(String date1) {
        this.date1 = date1;
    }

    public String getTotal_No_of_Pending_ATR_on_PMO_References() {
        return Total_No_of_Pending_ATR_on_PMO_References;
    }

    public void setTotal_No_of_Pending_ATR_on_PMO_References(String total_No_of_Pending_ATR_on_PMO_References) {
        Total_No_of_Pending_ATR_on_PMO_References = total_No_of_Pending_ATR_on_PMO_References;
    }

    public String getSubmitted_date() {
        return submitted_date;
    }

    public void setSubmitted_date(String submitted_date) {
        this.submitted_date = submitted_date;
    }

    public String getUpdated_date() {
        return updated_date;
    }

    public void setUpdated_date(String updated_date) {
        this.updated_date = updated_date;
    }
}
