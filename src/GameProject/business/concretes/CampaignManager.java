package GameProject.business.concretes;

import GameProject.business.abstracts.CampaignService;
import GameProject.dataAccess.abstracts.ILoggerDao;
import GameProject.entities.abstracts.Entity;
import java.util.List;



public class CampaignManager implements CampaignService {

	private List<ILoggerDao> loggerDao;
	public CampaignManager(List<ILoggerDao> loggerDao) {
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
