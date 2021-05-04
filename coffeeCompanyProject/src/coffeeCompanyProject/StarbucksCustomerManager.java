package coffeeCompanyProject;

public class StarbucksCustomerManager extends CustomerManager {

	CustomerCheckService checkService;
	public  StarbucksCustomerManager(CustomerCheckService checkService) {
		
		this.checkService=checkService;
	}
	@Override
	public void Save(Customer customer) {
		if(checkService.CheckIfRealPerson(customer))
		{
		super.Save(customer);
		}
		else {
			System.out.println("Bir hata ile karþýlaþýldý.");
		}
	}
}
