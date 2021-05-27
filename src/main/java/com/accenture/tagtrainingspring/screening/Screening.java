package com.accenture.tagtrainingspring.screening;

import com.accenture.tagtrainingspring.patient.*;

public class Screening {
	
		private int screening_id;
//		screening_id = 1;
//		System.out.println(screening_id);
		private Patient patient;
//		patient_id = 10;
//		System.out.println(patient_id);
		private String screeningDate;
//		screeningDate = "01/01/1960";
//		System.out.println(screeningDate);
		private boolean malignantResult;
//		malignantResult = true;
//		System.out.println(malignantResult);

	public static void main(String[] args) {
		
	}
	
	public Screening(int screening_id, Patient patient, String screeningDate, boolean malignantResult) {
		super();
		this.screening_id = screening_id;
		this.patient = patient;
		this.screeningDate = screeningDate;
		this.malignantResult = malignantResult;
	}

	public int getScreening_id() {
		return screening_id;
	}

	public void setScreening_id(int screening_id) {
		this.screening_id = screening_id;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public String getScreeningDate() {
		return screeningDate;
	}

	public void setScreeningDate(String screeningDate) {
		this.screeningDate = screeningDate;
	}

	public boolean isMalignantResult() {
		return malignantResult;
	}

	public void setMalignantResult(boolean malignantResult) {
		this.malignantResult = malignantResult;
	}
	

}
