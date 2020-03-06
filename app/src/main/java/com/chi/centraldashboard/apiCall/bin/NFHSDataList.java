package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class NFHSDataList {

    @SerializedName("Percentage_of_children_aged_12_23_months_fully_immunized")
    @Expose
    private List<NFHS_12_13immunized> nfhs_12_13immunizedList = null;

    @SerializedName("Percentage_of_Children_under_5_years_who_are_stunted_height_for_age")
    @Expose
    private List<NFHS_5years_stunted> nfhs_5years_stuntedList = null;

    @SerializedName("Percentage_of_Children_under_5_years_who_are_wasted_weight_for_height")
    @Expose
    private List<NFHS_5years_wasted> nfhs_5years_wastedList = null;

    @SerializedName("Percentage_of_Currently_Married_Women_15_49_years")
    @Expose
    private List<NFHS_MarriedWoman> nfhs_marriedWomanList = null;

    @SerializedName("Percentage_of_pregnant_women_with_full_antenatal_care_under_NHM")
    @Expose
    private List<NFHS_PregnantWoman> nfhs_pregnantWomanList = null;


    @SerializedName("Percentage_of_delivery_attended_by_skilled_health_professional")
    @Expose
    private List<NFHS_DeliveryAttended> nfhs_deliveryAttendedList = null;

    @SerializedName("Percentage_of_households_with_any_member_covered_under_insurance")
    @Expose
    private List<NFHS_Households> nfhs_householdsList = null;

    @SerializedName("Percentage_of_Children_less_than_6_month_exclusively_breastfed")
    @Expose
    private List<NFHS_BreastFed> nfhs_breastFedList = null;


    public List<NFHS_12_13immunized> getNfhs_12_13immunizedList() {
        return nfhs_12_13immunizedList;
    }

    public void setNfhs_12_13immunizedList(List<NFHS_12_13immunized> nfhs_12_13immunizedList) {
        this.nfhs_12_13immunizedList = nfhs_12_13immunizedList;
    }

    public List<NFHS_5years_stunted> getNfhs_5years_stuntedList() {
        return nfhs_5years_stuntedList;
    }

    public void setNfhs_5years_stuntedList(List<NFHS_5years_stunted> nfhs_5years_stuntedList) {
        this.nfhs_5years_stuntedList = nfhs_5years_stuntedList;
    }

    public List<NFHS_5years_wasted> getNfhs_5years_wastedList() {
        return nfhs_5years_wastedList;
    }

    public void setNfhs_5years_wastedList(List<NFHS_5years_wasted> nfhs_5years_wastedList) {
        this.nfhs_5years_wastedList = nfhs_5years_wastedList;
    }

    public List<NFHS_MarriedWoman> getNfhs_marriedWomanList() {
        return nfhs_marriedWomanList;
    }

    public void setNfhs_marriedWomanList(List<NFHS_MarriedWoman> nfhs_marriedWomanList) {
        this.nfhs_marriedWomanList = nfhs_marriedWomanList;
    }

    public List<NFHS_PregnantWoman> getNfhs_pregnantWomanList() {
        return nfhs_pregnantWomanList;
    }

    public void setNfhs_pregnantWomanList(List<NFHS_PregnantWoman> nfhs_pregnantWomanList) {
        this.nfhs_pregnantWomanList = nfhs_pregnantWomanList;
    }

    public List<NFHS_DeliveryAttended> getNfhs_deliveryAttendedList() {
        return nfhs_deliveryAttendedList;
    }

    public void setNfhs_deliveryAttendedList(List<NFHS_DeliveryAttended> nfhs_deliveryAttendedList) {
        this.nfhs_deliveryAttendedList = nfhs_deliveryAttendedList;
    }

    public List<NFHS_Households> getNfhs_householdsList() {
        return nfhs_householdsList;
    }

    public void setNfhs_householdsList(List<NFHS_Households> nfhs_householdsList) {
        this.nfhs_householdsList = nfhs_householdsList;
    }

    public List<NFHS_BreastFed> getNfhs_breastFedList() {
        return nfhs_breastFedList;
    }

    public void setNfhs_breastFedList(List<NFHS_BreastFed> nfhs_breastFedList) {
        this.nfhs_breastFedList = nfhs_breastFedList;
    }
}
