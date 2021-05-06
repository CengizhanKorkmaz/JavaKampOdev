package eticaretBackend.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eticaretBackend.dataAccess.abstracts.UserDao;
import eticaretBackend.entities.concretes.User;

public class HibernateUserDao implements UserDao {
	
	List<User> users=new ArrayList<User>();
	
	@Override
	public void register(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" kullanýcý sisteme eklendi.");
		users.add(user);
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" bilgileriniz güncellendi.");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" kullanýcý silindi.");
		
	}

	@Override
	public User get(int id) {
		
		return null;
	}

	@Override
	public List<User> getall() {
		
		return users;
	}

	@Override
	public boolean login(String email,String password) {
		for(User loginUser : users) {
			if(email == loginUser.getEmail() && password == loginUser.getPassword())
			{
				System.out.println(email+" sisteme giriþ yaptý.");
				return true;
			}	
		}
		System.out.println("Bilgileriniz kontrol ederek tekrar giriþ saðlayýnýz.");
		return false;
		
	}

}
