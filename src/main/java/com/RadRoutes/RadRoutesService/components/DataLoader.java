package com.RadRoutes.RadRoutesService.components;

import com.RadRoutes.RadRoutesService.models.Coordinate;
import com.RadRoutes.RadRoutesService.repository.CoordinateRepository;
import com.RadRoutes.RadRoutesService.repository.ParkRepository;
import com.RadRoutes.RadRoutesService.repository.RouteRepository;
import com.RadRoutes.RadRoutesService.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CoordinateRepository coordinateRepository;

    @Autowired
    ParkRepository parkRepository;

    @Autowired
    RouteRepository routeRepository;

    @Autowired
    UserRepository userRepository;


    public DataLoader(){

    }


    public void run(ApplicationArguments args){
        Coordinate one1 = new Coordinate(56.340556, 4.366389, 228);
        Coordinate one2 = new Coordinate(56.320278, 4.405278, 314);
        Coordinate one3 = new Coordinate(56.287222, 4.391667, 250);
        Coordinate one4 = new Coordinate(56.2725, 4.351667, 358);
        Coordinate one5= new Coordinate(56.3375, 4.365833, 268);
        Coordinate one6 = new Coordinate(56.3375, 4.365833, 268);



    }







}
