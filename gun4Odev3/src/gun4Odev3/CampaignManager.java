package gun4Odev3;

public class CampaignManager {
	public void add(Campaign campaign) {
		System.out.println("Yeni Kampanya sisteme eklendi :" + campaign.getCampaignName());
	}
	public void delete(Campaign campaign) {
		System.out.println("Kampanya sistemden silindi : " + campaign.getCampaignName());
	}
	public void update(Campaign campaign) {
		System.out.println("Kampanya Güncellendi :" +campaign.getCampaignName());
		System.out.println("Kampanyanýn yeni bilgileri :");
		System.out.println("Kampanyanýn Adý : "+ campaign.getCampaignName());
		System.out.println("Kampanya Miktarý : "+campaign.getCampaignAmount());
	}

}
