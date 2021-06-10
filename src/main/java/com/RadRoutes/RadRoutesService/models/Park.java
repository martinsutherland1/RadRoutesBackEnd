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

    @JsonIgnoreProperties(value = "park")
    @OneToMany(mappedBy = "park", fetch = FetchType.LAZY)
    private List<Route> allRoutes;

    public Park(String parkName) {
        this.parkName = parkName;
        this.allRoutes = new ArrayList<>();
    }


    public Park() {
    }


    public String getName() {
        return parkName;
    }

    public void setName(String name) {
        this.parkName = parkName;
    }

    public List<Route> getAllRoutes() {
        return allRoutes;
    }

    public void setAllRoutes(ArrayList<Route> allRoutes) {
        this.allRoutes = allRoutes;
    }


}
