package com.nstoya.oop.health;

public class Billing {
	   
    public static double[] computePaymentAmount(Patient patient, double amount) {
        double[] payments = new double[2];
        
        HealthInsurancePlan patientInsurancePlan = patient.getInsurancePlan();

        // your logic  
        //1 amount the insurance company would pay
        //2 patient pay
        //discounts for patient
        if (patientInsurancePlan != null) {
        	double insurancePay = amount*patientInsurancePlan.getCoverage();
        	payments[0] = insurancePay;
        	payments[1] = amount - insurancePay - patientInsurancePlan.getDiscount();
        }else {
        	payments[0] = 0;
        	payments[1] = amount - 20;
        }
        

        return payments;
    }
    
    public static void main (String[] args) {
    	HealthInsurancePlan insurancePlan = new BronzePlan();
    	Patient patient = new Patient();
    	patient.setInsurancePlan(insurancePlan);
    	
    	double[] payments = Billing.computePaymentAmount(patient, 950.0);
    	
    	System.out.println("insurance: " + payments[0]);
    	System.out.println("patient: " + payments[1]);
    }

}