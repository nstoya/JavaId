public class ValueReference{


	static void go(int[] array){
		System.out.println("array 0: " + array[0]);
		System.out.println("array 1: " + array[1]);

		array[1] = 22;
	}

	static void go(int i){
		System.out.println("go (int i)");
	}

	static void go(short s){
		System.out.println("go (short s)"); 
	}

	static void varargsOverload(boolean b, int i, int j, int k){

	System.out.println("varargsOverload, no varargs");
	}

	static void varargsOverload(boolean b, int... list){

	System.out.println("varargsOverload, with varargs");
	}



	public static void main(String[] args){
		int[] array = {1, 2};
		go(array);
		
		//array[1] has been changed by the method. Array is an object reference
		//therefore it gets changed. Pass by reference
		System.out.println("array 1: " + array[1]);
		

		//which method will be picked? go(short s), because is the most suitable for the byte variable
		byte b = 22;
		go(b);

		varargsOverload(true, 1, 2, 3); //compiler searches for exacht match 
		varargsOverload(true, 1, 2, 3, 4, 5, 6, 7); //no exact match, so the varargs method
		varargsOverload(true);  //no exact match, so the varargs method 
	}

}
