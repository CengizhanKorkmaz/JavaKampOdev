package kodlama.io.hrms.entites.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="activation_code")
public class ActivationCode{
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="code")
	private String code;
	
	@Column(name="confirmed_date")
	private Date confirmedDate;
	
	@Column(name="is_confirmed")
	private boolean isConfirmed;
	
	public ActivationCode() {
		
	}

	public ActivationCode(int id, String code, Date confirmedDate, boolean isConfirmed) {
		super();
		this.id = id;
		this.code = code;
		this.confirmedDate = confirmedDate;
		this.isConfirmed = isConfirmed;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getConfirmedDate() {
		return confirmedDate;
	}

	public void setConfirmedDate(Date confirmedDate) {
		this.confirmedDate = confirmedDate;
	}

	public boolean isConfirmed() {
		return isConfirmed;
	}

	public void setConfirmed(boolean isConfirmed) {
		this.isConfirmed = isConfirmed;
	}
	
	
	
}
