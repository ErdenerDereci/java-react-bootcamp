package javaReactDay3_kodlamaIo;

public class Instructor extends User {
	
	private double salary;
	private String iban;
	
	public Instructor(String userId, String firstName, String lastName, String eMail, String password,
			double salary,String iban) {
		
		super(userId, firstName, lastName, eMail, password);
		this.salary=salary;
		this.iban=iban;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}
	
	
}
