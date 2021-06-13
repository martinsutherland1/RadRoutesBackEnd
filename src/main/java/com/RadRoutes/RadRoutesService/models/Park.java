package com.RadRoutes.RadRoutesService.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


@Entity
@Table(name = "parks")
public class Park {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "park_name")
    private String parkName;

    @Column(name = "region")
    private HashMap<String, Double> region;

    @JsonBackReference
    @OneToMany(mappedBy = "park", fetch = FetchType.LAZY)
    private List<Route> allRoutes;

    public Park(String parkName) {
        this.parkName = parkName;
        this.region = new HashMap<String, Double>();
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

    public HashMap<String, Double> getRegion() {
        return region;
    }

    public void setRegion(HashMap<String, Double> region) {
        this.region = region;
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

    public void addPropertiesToRegion(String key, Double value){
        region.put(key, value);
    }
}
