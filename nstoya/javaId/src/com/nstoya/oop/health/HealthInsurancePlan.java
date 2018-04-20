package com.nstoya.oop.health;

public abstract class HealthInsurancePlan {
    // Code for 'coverage' field goes here
	
	private double coverage;
	private double discount;
    
    // Don't worry about the below code and also the InsuranceBrand class
	private InsuranceBrand offeredBy;
	
	public abstract double computeMonthlyPremium(double salary);

	public InsuranceBrand getOfferedBy() {
		return offeredBy;
	}

	public void setOfferedBy(InsuranceBrand offeredBy) {
		this.offeredBy = offeredBy;
	}

	public double getCoverage() {
		return coverage;
	}

	public void setCoverage(double coverage) {
		this.coverage = coverage;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	
	
	
}
