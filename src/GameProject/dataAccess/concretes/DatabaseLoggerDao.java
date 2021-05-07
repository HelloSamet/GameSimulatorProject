package GameProject.dataAccess.concretes;

import GameProject.dataAccess.abstracts.ILoggerDao;
import GameProject.entities.abstracts.Entity;

public class DatabaseLoggerDao implements ILoggerDao{

	@Override
	public void add(Entity entity) {
		// TODO Auto-generated method stub
		System.out.println("Database to add : "+entity.getName());
	}

	@Override
	public void update(Entity entity) {
		// TODO Auto-generated method stub
		System.out.println("Database to update : "+entity.getName());
	}

	@Override
	public void delete(Entity entity) {
		// TODO Auto-generated method stub
		System.out.println("Database to delete : "+entity.getName());
	}

}
