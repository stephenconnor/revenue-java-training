package com.accenture.tagtrainingspring.service;

import java.util.List;

import com.accenture.tagtrainingspring.patient.Patient;
import com.accenture.tagtrainingspring.screening.ScreeingDatabase;
import com.accenture.tagtrainingspring.screening.Screening;

public class ScreeningService {

//	private ScreeingDatabase screeningDatabase;
	
	public boolean isPatientScreening(Screening screening, Patient patient) {
		return screening.getPatient().getId().equals(patient.getId());

	}
	
//	public List<Screening> getScreenings(){
//		return this.screeningDatabase.screenings();
//	}
// 	

	public ScreeningService () {
		
	}
	
}
