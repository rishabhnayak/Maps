
package com.MsoftTexas.WeatherOnMyTripRoute.DirectionApiModel;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Leg {

    @SerializedName("distance")
    @Expose
    private Distance distance;
    @SerializedName("duration")
    @Expose
    private Duration duration;
    @SerializedName("end_address")
    @Expose
    private String end_address;
    @SerializedName("end_location")
    @Expose
    private End_location end_location;
    @SerializedName("start_address")
    @Expose
    private String start_address;
    @SerializedName("start_location")
    @Expose
    private Start_location start_location;
    @SerializedName("steps")
    @Expose
    private List<Step> steps = null;
    @SerializedName("traffic_speed_entry")
    @Expose
    private List<Object> traffic_speed_entry = null;
    @SerializedName("via_waypoint")
    @Expose
    private List<Object> via_waypoint = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Leg() {
    }

    /**
     * 
     * @param duration
     * @param distance
     * @param end_location
     * @param start_address
     * @param end_address
     * @param start_location
     * @param traffic_speed_entry
     * @param via_waypoint
     * @param steps
     */
    public Leg(Distance distance, Duration duration, String end_address, End_location end_location, String start_address, Start_location start_location, List<Step> steps, List<Object> traffic_speed_entry, List<Object> via_waypoint) {
        super();
        this.distance = distance;
        this.duration = duration;
        this.end_address = end_address;
        this.end_location = end_location;
        this.start_address = start_address;
        this.start_location = start_location;
        this.steps = steps;
        this.traffic_speed_entry = traffic_speed_entry;
        this.via_waypoint = via_waypoint;
    }

    public Distance getDistance() {
        return distance;
    }

    public void setDistance(Distance distance) {
        this.distance = distance;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public String getEnd_address() {
        return end_address;
    }

    public void setEnd_address(String end_address) {
        this.end_address = end_address;
    }

    public End_location getEnd_location() {
        return end_location;
    }

    public void setEnd_location(End_location end_location) {
        this.end_location = end_location;
    }

    public String getStart_address() {
        return start_address;
    }

    public void setStart_address(String start_address) {
        this.start_address = start_address;
    }

    public Start_location getStart_location() {
        return start_location;
    }

    public void setStart_location(Start_location start_location) {
        this.start_location = start_location;
    }

    public List<Step> getSteps() {
        return steps;
    }

    public void setSteps(List<Step> steps) {
        this.steps = steps;
    }

    public List<Object> getTraffic_speed_entry() {
        return traffic_speed_entry;
    }

    public void setTraffic_speed_entry(List<Object> traffic_speed_entry) {
        this.traffic_speed_entry = traffic_speed_entry;
    }

    public List<Object> getVia_waypoint() {
        return via_waypoint;
    }

    public void setVia_waypoint(List<Object> via_waypoint) {
        this.via_waypoint = via_waypoint;
    }

}
