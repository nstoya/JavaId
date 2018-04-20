public class BasicDemo23 {
	
	static void print(){
	}

	static void primitives(){
		System.out.println("Inside primitives");
		int intHex = 0x0041;
		System.out.println("intHex: " + intHex);
		int intBinary = 0b01000001;
		System.out.println("intBinary: " + intBinary);
		int intUnderscore = 1_23_456;
		System.out.println("intBinary: " + intUnderscore);

		char charA = 'A';
		System.out.println("charA: " + charA);

		char charInt = 65;
		System.out.println("charInt: " + charInt);

		char charUnicode = '\u0041';
		System.out.println("charUnicode: " + charUnicode);

		char charHex = 0x41;
		System.out.println("charHex: " + charHex);

		char charBinary = 0b01000001;
		System.out.println("charBinary: " + charBinary);


	}

	public static void main(String[] args){
		primitives();	
	}
}
