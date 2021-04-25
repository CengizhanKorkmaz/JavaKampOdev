import java.util.ArrayList;

public class CategoryManager {
	ArrayList<Category> categories=new ArrayList<Category>();
	public void addToCategory(Category category)
	{
		categories.add(category);
		System.out.println(category.name+" kategori eklendi.");
	}
	public void removeCategory(Category category)
	{
		categories.remove(category);
		System.out.println(category.name+" kategori silindi.");
	}
	public void list()
	{
		for (Category category : categories) {
			System.out.println(category.name);

		}
		System.out.println(categories.size());
	}
}
