package gun5Odev1.business.abstracts;

import gun5Odev1.entities.concretes.User;

public interface UserService {
	void register(User user);
	void login(User user);
	void delete(User user);
	User getByMail(String mail);
	

}
