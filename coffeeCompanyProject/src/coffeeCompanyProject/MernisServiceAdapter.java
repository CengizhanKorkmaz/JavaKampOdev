package coffeeCompanyProject;
import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@SuppressWarnings("deprecation")
	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		boolean result=false;
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			result=client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalIdentity()), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(),customer.getDateOfBirth().getYear());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
}
