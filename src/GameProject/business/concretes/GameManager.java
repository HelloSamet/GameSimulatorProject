package GameProject.business.concretes;

import java.util.List;

import GameProject.business.abstracts.GameService;
import GameProject.dataAccess.abstracts.ILoggerDao;
import GameProject.entities.abstracts.Entity;

public class GameManager implements GameService {

	private List<ILoggerDao> loggerDao;
	
	public GameManager(List<ILoggerDao> loggerDao) {
		super();
		this.loggerDao = loggerDao;
	}

	@Override
	public void add(Entity entity) {
		// TODO Auto-generated method stub
		for(ILoggerDao loggerDao:loggerDao) {
			loggerDao.add(entity);
		}
	}

	@Override
	public void update(Entity entity) {
		// TODO Auto-generated method stub
		for(ILoggerDao loggerDao:loggerDao) {
			loggerDao.update(entity);
		}
	}

	@Override
	public void delete(Entity entity) {
		// TODO Auto-generated method stub
		for(ILoggerDao loggerDao:loggerDao) {
			loggerDao.delete(entity);
		}
	}

}
