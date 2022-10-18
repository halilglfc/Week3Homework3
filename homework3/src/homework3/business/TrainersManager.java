package homework3.business;

import homework3.core.logging.Logger;
import homework3.dataAccess.TrainerDao;
import homework3.entities.Trainers;

public class TrainersManager {
	private TrainerDao trainerDao;
	private Logger[] loggers;

	public TrainersManager(TrainerDao trainerDao, Logger[] loggers) {
		this.trainerDao = trainerDao;
		this.loggers = loggers;
	}
	
	public void add(Trainers trainers) throws Exception {
		if(trainers.getId()<1) {
			throw new Exception("ID 1'den küçük olamaz.");
		}
		trainerDao.add(trainers);
		
		for (Logger logger : loggers) {
			logger.log(trainers.getName());
		}
		
	}
	

}
