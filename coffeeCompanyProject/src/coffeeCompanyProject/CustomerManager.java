package coffeeCompanyProject;

public abstract class CustomerManager implements CustomerService {
	
	@Override
	public void Save(Customer customer) {
		System.out.println("Sisteme kay�t edilmi�tir."+customer.getFirstName());
	}
}
