package Adapters;

import java.rmi.RemoteException;

import Abstract.CheckRealUser;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CheckRealUser{

	@SuppressWarnings("deprecation")
	@Override
	public boolean CheckIfRealPerson(Gamer gamer) {
		boolean result=false;
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			result=client.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalId()), gamer.getFirstName().toUpperCase(), gamer.getLastName().toUpperCase(),gamer.getDateOfBirth().getYear());
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
