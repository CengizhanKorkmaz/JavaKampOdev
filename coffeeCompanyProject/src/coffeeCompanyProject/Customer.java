package coffeeCompanyProject;

import java.util.Date;

public class Customer implements Entity {
	
	
	private int id;
	private String nationalIdentity;
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	
	public Customer() {
		
	}
	
	public Customer(int id, String nationalIdentity, String firstName, String lastName, Date dateOfBirth) {
		super();
		this.id = id;
		this.nationalIdentity = nationalIdentity;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNationalIdentity() {
		return nationalIdentity;
	}

	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
}
