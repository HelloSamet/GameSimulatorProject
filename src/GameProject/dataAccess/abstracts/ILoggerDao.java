package GameProject.dataAccess.abstracts;

import GameProject.entities.abstracts.Entity;

public interface ILoggerDao {
	void add(Entity entity);
	
	void update(Entity entity);
	
	void delete(Entity entity);
}
