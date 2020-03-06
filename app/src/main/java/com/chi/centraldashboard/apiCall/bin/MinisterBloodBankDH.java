package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MinisterBloodBankDH {
    @SerializedName("SR_NO")
    @Expose
    private String SR_NO;

    @SerializedName("Year")
    @Expose
    private String Year;

    @SerializedName("Quarterly")
    @Expose
    private String Quarterly;

    @SerializedName("state_id")
    @Expose
    private String state_id;

    @SerializedName("State_Name")
    @Expose
    private String State_Name;

    @SerializedName("No_of_functional_blood_banks")
    @Expose
    private String No_of_functional_blood_banks;

    @SerializedName("dh_morethanhundred_beds")
    @Expose
    private String dh_morethanhundred_beds;

    @SerializedName("No_of_functional_Blood_Banks_against_the_target_of_District_Hospitals_having_100_beds")
    @Expose
    private String No_of_functional_Blood_Banks_against_the_target_of_District_Hospitals_having_morethan_100_beds;

    @SerializedName("submitted_date")
    @Expose
    private String submitted_date;


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

    public String getState_id() {
        return state_id;
    }

    public void setState_id(String state_id) {
        this.state_id = state_id;
    }

    public String getState_Name() {
        return State_Name;
    }

    public void setState_Name(String state_Name) {
        State_Name = state_Name;
    }

    public String getNo_of_functional_blood_banks() {
        return No_of_functional_blood_banks;
    }

    public void setNo_of_functional_blood_banks(String no_of_functional_blood_banks) {
        No_of_functional_blood_banks = no_of_functional_blood_banks;
    }

    public String getDh_morethanhundred_beds() {
        return dh_morethanhundred_beds;
    }

    public void setDh_morethanhundred_beds(String dh_morethanhundred_beds) {
        this.dh_morethanhundred_beds = dh_morethanhundred_beds;
    }

    public String getNo_of_functional_Blood_Banks_against_the_target_of_District_Hospitals_having_morethan_100_beds() {
        return No_of_functional_Blood_Banks_against_the_target_of_District_Hospitals_having_morethan_100_beds;
    }

    public void setNo_of_functional_Blood_Banks_against_the_target_of_District_Hospitals_having_morethan_100_beds(String no_of_functional_Blood_Banks_against_the_target_of_District_Hospitals_having_morethan_100_beds) {
        No_of_functional_Blood_Banks_against_the_target_of_District_Hospitals_having_morethan_100_beds = no_of_functional_Blood_Banks_against_the_target_of_District_Hospitals_having_morethan_100_beds;
    }

    public String getSubmitted_date() {
        return submitted_date;
    }

    public void setSubmitted_date(String submitted_date) {
        this.submitted_date = submitted_date;
    }
}
