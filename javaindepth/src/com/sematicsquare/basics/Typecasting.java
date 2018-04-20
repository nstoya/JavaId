public class Typecasting{

	static void typecasting(){
		//Explicit casting
		long y = 42;
		//int x = y; //compiler Error, long is larger than int, explicit casting needed	
		int x = (int)y;
	
		//Information loss, out of range assignment
		byte narrowedByte = (byte)123456; //127 would not throw compiler error, 128 will
		System.out.println("narrowed Byte: " + narrowedByte);

		//Truncation	
	 	int iTruncated = (int)0.99;
		System.out.println("iTruncated: " + iTruncated);

		//implicit cast (int to long)
		y = x;

		//implicit cast (char to int)
		char cChar = 'A';
		int iInt = cChar;
		System.out.println("iInt: " + iInt);

		//byte to char, explicit cast.
		byte bByte = 65;
		cChar = (char)bByte; //special conversion, first widening byte to int, then narrowing int to char 
		System.out.println("cChar: " + cChar);


	}

	public static void main(String[] args){
		typecasting();	

	}
}
