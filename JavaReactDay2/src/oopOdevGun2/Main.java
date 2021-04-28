package oopOdevGun2;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student(1,"Erdener","Dereci",26,"ERKEK");
		Student student2 = new Student(2,"Ozlem","Kacar",22,"KADIN");
		Student student3 = new Student(3,"Zeynep","Kaya",22,"KADIN");
		Student student4 = new Student(4,"Faruk","Dereci",18,"ERKEK");
		
		Student[] students= {student1,student2,student3,student4};
		
		School school1 = new School(1,"Kocaeli Universitesi",200);
		School school2 = new School(2,"Bogazici Universitesi",100);
		
		School[] schools = {school1,school2};
		
		for (School school : schools) {
			System.out.println("School Name: "+school.schoolName+"\nClass Count: "+school.classCount+"\n--------");
		}
		for (Student student : students) {
			System.out.println(
					"Student First Name: "+student.studentFirstName+"\n"
							+ "Student Last Name: "+student.studentLastName+"\n"
									+ "Student Age: "+student.studentAge+"\n"
											+ "Student Gender: "+student.studentGender+"\n"
													+ "-------------");
					     
		}
		
		
		SchoolManager schoolManager = new SchoolManager(schools);
		
		schoolManager.printGivenSchoolArray();
		System.out.println(schoolManager.GetGivenSchoolArrayCount());
	}

}
