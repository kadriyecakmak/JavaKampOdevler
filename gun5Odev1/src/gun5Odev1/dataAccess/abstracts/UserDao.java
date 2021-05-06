package gun5Odev1.dataAccess.abstracts;

import gun5Odev1.entities.concretes.User;

public interface UserDao {
	void register(User user);
	void login(User user);
	void delete(User user);
	User getByMail(String mail);
}
