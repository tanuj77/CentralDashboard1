package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NursingCourses {
    @SerializedName("SR_NO")
    @Expose
    private String SR_NO;

    @SerializedName("year")
    @Expose
    private String year;

    @SerializedName("Nursing_Programs")
    @Expose
    private String Nursing_Programs;


    @SerializedName("Training_Duration")
    @Expose
    private String Training_Duration;

    @SerializedName("Examination")
    @Expose
    private String Examination;

    @SerializedName("Registration")
    @Expose
    private String Registration;

    @SerializedName("Total_Number_of_Courses")
    @Expose
    private String Total_Number_of_Courses;


    @SerializedName("date_added")
    @Expose
    private String date_added;


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

    public String getNursing_Programs() {
        return Nursing_Programs;
    }

    public void setNursing_Programs(String nursing_Programs) {
        Nursing_Programs = nursing_Programs;
    }

    public String getTraining_Duration() {
        return Training_Duration;
    }

    public void setTraining_Duration(String training_Duration) {
        Training_Duration = training_Duration;
    }

    public String getExamination() {
        return Examination;
    }

    public void setExamination(String examination) {
        Examination = examination;
    }

    public String getRegistration() {
        return Registration;
    }

    public void setRegistration(String registration) {
        Registration = registration;
    }

    public String getTotal_Number_of_Courses() {
        return Total_Number_of_Courses;
    }

    public void setTotal_Number_of_Courses(String total_Number_of_Courses) {
        Total_Number_of_Courses = total_Number_of_Courses;
    }

    public String getDate_added() {
        return date_added;
    }

    public void setDate_added(String date_added) {
        this.date_added = date_added;
    }
}
