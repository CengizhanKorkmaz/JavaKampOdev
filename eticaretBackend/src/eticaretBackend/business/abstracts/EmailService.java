package eticaretBackend.business.abstracts;

import eticaretBackend.entities.concretes.User;

public interface EmailService {
	
	void sendEmail(User user);
	
	void verifyUser(String email);
}
