package com.accenture.tagtrainingspring.screening;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.tagtrainingspring.service.ScreeningService;

//Day2Step4.1
@RestController 
public class ScreeningController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

//	Day2Step4.5
	@Autowired 
	ScreeningDaoImpl screeningDao;
//	ScreeningService screeningService; 

//	Day2Step4.3
	@GetMapping("/screenings") /*Day2Step4.8*/
	public List<Screening> getScreening(){  
//		return screeningService.getScreenings();
		return screeningDao.get();
	}
	
	@GetMapping("/screenings/{id}") /*Day2Step4.8*/
	public Screening getScreening(@PathVariable int id){  
//		return screeningService.getScreenings();
		return screeningDao.get(id);
	}
	
	@PostMapping("/screenings")
	public void createScreening(@RequestBody Screening screening) {
		screeningDao.save(screening);
	}
	
}
