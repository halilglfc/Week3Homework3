package homework3.dataAccess.hibernate;

import homework3.dataAccess.CategoryDao;
import homework3.entities.Category;

public class CategoryDaoHibernate implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println(category.getName() + " Kategori Hibernate ile eklendi.");
	}

}
