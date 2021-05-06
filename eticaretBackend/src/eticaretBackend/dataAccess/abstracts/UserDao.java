package eticaretBackend.dataAccess.abstracts;

import java.util.List;

import eticaretBackend.entities.concretes.User;

public interface UserDao {
	
	void register(User user);
	boolean login(String email,String password);
	void update(User user);
	void delete(User user);
	User get(int id);
	List<User> getall();
}
