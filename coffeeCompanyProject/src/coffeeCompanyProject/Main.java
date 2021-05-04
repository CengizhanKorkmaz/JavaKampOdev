package coffeeCompanyProject;

import java.util.Date;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		
		Customer customer=new Customer();
		customer.setId(1);
		customer.setFirstName("Cengizhan");
		customer.setLastName("Korkmaz");
		customer.setNationalIdentity("12347708244");
		customer.setDateOfBirth(new Date(1998,07,24));
		CustomerManager starbucks=new StarbucksCustomerManager(new MernisServiceAdapter());
		starbucks.Save(customer);

	}

}
