package gun5Odev1.core.googleAuthManagerAdapter;

import gun5Odev1.core.authService.AuthService;
import gun5Odev1.entities.concretes.User;
import gun5Odev1.googleAuth.googleAuthManager.GoogleAuthManager;

public class GoogleAuthManagerAdapter implements AuthService {
	private final GoogleAuthManager googleAuthManager;

	public GoogleAuthManagerAdapter(GoogleAuthManager googleAuthManager) {
		this.googleAuthManager = googleAuthManager;
	}

	@Override
	public void register(User user) {
		googleAuthManager.register(user);
		
	}

	@Override
	public void login(User user) {
		googleAuthManager.login(user);
		
	}

}
