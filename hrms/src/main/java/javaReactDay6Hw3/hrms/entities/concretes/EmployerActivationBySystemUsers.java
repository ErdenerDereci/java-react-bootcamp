package javaReactDay6Hw3.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employer_activation_by_system_users")
public class EmployerActivationBySystemUsers {

	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="system_user_id")
	private int systemUserId;
	
	@Column(name="employer_id")
	private int employerId;
	
	@Column(name="email_activation_id")
	private int emailActivationId;
	
	public EmployerActivationBySystemUsers(int id, int systemUserId, int employerId, int emailActivationId) {
		super();
		this.id = id;
		this.systemUserId = systemUserId;
		this.employerId = employerId;
		this.emailActivationId = emailActivationId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSystemUserId() {
		return systemUserId;
	}

	public void setSystemUserId(int systemUserId) {
		this.systemUserId = systemUserId;
	}

	public int getEmployerId() {
		return employerId;
	}

	public void setEmployerId(int employerId) {
		this.employerId = employerId;
	}

	public int getEmailActivationId() {
		return emailActivationId;
	}

	public void setEmailActivationId(int emailActivationId) {
		this.emailActivationId = emailActivationId;
	}
}
