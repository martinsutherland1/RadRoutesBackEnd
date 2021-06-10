package com.RadRoutes.RadRoutesService.models;

import java.util.ArrayList;

public class Park {

    private String name;
    private ArrayList<Route> allRoutes;

    public Park(String name) {
        this.name = name;
        this.allRoutes = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Route> getAllRoutes() {
        return allRoutes;
    }

    public void setAllRoutes(ArrayList<Route> allRoutes) {
        this.allRoutes = allRoutes;
    }


}
