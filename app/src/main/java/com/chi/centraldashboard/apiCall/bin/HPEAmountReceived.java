package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HPEAmountReceived {
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


    @SerializedName("Name_of_Category")
    @Expose
    private String Name_of_Category;

    @SerializedName("Amount_received_during_the_month_in_Lakh")
    @Expose
    private String Amount_received_during_the_month_in_Lakh;

    @SerializedName("Total_Amount_received_during_the_month_in_Lakh")
    @Expose
    private String Total_Amount_received_during_the_month_in_Lakh;


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

    public String getName_of_Category() {
        return Name_of_Category;
    }

    public void setName_of_Category(String name_of_Category) {
        Name_of_Category = name_of_Category;
    }

    public String getAmount_received_during_the_month_in_Lakh() {
        return Amount_received_during_the_month_in_Lakh;
    }

    public void setAmount_received_during_the_month_in_Lakh(String amount_received_during_the_month_in_Lakh) {
        Amount_received_during_the_month_in_Lakh = amount_received_during_the_month_in_Lakh;
    }

    public String getTotal_Amount_received_during_the_month_in_Lakh() {
        return Total_Amount_received_during_the_month_in_Lakh;
    }

    public void setTotal_Amount_received_during_the_month_in_Lakh(String total_Amount_received_during_the_month_in_Lakh) {
        Total_Amount_received_during_the_month_in_Lakh = total_Amount_received_during_the_month_in_Lakh;
    }
}
