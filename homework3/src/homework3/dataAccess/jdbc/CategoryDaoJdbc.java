package homework3.dataAccess.jdbc;

import homework3.dataAccess.CategoryDao;
import homework3.entities.Category;

public class CategoryDaoJdbc implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println(category.getName() + " Kategori Jdbc ile eklendi.");
	}

}
