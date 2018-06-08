package com.nstoya.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

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
			HttpConnect.send(-1, "hello","http://www.goodsnips.com");
		} catch (FileNotFoundException e) {
			throw e;
		} catch (IOException e) {
			System.out.println("Connecting to a different server ...");
		}
		System.out.println("\nEnd share");
	}

}
