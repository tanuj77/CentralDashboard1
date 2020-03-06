package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DashboardData {
    @SerializedName("Total_Facility")
    @Expose
    private Integer tOTALFACILITY;

    @SerializedName("RCH_MAPPING")
    @Expose
    private Integer rCHMAPPING;

    @SerializedName("total_verified")
    @Expose
    private Integer tOTALVERIFIED;

    @SerializedName("HWC_maped_RCH")
    @Expose
    private Integer hWCMAPEDRCH;

    @SerializedName("total_confirmed_not_verified")
    @Expose
    private Integer tOTALCONFIRMEDNOTVERIFIED;

    @SerializedName("HWC_proposed")
    @Expose
    private Integer hWCPROPOSED;

    @SerializedName("Medical_Colleges_Hospital")
    @Expose
    private Integer mEDICALCOLLEGESHOSPITAL;

    @SerializedName("District_Hospital")
    @Expose
    private Integer dISTRICTHOSPITAL;

    @SerializedName("Community_Health_Center")
    @Expose
    private Integer cOMMUNITYHEALTHCENTER;

    @SerializedName("Primary_Health_Centre")
    @Expose
    private Integer pRIMARYHEALTHCENTER;

    @SerializedName("Sub_center")
    @Expose
    private Integer sUBCENTER;


    public Integer gettOTALFACILITY() {
        return tOTALFACILITY;
    }

    public void settOTALFACILITY(Integer tOTALFACILITY) {
        this.tOTALFACILITY = tOTALFACILITY;
    }

    public Integer getrCHMAPPING() {
        return rCHMAPPING;
    }

    public void setrCHMAPPING(Integer rCHMAPPING) {
        this.rCHMAPPING = rCHMAPPING;
    }

    public Integer gettOTALVERIFIED() {
        return tOTALVERIFIED;
    }

    public void settOTALVERIFIED(Integer tOTALVERIFIED) {
        this.tOTALVERIFIED = tOTALVERIFIED;
    }

    public Integer gethWCMAPEDRCH() {
        return hWCMAPEDRCH;
    }

    public void sethWCMAPEDRCH(Integer hWCMAPEDRCH) {
        this.hWCMAPEDRCH = hWCMAPEDRCH;
    }

    public Integer gettOTALCONFIRMEDNOTVERIFIED() {
        return tOTALCONFIRMEDNOTVERIFIED;
    }

    public void settOTALCONFIRMEDNOTVERIFIED(Integer tOTALCONFIRMEDNOTVERIFIED) {
        this.tOTALCONFIRMEDNOTVERIFIED = tOTALCONFIRMEDNOTVERIFIED;
    }

    public Integer gethWCPROPOSED() {
        return hWCPROPOSED;
    }

    public void sethWCPROPOSED(Integer hWCPROPOSED) {
        this.hWCPROPOSED = hWCPROPOSED;
    }

    public Integer getmEDICALCOLLEGESHOSPITAL() {
        return mEDICALCOLLEGESHOSPITAL;
    }

    public void setmEDICALCOLLEGESHOSPITAL(Integer mEDICALCOLLEGESHOSPITAL) {
        this.mEDICALCOLLEGESHOSPITAL = mEDICALCOLLEGESHOSPITAL;
    }

    public Integer getdISTRICTHOSPITAL() {
        return dISTRICTHOSPITAL;
    }

    public void setdISTRICTHOSPITAL(Integer dISTRICTHOSPITAL) {
        this.dISTRICTHOSPITAL = dISTRICTHOSPITAL;
    }

    public Integer getcOMMUNITYHEALTHCENTER() {
        return cOMMUNITYHEALTHCENTER;
    }

    public void setcOMMUNITYHEALTHCENTER(Integer cOMMUNITYHEALTHCENTER) {
        this.cOMMUNITYHEALTHCENTER = cOMMUNITYHEALTHCENTER;
    }

    public Integer getpRIMARYHEALTHCENTER() {
        return pRIMARYHEALTHCENTER;
    }

    public void setpRIMARYHEALTHCENTER(Integer pRIMARYHEALTHCENTER) {
        this.pRIMARYHEALTHCENTER = pRIMARYHEALTHCENTER;
    }

    public Integer getsUBCENTER() {
        return sUBCENTER;
    }

    public void setsUBCENTER(Integer sUBCENTER) {
        this.sUBCENTER = sUBCENTER;
    }
}
