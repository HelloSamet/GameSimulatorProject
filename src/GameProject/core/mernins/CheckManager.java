package GameProject.core.mernins;

import GameProject.entities.concretes.Player;

public class CheckManager implements CheckService {

	@Override
	public boolean check(Player player) {
		if((player.getNationalityId().length()==11)&&
				(!(player.getFirstName().isEmpty()))&&(!(player.getLastName().isEmpty()))) {
			System.out.println(player.getFirstName()+" "+player.getLastName()+"Doðrulama Baþarýlý!");
			return true;
		}else {
			System.out.println(player.getFirstName()+" "+player.getLastName()+"Doðrulama Baþarýsýz!");
			return false;
		}
		
	}

}
