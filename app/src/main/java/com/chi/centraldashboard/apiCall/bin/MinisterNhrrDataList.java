package com.chi.centraldashboard.apiCall.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MinisterNhrrDataList {
    @SerializedName("Statewise")
    @Expose
    private List<MinisterNhrrDataStatewise> ministerNhrrDataStatewise = null;


    @SerializedName("Typewise")
    @Expose
    private List<MinisterNhrrDataTypewise> ministerNhrrDataTypewise=null;


    public List<MinisterNhrrDataStatewise> getMinisterNhrrDataStatewise() {
        return ministerNhrrDataStatewise;
    }

    public void setMinisterNhrrDataStatewise(List<MinisterNhrrDataStatewise> ministerNhrrDataStatewise) {
        this.ministerNhrrDataStatewise = ministerNhrrDataStatewise;
    }

    public List<MinisterNhrrDataTypewise> getMinisterNhrrDataTypewise() {
        return ministerNhrrDataTypewise;
    }

    public void setMinisterNhrrDataTypewise(List<MinisterNhrrDataTypewise> ministerNhrrDataTypewise) {
        this.ministerNhrrDataTypewise = ministerNhrrDataTypewise;
    }
}
