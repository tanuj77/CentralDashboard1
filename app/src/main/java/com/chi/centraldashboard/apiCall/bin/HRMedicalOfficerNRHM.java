package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HRMedicalOfficerNRHM {
    @SerializedName("SR_NO")
    @Expose
    private String SR_NO;

    @SerializedName("year")
    @Expose
    private String year;

    @SerializedName("Quarterly")
    @Expose
    private String Quarterly;

    @SerializedName("StateID")
    @Expose
    private String StateID;


    @SerializedName("State_Name")
    @Expose
    private String State_Name;


    @SerializedName("Vacancies_Of_Medical_Officer_NRHM")
    @Expose
    private String Vacancies_Of_Medical_Officer_NRHM;

    @SerializedName("Sanctioned_Medical_Post_NRHM")
    @Expose
    private String Sanctioned_Medical_Post_NRHM;

    @SerializedName("Vacancies_20_of_Medical_Officers_including_specialists_against_Sanctioned_Posts_Both_Regular_NRHM_Posts")
    @Expose
    private String total_vacancies;

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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getQuarterly() {
        return Quarterly;
    }

    public void setQuarterly(String quarterly) {
        Quarterly = quarterly;
    }

    public String getStateID() {
        return StateID;
    }

    public void setStateID(String stateID) {
        StateID = stateID;
    }

    public String getState_Name() {
        return State_Name;
    }

    public void setState_Name(String state_Name) {
        State_Name = state_Name;
    }

    public String getVacancies_Of_Medical_Officer_NRHM() {
        return Vacancies_Of_Medical_Officer_NRHM;
    }

    public void setVacancies_Of_Medical_Officer_NRHM(String vacancies_Of_Medical_Officer_NRHM) {
        Vacancies_Of_Medical_Officer_NRHM = vacancies_Of_Medical_Officer_NRHM;
    }

    public String getSanctioned_Medical_Post_NRHM() {
        return Sanctioned_Medical_Post_NRHM;
    }

    public void setSanctioned_Medical_Post_NRHM(String sanctioned_Medical_Post_NRHM) {
        Sanctioned_Medical_Post_NRHM = sanctioned_Medical_Post_NRHM;
    }

    public String getTotal_vacancies() {
        return total_vacancies;
    }

    public void setTotal_vacancies(String total_vacancies) {
        this.total_vacancies = total_vacancies;
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
