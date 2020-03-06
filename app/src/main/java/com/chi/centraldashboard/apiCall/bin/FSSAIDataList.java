package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FSSAIDataList {

    @SerializedName("Total_number_of_State_Food_Laboratories_strengthened")
    @Expose
    private List<FSSAIState> fssaiStateList = null;

    @SerializedName("Total_Number_Primary_Food_Testing_Laboratories")
    @Expose
    private List<FSSAIPrimary> fssaiPrimaryList = null;

    @SerializedName("Total_Number_FSSAI_Manpower_Posts")
    @Expose
    private List<FSSAIManPower> fssaiManPowerList = null;

    @SerializedName("Total_Number_Licensing_and_Registration_of_FBOs")
    @Expose
    private List<FSSAILicensing> fssaiLicensingList = null;

    @SerializedName("Total_Number_of_Food_Safety_On_Wheels_FSWS_Provided")
    @Expose
    private List<FSSAIFSWS> fssaifswsList = null;

    @SerializedName("Total_Number_of_Referral_Food_Testing_Laboratories")
    @Expose
    private List<FSSAIFood> fssaiFoodList = null;


    public List<FSSAIState> getFssaiStateList() {
        return fssaiStateList;
    }

    public void setFssaiStateList(List<FSSAIState> fssaiStateList) {
        this.fssaiStateList = fssaiStateList;
    }

    public List<FSSAIPrimary> getFssaiPrimaryList() {
        return fssaiPrimaryList;
    }

    public void setFssaiPrimaryList(List<FSSAIPrimary> fssaiPrimaryList) {
        this.fssaiPrimaryList = fssaiPrimaryList;
    }

    public List<FSSAIManPower> getFssaiManPowerList() {
        return fssaiManPowerList;
    }

    public void setFssaiManPowerList(List<FSSAIManPower> fssaiManPowerList) {
        this.fssaiManPowerList = fssaiManPowerList;
    }

    public List<FSSAILicensing> getFssaiLicensingList() {
        return fssaiLicensingList;
    }

    public void setFssaiLicensingList(List<FSSAILicensing> fssaiLicensingList) {
        this.fssaiLicensingList = fssaiLicensingList;
    }

    public List<FSSAIFSWS> getFssaifswsList() {
        return fssaifswsList;
    }

    public void setFssaifswsList(List<FSSAIFSWS> fssaifswsList) {
        this.fssaifswsList = fssaifswsList;
    }

    public List<FSSAIFood> getFssaiFoodList() {
        return fssaiFoodList;
    }

    public void setFssaiFoodList(List<FSSAIFood> fssaiFoodList) {
        this.fssaiFoodList = fssaiFoodList;
    }
}
