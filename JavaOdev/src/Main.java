
public class Main {

	public static void main(String[] args) {
		Course course1=new Course(1,"Java Yaz�l�m Geli�tirici","Engin Demiro�","default.png");
		Category category1=new Category(1,"Programlama");
		Category category2=new Category(2,"Yaz�l�m");

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
