package javaReactDay5Hw1_eCommerceSystem.adapters;

import javaReactDay5Hw1_eCommerceSystem.business.abstracts.RegisterService;
import javaReactDay5Hw1_eCommerceSystem.business.abstracts.UserService;
import javaReactDay5Hw1_eCommerceSystem.entities.concretes.User;
import javaReactDay5Hw1_eCommerceSystem.googleRegisterService.GoogleRegisterManager;

public class GoogleRegisterAdapter implements RegisterService {
	private UserService userManager;
	public GoogleRegisterAdapter(UserService userManager) {
		super();
		this.userManager = userManager;
	}
	@Override
	public void register(User user) {
		GoogleRegisterManager googleRegisterManager = new GoogleRegisterManager();
		
		googleRegisterManager.register(user.geteMail(), user.getPassword());
		userManager.add(user);
		System.out.println("Kayit islemi basarili!");
	}

}
