package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MaternalHealthList {
    @SerializedName("Antenatal_Care")
    @Expose
    private List<MaternalHealthAntenatalCare> maternalHealthAntenatalCareList=null;

    @SerializedName("Institutional_Delivery")
    @Expose
    private List<MaternalHealthInstitutionalDelivery>maternalHealthInstitutionalDeliveryList=null;

    @SerializedName("ANC_Checkup")
    @Expose
    private List<MaternalHealthANCCheckup>maternalHealthANCCheckupList=null;

    @SerializedName("PMSMA")
    @Expose
    private List<MaternalHealthPMSMA>maternalHealthPMSMAList=null;

    @SerializedName("Public_Health_Facilities")
    @Expose
    private List<MaternalHealthPHF>maternalHealthPHFList=null;

    @SerializedName("Labour_Rooms_and_Operation_Theatres_State_Certified")
    @Expose
    private List<MaternalHealthStateCertified> maternalHealthStateCertifiedList=null;

    @SerializedName("Labour_Rooms_and_Operation_Theatres_Nationally_Certified")
    @Expose
    private List<MaternalHealthNationallyCertified>maternalHealthNationallyCertifiedList=null;


    public List<MaternalHealthAntenatalCare> getMaternalHealthAntenatalCareList() {
        return maternalHealthAntenatalCareList;
    }

    public void setMaternalHealthAntenatalCareList(List<MaternalHealthAntenatalCare> maternalHealthAntenatalCareList) {
        this.maternalHealthAntenatalCareList = maternalHealthAntenatalCareList;
    }

    public List<MaternalHealthInstitutionalDelivery> getMaternalHealthInstitutionalDeliveryList() {
        return maternalHealthInstitutionalDeliveryList;
    }

    public void setMaternalHealthInstitutionalDeliveryList(List<MaternalHealthInstitutionalDelivery> maternalHealthInstitutionalDeliveryList) {
        this.maternalHealthInstitutionalDeliveryList = maternalHealthInstitutionalDeliveryList;
    }

    public List<MaternalHealthANCCheckup> getMaternalHealthANCCheckupList() {
        return maternalHealthANCCheckupList;
    }

    public void setMaternalHealthANCCheckupList(List<MaternalHealthANCCheckup> maternalHealthANCCheckupList) {
        this.maternalHealthANCCheckupList = maternalHealthANCCheckupList;
    }

    public List<MaternalHealthPMSMA> getMaternalHealthPMSMAList() {
        return maternalHealthPMSMAList;
    }

    public void setMaternalHealthPMSMAList(List<MaternalHealthPMSMA> maternalHealthPMSMAList) {
        this.maternalHealthPMSMAList = maternalHealthPMSMAList;
    }

    public List<MaternalHealthPHF> getMaternalHealthPHFList() {
        return maternalHealthPHFList;
    }

    public void setMaternalHealthPHFList(List<MaternalHealthPHF> maternalHealthPHFList) {
        this.maternalHealthPHFList = maternalHealthPHFList;
    }

    public List<MaternalHealthStateCertified> getMaternalHealthStateCertifiedList() {
        return maternalHealthStateCertifiedList;
    }

    public void setMaternalHealthStateCertifiedList(List<MaternalHealthStateCertified> maternalHealthStateCertifiedList) {
        this.maternalHealthStateCertifiedList = maternalHealthStateCertifiedList;
    }

    public List<MaternalHealthNationallyCertified> getMaternalHealthNationallyCertifiedList() {
        return maternalHealthNationallyCertifiedList;
    }

    public void setMaternalHealthNationallyCertifiedList(List<MaternalHealthNationallyCertified> maternalHealthNationallyCertifiedList) {
        this.maternalHealthNationallyCertifiedList = maternalHealthNationallyCertifiedList;
    }
}
