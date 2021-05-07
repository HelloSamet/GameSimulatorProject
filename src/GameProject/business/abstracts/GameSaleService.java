package GameProject.business.abstracts;

import GameProject.entities.abstracts.Entity;

public interface GameSaleService {
	void sale(Entity entity);
	
	void sale(Entity entity,Entity campaign);
}
