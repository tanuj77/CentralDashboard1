package com.chi.centraldashboard.apiCall;


import com.chi.centraldashboard.apiCall.bin.AMRData;
import com.chi.centraldashboard.apiCall.bin.Ambulance;
import com.chi.centraldashboard.apiCall.bin.CEAData;
import com.chi.centraldashboard.apiCall.bin.ChildHealthData;
import com.chi.centraldashboard.apiCall.bin.CommunityProcessData;
import com.chi.centraldashboard.apiCall.bin.DDAPData;
import com.chi.centraldashboard.apiCall.bin.EMRData;
import com.chi.centraldashboard.apiCall.bin.FRUData;
import com.chi.centraldashboard.apiCall.bin.FSSAIData;
import com.chi.centraldashboard.apiCall.bin.FamilyPlaningData;
import com.chi.centraldashboard.apiCall.bin.HPEData;
import com.chi.centraldashboard.apiCall.bin.HRData;
import com.chi.centraldashboard.apiCall.bin.ImmunizationData;
import com.chi.centraldashboard.apiCall.bin.LeptospirosisData;
import com.chi.centraldashboard.apiCall.bin.Login;
import com.chi.centraldashboard.apiCall.bin.MaternalHealth;
import com.chi.centraldashboard.apiCall.bin.MinisterAmritData;
import com.chi.centraldashboard.apiCall.bin.MinisterAtrData;
import com.chi.centraldashboard.apiCall.bin.MinisterBloodBankData;
import com.chi.centraldashboard.apiCall.bin.MinisterCghsData;

import com.chi.centraldashboard.apiCall.bin.MinisterDialysisData;
import com.chi.centraldashboard.apiCall.bin.MinisterEHospitalData;
import com.chi.centraldashboard.apiCall.bin.MinisterFreeDSIData;
import com.chi.centraldashboard.apiCall.bin.MinisterMhealthData;
import com.chi.centraldashboard.apiCall.bin.MinisterMouData;
import com.chi.centraldashboard.apiCall.bin.MinisterNcdData;
import com.chi.centraldashboard.apiCall.bin.MinisterNhrrData;
import com.chi.centraldashboard.apiCall.bin.MinisterORSData;
import com.chi.centraldashboard.apiCall.bin.MinisterPbsData;
import com.chi.centraldashboard.apiCall.bin.MinisterPmjayData;
import com.chi.centraldashboard.apiCall.bin.MinisterPmssyData;
import com.chi.centraldashboard.apiCall.bin.MinisterQAData;
import com.chi.centraldashboard.apiCall.bin.MinisterRchData;
import com.chi.centraldashboard.apiCall.bin.MinisterSonData;
import com.chi.centraldashboard.apiCall.bin.MinisterSugamData;
import com.chi.centraldashboard.apiCall.bin.NACOData;
import com.chi.centraldashboard.apiCall.bin.NCDCData;
import com.chi.centraldashboard.apiCall.bin.NFHSData;
import com.chi.centraldashboard.apiCall.bin.NLEPData;
import com.chi.centraldashboard.apiCall.bin.NOTPData;
import com.chi.centraldashboard.apiCall.bin.NPCDCS_InfraData;
import com.chi.centraldashboard.apiCall.bin.NPCDCS_ScreeningData;
import com.chi.centraldashboard.apiCall.bin.NPPCDData;
import com.chi.centraldashboard.apiCall.bin.NPPCFData;
import com.chi.centraldashboard.apiCall.bin.NVBDCP_ChikungunyaData;
import com.chi.centraldashboard.apiCall.bin.NVBDCP_DengueData;
import com.chi.centraldashboard.apiCall.bin.NVBDCP_JapeneseData;
import com.chi.centraldashboard.apiCall.bin.NVBDCP_KalaazarData;
import com.chi.centraldashboard.apiCall.bin.NVBDCP_LymphaticData;
import com.chi.centraldashboard.apiCall.bin.NVBDCP_MalariaData;
import com.chi.centraldashboard.apiCall.bin.NursingData;
import com.chi.centraldashboard.apiCall.bin.PCZDData;
import com.chi.centraldashboard.apiCall.bin.RTIData;
import com.chi.centraldashboard.apiCall.bin.SRSData;
import com.chi.centraldashboard.apiCall.bin.StateData;
import com.chi.centraldashboard.apiCall.bin.VHPData;


import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiInterface {
    @FormUrlEncoded
    @POST("auth/login")
        //users/login.php
    Call<Login> logIn(@Field("email") String email, @Field("password") String password);

    @FormUrlEncoded
    @POST("apinew.php")
    Call<StateData> stateData(@Field("program") String program);

    //@FormUrlEncoded no need cz no field in it to pass server
    @POST("nhrr")
    Call<MinisterNhrrData> ministerNhrrData();

    @POST("ambulance")
    Call<Ambulance> ambulance();

    @POST("notp")
    Call<NOTPData> notpData();

    @POST("blood_bank")
    Call<MinisterBloodBankData> ministerBloodBankData();

    @POST("fru")
    Call<FRUData> fruData();

    @POST("dialysis")
    Call<MinisterDialysisData> ministerDialysisData();


    @POST("community_process")
    Call<CommunityProcessData> communityprocessData();

    @POST("humanresource")
    Call<HRData> hrData();

    @POST("nursing")
    Call<NursingData> nursingData();


    //@FormUrlEncoded no need cz no field in it to pass server
    @POST("pmssy")
    Call<MinisterPmssyData> ministerPmssyData();

    //@FormUrlEncoded no need cz no field in it to pass server
    @POST("pmjay")
    Call<MinisterPmjayData> ministerPmjayData();

    //@FormUrlEncoded no need cz no field in it to pass server
    @POST("cghs")
    Call<MinisterCghsData> ministerCghsData();

    @POST("mhealth")
    Call<MinisterMhealthData> ministerMhealthData();

    @POST("RCH")
    Call<MinisterRchData> ministerRchData();

    @POST("familyPlanning")
    Call<FamilyPlaningData> familyPlaning();

    @POST("maternalHealth")
    Call<MaternalHealth> maternalHealth();

    @POST("immunization")
    Call<ImmunizationData> immunizationData();

    @POST("childHealth")
    Call<ChildHealthData> childHealthData();


    @POST("emrdata")
    Call<EMRData> emrData();


    @POST("e-Hospital")
    Call<MinisterEHospitalData> ministerEhospitalData();

    @POST("rti")
    Call<RTIData> rtiData();

    @POST("Quality_Assurance")
    Call<MinisterQAData> ministerQAData();

    @POST("fssaidata")
    Call<FSSAIData> fssaiData();

    @POST("cle")
    Call<CEAData> ceaData();

    @POST("ORS")
    Call<MinisterORSData> ministerOrsData();


    @POST("ncdc")
    Call<NCDCData> ncdcData();

    @POST("ntcp")
    Call<NTCPData> ntcpData();

    @POST("ddap")
    Call<DDAPData> ddapData();


    @POST("pclp")
    Call<LeptospirosisData> leptospirosisData();

    @POST("naco")
    Call<NACOData> nacoData();


    @POST("vhp")
    Call<VHPData> vhpData();

    @POST("nlep")
    Call<NLEPData> nlepData();

    @POST("nppcf")
    Call<NPPCFData> nppcfData();


    @POST("nppcd")
    Call<NPPCDData> nppcdData();

    @POST("pczd")
    Call<PCZDData> pczdData();

    @POST("NPCDCS_Cumulative_Infrastructure")
    Call<NPCDCS_InfraData> npcdcs_InfraData();

    @POST("NPCDCS_Cumulative_Screening_data")
    Call<NPCDCS_ScreeningData> npcdcs_ScreeningData();


    @POST("amr")
    Call<AMRData> amrData();

    @POST("nvbdcp_Malaria")
    Call<NVBDCP_MalariaData> nvbdcp_MalariaData();

    @POST("nvbdcp_Kala_azar")
    Call<NVBDCP_KalaazarData> nvbdcp_KalaazarData();

    @POST("nvbdcp_Lymphatic_Filariasis")
    Call<NVBDCP_LymphaticData> nvbdcp_LymphaticData();

    @POST("nvbdcp_Dengue")
    Call<NVBDCP_DengueData> nvbdcp_DengueData();

    @POST("nvbdcp_Chikungunya")
    Call<NVBDCP_ChikungunyaData> nvbdcp_ChikungunyaData();

    @POST("nvbdcp_Japanese_Encephalitis")
    Call<NVBDCP_JapeneseData> nvbdcp_JapeneseData();

    @POST("statistics_division_nfhs")
    Call<NFHSData> nfhsData();

    @POST("statistics_division_srs")
    Call<SRSData> srsData();


    @POST("pbs")
    Call<MinisterPbsData> ministerPbsData();

    @POST("ncd")
    Call<MinisterNcdData> ministerNcdData();

    @POST("mou")
    Call<MinisterMouData> ministerMouData();

    @POST("son")
    Call<MinisterSonData> ministerSonData();

    @POST("sugam")
    Call<MinisterSugamData> ministerSugamData();

    @POST("free_diagnosticssi")
    Call<MinisterFreeDSIData> ministerFreeDSIData();

    @POST("amrit")
    Call<MinisterAmritData> ministerAmritData();

    @POST("hpe")
    Call<HPEData> hpeData();

    @POST("atr")
    Call<MinisterAtrData> ministerAtrData();


}

