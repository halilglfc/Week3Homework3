package homework3.dataAccess.jdbc;

import homework3.dataAccess.TrainerDao;
import homework3.entities.Trainers;

public class TrainerDaoJdbc implements TrainerDao{

	@Override
	public void add(Trainers trainers) {
		System.out.println(trainers.getName() + " Eğitmen Jdbc ile eklendi.");
	}

}
