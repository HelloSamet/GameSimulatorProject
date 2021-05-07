package GameProject.business.abstracts;

import GameProject.entities.abstracts.Entity;

public interface CampaignService {
	void add(Entity entity);
	void update(Entity entity);
	void delete(Entity entity);
}
