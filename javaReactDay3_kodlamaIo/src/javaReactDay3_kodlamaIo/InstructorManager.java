package javaReactDay3_kodlamaIo;

public class InstructorManager extends UserManager {
	
	public void getSalary(Instructor instructor) {
		System.out.println(instructor.getFirstName()+" adli egitmenin maasi: "+instructor.getSalary());
	}
}
