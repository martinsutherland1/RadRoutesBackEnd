package com.RadRoutes.RadRoutesService.controller;

import com.RadRoutes.RadRoutesService.models.Route;
import com.RadRoutes.RadRoutesService.repository.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RouteController {

    @Autowired
    RouteRepository routeRepository;

    // INDEX
    @GetMapping(value = "/routes")
    public ResponseEntity<List<Route>> getAllRoutes(){
        return new ResponseEntity<>(routeRepository.findAll(), HttpStatus.OK);
    }

    // GET
    @GetMapping(value = "/routes/{id}")
    public ResponseEntity getRoute(@PathVariable Long id){
        return new ResponseEntity<>(routeRepository.findById(id), HttpStatus.OK);
    }

    // POST
    @PostMapping(value = "/routes")
    public ResponseEntity<Route> postRoute(@RequestBody Route route){
        routeRepository.save(route);
        return new ResponseEntity<>(route, HttpStatus.OK);
    }

    // UPDATE
    @PatchMapping(value = "/routes/{id}")
    public ResponseEntity<Route> updateRoute(@PathVariable Route route){
        routeRepository.save(route);
        return new ResponseEntity<>(route, HttpStatus.OK);
    }

    //DELETE
    @DeleteMapping(value = "/routes/{id}")
    public ResponseEntity<Route> deleteRoute(@PathVariable Long id) {
        Route found = routeRepository.getById(id);
        routeRepository.delete(found);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
}
