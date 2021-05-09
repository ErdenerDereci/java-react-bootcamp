package javaReactDay5Hw1_eCommerceSystem.business.concretes;

import javaReactDay5Hw1_eCommerceSystem.business.abstracts.RegisterService;
import javaReactDay5Hw1_eCommerceSystem.business.abstracts.UserService;
import javaReactDay5Hw1_eCommerceSystem.entities.concretes.User;

public class MyRegisterManager implements RegisterService {
	
	private UserService userManager;
	
	
	public MyRegisterManager(UserService userManager) {
		super();
		this.userManager = userManager;
	}


	@Override
	public void register(User user) {
		if (UserValidations.validateUser(user,userManager.getAll())) {
			userManager.add(user);
		}else {
			System.out.println("Kayit islemi basarisiz!!");
		}
		
	}
 
}
