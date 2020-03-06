package com.chi.centraldashboard.apiCall;

import com.chi.centraldashboard.apiCall.bin.NTCPCOTPA;
import com.chi.centraldashboard.apiCall.bin.NTCPDataList;
import com.chi.centraldashboard.apiCall.bin.NTCPFineImposed;
import com.chi.centraldashboard.apiCall.bin.NTCPPersonQuit;
import com.chi.centraldashboard.apiCall.bin.NTCPQuitline;
import com.chi.centraldashboard.apiCall.bin.NTCPQuitters;
import com.chi.centraldashboard.apiCall.bin.NTCPTCC;
import com.chi.centraldashboard.apiCall.bin.NTCPTCServices;
import com.chi.centraldashboard.apiCall.bin.NTCPUnderNTCP;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class NTCPData {
    @SerializedName("Ntcp")
    @Expose
    private List<NTCPDataList> ntcpDataListList = null;

    @SerializedName("Total_No_of_calls_Landed_at_Quitline")
    @Expose
    private List<NTCPQuitline> ntcpQuitlineList = null;

    @SerializedName("Total_No_of_registered_Quitters")
    @Expose
    private List<NTCPQuitters> ntcpQuittersList = null;

    @SerializedName("Total_No_of_persons_who_have_quit")
    @Expose
    private List<NTCPPersonQuit> ntcpPersonQuitList = null;

    @SerializedName("Total_number_of_districts_under_NTCP")
    @Expose
    private List<NTCPUnderNTCP> ntcpUnderNTCPList = null;

    @SerializedName("Total_No_of_persons_fined_COTPA")
    @Expose
    private List<NTCPCOTPA> ntcpcotpaList = null;

    @SerializedName("Total_Amount_of_fine_imposed")
    @Expose
    private List<NTCPFineImposed> ntcpFineImposedList = null;

    @SerializedName("Total_No_of_TCCS_Under_NTCP")
    @Expose
    private List<NTCPTCC> ntcptccList = null;

    @SerializedName("Total_No_of_persons_who_availed_TC_services")
    @Expose
    private List<NTCPTCServices>ntcptcServicesList=null;


    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("status")
    @Expose
    private int status;


    public List<NTCPDataList> getNtcpDataListList() {
        return ntcpDataListList;
    }

    public void setNtcpDataListList(List<NTCPDataList> ntcpDataListList) {
        this.ntcpDataListList = ntcpDataListList;
    }

    public List<NTCPQuitline> getNtcpQuitlineList() {
        return ntcpQuitlineList;
    }

    public void setNtcpQuitlineList(List<NTCPQuitline> ntcpQuitlineList) {
        this.ntcpQuitlineList = ntcpQuitlineList;
    }

    public List<NTCPQuitters> getNtcpQuittersList() {
        return ntcpQuittersList;
    }

    public void setNtcpQuittersList(List<NTCPQuitters> ntcpQuittersList) {
        this.ntcpQuittersList = ntcpQuittersList;
    }

    public List<NTCPPersonQuit> getNtcpPersonQuitList() {
        return ntcpPersonQuitList;
    }

    public void setNtcpPersonQuitList(List<NTCPPersonQuit> ntcpPersonQuitList) {
        this.ntcpPersonQuitList = ntcpPersonQuitList;
    }

    public List<NTCPUnderNTCP> getNtcpUnderNTCPList() {
        return ntcpUnderNTCPList;
    }

    public void setNtcpUnderNTCPList(List<NTCPUnderNTCP> ntcpUnderNTCPList) {
        this.ntcpUnderNTCPList = ntcpUnderNTCPList;
    }

    public List<NTCPCOTPA> getNtcpcotpaList() {
        return ntcpcotpaList;
    }

    public void setNtcpcotpaList(List<NTCPCOTPA> ntcpcotpaList) {
        this.ntcpcotpaList = ntcpcotpaList;
    }

    public List<NTCPFineImposed> getNtcpFineImposedList() {
        return ntcpFineImposedList;
    }

    public void setNtcpFineImposedList(List<NTCPFineImposed> ntcpFineImposedList) {
        this.ntcpFineImposedList = ntcpFineImposedList;
    }

    public List<NTCPTCC> getNtcptccList() {
        return ntcptccList;
    }

    public void setNtcptccList(List<NTCPTCC> ntcptccList) {
        this.ntcptccList = ntcptccList;
    }

    public List<NTCPTCServices> getNtcptcServicesList() {
        return ntcptcServicesList;
    }

    public void setNtcptcServicesList(List<NTCPTCServices> ntcptcServicesList) {
        this.ntcptcServicesList = ntcptcServicesList;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
