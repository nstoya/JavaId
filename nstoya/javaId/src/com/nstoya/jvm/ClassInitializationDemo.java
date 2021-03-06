package com.nstoya.jvm;

/**
* Demonstrates,
  (i) class is NOT loaded on accessing a compile-time constant. Constant is fetched from .class file
  (ii) On accessing a non compile-time constant, class & its super-class are LOADED and INITIALIZED
  (iii) On instantiating the class, it is loaded from memory (loading was done previous step) and 
         (a) superclass constructor is run, i.e., CONSTRUCTOR CHAINING
		 (b) its instance variables are initialized and instance initializer block is run
		 (c) its own constructor is run
*/

interface Superinterface {
	//the interface gets initialized when a static method is invoked or 
	//a field, which is not a compile time constant, is accessed
	//at initialisation time (when one of the variables is accessd) 
	//both variables below get initialized  
	int STATIC_FINAL3 = new ClassInitializationDemo().getInt();
	int STATIC_FINAL5 = new ClassInitializationDemo().getInt5();
	static void staticMethod() {
		System.out.println("Superinterface: staticMethod");
	}
}
class ObjectReference {
	ObjectReference() {
	  System.out.println("ObjectReference: constructor");
	}
}
class Superclass {
    static {
    	//gets executed when the initialisation of the class is completed
	    System.out.println("Superclass: static initializer");
	}
    //Instance initializer block
    {
	    System.out.println("Superclass: instance initializer");
	}
    Superclass () {
    	System.out.println("Superclass: constructor");
	}    
}
class Subclass extends Superclass implements Superinterface {
	static final int STATIC_FINAL = 47;	
	//Math.random is loaded when it is encountered (lazy loading) 
	//and not directly at the beginning
	static final int STATIC_FINAL2 = (int) (Math.random() * 5);
	
	//static String stringLiteral = "hello";	
	//public static int STATIC_FINAL4 = new ClassInitializationDemo().getInt();
	
	ObjectReference objectReference = new ObjectReference();
	static {
		System.out.println("Subclass: static initializer");
		//staticFinal = 47;
	}		
	Subclass () {
		System.out.println("Subclass: constructor");	    
	}	
	// Instance initializer is copied to the beginning of constructor by compiler
	{
		System.out.println("Subclass: instance initializer");	
	}
}

public class ClassInitializationDemo {
	
	//Instance initialiser block - gets executed when an instance of the class is created
	{
		System.out.println("\nClassInitializationDemo: instance initializer");	
	}
	static {
		System.out.println("\nClassInitializationDemo: static initializer (Initialization Stage)");
	}
	static int getInt() { 
		System.out.println("ClassInitializationDemo:getInt()");
		return 3; 
	}
	static int getInt5() { 
		System.out.println("ClassInitializationDemo:getInt5()");
		return 5; 
	}
	public static void main(String[] args) throws Exception { 		
		System.out.println("\nJVM invoked the main method ... ");
		//Subclass is not loaded because Subclass.STATIC_FINAL is a compile time constant and is directly copied
	    System.out.println("Subclass.STATIC_FINAL: " + Subclass.STATIC_FINAL);
	    //System.out.println("Subclass.stringLiteral: " + Subclass.stringLiteral);
	    System.out.println("Invoking Subclass.STATIC_FINAL2  ... "); //Subclass.STATIC_FINAL2 is not a compile time constant
		System.out.println("Subclass.STATIC_FINAL2: " + Subclass.STATIC_FINAL2);		
		System.out.println("\nInstantiating Subclass ...");
		//the Subclass is already loaded before and on the heap so no need to load it again
		new Subclass();		
		System.out.println("Superinterface.STATIC_FINAL3: " + Superinterface.STATIC_FINAL3);
		//Superinterface.staticMethod();
	}
}
