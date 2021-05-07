package GameProject.entities.concretes;

import GameProject.entities.abstracts.Entity;

public class Campaign extends Entity {
	private int id;
	private String campaignName;
	private double discountedPrice;
	
	public Campaign() {
		// TODO Auto-generated constructor stub
	}

	public Campaign(int id, String campaignName, double discountedPrice) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.discountedPrice = discountedPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public double getDiscountedPrice() {
		return discountedPrice;
	}

	public void setDiscountedPrice(double discountedPrice) {
		this.discountedPrice = discountedPrice;
	}
	
	
}
