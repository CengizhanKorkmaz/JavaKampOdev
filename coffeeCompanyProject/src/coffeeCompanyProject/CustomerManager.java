package coffeeCompanyProject;

public abstract class CustomerManager implements CustomerService {
	
	@Override
	public void Save(Customer customer) {
		System.out.println("Sisteme kayýt edilmiþtir."+customer.getFirstName());
	}
}
