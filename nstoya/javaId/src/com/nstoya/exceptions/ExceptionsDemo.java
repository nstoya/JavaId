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
			HttpConnect.send(0, "hello","http://www.goodsnips.com");
			System.out.println("\nStart share, send invoked");
		} catch (FileNotFoundException e) {
			System.out.println("Share, throwing FileNotFound");
			throw e;
		} catch (IOException e) {
			System.out.println("Connecting to a different server ...");
		}finally {
			System.out.println("Share finally");
		}
		System.out.println("\nEnd share");
	}

}
