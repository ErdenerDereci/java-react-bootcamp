package oopOdevGun2;

public class SchoolManager {

	School[] _schools;
	
	public SchoolManager(School[] schools) {
		this._schools=schools;
	}
	
	public int GetGivenSchoolArrayCount() {
		return _schools.length;
	}
	
	public void printGivenSchoolArray() {
		for (School school : _schools) {
			System.out.println("School Name: "+school.schoolName+"\nClass Count: "+school.classCount);
		}
	}
	
}
