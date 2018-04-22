package com.nstoya.oop.interfaces;

public class X extends AbstractA implements AInt, BInt, CInt, Cloneable {

	@Override
	public void foo() {
		System.out.println("X: foo");
		System.out.println("VAL: " + BInt.VAL); //avoid diamond problem

	}
	
	public void foobar() {
		System.out.println("X: foobar");
	}
	
	public CInt clone() { //if cloneable is not implemented an exception is thrown
		try {
			return (CInt)super.clone();
		}catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
