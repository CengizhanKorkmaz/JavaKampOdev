package kodlama.io.hrms.entites.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="activation_employer")

public class ActivationEmployer extends ActivationCode {

	@Column(name="employer_id")
	private int employerId;
	

	public ActivationEmployer() {
		
	}
	public ActivationEmployer(int employerId) {
		super();
		this.employerId = employerId;
	}
	public int getEmployerId() {
		return employerId;
	}
	public void setEmployerId(int employerId) {
		this.employerId = employerId;
	}
	
	
}
