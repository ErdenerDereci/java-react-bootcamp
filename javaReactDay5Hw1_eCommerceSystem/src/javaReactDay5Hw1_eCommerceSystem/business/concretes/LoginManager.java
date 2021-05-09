package javaReactDay5Hw1_eCommerceSystem.business.concretes;

import javaReactDay5Hw1_eCommerceSystem.business.abstracts.LoginService;
import javaReactDay5Hw1_eCommerceSystem.business.abstracts.UserService;

public class LoginManager implements LoginService {
	
	private UserService userManager;
	public LoginManager(UserService userManager) {
		super();
		this.userManager = userManager;
	}
	@Override
	public void login(String eMail, String password) {
		if(userManager.getByEMailAndPass(eMail, password)!=null) {
			System.out.println("Giris islemi basarili!");
		}else {
			System.out.println("Giris islemi basarisiz!");
		}
		
		
	}

}
