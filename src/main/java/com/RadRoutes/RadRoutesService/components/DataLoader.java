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

        Park lochLomond = new Park("Loch Lomond");

        Park cairngorms = new Park("Cairngorms");



        lochLomond.addPropertiesToRegion("longitudeDelta", 0.04);
        lochLomond.addPropertiesToRegion("latitudeDelta", 0.09);
        lochLomond.addPropertiesToRegion("longitude", 56.339);
        lochLomond.addPropertiesToRegion("latitude", -4.381);




        cairngorms.addPropertiesToRegion("latitude", -3.646);
        cairngorms.addPropertiesToRegion("longitudeDelta", 0.04);
        cairngorms.addPropertiesToRegion("latitudeDelta", 0.09);
        cairngorms.addPropertiesToRegion("longitude", 57.078);




        parkRepository.save(lochLomond);
        parkRepository.save(cairngorms);

//
//        // USER CREATED
        User testUser1 = new User("Martin", "Sutherland", 31, "martin@email.co.uk", "male", 100.00, "Tino");
        userRepository.save(testUser1);
        User testUser2 = new User("Rab", "Nesbitt", 60, "RabCNesbitt@scotland.co.uk", "male", 10.00, "Rab C. Nesbitt");
        userRepository.save(testUser2);

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



        Route test3 = new Route("Alt Darroch",4.5,1.25,175, "easy", 3, cairngorms);
        routeRepository.save(test3);

        Route test4 = new Route("Beananidh Bheag",21.09,8.83,1352.00, "hard", 5, cairngorms);
        routeRepository.save(test4);

        Route test5 = new Route("Carn na Criche",17.1,6.8,835, "Roy Keane", 4, cairngorms);
        routeRepository.save(test5);

        Route test6 = new Route("Carn Laith",13.5,5.03,772, "ice cream", 3, cairngorms);
        routeRepository.save(test6);

        Route test7 = new Route("Burn of Loinherry",5.3,2.12,405, "easy", 3, cairngorms);
        routeRepository.save(test7);

        Route test8 = new Route("Danger Zone",10.3,4.28,800, "Laaaaannnnaaa!", 5, cairngorms);
        routeRepository.save(test8);

        Route test9 = new Route("Aviemore Loop",42.2,13.2,1495, "Why", 2, cairngorms);
        routeRepository.save(test9);

        Route test10 = new Route("K-B",58.21,24.05,3763.05, "EASAYYY!!!!", 5, cairngorms);
        routeRepository.save(test10);

        Route test11 = new Route("Lochinthrob",1.7,0.15,0, "Saucy", 1, cairngorms);
        routeRepository.save(test11);


//        **COORDINATE CREATED**

        //COORDINATES FOR ROUTE 1
        Coordinate one1 = new Coordinate(-4.366389, 56.340556,  228, test1);
        coordinateRepository.save(one1);

        Coordinate one2 = new Coordinate(-4.405278, 56.320278,  314,test1);
        coordinateRepository.save(one2);

        Coordinate one3 = new Coordinate(-4.391667, 56.287222, 250, test1);
        coordinateRepository.save(one3);

        Coordinate one4 = new Coordinate(-4.351667, 56.2725, 358, test1);
        coordinateRepository.save(one4);

        Coordinate one5= new Coordinate(-4.365833, 56.3375,  268, test1);
        coordinateRepository.save(one5);

        Coordinate one6 = new Coordinate(-4.365833, 56.3375,  268, test1);
        coordinateRepository.save(one6);


        //COORDINATES FOR ROUTE 2
        Coordinate two1 = new Coordinate(-4.366389, 56.340556,  228, test2);
        coordinateRepository.save(two1);

        Coordinate two2 = new Coordinate(-4.405278, 56.320278,  314,test2);
        coordinateRepository.save(two2);

        Coordinate two3 = new Coordinate(-4.391667, 56.287222,  250, test2);
        coordinateRepository.save(two3);

        Coordinate two4 = new Coordinate(-4.351667, 56.2725, 358, test2);
        coordinateRepository.save(two4);

        Coordinate two5= new Coordinate(-4.365833, 56.3375,  268, test2);
        coordinateRepository.save(two5);

        Coordinate two6 = new Coordinate(-4.365833, 56.3375,  268, test2);
        coordinateRepository.save(two6);




        //COORDINATES FOR ROUTE 3
        Coordinate three1 = new Coordinate(-4.6825248, 57.1270105,  75.1, test2);
        coordinateRepository.save(three1);
        Coordinate three2 = new Coordinate(-4.6822673, 57.1254265,  85.3, test2);
        coordinateRepository.save(three2);
        Coordinate three3 = new Coordinate( -4.6810657, 57.1222117,  86, test2);
        coordinateRepository.save(three3);
        Coordinate three4 = new Coordinate(-4.6808941 , 57.1165269,  112.5, test2);
        coordinateRepository.save(three4);
        Coordinate three5 = new Coordinate(-4.6844131  , 57.1135910,  148.8, test2);
        coordinateRepository.save(three5);
        Coordinate three6 = new Coordinate(-4.6958286 , 57.1109345,  195.4, test2);
        coordinateRepository.save(three6);
        Coordinate three7 = new Coordinate(-4.6893055 , 57.1175055,  206.7, test2);
        coordinateRepository.save(three7);
        Coordinate three8 = new Coordinate(-4.6844989, 57.1252401,  86.2, test2);
        coordinateRepository.save(three8);
        Coordinate three9 = new Coordinate(-4.6833831 , 57.1277093,  67.5, test2);
        coordinateRepository.save(three9);

        //COORDINATES FOR ROUTE 4
        Coordinate four1 = new Coordinate(-3.7404347,57.1316288,413.1 , test2);
        coordinateRepository.save(four1);
        Coordinate four2 = new Coordinate(-3.7109089,57.1059070,689  , test2);
        coordinateRepository.save(four2);
        Coordinate four3 = new Coordinate(-3.6954594,57.0863241,822.8,  test2);
        coordinateRepository.save(four3);
        Coordinate four4 = new Coordinate(-3.6968327,57.0704637,662.6 , test2);
        coordinateRepository.save(four4);
        Coordinate four5 = new Coordinate(-3.7342549,57.0615043,883.5, test2);
        coordinateRepository.save(four5);
        Coordinate four6 = new Coordinate(-3.7740803,57.0557168,989   , test2);
        coordinateRepository.save(four6);
        Coordinate four7 = new Coordinate(-3.7679005,57.1006859,516.3 , test2);
        coordinateRepository.save(four7);
        Coordinate four8 = new Coordinate(-3.7455845,57.1303245,473   , test2);
        coordinateRepository.save(four8);

        //COORDINATES FOR ROUTE 5
        Coordinate five1 = new Coordinate(-3.5176569, 57.0363820, 460.9 , test2);
        coordinateRepository.save(five1);
        Coordinate five2 = new Coordinate(-3.4833247, 57.0442269, 540.9, test2);
        coordinateRepository.save(five2);
        Coordinate five3 = new Coordinate(-3.4599787, 57.0479620, 565.7,  test2);
        coordinateRepository.save(five3);
        Coordinate five4 = new Coordinate(-3.4256464, 57.0367556, 525.1 , test2);
        coordinateRepository.save(five4);
        Coordinate five5 = new Coordinate(-3.4084803, 57.0180707, 386.2, test2);
        coordinateRepository.save(five5);
        Coordinate five6 = new Coordinate(-3.4537989, 57.0049856, 351.6 , test2);
        coordinateRepository.save(five6);
        Coordinate five7 = new Coordinate(-3.4943110, 57.0132110, 398.9 , test2);
        coordinateRepository.save(five7);
        Coordinate five8 = new Coordinate(-3.5231501, 57.0337666, 493.6 , test2);
        coordinateRepository.save(five8);


        //COORDINATES FOR ROUTE 6
        Coordinate six1 = new Coordinate(-3.5794550, 56.9600877, 690.6 , test2);
        coordinateRepository.save(six1);
        Coordinate six2 = new Coordinate(-3.5506159, 56.9608364, 583.5, test2);
        coordinateRepository.save(six2);
        Coordinate six3 = new Coordinate(-3.5307032, 56.9615852, 520.6,  test2);
        coordinateRepository.save(six3);
        Coordinate six4 = new Coordinate(-3.5025507, 56.9533483, 574   , test2);
        coordinateRepository.save(six4);
        Coordinate six5 = new Coordinate(-3.5355097, 56.9376184, 710.3, test2);
        coordinateRepository.save(six5);
        Coordinate six6 = new Coordinate(-3.5918147, 56.9372438, 809.3 , test2);
        coordinateRepository.save(six6);
        Coordinate six7 = new Coordinate(-3.5918147, 56.9525995, 749.3 , test2);
        coordinateRepository.save(six7);
        Coordinate six8 = new Coordinate(-3.5890681, 56.9578414, 759.7 , test2);
        coordinateRepository.save(six8);


        //COORDINATES FOR ROUTE 7
        Coordinate seven1 = new Coordinate(-3.2347423, 57.1749657, 549.7 , test2);
        coordinateRepository.save(seven1);
        Coordinate seven2 = new Coordinate(-3.2428104, 57.1741748, 514.8, test2);
        coordinateRepository.save(seven2);
        Coordinate seven3 = new Coordinate(-3.2513076, 57.1736630, 515.3,  test2);
        coordinateRepository.save(seven3);
        Coordinate seven4 = new Coordinate(-3.2628947, 57.1768268, 656.9 , test2);
        coordinateRepository.save(seven4);
        Coordinate seven5 = new Coordinate(-3.2658988, 57.1844560, 720.9, test2);
        coordinateRepository.save(seven5);
        Coordinate seven6 = new Coordinate(-3.2523376, 57.1856653, 574.9 , test2);
        coordinateRepository.save(seven6);
        Coordinate seven7 = new Coordinate(-3.2404071, 57.1848281, 544.8 , test2);
        coordinateRepository.save(seven7);
        Coordinate seven8 = new Coordinate(-3.2350856, 57.1755241, 546.7 , test2);
        coordinateRepository.save(seven8);

        //COORDINATES FOR ROUTE 8
        Coordinate eight1 = new Coordinate(-3.8287197, 56.7832421, 279.7 , test2);
        coordinateRepository.save(eight1);
        Coordinate eight2 = new Coordinate(-3.8451134, 56.7944309, 337.2, test2);
        coordinateRepository.save(eight2);
        Coordinate eight3 = new Coordinate(-3.8632236, 56.8091874, 561  ,  test2);
        coordinateRepository.save(eight3);
        Coordinate eight4 = new Coordinate(-3.8421093, 56.8194760, 493   , test2);
        coordinateRepository.save(eight4);
        Coordinate eight5 = new Coordinate(-3.8200508, 56.8136039, 394.5, test2);
        coordinateRepository.save(eight5);
        Coordinate eight6 = new Coordinate(-3.8166176, 56.8001180, 527.2 , test2);
        coordinateRepository.save(eight6);
        Coordinate eight7 = new Coordinate(-3.8278614, 56.7837593, 282.9 , test2);
        coordinateRepository.save(eight7);

        //COORDINATES FOR ROUTE 9
        Coordinate nine1 = new Coordinate(-3.8247880, 57.1810163, 210.3, test2);
        coordinateRepository.save(nine1);
        Coordinate nine2 = new Coordinate(-3.7550934, 57.1426647, 334.9, test2);
        coordinateRepository.save(nine2);
        Coordinate nine3 = new Coordinate(-3.7015351, 57.0990520, 775.9,  test2);
        coordinateRepository.save(nine3);
        Coordinate nine4 = new Coordinate(-3.6874589, 57.0615488, 589.9, test2);
        coordinateRepository.save(nine4);
        Coordinate nine5 = new Coordinate(-3.6744126, 57.0322288, 554.4, test2);
        coordinateRepository.save(nine5);
        Coordinate nine6 = new Coordinate(-3.7183579, 57.0266237, 538.1, test2);
        coordinateRepository.save(nine6);
        Coordinate nine7 = new Coordinate(-3.7677964, 57.0482923, 937.9, test2);
        coordinateRepository.save(nine7);
        Coordinate nine8 = new Coordinate(-3.7993821, 57.0641622, 563  , test2);
        coordinateRepository.save(nine8);
        Coordinate nine9 = new Coordinate(-3.7849625, 57.1160186, 461.7, test2);
        coordinateRepository.save(nine9);
        Coordinate nine10 = new Coordinate(-3.7907990, 57.1543978, 297.7 , test2);
        coordinateRepository.save(nine10);
        Coordinate nine11 = new Coordinate(-3.8258179, 57.1782251, 213.8, test2);
        coordinateRepository.save(nine11);

        //COORDINATES FOR ROUTE 10
        Coordinate ten1 = new Coordinate(-4.0227620, 57.0749101, 222.1 , test2);
        coordinateRepository.save(ten1);
        Coordinate ten2 = new Coordinate(-3.8909260, 57.0599783, 383.6, test2);
        coordinateRepository.save(ten2);
        Coordinate ten3 = new Coordinate(-3.7687031, 57.0480285, 938.9,  test2);
        coordinateRepository.save(ten3);
        Coordinate ten4 = new Coordinate(-3.5187642, 57.0487755, 682.2 , test2);
        coordinateRepository.save(ten4);
        Coordinate ten5 = new Coordinate(-3.3649556, 57.0480285, 615.1, test2);
        coordinateRepository.save(ten5);
        Coordinate ten6 = new Coordinate(-3.2454792, 57.0487755, 432.5 , test2);
        coordinateRepository.save(ten6);
        Coordinate ten7 = new Coordinate(-3.0683247, 57.0487755, 237.4 , test2);
        coordinateRepository.save(ten7);

//COORDINATES FOR ROUTE LOCHINTHROB
        Coordinate  eleven1 = new Coordinate( -3.7133309  ,57.4066481  ,  294.8  , test2);
        coordinateRepository.save( eleven1);
        Coordinate  eleven2 = new Coordinate( -3.7146613  ,57.4050761  ,  294.8  , test2);
        coordinateRepository.save( eleven2);
        Coordinate  eleven3 = new Coordinate( -3.7155625  ,57.4052610  ,  294.8  ,  test2);
        coordinateRepository.save( eleven3);
        Coordinate  eleven4 = new Coordinate( -3.7165925  ,57.4052610  ,  294.8  , test2);
        coordinateRepository.save( eleven4);
        Coordinate  eleven5 = new Coordinate( -3.7176224  ,57.4047987  ,  294.8  , test2);
        coordinateRepository.save( eleven5);
        Coordinate  eleven6 = new Coordinate( -3.7171933  ,57.4042901  ,  294.8  , test2);
        coordinateRepository.save( eleven6);
        Coordinate  eleven7 = new Coordinate( -3.7164208  ,57.4040820  ,  294.8  , test2);
        coordinateRepository.save( eleven7);
        Coordinate  eleven8 = new Coordinate( -3.7152192  ,57.4038739  ,  294.8  , test2);
        coordinateRepository.save( eleven8);
        Coordinate  eleven9 = new Coordinate( -3.7147042  ,57.4041745  ,  294.8   , test2);
        coordinateRepository.save( eleven9);
        Coordinate  eleven10 = new Coordinate(-3.7144467  ,57.4038970  ,  294.8   , test2);
        coordinateRepository.save( eleven10);
        Coordinate  eleven11 = new Coordinate(-3.7140605  ,57.4035271  ,  294.8  , test2);
        coordinateRepository.save( eleven11);
        Coordinate  eleven12 = new Coordinate(-3.7132451  ,57.4034347  ,  294.8  , test2);
        coordinateRepository.save( eleven12);
        Coordinate  eleven13 = new Coordinate(-3.7123009  ,57.4035271  ,  294.8  , test2);
        coordinateRepository.save( eleven13);
        Coordinate  eleven14 = new Coordinate(-3.7117859  ,57.4039433  ,  294.8  , test2);
        coordinateRepository.save( eleven14);
        Coordinate  eleven15 = new Coordinate(-3.7121722  ,57.4045213  ,  294.8  , test2);
        coordinateRepository.save( eleven15);
        Coordinate  eleven16 = new Coordinate(-3.7129876  ,57.4048680  ,  294.8  , test2);
        coordinateRepository.save( eleven16);
        Coordinate  eleven17 = new Coordinate(-3.7120005  ,57.4063938  ,  294.8  , test2);
        coordinateRepository.save( eleven17);
        Coordinate  eleven18 = new Coordinate(-3.7111422  ,57.4061626  ,  294.8  , test2);
        coordinateRepository.save( eleven18);
        Coordinate  eleven19 = new Coordinate(-3.7106906  ,57.4066236  ,  294.8  , test2);
        coordinateRepository.save( eleven19);
        Coordinate  eleven20 = new Coordinate(-3.7110124  ,57.4071900  ,  294.8   , test2);
        coordinateRepository.save( eleven20);
        Coordinate  eleven21 = new Coordinate(-3.7115060  ,57.4075714  ,  294.8  , test2);
        coordinateRepository.save( eleven21);
        Coordinate  eleven22 = new Coordinate(-3.7119566  ,57.4076985  ,  294.8  , test2);
        coordinateRepository.save( eleven22);
        Coordinate  eleven23 = new Coordinate(-3.7127720  ,57.4076985  ,  294.8  , test2);
        coordinateRepository.save( eleven23);
        Coordinate  eleven24 = new Coordinate(-3.7133942  ,57.4075830  ,  294.8  , test2);
        coordinateRepository.save( eleven24);
        Coordinate  eleven25 = new Coordinate(-3.7139521  ,57.4073171  ,  294.8  , test2);
        coordinateRepository.save( eleven25);
        Coordinate  eleven26 = new Coordinate(-3.7143384  ,57.4070166  ,  294.8  , test2);
        coordinateRepository.save( eleven26);
        Coordinate  eleven27 = new Coordinate(-3.7133728  ,57.4066583  ,  294.8  , test2);
        coordinateRepository.save( eleven27);










        ////        ROUTE CREATED
        //ROUTE 1
        test1.addCoordinate(one1);
        test1.addCoordinate(one2);
        test1.addCoordinate(one3);
        test1.addCoordinate(one4);
        test1.addCoordinate(one5);
        test1.addCoordinate(one6);
        routeRepository.save(test1);


        //ROUTE 2

        test2.addCoordinate(two1);
        test2.addCoordinate(two2);
        test2.addCoordinate(two3);
        test2.addCoordinate(two4);
        test2.addCoordinate(two5);
        test2.addCoordinate(two6);
        routeRepository.save(test2);

        //ROUTE 3

        test3.addCoordinate(three1);
        test3.addCoordinate(three2);
        test3.addCoordinate(three3);
        test3.addCoordinate(three4);
        test3.addCoordinate(three5);
        test3.addCoordinate(three6);
        test3.addCoordinate(three7);
        test3.addCoordinate(three8);
        test3.addCoordinate(three9);
        routeRepository.save(test3);

//ROUTE 4

        test4.addCoordinate(four1);
        test4.addCoordinate(four2);
        test4.addCoordinate(four3);
        test4.addCoordinate(four4);
        test4.addCoordinate(four5);
        test4.addCoordinate(four6);
        test4.addCoordinate(four7);
        test4.addCoordinate(four8);
        routeRepository.save(test4);

//ROUTE 5

        test5.addCoordinate(five1);
        test5.addCoordinate(five2);
        test5.addCoordinate(five3);
        test5.addCoordinate(five4);
        test5.addCoordinate(five5);
        test5.addCoordinate(five6);
        test5.addCoordinate(five7);
        test5.addCoordinate(five8);
        routeRepository.save(test5);

//ROUTE 6

        test6.addCoordinate(six1);
        test6.addCoordinate(six2);
        test6.addCoordinate(six3);
        test6.addCoordinate(six4);
        test6.addCoordinate(six5);
        test6.addCoordinate(six6);
        test6.addCoordinate(six7);
        test6.addCoordinate(six8);
        routeRepository.save(test6);

//ROUTE 7

        test7.addCoordinate(seven1);
        test7.addCoordinate(seven2);
        test7.addCoordinate(seven3);
        test7.addCoordinate(seven4);
        test7.addCoordinate(seven5);
        test7.addCoordinate(seven6);
        test7.addCoordinate(seven7);
        test7.addCoordinate(seven8);
        routeRepository.save(test7);



//ROUTE 8

        test8.addCoordinate(eight1);
        test8.addCoordinate(eight2);
        test8.addCoordinate(eight3);
        test8.addCoordinate(eight4);
        test8.addCoordinate(eight5);
        test8.addCoordinate(eight6);
        test8.addCoordinate(eight7);
        routeRepository.save(test8);






//ROUTE 9

        test9.addCoordinate(nine1);
        test9.addCoordinate(nine2);
        test9.addCoordinate(nine3);
        test9.addCoordinate(nine4);
        test9.addCoordinate(nine5);
        test9.addCoordinate(nine6);
        test9.addCoordinate(nine7);
        test9.addCoordinate(nine8);
        test9.addCoordinate(nine9);
        test9.addCoordinate(nine10);
        test9.addCoordinate(nine11);
        routeRepository.save(test9);








//ROUTE 10

        test10.addCoordinate(ten1);
        test10.addCoordinate(ten2);
        test10.addCoordinate(ten3);
        test10.addCoordinate(ten4);
        test10.addCoordinate(ten5);
        test10.addCoordinate(ten6);
        test10.addCoordinate(ten7);
        routeRepository.save(test10);












//ROUTE 11

        test11.addCoordinate(eleven1);
        test11.addCoordinate(eleven2);
        test11.addCoordinate(eleven3);
        test11.addCoordinate(eleven4);
        test11.addCoordinate(eleven5);
        test11.addCoordinate(eleven6);
        test11.addCoordinate(eleven7);
        test11.addCoordinate(eleven9);
        test11.addCoordinate(eleven10);
        test11.addCoordinate(eleven11);
        test11.addCoordinate(eleven12);
        test11.addCoordinate(eleven13);
        test11.addCoordinate(eleven14);
        test11.addCoordinate(eleven15);
        test11.addCoordinate(eleven16);
        test11.addCoordinate(eleven17);
        test11.addCoordinate(eleven18);
        test11.addCoordinate(eleven19);
        test11.addCoordinate(eleven20);
        test11.addCoordinate(eleven21);
        test11.addCoordinate(eleven22);
        test11.addCoordinate(eleven23);
        test11.addCoordinate(eleven24);
        test11.addCoordinate(eleven25);
        test11.addCoordinate(eleven26);
        test11.addCoordinate(eleven27);
        routeRepository.save(test11);






















    }







}
