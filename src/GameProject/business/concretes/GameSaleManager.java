package GameProject.business.concretes;

import GameProject.business.abstracts.GameSaleService;
import GameProject.entities.abstracts.Entity;

public class GameSaleManager implements GameSaleService {

	private Entity player;
	
	public GameSaleManager(Entity entity) {
		
		this.player = entity;
	}
	@Override
	public void sale(Entity game) {
		// TODO Auto-generated method stub
		System.out.println(player.getName()+" Kiþisine "+game.getName()+" oyunu satildi bu oyunda indirim mevcut deðildir.");
	}

	@Override
	public void sale(Entity game, Entity campaign) {
		// TODO Auto-generated method stub
		System.out.println(player.getName()+" Kiþisine "+game.getName()+" oyunu satilirken "+campaign.getName()+" indirimi gerçekleþti.");
	}

}
