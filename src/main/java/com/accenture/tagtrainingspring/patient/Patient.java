package com.accenture.tagtrainingspring.patient;

public class Patient {
	
	private String name;
//	name = "Ste";
//	System.out.println(name);
	private Integer id;
//	id = 132456;
//	System.out.println(id);
	private String date;
//	date = "01/01/1960";
//	System.out.println(date);
	private char gender;
//	gender Male, Female, Other (m, f, o)
//	gender = 'm';
//	System.out.println(gender);
	
	public Patient(String name, int id, String date, char gender) {
		super();
		this.name = name;
		this.id = id;
		this.date = date;
		this.gender = gender;
	}
	
	public static void main (String[] args) {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}	
	
	
	
}
