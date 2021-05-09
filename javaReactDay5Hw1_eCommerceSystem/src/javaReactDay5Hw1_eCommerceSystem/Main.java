package javaReactDay5Hw1_eCommerceSystem;

import java.util.Scanner;

import javaReactDay5Hw1_eCommerceSystem.adapters.GoogleRegisterAdapter;
import javaReactDay5Hw1_eCommerceSystem.business.abstracts.LoginService;
import javaReactDay5Hw1_eCommerceSystem.business.abstracts.RegisterService;
import javaReactDay5Hw1_eCommerceSystem.business.abstracts.UserService;
import javaReactDay5Hw1_eCommerceSystem.business.concretes.LoginManager;
import javaReactDay5Hw1_eCommerceSystem.business.concretes.MyRegisterManager;
import javaReactDay5Hw1_eCommerceSystem.business.concretes.UserManager;
import javaReactDay5Hw1_eCommerceSystem.core.concretes.AbcVerifyManager;
import javaReactDay5Hw1_eCommerceSystem.dataAccess.concretes.HibernateUserDao;
import javaReactDay5Hw1_eCommerceSystem.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		
		User user= new User(1,"Erdener","Dereci","erdenerdereci@gmail.com","111111");
		
		
		RegisterService registerManager= new MyRegisterManager(new UserManager(new HibernateUserDao()));
		registerManager.register(user);
		
		 UserManager mana = new UserManager(new HibernateUserDao());
		 for (User m : mana.getAll()) {
			System.out.println(m.getFirstName());
		}
		 Scanner input = new Scanner(System.in);
		 System.out.print("Enter mail: ");
	     String eMail = input.next();
	     System.out.print("Enter password: ");
	     String pass = input.next();
	     
	     LoginService loginManager = new LoginManager(new UserManager(new HibernateUserDao()));
	     loginManager.login(eMail, pass);
	}

}
