package GameProject.business.concretes;

import java.util.List;

import GameProject.business.abstracts.PlayerService;
import GameProject.core.mernins.CheckService;
import GameProject.dataAccess.abstracts.ILoggerDao;
import GameProject.entities.abstracts.Entity;
import GameProject.entities.concretes.Player;

public class PlayerManager implements PlayerService {
	
	private List<ILoggerDao>loggerDao;
	private List<CheckService> checkService;
	
	public PlayerManager(List<ILoggerDao>loggerDao,List<CheckService> checkService) {
		this.loggerDao=loggerDao;
		this.checkService=checkService;
	}
	
	@Override
	public void add(Entity entity) {
		// TODO Auto-generated method stub
		try {
			for(CheckService check:checkService) {
				if(check.check((Player)entity)) {
					for(ILoggerDao loggerDao:loggerDao) {
						loggerDao.add(entity);
					}
				}else {
					System.out.println("gecersiz oyuncu : "+entity.getName());
				}
			}
		}catch(Exception exception) {
			System.out.println(exception.getMessage());
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
