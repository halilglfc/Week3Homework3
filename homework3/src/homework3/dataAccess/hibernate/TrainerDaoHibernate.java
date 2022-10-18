package homework3.dataAccess.hibernate;

import homework3.dataAccess.TrainerDao;
import homework3.entities.Trainers;

public class TrainerDaoHibernate implements TrainerDao{

	@Override
	public void add(Trainers trainers) {
		System.out.println(trainers.getName() + " Eğitmen hibernate ile eklendi.");
	}
	

}
