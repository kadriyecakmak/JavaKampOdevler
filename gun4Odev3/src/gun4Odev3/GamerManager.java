package gun4Odev3;

public class GamerManager {
	public void register(Gamer gamer) {
		System.out.println("Kayýt Baþarýlý : "+ gamer.getFirstName()+ " "+gamer.getLastName().toUpperCase());
		
	}
	public void update(Gamer gamer) {
		System.out.println("Bilgiler Güncellendi");
		System.out.println("*********************");
		System.out.println("Kullanýcý Adý soyadý : "+ gamer.getFirstName()+" "+gamer.getLastName().toUpperCase());
		System.out.println("Kullanýcý Doðum yýlý :"+gamer.getBirthYear());
		System.out.println("Kullancý Tc No :"+ gamer.getNationalIdentty());
	}
	public void delete(Gamer gamer) {
		System.out.println("Silme baþarýlý : "+ gamer.getFirstName()+" "+gamer.getLastName().toUpperCase());
	}

}
