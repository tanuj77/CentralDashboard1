package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NursingSeats {

    @SerializedName("SR_NO")
    @Expose
    private String SR_NO;

    @SerializedName("e_year")
    @Expose
    private String e_year;

    @SerializedName("Annual_Admission_Capacity_Seats")
    @Expose
    private String Annual_Admission_Capacity_Seats;

    @SerializedName("Thematic_Registered_Nurses_RN_RM")
    @Expose
    private String Thematic_Registered_Nurses_RN_RM;

    @SerializedName("Thematic_Registered_ANM_LHV")
    @Expose
    private String Thematic_Registered_ANM_LHV;


    @SerializedName("Total_Registered_Nursing")
    @Expose
    private String Total_Registered_Nursing;

    @SerializedName("India_Status_Per_1000_Population")
    @Expose
    private String India_Status_Per_1000_Population;

    @SerializedName("WHO_Norms_per_1000_population_Target")
    @Expose
    private String WHO_Norms_per_1000_population_Target;

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

    public String getAnnual_Admission_Capacity_Seats() {
        return Annual_Admission_Capacity_Seats;
    }

    public void setAnnual_Admission_Capacity_Seats(String annual_Admission_Capacity_Seats) {
        Annual_Admission_Capacity_Seats = annual_Admission_Capacity_Seats;
    }

    public String getThematic_Registered_Nurses_RN_RM() {
        return Thematic_Registered_Nurses_RN_RM;
    }

    public void setThematic_Registered_Nurses_RN_RM(String thematic_Registered_Nurses_RN_RM) {
        Thematic_Registered_Nurses_RN_RM = thematic_Registered_Nurses_RN_RM;
    }

    public String getThematic_Registered_ANM_LHV() {
        return Thematic_Registered_ANM_LHV;
    }

    public void setThematic_Registered_ANM_LHV(String thematic_Registered_ANM_LHV) {
        Thematic_Registered_ANM_LHV = thematic_Registered_ANM_LHV;
    }

    public String getTotal_Registered_Nursing() {
        return Total_Registered_Nursing;
    }

    public void setTotal_Registered_Nursing(String total_Registered_Nursing) {
        Total_Registered_Nursing = total_Registered_Nursing;
    }

    public String getIndia_Status_Per_1000_Population() {
        return India_Status_Per_1000_Population;
    }

    public void setIndia_Status_Per_1000_Population(String india_Status_Per_1000_Population) {
        India_Status_Per_1000_Population = india_Status_Per_1000_Population;
    }

    public String getWHO_Norms_per_1000_population_Target() {
        return WHO_Norms_per_1000_population_Target;
    }

    public void setWHO_Norms_per_1000_population_Target(String WHO_Norms_per_1000_population_Target) {
        this.WHO_Norms_per_1000_population_Target = WHO_Norms_per_1000_population_Target;
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
