package homework3.dataAccess.jdbc;

import homework3.dataAccess.CourseDao;
import homework3.entities.Course;

public class CourseDaoJdbc implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println(course.getName() + " Kurs Jdbc ile eklendi.");
	}

}
