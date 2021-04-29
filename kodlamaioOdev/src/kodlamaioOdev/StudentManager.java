package kodlamaioOdev;

public class StudentManager extends UserManager {
	
	@Override
	public void add(User user)
	{
		System.out.println(user.getFirstName()+" "+user.lastName+" sisteme kayýt edildi.");
	}
	
}
