package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NursingStateWise {
    @SerializedName("SR_NO")
    @Expose
    private String SR_NO;

    @SerializedName("year")
    @Expose
    private String year;

    @SerializedName("StateID")
    @Expose
    private String StateID;

    @SerializedName("State_Name")
    @Expose
    private String State_Name;

    @SerializedName("A_N_M")
    @Expose
    private String A_N_M;

    @SerializedName("G_N_M")
    @Expose
    private String G_N_M;

    @SerializedName("B_Sc")
    @Expose
    private String B_Sc;

    @SerializedName("M_Sc")
    @Expose
    private String M_Sc;

    @SerializedName("PBBSC")
    @Expose
    private String PBBSC;

    @SerializedName("IGNOU")
    @Expose
    private String IGNOU;

    @SerializedName("Nurse_Practitioner_Critical_Care")
    @Expose
    private String Nurse_Practitioner_Critical_Care;

    @SerializedName("Total_Number_of_State_Wise_Nursing_Institute")
    @Expose
    private String Total_Number_of_State_Wise_Nursing_Institute;



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

    public String getA_N_M() {
        return A_N_M;
    }

    public void setA_N_M(String a_N_M) {
        A_N_M = a_N_M;
    }

    public String getG_N_M() {
        return G_N_M;
    }

    public void setG_N_M(String g_N_M) {
        G_N_M = g_N_M;
    }

    public String getB_Sc() {
        return B_Sc;
    }

    public void setB_Sc(String b_Sc) {
        B_Sc = b_Sc;
    }

    public String getM_Sc() {
        return M_Sc;
    }

    public void setM_Sc(String m_Sc) {
        M_Sc = m_Sc;
    }

    public String getPBBSC() {
        return PBBSC;
    }

    public void setPBBSC(String PBBSC) {
        this.PBBSC = PBBSC;
    }

    public String getIGNOU() {
        return IGNOU;
    }

    public void setIGNOU(String IGNOU) {
        this.IGNOU = IGNOU;
    }

    public String getNurse_Practitioner_Critical_Care() {
        return Nurse_Practitioner_Critical_Care;
    }

    public void setNurse_Practitioner_Critical_Care(String nurse_Practitioner_Critical_Care) {
        Nurse_Practitioner_Critical_Care = nurse_Practitioner_Critical_Care;
    }

    public String getTotal_Number_of_State_Wise_Nursing_Institute() {
        return Total_Number_of_State_Wise_Nursing_Institute;
    }

    public void setTotal_Number_of_State_Wise_Nursing_Institute(String total_Number_of_State_Wise_Nursing_Institute) {
        Total_Number_of_State_Wise_Nursing_Institute = total_Number_of_State_Wise_Nursing_Institute;
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
