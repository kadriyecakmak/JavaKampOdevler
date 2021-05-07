package gun4Odev3;

public class SellManager {
	public void sell(Gamer gamer, Game game) {
		Sell sell = new Sell(1,gamer.getFirstName()+""+gamer.getLastName().toUpperCase(),game.getName());
		System.out.println(game.getName()+ "Ýsimli oyun "+ gamer.getFirstName() + " "+ gamer.getLastName().toUpperCase()+" tarafýndan "+ "%" + game.getCampaignAmount()+" indirimle"+game.getPriceBeforeCampaign()
		+" Tl karþýlýðýnda sarýn alýndý. ");
		
		System.out.println("Satýþ bilgileri");
		System.out.println("*****************");
		System.out.println("Satýþ Id : "+ sell.getId());
		System.out.println("Satýlan oyun :" + sell.getGameName());
		System.out.println("Satýn Alan : "+ sell.getGamerName());
	}

}
