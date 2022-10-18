package homework3.dataAccess.hibernate;

import homework3.dataAccess.CourseDao;
import homework3.entities.Course;

public class CourseDaoHibernate implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println(course.getName() + " Kurs hibernate ile eklendi");
	}

}
