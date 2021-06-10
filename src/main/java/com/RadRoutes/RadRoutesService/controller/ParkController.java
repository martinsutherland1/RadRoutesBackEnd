package com.RadRoutes.RadRoutesService.controller;

import com.RadRoutes.RadRoutesService.models.Park;
import com.RadRoutes.RadRoutesService.repository.ParkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ParkController {

    @Autowired
    ParkRepository parkRepository;

    // INDEX
    @GetMapping(value = "/parks")
    public ResponseEntity<List<Park>> getAllParks(){
        return new ResponseEntity<>(parkRepository.findAll(), HttpStatus.OK);
    }

    // GET
    @GetMapping(value = "/parks/{id}")
    public ResponseEntity getPark(@PathVariable Long id){
        return new ResponseEntity<>(parkRepository.findById(id), HttpStatus.OK);
    }

    // POST
    @PostMapping(value = "/parks")
    public ResponseEntity<Park> postPark(@RequestBody Park park){
        parkRepository.save(park);
        return new ResponseEntity<>(park, HttpStatus.OK);
    }

    // UPDATE
    @PatchMapping(value = "/park/{id}")
    public ResponseEntity<Park> updatePark(@PathVariable Park park){
        parkRepository.save(park);
        return new ResponseEntity<>(park, HttpStatus.OK);
    }

    //DELETE
    @DeleteMapping(value = "/PARKS/{id}")
    public ResponseEntity<Park> deletePirate(@PathVariable Long id) {
        Park found = parkRepository.getById(id);
        parkRepository.delete(found);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

}
