public class Operands{

	static void charTypePromotion(){
		char char1 = 50; //corresponding utf16 value 2 from the utf16 table is assigned
		System.out.println("char1:" + char1);
		System.out.println("73 - char1:" + (73 - char1)); //char 1 gets promoted to int
		System.out.println("char1 -'3' :" + (char1 - '3')); //char1 an '3' are promoted to ints
		System.out.println("'a' + 'b': " + ('a' + 'b')); //'a' + 'b' are promoted to ints
	}

	static void beforeAfterAssignment(){
		int x = 1;
		int y = ++x;
		System.out.println("int x = 1; int y = ++x: " + y);

		x = 1;
		y = x++;
		System.out.println("int x = 1; int y = x++ " + y);

	}

	public static void main(String[] args){
		charTypePromotion();
		beforeAfterAssignment();

	}


}
