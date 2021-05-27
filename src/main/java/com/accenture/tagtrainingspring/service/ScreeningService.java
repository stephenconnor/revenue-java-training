package com.accenture.tagtrainingspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.tagtrainingspring.patient.Patient;
import com.accenture.tagtrainingspring.screening.Screening;
import com.accenture.tagtrainingspring.screening.ScreeningDatabase;

//Day2Step4.4
@Service 
//Day2Step
public class ScreeningService {
	
//	Day2Step4.3
	@Autowired 
	private ScreeningDatabase screeningDatabase;
	
	 public ScreeningService(ScreeningDatabase screeningDatabase) {
	        this.screeningDatabase = screeningDatabase;
	 }
	
	public boolean isPatientScreening(Screening screening, Patient patient) {
		return screening.getPatient().getId().equals(patient.getId());

	}
	
	public Screening findScreening(String name) {
        Screening screening = null;
        List<Screening>  list = getScreenings();
        for(Screening screeningx: list){
            if(screeningx.getPatient().getName().equalsIgnoreCase(name)){
                screening = screeningx;
            }
        }
        return screening;
    }
	
	public List<Screening> getScreenings(){
		return this.screeningDatabase.screenings();
	}
 	
	
}
