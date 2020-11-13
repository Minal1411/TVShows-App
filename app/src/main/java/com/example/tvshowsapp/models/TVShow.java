package com.example.tvshowsapp.models;

import com.google.gson.annotations.SerializedName;

public class TVShow {
    @SerializedName("id")
    private  int id;
    @SerializedName("name")
    private String name;
    @SerializedName("start_date")
    private  String startDate;
    @SerializedName("country")
    private  String country;
    @SerializedName("network")
    private  String network;
    @SerializedName("status")
    private  String status;
    @SerializedName("image_thumbnail_path")
    private String thumbnail;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }
}
