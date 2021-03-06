package com.nstoya.oop.health;

public class User {
    
	private long id;
	// add rest of the variables
	
	private String firstName, lastName, gender, email;
	private boolean insured;
	private HealthInsurancePlan insurancePlan;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	
	
	// add rest of the getters & setters
		
	public void setFirstName(String firstName){
	    this.firstName = firstName;
	}
	
	public String getFirstName(){
	    return firstName;
	}
	
	public void setLastName(String lastName){
	    this.lastName = lastName;
	}
	
	public String getLastName(){
	    return lastName;
	}
	
	public void setGender(String gender){
	    this.gender = gender;
	}
	
	public String getGender(){
	    return gender;
	}
	
	public void setEmail(String email){
	    this.email = email;
	}
	
	public String getEmail(){
	    return email; 
	}
	
	public boolean isInsured() {
		return insured;
	}
	public void setInsured(boolean insured) {
		this.insured = insured;
	}
	public HealthInsurancePlan getInsurancePlan() {
		return insurancePlan;
	}
	public void setInsurancePlan(HealthInsurancePlan insurancePlan) {
		this.insurancePlan = insurancePlan;
	}
	
	
}

