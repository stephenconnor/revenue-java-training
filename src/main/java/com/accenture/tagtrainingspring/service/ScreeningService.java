package com.accenture.tagtrainingspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.tagtrainingspring.patient.Patient;
import com.accenture.tagtrainingspring.screening.Screening;
//import com.accenture.tagtrainingspring.screening.ScreeningDatabase;

@Service 
public class ScreeningService {
	
// @Autowired 
//	private ScreeningDatabase screeningDatabase;
//	
//	 public ScreeningService(ScreeningDatabase screeningDatabase) {
//	        this.screeningDatabase = screeningDatabase;
//	 }
	
//	public boolean isPatientScreening(Screening screening, Patient patient) {
//		return screening.getPatient().getId().equals(patient.getId());
//	}
	 
	 public boolean isPatientScreening(Screening screening, Patient patient) {
			return screening.getId() == patient.getId();
		}
	
//	public Screening findScreening(String name) {
//        Screening screening = null;
//        List<Screening>  list = getScreenings();
//        for(Screening screeningx: list){
//            if(screeningx.getPatient().getName().equalsIgnoreCase(name)){
//                screening = screeningx;
//            }
//        }
//        return screening;
//    }
	
	public List<Screening> getScreenings(){
		return null;
	}
 	
	
}
