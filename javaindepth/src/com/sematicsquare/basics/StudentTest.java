class StudentTest{
	
	public static void main(String[] args){
		int[] studentIds =  new int[]{1001, 1002, 1003};

		Student student1 = new Student(studentIds[0], "Joan", new char[] {'A', 'B', 'C'});
		student1.gender = "male";

		Student student2 = new Student(studentIds[1], "Raj");
		student2.gender = "male";

		Student student3 = new Student(studentIds[2], "Anita");
		student1.gender = "female";

		System.out.println("Student 1: " + student1.name);
		System.out.println("Student 2: " + student2.name);
		System.out.println("Student 3: " + student3.name);

		student1.updateProfile("John");
		System.out.println("Update Student 1: " + student1.name);
		
		Student student4 = student1;		
		System.out.println("Student 4: " + student4.name);
		
		student4.updateProfile("Mike");
		System.out.println("Student 1 aftre update Student 4: " + student1.name);
		System.out.println("Update Student 4: " + student4.name);

	
	}
}
