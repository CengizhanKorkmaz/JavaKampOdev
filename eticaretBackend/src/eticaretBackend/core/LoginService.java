package eticaretBackend.core;

public interface LoginService {
	 void register(int id, String email,String password,String firstName,String lastName);
     void login(String email, String password);
}
