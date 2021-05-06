package gun5Odev1.business.concretes;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import gun5Odev1.business.abstracts.UserService;
import gun5Odev1.core.authService.AuthService;
import gun5Odev1.dataAccess.abstracts.UserDao;
import gun5Odev1.entities.concretes.User;

public class UserManager implements UserService{
	private  UserDao userDao;
    private  AuthService authService;

    public UserManager (AuthService authService){this.authService = authService;}
    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }
	@Override
	public void register(User user) {
		if(user.getPassword().length() < 6) {
			System.out.println("Þifreniz en az 6 karakter uzunluðunda olmalýdýr.");
			return;
		}
		String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(user.getEmail());
		if(!matcher.matches()) {
			System.out.println("Mail adresiniz e-posta formatýnda olmalýdýr. (mymail@mail.com)");
			return;
		}
		if (userDao.getByMail(user.getEmail()) != null){
	        System.out.println("Bu kullanýcý zaten mevcut");
	        return;
	    }
		if(user.getName().length() <2 || user.getSurname().length() <2) {
			System.out.println("Ýsim ve soyisim 2 karakterden az olmamalýdýr!");
			return;
			
		}
		Scanner scanner = new Scanner(System.in);
		System.out.println("Gönderilen e postayý doðrulamak için 2'ye ve ardýndan Enter'a basýn : ");
		int selection = scanner.nextInt();
		if(selection !=2) {
			System.out.println("Hata : 2 ye bassana kardeþim");
			return;
		}
		userDao.register(user);
		
		
	}

	@Override
	public void login(User user) {
		if (user.getEmail() == null || user.getPassword() == null) {
			System.out.println("Lütfen Email ve þifre alanlarýný boþ býrakmayýnýz");
			return;
		}
		if(userDao != null) {
			userDao.login(user);
		}
		if(authService != null) {
		    authService.login(user);
		}
		
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
		
	}

	@Override
	public User getByMail(String mail) {
		
		return userDao.getByMail(mail);
	}

}
