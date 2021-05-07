package GameProject;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import GameProject.business.abstracts.CampaignService;
import GameProject.business.abstracts.GameSaleService;
import GameProject.business.abstracts.GameService;
import GameProject.business.abstracts.PlayerService;
import GameProject.business.concretes.CampaignManager;
import GameProject.business.concretes.GameManager;
import GameProject.business.concretes.GameSaleManager;
import GameProject.business.concretes.PlayerManager;
import GameProject.core.mernins.CheckManager;
import GameProject.core.mernins.CheckService;
import GameProject.dataAccess.abstracts.ILoggerDao;
import GameProject.dataAccess.concretes.DatabaseLoggerDao;
import GameProject.dataAccess.concretes.FileLoggerDao;
import GameProject.dataAccess.concretes.SmsLoggerDao;
import GameProject.entities.concretes.Campaign;
import GameProject.entities.concretes.Game;
import GameProject.entities.concretes.Player;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ILoggerDao smsLoggerDao = new SmsLoggerDao();
		ILoggerDao databaseLoggerDao = new DatabaseLoggerDao();
		ILoggerDao fileLoggerDao = new FileLoggerDao();
		
		List<ILoggerDao> loggerDao = new ArrayList<ILoggerDao>();
		loggerDao.add(fileLoggerDao);
		loggerDao.add(databaseLoggerDao);
		loggerDao.add(smsLoggerDao);

		CheckService checkService = new CheckManager();
		List<CheckService> checkServices = new ArrayList<CheckService>();
		checkServices.add(checkService);
		
		Player player1 = new Player();
		player1.setFirstName("Abdulsamet");
		player1.setLastName("Göçmen");
		player1.setId(1);
		player1.setNationalityId("11111111111");

		Player player2 = new Player();
		player2.setId(2);
		player2.setFirstName("Emirhan");
		player2.setLastName("Doðandemir");
		player2.setNationalityId("11111111111");

		
		Player player3 = new Player();
		player3.setId(3);
		player3.setFirstName("ÖmerFaruk");
		player3.setLastName("Duran");
		player3.setNationalityId("11111111111");
		
		PlayerService playerService = new PlayerManager(loggerDao,checkServices);
		
		playerService.add(player1);
		playerService.add(player2);
		playerService.add(player3);
	
		
		Game game1 = new Game();
		game1.setGameId(1);
		game1.setGameType("Macera");
		game1.setName("Apex Legends");
		game1.setUnitPrice(250);
		game1.setStockAmount(13);
		
		
		Game game2 = new Game();
		game2.setGameId(2);
		game2.setGameType("Eðlence");
		game2.setName("Fall guys");
		game2.setUnitPrice(123);
		game2.setStockAmount(10);
		
		List<ILoggerDao> loggerGameDao = new ArrayList<ILoggerDao>();
		loggerGameDao.add(fileLoggerDao);
		GameService gameManager = new GameManager(loggerGameDao);
		
		gameManager.add(game1);
		gameManager.add(game2);
		
		
		Campaign campaign1 = new Campaign();
		campaign1.setId(1);
		campaign1.setDiscountedPrice(25);
		campaign1.setName("Kýþ indirimi");
		
		Campaign campaign2 = new Campaign();
		campaign2.setId(2);
		campaign2.setDiscountedPrice(45);
		campaign2.setName("Yaz indirimi");
		
		List<ILoggerDao> loggerCampaignDao = new ArrayList<ILoggerDao>();
		loggerCampaignDao.add(databaseLoggerDao);
		CampaignService campaignManager = new CampaignManager(loggerCampaignDao);
		campaignManager.add(campaign1);
		campaignManager.add(campaign2);
		
		
		GameSaleService saleManager1 = new GameSaleManager(player1);
		GameSaleService saleManager2 = new GameSaleManager(player2);
		saleManager1.sale(game1);
		saleManager2.sale(game2, campaign2);
	}

}
