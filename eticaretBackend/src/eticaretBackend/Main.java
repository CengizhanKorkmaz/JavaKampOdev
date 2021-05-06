package eticaretBackend;

import eticaretBackend.business.abstracts.UserService;
import eticaretBackend.business.concretes.EmailManager;
import eticaretBackend.business.concretes.UserManager;
import eticaretBackend.core.LoginManagerAdapter;
import eticaretBackend.core.LoginService;
import eticaretBackend.dataAccess.concretes.HibernateUserDao;
import eticaretBackend.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		UserService userService=new UserManager(new HibernateUserDao(),new EmailManager());
		User user=new User();
		user.setId(1);
		user.setFirstName("ali");
		user.setLastName("korkmaz");
		user.setEmail("ali@gmail.com");
		user.setPassword("369568");
		userService.register(user);
		
		User user1=new User();
		user1.setId(2);
		user1.setFirstName("cengizhan");
		user1.setLastName("korkmaz");
		user1.setEmail("cengizhan@gmail.com");
		user1.setPassword("369568");
		userService.register(user1);
		userService.getall();
		
		userService.login("cengizhann@gmail.com","369568");
		
		LoginService loginService=new  LoginManagerAdapter();
		loginService.login("deneme@gmail.com","123456");
	}

}
