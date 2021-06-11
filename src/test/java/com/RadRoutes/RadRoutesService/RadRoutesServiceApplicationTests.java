package com.RadRoutes.RadRoutesService;

import com.RadRoutes.RadRoutesService.models.Park;
import com.RadRoutes.RadRoutesService.models.Route;
import com.RadRoutes.RadRoutesService.models.User;
import com.RadRoutes.RadRoutesService.repository.CoordinateRepository;
import com.RadRoutes.RadRoutesService.repository.ParkRepository;
import com.RadRoutes.RadRoutesService.repository.RouteRepository;
import com.RadRoutes.RadRoutesService.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
class RadRoutesServiceApplicationTests {

	@Autowired
	CoordinateRepository coordinateRepository;

	@Autowired
	ParkRepository parkRepository;

	@Autowired
	RouteRepository routeRepository;

	@Autowired
	UserRepository userRepository;


	@Test
	void contextLoads() {
	}

	@Test
	public void canAddRouteToPark(){
		Park lochLomond = new Park("Loch Lomond", 56.33900, -4.38114);
		parkRepository.save(lochLomond);
		User testUser1 = new User("Martin", "Sutherland", 31, "martin@email.co.uk", "male", 100.00, "Tino");
		userRepository.save(testUser1);
		Route test1 = new Route("Sore legs",17.28,7.006, 1070.05, "tough", 5, lochLomond);
		Route test2 = new Route("Easy on the legs",17.28,7.006,1070.05, "easy", 4, lochLomond);
		routeRepository.save(test1);
		routeRepository.save(test2);
		List<Park> foundParks = parkRepository.findByParksId(1L);
		assertEquals(1, foundParks.size());



	}





}
