package GameProject.business.abstracts;

import GameProject.entities.abstracts.Entity;

public interface GameService {
	void add(Entity entity);
	void update(Entity entity);
	void delete(Entity entity);
}
