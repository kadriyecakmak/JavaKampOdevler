package gun4Odev3;

public class Campaign {
	private int id;
	private String campaignName;
	private double campaignAmount;
	
	
	public Campaign(int id, String campaignName, double campaignAmount) {
		
		this.id = id;
		this.campaignName = campaignName;
		this.campaignAmount = campaignAmount;
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


	public double getCampaignAmount() {
		return campaignAmount;
	}


	public void setCampaignAmount(double campaignAmount) {
		this.campaignAmount = campaignAmount;
	}
	
	

}
