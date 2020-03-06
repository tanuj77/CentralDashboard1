package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MinisterSugamData {
    @SerializedName("SUGAM")
    @Expose
    private List<MinisterSugamDataList> ministerSugamDataListList = null;

    @SerializedName("Number_of_Manufacturing_Site")
    @Expose
    private List<MinisterSugamManufacturingSite> ministerSugamManufacturingSiteList = null;

    @SerializedName("Number_of_Formulation_Data")
    @Expose
    private List<MinisterSugamFormulationData> ministerSugamFormulationDataList = null;

    @SerializedName("Total_Application_in_CDSCO")
    @Expose
    private List<MinisterSugamCDSCO> ministerSugamCDSCOList = null;

    @SerializedName("Number_of_Firms_Registered_for_Import_of_Drug_Medical_Devices_Cosmetics")
    @Expose
    private List<MinisterSugamFirmsRegDMDC> ministerSugamFirmsRegDMDCList = null;


    @SerializedName("Number_of_Applications_Received_for_Test_Licenses")
    @Expose
    private List<MinisterSugamReceivedTL> ministerSugamReceivedTLList = null;

    @SerializedName("Number_of_applications_Approved_for_Test_Licenses")
    @Expose
    private List<MinisterSugamApprovedTL> ministerSugamApprovedTLList = null;

    @SerializedName("Number_of_Applications_Received_for_Import_of_Drug_Medical_Devices_Cosmetics")
    @Expose
    private List<MinisterSugamAppReceivedDMDC> ministerSugamAppReceivedDMDCList = null;


    @SerializedName("Number_of_Applications_Approved_for_Import_of_Drug_Medical_Devices_Cosmetics")
    @Expose
    private List<MinisterSugamAppApprovedDMDC> ministerSugamAppApprovedDMDCList = null;

    @SerializedName("Number_of_Applications_Received_for_Conducting_Clinical_Trial_in_India")
    @Expose
    private List<MinisterSugamConductingCT> ministerSugamConductingCTList = null;

    @SerializedName("Number_of_Applications_Approved_for_Clinical_Trial_in_India")
    @Expose
    private List<MinisterSugamApprovedCT> ministerSugamApprovedCTList = null;


    @SerializedName("Number_of_Application_Received_for_Import_of_Life_Saving_Drugs_for_Personal_Use")
    @Expose
    private List<MinisterSugamAppReceivedPersonalUse> ministerSugamAppReceivedPersonalUseList = null;

    @SerializedName("Number_of_Application_Approved_for_Import_of_Life_Saving_Drugs_for_Personal_Use")
    @Expose
    private List<MinisterSugamAppApprovedPersonalUse> ministerSugamAppApprovedPersonalUseList = null;


    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("status")
    @Expose
    private Integer status;


    public List<MinisterSugamDataList> getMinisterSugamDataListList() {
        return ministerSugamDataListList;
    }

    public void setMinisterSugamDataListList(List<MinisterSugamDataList> ministerSugamDataListList) {
        this.ministerSugamDataListList = ministerSugamDataListList;
    }

    public List<MinisterSugamManufacturingSite> getMinisterSugamManufacturingSiteList() {
        return ministerSugamManufacturingSiteList;
    }

    public void setMinisterSugamManufacturingSiteList(List<MinisterSugamManufacturingSite> ministerSugamManufacturingSiteList) {
        this.ministerSugamManufacturingSiteList = ministerSugamManufacturingSiteList;
    }

    public List<MinisterSugamFormulationData> getMinisterSugamFormulationDataList() {
        return ministerSugamFormulationDataList;
    }

    public void setMinisterSugamFormulationDataList(List<MinisterSugamFormulationData> ministerSugamFormulationDataList) {
        this.ministerSugamFormulationDataList = ministerSugamFormulationDataList;
    }

    public List<MinisterSugamCDSCO> getMinisterSugamCDSCOList() {
        return ministerSugamCDSCOList;
    }

    public void setMinisterSugamCDSCOList(List<MinisterSugamCDSCO> ministerSugamCDSCOList) {
        this.ministerSugamCDSCOList = ministerSugamCDSCOList;
    }

    public List<MinisterSugamFirmsRegDMDC> getMinisterSugamFirmsRegDMDCList() {
        return ministerSugamFirmsRegDMDCList;
    }

    public void setMinisterSugamFirmsRegDMDCList(List<MinisterSugamFirmsRegDMDC> ministerSugamFirmsRegDMDCList) {
        this.ministerSugamFirmsRegDMDCList = ministerSugamFirmsRegDMDCList;
    }

    public List<MinisterSugamReceivedTL> getMinisterSugamReceivedTLList() {
        return ministerSugamReceivedTLList;
    }

    public void setMinisterSugamReceivedTLList(List<MinisterSugamReceivedTL> ministerSugamReceivedTLList) {
        this.ministerSugamReceivedTLList = ministerSugamReceivedTLList;
    }

    public List<MinisterSugamApprovedTL> getMinisterSugamApprovedTLList() {
        return ministerSugamApprovedTLList;
    }

    public void setMinisterSugamApprovedTLList(List<MinisterSugamApprovedTL> ministerSugamApprovedTLList) {
        this.ministerSugamApprovedTLList = ministerSugamApprovedTLList;
    }

    public List<MinisterSugamAppReceivedDMDC> getMinisterSugamAppReceivedDMDCList() {
        return ministerSugamAppReceivedDMDCList;
    }

    public void setMinisterSugamAppReceivedDMDCList(List<MinisterSugamAppReceivedDMDC> ministerSugamAppReceivedDMDCList) {
        this.ministerSugamAppReceivedDMDCList = ministerSugamAppReceivedDMDCList;
    }

    public List<MinisterSugamAppApprovedDMDC> getMinisterSugamAppApprovedDMDCList() {
        return ministerSugamAppApprovedDMDCList;
    }

    public void setMinisterSugamAppApprovedDMDCList(List<MinisterSugamAppApprovedDMDC> ministerSugamAppApprovedDMDCList) {
        this.ministerSugamAppApprovedDMDCList = ministerSugamAppApprovedDMDCList;
    }

    public List<MinisterSugamConductingCT> getMinisterSugamConductingCTList() {
        return ministerSugamConductingCTList;
    }

    public void setMinisterSugamConductingCTList(List<MinisterSugamConductingCT> ministerSugamConductingCTList) {
        this.ministerSugamConductingCTList = ministerSugamConductingCTList;
    }

    public List<MinisterSugamApprovedCT> getMinisterSugamApprovedCTList() {
        return ministerSugamApprovedCTList;
    }

    public void setMinisterSugamApprovedCTList(List<MinisterSugamApprovedCT> ministerSugamApprovedCTList) {
        this.ministerSugamApprovedCTList = ministerSugamApprovedCTList;
    }

    public List<MinisterSugamAppReceivedPersonalUse> getMinisterSugamAppReceivedPersonalUseList() {
        return ministerSugamAppReceivedPersonalUseList;
    }

    public void setMinisterSugamAppReceivedPersonalUseList(List<MinisterSugamAppReceivedPersonalUse> ministerSugamAppReceivedPersonalUseList) {
        this.ministerSugamAppReceivedPersonalUseList = ministerSugamAppReceivedPersonalUseList;
    }

    public List<MinisterSugamAppApprovedPersonalUse> getMinisterSugamAppApprovedPersonalUseList() {
        return ministerSugamAppApprovedPersonalUseList;
    }

    public void setMinisterSugamAppApprovedPersonalUseList(List<MinisterSugamAppApprovedPersonalUse> ministerSugamAppApprovedPersonalUseList) {
        this.ministerSugamAppApprovedPersonalUseList = ministerSugamAppApprovedPersonalUseList;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
