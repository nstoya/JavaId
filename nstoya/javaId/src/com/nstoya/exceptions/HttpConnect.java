package com.nstoya.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class HttpConnect {
	
	
	/**
	 * 
	 * @param destination
	 * @param data
	 * @param partner
	 * @throws IOException
	 * @throws IllegalArgumentException generated if destination < 0 || destination > 1
	 */
	public static void send(int destination, String data, String partner) throws IOException {
		System.out.println("\nStart send");
		
		if (destination < 0 || destination > 1) {
			throw new IllegalArgumentException();
		}
		
		if(destination == 0) {
			//try to write data to file, but the file is missing, so an exception is generated
			throw new FileNotFoundException();
		}
		
		System.out.println("\nEnd send");
	}

}
