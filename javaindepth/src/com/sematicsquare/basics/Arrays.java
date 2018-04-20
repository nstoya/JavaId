public class Arrays{

	static void arrays(){
		int[] myArray = new int[] {9, 11, 2, 5, 4, 4, 6};
		int myArray2[]; //possible
		int[] myArray3 =  {9, 11, 2, 5, 4, 4, 6};

		System.out.println("myArray.lengt: " + myArray.length);	
		System.out.println("myArray[1]: " + myArray[1]);
	}

	static void twoDimensionalArrays(){
	
		int[][] myArray = new int[2][4];
		int[][] myArray2 = new int[][]{{9,11}, {2,5}, {4, 4}, {6,1}};
	}

	static void threeDimensionalarrays(){
	int[][][] unitsSold = new int[][][] {
									{ //New York
										{0,0,0,0}, //Jan
										{0,0,0,0}, //Feb
										{0,0,0,0}, //March
										{0,850,0,0} //April
									},
									{ //San Francisco
										{0,0,0,0},
										{0,0,0,0},
										{0,0,0,0},
										{0,0,0,0}
									},
									{
										{0,0,0,0},
										{0,0,0,0},
										{0,0,0,0},
										{0,0,0,0}
									},
									{
										{0,0,0,0},
										{0,0,0,0},
										{0,0,0,0},
										{0,0,0,0}
									}
								};

	}

	public static void main(String[] args){
		arrays();	
	}
}
