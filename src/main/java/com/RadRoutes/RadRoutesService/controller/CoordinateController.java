package com.RadRoutes.RadRoutesService.controller;

import com.RadRoutes.RadRoutesService.models.Coordinate;
import com.RadRoutes.RadRoutesService.repository.CoordinateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CoordinateController {

    @Autowired
    CoordinateRepository coordinateRepository;

    //INDEX
    @GetMapping(value = "/coordinates")
    public ResponseEntity<List<Coordinate>> getAllCoordinates(){
        return new ResponseEntity<>(coordinateRepository.findAll(), HttpStatus.OK);
    }

//    GET
    @GetMapping(value = "/coordinates/{id}")
    public ResponseEntity getCoordinate(@PathVariable Long id){
        return new ResponseEntity<>(coordinateRepository.findById(id), HttpStatus.OK);
    }


//    POST
    @PostMapping(value = "/coordinates")
    public ResponseEntity<Coordinate> createCoordinate(@RequestBody Coordinate coordinate){
        coordinateRepository.save(coordinate);
        return new ResponseEntity<>(coordinate, HttpStatus.OK);
    }


//    UPDATE
    @PatchMapping(value = "/coordinates/{id}")
    public ResponseEntity<Coordinate> updateCoordinate(@RequestBody Coordinate coordinate) {
        coordinateRepository.save(coordinate);
        return new ResponseEntity<>(coordinate, HttpStatus.OK);
    }


//    DELETE ONE
    @DeleteMapping(value = "/coordinates/{id}")
    public ResponseEntity<Coordinate> deleteCoordinate(@PathVariable Long id){
        Coordinate found = coordinateRepository.getById(id);
        coordinateRepository.delete(found);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }


}
