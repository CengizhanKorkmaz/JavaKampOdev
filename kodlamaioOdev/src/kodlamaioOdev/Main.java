package kodlamaioOdev;

public class Main {

	public static void main(String[] args) {
		
		Student student=new Student();
		student.setId(1);
		student.setFirstName("Murat");
		student.setLastName("Korkmaz");
		student.setEmail("cengizhann55@gmail.com");
		student.setPassword("123456");
		student.setAvatar("default.png");
		
		StudentManager studentManager=new StudentManager();
		studentManager.add(student);
		
		Instructor instructor=new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Cengizhan");
		instructor.setLastName("Korkmaz");
		instructor.setEmail("cengizhann55@gmail.com");
		instructor.setPassword("123456");
		instructor.setAvatar("default.png");
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.add(instructor);
		

	}

}
