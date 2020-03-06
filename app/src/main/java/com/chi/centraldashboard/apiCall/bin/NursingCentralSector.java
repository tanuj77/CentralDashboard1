package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NursingCentralSector {

    @SerializedName("SR_NO")
    @Expose
    private String SR_NO;

    @SerializedName("year")
    @Expose
    private String year;


    @SerializedName("Training_of_Nurses")
    @Expose
    private String Training_of_Nurses;


    @SerializedName("Upgradation_of_Schools_into_College_of_Nursing")
    @Expose
    private String Upgradation_of_Schools_into_College_of_Nursing;


    @SerializedName("National_Florence_Nightingale_Awards")
    @Expose
    private String National_Florence_Nightingale_Awards;

    @SerializedName("submitted_date")
    @Expose
    private String submitted_date;


    @SerializedName("updated_date")
    @Expose
    private String updated_date;


    @SerializedName("Total_Number_of_Central_Sector_Schemes_Development_of_Nursing_Services")
    @Expose
    private String Total_Number_of_Central_Sector_Schemes_Development_of_Nursing_Services;

    public String getSR_NO() {
        return SR_NO;
    }

    public void setSR_NO(String SR_NO) {
        this.SR_NO = SR_NO;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getTraining_of_Nurses() {
        return Training_of_Nurses;
    }

    public void setTraining_of_Nurses(String training_of_Nurses) {
        Training_of_Nurses = training_of_Nurses;
    }

    public String getUpgradation_of_Schools_into_College_of_Nursing() {
        return Upgradation_of_Schools_into_College_of_Nursing;
    }

    public void setUpgradation_of_Schools_into_College_of_Nursing(String upgradation_of_Schools_into_College_of_Nursing) {
        Upgradation_of_Schools_into_College_of_Nursing = upgradation_of_Schools_into_College_of_Nursing;
    }

    public String getNational_Florence_Nightingale_Awards() {
        return National_Florence_Nightingale_Awards;
    }

    public void setNational_Florence_Nightingale_Awards(String national_Florence_Nightingale_Awards) {
        National_Florence_Nightingale_Awards = national_Florence_Nightingale_Awards;
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

    public String getTotal_Number_of_Central_Sector_Schemes_Development_of_Nursing_Services() {
        return Total_Number_of_Central_Sector_Schemes_Development_of_Nursing_Services;
    }

    public void setTotal_Number_of_Central_Sector_Schemes_Development_of_Nursing_Services(String total_Number_of_Central_Sector_Schemes_Development_of_Nursing_Services) {
        Total_Number_of_Central_Sector_Schemes_Development_of_Nursing_Services = total_Number_of_Central_Sector_Schemes_Development_of_Nursing_Services;
    }
}
