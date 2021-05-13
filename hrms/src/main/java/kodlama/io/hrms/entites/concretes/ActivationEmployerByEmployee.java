package kodlama.io.hrms.entites.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table; 

@Entity
@Table(name="activation_employer_by_employee")
public class ActivationEmployerByEmployee{

	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="employer_id")
	private int employerId;
	
	@Column(name="employee_id")
	private int employeeId;
	
	@Column(name="confirmed_date")
	private Date confirmedDate;
	
	public ActivationEmployerByEmployee() {
		
	}

	public ActivationEmployerByEmployee(int id, int employerId, int employeeId, Date confirmedDate) {
		super();
		this.id = id;
		this.employerId = employerId;
		this.employeeId = employeeId;
		this.confirmedDate = confirmedDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEmployerId() {
		return employerId;
	}

	public void setEmployerId(int employerId) {
		this.employerId = employerId;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public Date getConfirmedDate() {
		return confirmedDate;
	}

	public void setConfirmedDate(Date confirmedDate) {
		this.confirmedDate = confirmedDate;
	}
	
}
