package com.nstoya.jvm;

import java.lang.reflect.Method;

public class SimpleUnitTester {
    
    public int execute(Class clazz) throws Exception {
        int failedCount = 0;
        Object refObj = null;
        // your code
    	try {
    		refObj = clazz.newInstance();
    		 Method[] methods = clazz.getMethods();
    	        for (Method m: methods) {
    	        	if (m.getName().startsWith("test")){
    	        		if (m.getReturnType() == boolean.class) {
    	        			Object result = m.invoke(refObj);
    	        			failedCount = ((Boolean)result).booleanValue() ? failedCount: failedCount + 1;
    	        			 System.out.println("---" + m.getName() + ": " + result.toString());
    	        			 
    	        		}
    	        	}
    	        	
    	        }
    	}
        catch (Exception e) {
        	e.printStackTrace();
		}
       
        
        System.out.println("failedCount: " + failedCount);
        return failedCount;
    }
    
    public static void main(String[] args) throws Exception{
    	SimpleUnitTester ut = new SimpleUnitTester();
    	ut.execute(Reflection.class);
    }
    
}
