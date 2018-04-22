package com.nstoya.oop.interfaces;

public abstract class AbstractA implements AInt{
	public void bar() {
		System.out.println("Abstract A: bar");
	}
	
	//no need to implement foo, since this is an abstract 
	//class and foo is an abstract method
}
