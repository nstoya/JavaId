package com.nstoya.oop.health;

public class SilverPlan extends HealthInsurancePlan {

	public SilverPlan() {
		
		setCoverage(0.7);
		setDiscount(30);
	}

	@Override
	public double computeMonthlyPremium(double salary) {
		
		return salary*0.06;
	}
}
