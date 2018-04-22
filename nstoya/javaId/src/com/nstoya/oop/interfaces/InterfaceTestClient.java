package com.nstoya.oop.interfaces;

public class InterfaceTestClient {

	public static int getVal() {
		return 43;
	}
	
	public static void main(String[] args) {
		AInt a = new X();
		CInt c = new X();
		a.foo();
		a.bar();
		
		CInt clone = ((X)c).clone();
		
		if (clone != c) {
			System.out.println("Clone created!");
		}
	}

}
