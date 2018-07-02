
package com.MsoftTexas.WeatherOnMyTripRoute.DirectionApiModel;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Geocoded_waypoint {

    @SerializedName("geocoder_status")
    @Expose
    private String geocoder_status;
    @SerializedName("place_id")
    @Expose
    private String place_id;
    @SerializedName("types")
    @Expose
    private List<String> types = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Geocoded_waypoint() {
    }

    /**
     * 
     * @param place_id
     * @param geocoder_status
     * @param types
     */
    public Geocoded_waypoint(String geocoder_status, String place_id, List<String> types) {
        super();
        this.geocoder_status = geocoder_status;
        this.place_id = place_id;
        this.types = types;
    }

    public String getGeocoder_status() {
        return geocoder_status;
    }

    public void setGeocoder_status(String geocoder_status) {
        this.geocoder_status = geocoder_status;
    }

    public String getPlace_id() {
        return place_id;
    }

    public void setPlace_id(String place_id) {
        this.place_id = place_id;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

}
