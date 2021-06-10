package com.RadRoutes.RadRoutesService.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "routes")
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "route_name")
    private String routeName;

    @Column(name = "distance")
    private double distance;

    @Column(name = "duration")
    private double duration;

    @Column(name = "elevation_change")
    private double elevationChange;

    @Column(name = "difficulty")
    private String difficulty;

    @Column(name = "rating")
    private int rating;


    @JsonIgnoreProperties(value = "routes")
    @ManyToOne
    @JoinColumn(name = "park_id", nullable = false)
    private Park park;

    private List<Coordinate> routePoints;

    public Route(String routeName, double distance, double duration, double elevationChange, String difficulty, int rating) {
        this.routeName = routeName;
        this.distance = distance;
        this.duration = duration;
        this.elevationChange = elevationChange;
        this.difficulty = difficulty;
        this.rating = rating;
    }

    public Route() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public double getElevationChange() {
        return elevationChange;
    }

    public void setElevationChange(double elevationChange) {
        this.elevationChange = elevationChange;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Park getPark() {
        return park;
    }

    public void setPark(Park park) {
        this.park = park;
    }
}
