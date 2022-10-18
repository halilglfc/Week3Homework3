package homework3.business;

import java.util.List;

import homework3.core.logging.Logger;
import homework3.dataAccess.CategoryDao;
import homework3.entities.Category;

public class CategoryManager {
	
	private CategoryDao categoryDao;
	private Logger[] loggers;
	
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}
	


	public void add(Category category) throws Exception{
		if(category.getId()<1) {
			throw new Exception("ID 0dan küçük olamaz");
		}
	    categoryDao.add(category);
	    
	    for (Logger logger : loggers) {
			logger.log(category.getName());
		}
	}
}
