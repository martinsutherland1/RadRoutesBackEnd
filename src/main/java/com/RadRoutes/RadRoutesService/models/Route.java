package com.RadRoutes.RadRoutesService.models;

import java.util.ArrayList;
import java.util.List;

public class Route {


    private String name;
    private double distance;
    private double time;
    private double elevationChange;
    private String difficulty;
    private int rating;
    private List<Coordinate> routePoints;

    public Route(String name, double distance, double time, double elevationChange, String difficulty, int rating) {
        this.name = name;
        this.distance = distance;
        this.time = time;
        this.elevationChange = elevationChange;
        this.difficulty = difficulty;
        this.rating = rating;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
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




}
