package kodlamaioOdev;

public class InstructorManager extends UserManager{

	@Override
	public void add(User user)
	{
		System.out.println(user.getFirstName()+" "+user.lastName+" sisteme kayıt edildi.");
		
	}
	
	CourseManager courseManager=new CourseManager();
	
	public void addCourse(Course course) {
		
		course.setId(1);
		course.setInstructor("Cengizhan KORKMAZ");
		course.setName("Java Programlama");
		courseManager.courses.add(course);
		System.out.println("Kurs eklendi.");
	}
	
	public void deleteCourse(Course course) {
		courseManager.courses.remove(course.id);
	}
	

	
	
	
}
