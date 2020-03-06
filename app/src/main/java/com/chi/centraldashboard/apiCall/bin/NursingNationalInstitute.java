package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NursingNationalInstitute {

    @SerializedName("SR_NO")
    @Expose
    private String SR_NO;

    @SerializedName("e_year")
    @Expose
    private String e_year;

    @SerializedName("Total_Number_of_Nursing_Institutes")
    @Expose
    private String Total_Number_of_Nursing_Institutes;

    @SerializedName("Total_Number_of_National_Nursing_Institute")
    @Expose
    private String Total_Number_of_National_Nursing_Institute;

    @SerializedName("date_added")
    @Expose
    private String date_added;

    @SerializedName("updated_date")
    @Expose
    private String updated_date;


    public String getSR_NO() {
        return SR_NO;
    }

    public void setSR_NO(String SR_NO) {
        this.SR_NO = SR_NO;
    }

    public String getE_year() {
        return e_year;
    }

    public void setE_year(String e_year) {
        this.e_year = e_year;
    }

    public String getTotal_Number_of_Nursing_Institutes() {
        return Total_Number_of_Nursing_Institutes;
    }

    public void setTotal_Number_of_Nursing_Institutes(String total_Number_of_Nursing_Institutes) {
        Total_Number_of_Nursing_Institutes = total_Number_of_Nursing_Institutes;
    }

    public String getTotal_Number_of_National_Nursing_Institute() {
        return Total_Number_of_National_Nursing_Institute;
    }

    public void setTotal_Number_of_National_Nursing_Institute(String total_Number_of_National_Nursing_Institute) {
        Total_Number_of_National_Nursing_Institute = total_Number_of_National_Nursing_Institute;
    }

    public String getDate_added() {
        return date_added;
    }

    public void setDate_added(String date_added) {
        this.date_added = date_added;
    }

    public String getUpdated_date() {
        return updated_date;
    }

    public void setUpdated_date(String updated_date) {
        this.updated_date = updated_date;
    }
}
