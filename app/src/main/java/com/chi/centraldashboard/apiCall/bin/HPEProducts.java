package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HPEProducts {
    @SerializedName("SR_NO")
    @Expose
    private String SR_NO;

    @SerializedName("Year")
    @Expose
    private String Year;

    @SerializedName("Month")
    @Expose
    private String Month;

    @SerializedName("created_date")
    @Expose
    private String created_date;


    @SerializedName("updated_date")
    @Expose
    private String updated_date;

    @SerializedName("Number_of_Products")
    @Expose
    private String Number_of_Products;


    @SerializedName("Total_Number_of_Products")
    @Expose
    private String Total_Number_of_Products;


    public String getSR_NO() {
        return SR_NO;
    }

    public void setSR_NO(String SR_NO) {
        this.SR_NO = SR_NO;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    public String getMonth() {
        return Month;
    }

    public void setMonth(String month) {
        Month = month;
    }

    public String getCreated_date() {
        return created_date;
    }

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }

    public String getUpdated_date() {
        return updated_date;
    }

    public void setUpdated_date(String updated_date) {
        this.updated_date = updated_date;
    }

    public String getNumber_of_Products() {
        return Number_of_Products;
    }

    public void setNumber_of_Products(String number_of_Products) {
        Number_of_Products = number_of_Products;
    }

    public String getTotal_Number_of_Products() {
        return Total_Number_of_Products;
    }

    public void setTotal_Number_of_Products(String total_Number_of_Products) {
        Total_Number_of_Products = total_Number_of_Products;
    }
}
