package GameProject.dataAccess.concretes;

import GameProject.dataAccess.abstracts.ILoggerDao;
import GameProject.entities.abstracts.Entity;

public class SmsLoggerDao implements ILoggerDao {

	@Override
	public void add(Entity entity) {
		// TODO Auto-generated method stub
		System.out.println("Sms to add : "+entity.getName());
	}

	@Override
	public void update(Entity entity) {
		// TODO Auto-generated method stub
		System.out.println("Sms to update : "+entity.getName());
	}

	@Override
	public void delete(Entity entity) {
		// TODO Auto-generated method stub
		System.out.println("Sms to delete : "+entity.getName());
	}

}
