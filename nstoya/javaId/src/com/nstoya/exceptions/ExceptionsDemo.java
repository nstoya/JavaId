package com.nstoya.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionsDemo {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("\nStart main");
		try {
			share();
			System.out.println("Share invoked");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("Main fileNotFound exception");
		}finally {
			System.out.println("Main finally");
		}
		System.out.println("\nEnd main");

	}
	private static void share() throws FileNotFoundException {
		System.out.println("\nStart share");
		
		try {
			String responce = HttpConnect.send(1, "hello","http://www.goodsnips.com");
			System.out.println("\nStart share, send invoked");
			APIParser.parseSendREsponseCode(responce, "hello", "http://www.goodsnips.com");
		} catch (FileNotFoundException e) {
			System.out.println("Share, throwing FileNotFound");
			throw e;
		} catch (IOException e) {
			System.out.println("Connecting to a different server ...");
		} catch (APIFormatChangeException e) {
			// Item 65: Don't ignore exceptions
			e.printStackTrace();
			
			//Item 63: Include failure-capture information  in detail messages
			//System.out.println("e.toString " + e);
			//System.out.println("e.getMessage: " + e.getMessage());
			
			//Item 63: 
			System.out.println("e.getElementName(): " + e.getElementName());
			
			//Item 61: Throw exceptopns appropriate to the abstraction
			e.getCause().printStackTrace(); //shows only the lower lever exception
		}finally {
			System.out.println("Share finally");
		}
		System.out.println("\nEnd share");
	}

}
