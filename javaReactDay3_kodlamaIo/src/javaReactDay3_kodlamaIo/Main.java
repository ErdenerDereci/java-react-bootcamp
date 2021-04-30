package javaReactDay3_kodlamaIo;

public class Main {

	public static void main(String[] args) {
		
		User student = new Student(
				"s1",
				"Erdener",
				"Dereci",
				"erdenerdereci@gmail.com",
				"111"
				);
		Instructor instructor = new Instructor(
				"i1",
				"Engin",
				"Demirog",
				"engin@gmail.com",
				"222",
				20000,
				"TR 12340");
		
		User student2 = new Student();
		student2.setFirstName("Faruk");
		student2.setLastName("Dereci");
		student2.setMail("faruk@gmail.com");
		
		System.out.println("student2 nin mail adresi: "+student2.getMail());
		
		
		UserManager studentManager = new StudentManager();
		studentManager.add(student2);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.getSalary(instructor);
		
	}

}
