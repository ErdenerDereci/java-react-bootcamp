package javaReactDay6Hw3.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="employer")
public class Employer extends User {
	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="website")
	private String website;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	public Employer(int id, String eMail, String password, String companyName, String website, String phoneNumber) {
		super(id,eMail,password);
		this.companyName = companyName;
		this.website = website;
		this.phoneNumber = phoneNumber;
	}
	
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}
