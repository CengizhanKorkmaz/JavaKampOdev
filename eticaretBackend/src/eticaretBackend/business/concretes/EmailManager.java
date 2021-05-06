package eticaretBackend.business.concretes;

import eticaretBackend.business.abstracts.EmailService;
import eticaretBackend.entities.concretes.User;

public class EmailManager implements EmailService {

	@Override
	public void sendEmail(User user) {
		
		System.out.println(user.getEmail()+" hesap doðrulamasý sisteme giriþ yapýldýðýnda otomatik olarak gerçekleþecektir.");
		
	}

	@Override
	public void verifyUser(String email) {
		
		System.out.println(email+" hesabýnýz doðrulanmýþtýr.");
	}

}
