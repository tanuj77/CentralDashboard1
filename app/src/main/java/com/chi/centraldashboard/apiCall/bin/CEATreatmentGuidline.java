package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CEATreatmentGuidline {

    @SerializedName("SR_NO")
    @Expose
    private String SR_NO;

    @SerializedName("Year")
    @Expose
    private String Year;

    @SerializedName("submitted_date")
    @Expose
    private String submitted_date;

    @SerializedName("updated_date")
    @Expose
    private String updated_date;


    @SerializedName("allopathic")
    @Expose
    private String allopathic;

    @SerializedName("Ayush")
    @Expose
    private String Ayush;

    @SerializedName("Total_Number_of_Standard_Treatment_Guidelines")
    @Expose
    private String Total_Number_of_Standard_Treatment_Guidelines;


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

    public String getAllopathic() {
        return allopathic;
    }

    public void setAllopathic(String allopathic) {
        this.allopathic = allopathic;
    }

    public String getAyush() {
        return Ayush;
    }

    public void setAyush(String ayush) {
        Ayush = ayush;
    }

    public String getTotal_Number_of_Standard_Treatment_Guidelines() {
        return Total_Number_of_Standard_Treatment_Guidelines;
    }

    public void setTotal_Number_of_Standard_Treatment_Guidelines(String total_Number_of_Standard_Treatment_Guidelines) {
        Total_Number_of_Standard_Treatment_Guidelines = total_Number_of_Standard_Treatment_Guidelines;
    }
}
