package com.nstoya.exceptions;

import java.io.FileNotFoundException;

public class ExceptionsDemo {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("\nStart main");
//		try {
			share();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.println("\nEnd main");

	}
	private static void share() throws FileNotFoundException {
		System.out.println("\nStart share");
		
		try {
			HttpConnect.send(0, "hello","http://www.goodsnips.com");
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			throw e;
		}
		System.out.println("\nEnd share");
	}

}
