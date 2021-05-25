package com.accenture.tagtrainingspring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.accenture.tagtrainingspring.patient.Patient;
import com.accenture.tagtrainingspring.screening.Screening;
import com.accenture.tagtrainingspring.service.ScreeningService;

@SpringBootApplication
public class TagTrainingSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(TagTrainingSpringApplication.class, args);
		printWelcomeMessage();
		
		Patient patient_1 = new Patient("Dave", 1, "01/01/1980", 'm');
		Patient patient_2 = new Patient("Rob", 2, "01/01/1992", 'm');
		Patient patient_3 = new Patient("Sarah", 1, "01/07/1985", 'f');
		Patient patient_4 = new Patient("Helen", 1, "15/09/1975", 'm');
		
		Screening screening_1 = new Screening(1, patient_1, "01/09/2021", false);
		Screening screening_2 = new Screening(2, patient_2, "01/03/2021", false);
		Screening screening_3 = new Screening(3, patient_3, "03/08/2021", true);
		Screening screening_4 = new Screening(4, patient_4, "10/10/2021", false);
		
		System.out.println(patient_1.getName() + " has returned a " + screening_1.isMalignantResult() + " result for malignant diagnosis");
		
		ScreeningService screeningService_1 = new ScreeningService();
		System.out.println(screeningService_1.isPatientScreening(screening_1, patient_1));
		
		List<Screening> screeningList = new ArrayList<>();
        screeningList.add(screening_1);
        screeningList.add(screening_2);
        screeningList.add(screening_3);
        screeningList.add(screening_4);
       
		
		for(Screening screening : screeningList){
			System.out.println(" Screening ID: " + screening.getScreening_id() + " Result :" + screening.isMalignantResult());
			System.out.println(screening.getPatient());
		}
		
	}

	private static void printWelcomeMessage() {
		System.out.println("\n" +
				"  _______       _____   _______        _       _             \n" +
				" |__   __|/\\   / ____| |__   __|      (_)     (_)            \n" +
				"    | |  /  \\ | |  __     | |_ __ __ _ _ _ __  _ _ __   __ _ \n" +
				"    | | / /\\ \\| | |_ |    | | '__/ _` | | '_ \\| | '_ \\ / _` |\n" +
				"    | |/ ____ \\ |__| |    | | | | (_| | | | | | | | | | (_| |\n" +
				"    |_/_/    \\_\\_____|    |_|_|  \\__,_|_|_| |_|_|_| |_|\\__, |\n" +
				"                                                        __/ |\n" +
				"                                                       |___/ \n");
	}

}
