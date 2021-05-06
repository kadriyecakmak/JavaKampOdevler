package gun5Odev1.core.authService;

import gun5Odev1.entities.concretes.User;

public interface AuthService {
	void register(User user);
	void login(User user);

}
