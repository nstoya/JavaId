package com.nstoya.oop.health;

public class BronzePlan extends HealthInsurancePlan {

	public BronzePlan() {
		setCoverage(0.6);
		setDiscount(25);
	}
	
	@Override
	public double computeMonthlyPremium(double salary) {
		
		return salary*0.05;
	}

}
