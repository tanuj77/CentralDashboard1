package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CommunityProcessDataList {

    @SerializedName("Number_of_VHSNCs_formed_against_number_of_revenue_villages")
    @Expose
    private List<CommunityProcess_VHSNCs> communityProcess_vhsnCsList = null;

    @SerializedName("Vacancies_of_Rogi_Kalyan_Samiti_RKSs_against_total_number_of_PHC_CHC_SDH_DH")
    @Expose
    private List<CommunityProcess_RKSs> communityProcess_rkSsList = null;


    @SerializedName("Number_of_ASHAs_in_position_against_approved_strength_Both_in_rural_and_urban_areas")
    @Expose
    private List<CommunityProcess_RuralAndUrban> communityProcess_ruralAndUrbanList = null;

    @SerializedName("Percentage_of_ASHAs_whose_Honorarium_is_Paid_through_DBT")
    @Expose
    private List<CommunityProcess_DBT> communityProcess_dbtList = null;

    @SerializedName("Percentage_of_MAS_created_against_approved")
    @Expose
    private List<CommunityProcess_MAS> communityProcess_masList = null;


    public List<CommunityProcess_VHSNCs> getCommunityProcess_vhsnCsList() {
        return communityProcess_vhsnCsList;
    }

    public void setCommunityProcess_vhsnCsList(List<CommunityProcess_VHSNCs> communityProcess_vhsnCsList) {
        this.communityProcess_vhsnCsList = communityProcess_vhsnCsList;
    }

    public List<CommunityProcess_RKSs> getCommunityProcess_rkSsList() {
        return communityProcess_rkSsList;
    }

    public void setCommunityProcess_rkSsList(List<CommunityProcess_RKSs> communityProcess_rkSsList) {
        this.communityProcess_rkSsList = communityProcess_rkSsList;
    }

    public List<CommunityProcess_RuralAndUrban> getCommunityProcess_ruralAndUrbanList() {
        return communityProcess_ruralAndUrbanList;
    }

    public void setCommunityProcess_ruralAndUrbanList(List<CommunityProcess_RuralAndUrban> communityProcess_ruralAndUrbanList) {
        this.communityProcess_ruralAndUrbanList = communityProcess_ruralAndUrbanList;
    }

    public List<CommunityProcess_DBT> getCommunityProcess_dbtList() {
        return communityProcess_dbtList;
    }

    public void setCommunityProcess_dbtList(List<CommunityProcess_DBT> communityProcess_dbtList) {
        this.communityProcess_dbtList = communityProcess_dbtList;
    }

    public List<CommunityProcess_MAS> getCommunityProcess_masList() {
        return communityProcess_masList;
    }

    public void setCommunityProcess_masList(List<CommunityProcess_MAS> communityProcess_masList) {
        this.communityProcess_masList = communityProcess_masList;
    }
}
