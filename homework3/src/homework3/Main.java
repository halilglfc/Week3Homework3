package homework3;

import homework3.business.CategoryManager;
import homework3.business.CourseManager;
import homework3.business.TrainersManager;
import homework3.core.logging.DatabaseLogger;
import homework3.core.logging.FileLogger;
import homework3.core.logging.Logger;
import homework3.core.logging.MailLogger;
import homework3.dataAccess.hibernate.CategoryDaoHibernate;
import homework3.dataAccess.hibernate.CourseDaoHibernate;
import homework3.dataAccess.jdbc.TrainerDaoJdbc;
import homework3.entities.Category;
import homework3.entities.Course;
import homework3.entities.Trainers;

public class Main {

	public static void main(String[] args) throws Exception {
		Category category = new Category(1,"Programlama");
		Trainers trainers = new Trainers(1, "Engin Demirog");
		Course course = new Course(1, "Java Egitimi",350);
		
		Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
		
		CategoryManager categoryManager = new CategoryManager(new CategoryDaoHibernate(),loggers);
		categoryManager.add(category);
		
		TrainersManager trainersManager = new TrainersManager(new TrainerDaoJdbc(),loggers);
		trainersManager.add(trainers);
		
		CourseManager courseManager = new CourseManager(new CourseDaoHibernate(), loggers);
		courseManager.add(course);
	}

}