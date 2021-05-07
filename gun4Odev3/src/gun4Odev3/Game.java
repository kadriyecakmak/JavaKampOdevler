package gun4Odev3;

public class Game {
	
	private int id;
	private double campaignAmount;
	private String name;
	private double price;
	
	public Game(int id, double campaignAmount, String name, double price) {
		
		this.id = id;
		this.campaignAmount = 0;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getCampaignAmount() {
		return campaignAmount;
	}

	public void setCampaignAmount(double campaignAmount) {
		this.campaignAmount = campaignAmount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPriceBeforeCampaign() {
		if(this.campaignAmount==0) {
			return this.price;
		}
		return this.price - this.price/100* campaignAmount;
	}
	
	

}
