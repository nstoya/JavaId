package com.nstoya.oop.health;

public class GoldPlan extends HealthInsurancePlan {
	
	public GoldPlan() {
		setCoverage(0.8);
		setDiscount(40);
	}

	@Override
	public double computeMonthlyPremium(double salary) {
		
		return salary*0.07;
	}

}
