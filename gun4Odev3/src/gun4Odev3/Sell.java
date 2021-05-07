package gun4Odev3;

public class Sell {
	
	private int id;
	//private int gamerId;
	private String gamerName;
	//private int gameId;
	private String gameName;
	
	public Sell(int id, String gamerName, String gameName) {
		super();
		this.id = id;
		this.gamerName = gamerName;
		this.gameName = gameName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGamerName() {
		return gamerName;
	}

	public void setGamerName(String gamerName) {
		this.gamerName = gamerName;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	
	
	

}
