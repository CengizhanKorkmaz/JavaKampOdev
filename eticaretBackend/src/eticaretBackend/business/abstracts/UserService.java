package eticaretBackend.business.abstracts;

import java.util.List;

import eticaretBackend.entities.concretes.User;

public interface UserService {

	void register(User user);
	void login(String email,String password);
	void delete(User user);
	void update(User user);
	List<User> getall();
	User get(int id);
	
}
