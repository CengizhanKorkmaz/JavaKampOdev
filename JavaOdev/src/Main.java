
public class Main {

	public static void main(String[] args) {
		Course course1=new Course(1,"Java Yazýlým Geliþtirici","Engin Demiroð","default.png");
		Category category1=new Category(1,"Programlama");
		Category category2=new Category(2,"Yazýlým");

		CourseManager courseManager=new CourseManager();
		CategoryManager categoryManager=new CategoryManager();
		courseManager.addToCourse(course1);
		courseManager.list();
		categoryManager.addToCategory(category1);
		categoryManager.addToCategory(category2);
		//categoryManager.removeCategory(category1);
		categoryManager.list();
	}

}
