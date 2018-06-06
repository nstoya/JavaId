package com.nstoya.exceptions;

import java.io.FileNotFoundException;

public class HttpConnect {
	
	public static void send(int destination, String data, String partner) throws FileNotFoundException {
		System.out.println("\nStart send");
		if(destination == 0) {
			//try to write data to file, but the file is missing, so an exception is generated
			throw new FileNotFoundException();
		}
		
		System.out.println("\nEnd send");
	}

}
