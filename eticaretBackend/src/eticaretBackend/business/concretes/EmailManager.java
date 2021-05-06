package eticaretBackend.business.concretes;

import eticaretBackend.business.abstracts.EmailService;
import eticaretBackend.entities.concretes.User;

public class EmailManager implements EmailService {

	@Override
	public void sendEmail(User user) {
		
		System.out.println(user.getEmail()+" hesap do�rulamas� sisteme giri� yap�ld���nda otomatik olarak ger�ekle�ecektir.");
		
	}

	@Override
	public void verifyUser(String email) {
		
		System.out.println(email+" hesab�n�z do�rulanm��t�r.");
	}

}
