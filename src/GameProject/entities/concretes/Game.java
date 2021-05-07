package GameProject.entities.concretes;

import GameProject.entities.abstracts.Entity;

public class Game extends Entity {
	private int gameId;
	private int categoryId;
	private String gameType;
	private String gameName;
	private int stockAmount;
	private double unitPrice;
	
	public Game() {
		
	}

	public Game(int gameId, int categoryId, String gameType, String gameName, int stockAmount, double unitPrice) {
		super();
		this.gameId = gameId;
		this.categoryId = categoryId;
		this.gameType = gameType;
		this.gameName = gameName;
		this.stockAmount = stockAmount;
		this.unitPrice = unitPrice;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getGameType() {
		return gameType;
	}

	public void setGameType(String gameType) {
		this.gameType = gameType;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
}
