package com.nstoya.oop.health;

public class PlatinumPlan extends HealthInsurancePlan {
	
	public PlatinumPlan() {
		setCoverage(0.9);
		setDiscount(50);
	}

	@Override
	public double computeMonthlyPremium(double salary) {
		
		return salary*0.08;
	}

	
}
