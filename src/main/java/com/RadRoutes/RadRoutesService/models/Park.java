package com.RadRoutes.RadRoutesService.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "parks")
public class Park {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "park_name")
    private String parkName;

    @Column(name = "longitude")
    private double longitude;

    @Column(name = "latitude")
    private double latitude;

    @JsonIgnoreProperties(value = "routePoints")
    @OneToMany(mappedBy = "park", fetch = FetchType.LAZY)
    private List<Route> allRoutes;

    public Park(String parkName, double longitude, double latitude) {
        this.parkName = parkName;
        this.longitude = longitude;
        this.latitude = latitude;
        this.allRoutes = new ArrayList<>();

    }

    public Park() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getParkName() {
        return parkName;
    }

    public void setParkName(String parkName) {
        this.parkName = parkName;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public List<Route> getAllRoutes() {
        return allRoutes;
    }

    public void setAllRoutes(List<Route> allRoutes) {
        this.allRoutes = allRoutes;
    }

    public int routeCount(){
        return getAllRoutes().size();
    }
}
