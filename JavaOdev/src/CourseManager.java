import java.util.ArrayList;

public class CourseManager {
	ArrayList<Course> courses=new ArrayList<Course>();
	public void addToCourse(Course course)
	{
		courses.add(course);
		System.out.println("Kurs eklendi.");
	}
	public void removeCourse(Course course)
	{
		courses.remove(course);
		System.out.println("Kurs silindi.");
	}
	public void list()
	{
		for (Course course : courses) {
			System.out.println(course.name);
		}
		System.out.println(courses.size());
	}
}
