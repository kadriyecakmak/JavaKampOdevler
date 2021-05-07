package gun4Odev3;

public class Main {

	public static void main(String[] args) {
	
		Gamer gamer = new Gamer(1,"44444444444","Kadriye","Çakmak",1998);
		Game game = new Game(1,0," ninja kaplumbaðalar",150);
		Campaign campaign = new Campaign(1,"yüzde 8 indirim",8);
		
		GamerManager gamerManger = new GamerManager();
		GameManager gameManager = new GameManager();
		CampaignManager campaignManager = new CampaignManager();
		SellManager sellManager = new SellManager();
		
		gamerManger.register(gamer);
	    System.out.println("----------");
	    gameManager.add(game);
	    System.out.println("----------");
	    campaignManager.add(campaign);
	    System.out.println("----------");
	    sellManager.sell(gamer,game);
	    System.out.println("----------");
	    
	    gamer.setFirstName("Kadriye");
        gamerManger.update(gamer);
        System.out.println("----------");
        campaign.setCampaignAmount(10);
        campaignManager.update(campaign);
        System.out.println("----------");
        game.setCampaignAmount(campaign.getCampaignAmount());
        gameManager.update(game);
        System.out.println("----------");
        sellManager.sell(gamer,game);
        System.out.println("----------");
        gameManager.delete(game);
        System.out.println("----------");
        gamerManger.delete(gamer);
        System.out.println("----------");
        campaignManager.delete(campaign);
		
		

	}

}
