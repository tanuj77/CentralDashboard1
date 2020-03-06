package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MinisterAtrParliament {

    @SerializedName("SR_NO")
    @Expose
    private String SR_NO;



    @SerializedName("Name_Section")
    @Expose
    private String Name_Section;



    @SerializedName("No_of_Parliament_Assurances")
    @Expose
    private String No_of_Parliament_Assurances;



    @SerializedName("date1")
    @Expose
    private String date1;



    @SerializedName("Total_Parliament_Assurances")
    @Expose
    private String Total_Parliament_Assurances;


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

    public String getName_Section() {
        return Name_Section;
    }

    public void setName_Section(String name_Section) {
        Name_Section = name_Section;
    }

    public String getNo_of_Parliament_Assurances() {
        return No_of_Parliament_Assurances;
    }

    public void setNo_of_Parliament_Assurances(String no_of_Parliament_Assurances) {
        No_of_Parliament_Assurances = no_of_Parliament_Assurances;
    }

    public String getDate1() {
        return date1;
    }

    public void setDate1(String date1) {
        this.date1 = date1;
    }

    public String getTotal_Parliament_Assurances() {
        return Total_Parliament_Assurances;
    }

    public void setTotal_Parliament_Assurances(String total_Parliament_Assurances) {
        Total_Parliament_Assurances = total_Parliament_Assurances;
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
