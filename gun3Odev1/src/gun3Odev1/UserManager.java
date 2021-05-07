package gun3Odev1;

public class UserManager extends BaseClassManager{

	@Override
	public void add(BaseClass user) {
		System.out.println("Kullanýcý Eklendi :"+user.getFirstName()+" "+user.getLastName().toUpperCase());
		System.out.println("*************************");
	}
	public void Login(User user) {
		System.out.println("Giriþ Yapýldý : "+ user.getEmail());
	}
	public void Logout(User user) {
		System.out.println("Çýkýþ Yapýldý : "+ user.getEmail());
	}
}
