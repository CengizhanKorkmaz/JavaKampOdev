package eticaretBackend.core;

import googleWithLogin.GoogleLoginManager;

public class LoginManagerAdapter implements LoginService {

    GoogleLoginManager googleLoginManager=new GoogleLoginManager();

	@Override
	public void register(int id, String email, String password, String firstName, String lastName) {
		googleLoginManager.register(email, password);
		
	}

	@Override
	public void login(String email, String password) {
		googleLoginManager.login(email, password);
		
	}
	

}
