package homework3.business;

import homework3.core.logging.Logger;
import homework3.dataAccess.CourseDao;
import homework3.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;

	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	
	public void add(Course course) throws Exception{
		if(course.getPrice()<0) {
			throw new Exception("Kurs fiyatı 0'dan küçük olamaz.");
		}
	    courseDao.add(course);
	    
	    for (Logger logger : loggers) {
			logger.log(course.getName());
		}
	}
	
}
