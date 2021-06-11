package com.RadRoutes.RadRoutesService.components;

import com.RadRoutes.RadRoutesService.models.Coordinate;
import com.RadRoutes.RadRoutesService.models.Park;
import com.RadRoutes.RadRoutesService.models.Route;
import com.RadRoutes.RadRoutesService.models.User;
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

        //        CREATE PARK

        Park lochLomond = new Park("Loch Lomond", 56.33900, -4.38114);
        parkRepository.save(lochLomond);
//
//        // USER CREATED
        User testUser1 = new User("Martin", "Sutherland", 31, "martin@email.co.uk", "male", 100.00, "Tino");
        userRepository.save(testUser1);


//
//
//        //      ROUTE CLASS CREATED
        Route test1 = new Route("Sore legs",17.28,7.006, 1070.05, "tough", 5, lochLomond);
        Route test2 = new Route("Easy on the legs",17.28,7.006,1070.05, "easy", 4, lochLomond);
        routeRepository.save(test1);
        routeRepository.save(test2);
        testUser1.addRoute(test1);
        testUser1.addRoute(test2);
        userRepository.save(testUser1);


//        COORDINATE CREATED
        Coordinate one1 = new Coordinate(56.340556, -4.366389, 228, test1);
        coordinateRepository.save(one1);

        Coordinate one2 = new Coordinate(56.320278, -4.405278, 314,test1);
        coordinateRepository.save(one2);

        Coordinate one3 = new Coordinate(56.287222, -4.391667, 250, test1);
        coordinateRepository.save(one3);

        Coordinate one4 = new Coordinate(56.2725, -4.351667, 358, test1);
        coordinateRepository.save(one4);

        Coordinate one5= new Coordinate(56.3375, -4.365833, 268, test1);
        coordinateRepository.save(one5);

        Coordinate one6 = new Coordinate(56.3375, -4.365833, 268, test1);
        coordinateRepository.save(one6);

        Coordinate two1 = new Coordinate(56.340556, -4.366389, 228, test2);
        coordinateRepository.save(two1);

        Coordinate two2 = new Coordinate(56.320278, -4.405278, 314,test2);
        coordinateRepository.save(two2);

        Coordinate two3 = new Coordinate(56.287222, -4.391667, 250, test2);
        coordinateRepository.save(two3);

        Coordinate two4 = new Coordinate(56.2725, -4.351667, 358, test2);
        coordinateRepository.save(two4);

        Coordinate two5= new Coordinate(56.3375, -4.365833, 268, test2);
        coordinateRepository.save(two5);

        Coordinate two6 = new Coordinate(56.3375, -4.365833, 268, test2);
        coordinateRepository.save(two6);

        ////        ROUTE CREATED
        test1.addCoordinate(one1);
        test1.addCoordinate(one2);
        test1.addCoordinate(one3);
        test1.addCoordinate(one4);
        test1.addCoordinate(one5);
        test1.addCoordinate(one6);
        routeRepository.save(test1);

        test2.addCoordinate(two1);
        test2.addCoordinate(two2);
        test2.addCoordinate(two3);
        test2.addCoordinate(two4);
        test2.addCoordinate(two5);
        test2.addCoordinate(two6);
        routeRepository.save(test2);




















    }







}
