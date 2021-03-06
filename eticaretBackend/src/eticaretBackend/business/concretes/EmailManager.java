package eticaretBackend.business.concretes;

import eticaretBackend.business.abstracts.EmailService;
import eticaretBackend.entities.concretes.User;

public class EmailManager implements EmailService {

	@Override
	public void sendEmail(User user) {
		
		System.out.println(user.getEmail()+" hesap doğrulaması sisteme giriş yapıldığında otomatik olarak gerçekleşecektir.");
		
	}

	@Override
	public void verifyUser(String email) {
		
		System.out.println(email+" hesabınız doğrulanmıştır.");
	}

}
