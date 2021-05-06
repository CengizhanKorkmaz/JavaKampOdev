package eticaretBackend.business.concretes;


import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eticaretBackend.business.abstracts.EmailService;
import eticaretBackend.business.abstracts.UserService;
import eticaretBackend.dataAccess.abstracts.UserDao;
import eticaretBackend.entities.concretes.User;

public class UserManager implements UserService{
	
	private UserDao userDao;
	private EmailService emailService;
	public UserManager(UserDao userDao,EmailService emailService)
	{
		this.userDao=userDao;
		this.emailService=emailService;
	}
	@Override
	public void register(User user) {
		if(CheckUser(user)&& CheckEmail(user))
		{	
			userDao.register(user);
			emailService.sendEmail(user);
		}
	}
	
	@Override
	public void login(String email, String password) {
		if(userDao.login(email, password))
		{
			emailService.verifyUser(email);
		}
		
		
		
	}
	

	@Override
	public void delete(User user) {
		userDao.delete(user);
		
	}

	@Override
	public void update(User user) {
		userDao.update(user);
	}

	@Override
	public List<User> getall() {		
		return userDao.getall();
	}

	@Override
	public User get(int id) {
		return userDao.get(id);

	}
	private boolean CheckUser(User user)
	{
		String regex = "^(.+)@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher;
		
		
		matcher=pattern.matcher(user.getEmail());
		
		if(user.getFirstName().length()<2 || user.getLastName().length()<2)
		{
			System.out.println("Ýsim ve soyisim 2 karakterden fazla olmalýdýr.");
			return false;
		}
		if(user.getPassword().length()<6)
		{
			System.out.println("Þifreniz 6 karakterden büyük olmalýdýr.");
			return false;
		}
		if(user.getEmail().length()<5 || matcher.matches()==false)
		{
			
			System.out.println("Email adresiniz 5 karakteden büyük ve '@' iþareti içermelidir.");
			return false;
		}
		return true;
	}
	
	private boolean CheckEmail(User user)
	{
		for(User checkUser:userDao.getall())
		{
			if(user.getEmail()==checkUser.getEmail())
			{
				System.out.println("Email sistemde kayýtlýdýr.");
				return false;
			}
			
		}
		return true;
	}

	

}
