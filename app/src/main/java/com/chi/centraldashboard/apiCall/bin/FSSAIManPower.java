package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FSSAIManPower {
    @SerializedName("SR_NO")
    @Expose
    private String SR_NO;

    @SerializedName("Year")
    @Expose
    private String Year;

    @SerializedName("Quarterly")
    @Expose
    private String Quarterly;

    @SerializedName("submitted_date")
    @Expose
    private String submitted_date;

    @SerializedName("updated_date")
    @Expose
    private String updated_date;

    @SerializedName("Name_of_Post")
    @Expose
    private String Name_of_Post;


    @SerializedName("Total_Number_of_Posts_Sanctioned")
    @Expose
    private String Total_Number_of_Posts_Sanctioned;

    @SerializedName("Total_Number_of_Filledup")
    @Expose
    private String Total_Number_of_Filledup;

    @SerializedName("Total_Number_of_Vacancy")
    @Expose
    private String Total_Number_of_Vacancy;

    @SerializedName("Total_Number_FSSAI_Manpower_Posts")
    @Expose
    private String Total_Number_FSSAI_Manpower_Posts;


    public String getSR_NO() {
        return SR_NO;
    }

    public void setSR_NO(String SR_NO) {
        this.SR_NO = SR_NO;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    public String getQuarterly() {
        return Quarterly;
    }

    public void setQuarterly(String quarterly) {
        Quarterly = quarterly;
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

    public String getName_of_Post() {
        return Name_of_Post;
    }

    public void setName_of_Post(String name_of_Post) {
        Name_of_Post = name_of_Post;
    }

    public String getTotal_Number_of_Posts_Sanctioned() {
        return Total_Number_of_Posts_Sanctioned;
    }

    public void setTotal_Number_of_Posts_Sanctioned(String total_Number_of_Posts_Sanctioned) {
        Total_Number_of_Posts_Sanctioned = total_Number_of_Posts_Sanctioned;
    }

    public String getTotal_Number_of_Filledup() {
        return Total_Number_of_Filledup;
    }

    public void setTotal_Number_of_Filledup(String total_Number_of_Filledup) {
        Total_Number_of_Filledup = total_Number_of_Filledup;
    }

    public String getTotal_Number_of_Vacancy() {
        return Total_Number_of_Vacancy;
    }

    public void setTotal_Number_of_Vacancy(String total_Number_of_Vacancy) {
        Total_Number_of_Vacancy = total_Number_of_Vacancy;
    }

    public String getTotal_Number_FSSAI_Manpower_Posts() {
        return Total_Number_FSSAI_Manpower_Posts;
    }

    public void setTotal_Number_FSSAI_Manpower_Posts(String total_Number_FSSAI_Manpower_Posts) {
        Total_Number_FSSAI_Manpower_Posts = total_Number_FSSAI_Manpower_Posts;
    }
}
