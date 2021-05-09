package javaReactDay5Hw1_eCommerceSystem.business.concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javaReactDay5Hw1_eCommerceSystem.entities.concretes.User;

public class UserValidations {
	
	private static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
		    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

	private static boolean checkEMailIsValid(String emailStr) {
		        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
		        return matcher.find();
		}
		
	private static boolean checkPassword(String password) {
		if(password.length()<6) {
			return false;
		}
		return true;
	}
	
	private static boolean checkIfEMailHasBeenUse(String eMail, List<User> database) {
		if (database.contains(eMail)) {
			return false;
		}
		return true;
	}
	
	private static boolean checkFirstAndLastNameCorrect(User user) {
		if(user.getFirstName().length()<2 || user.getLastName().length()<2) {
			return false;
		}
		return true;
	}
	
	static boolean validateUser(User user,List<User> database) {
		if (checkEMailIsValid(user.geteMail())) {
			if(checkFirstAndLastNameCorrect(user)) {
				if (checkIfEMailHasBeenUse(user.geteMail(), database)) {
					if (checkPassword(user.getPassword())) {
						
						System.out.println("Kullanici kayit islemi basarili!");
						return true;
					}else {
						System.out.println("Sifre en az 6 karakterden olusmali!");
						return false;
					}
				}else {
					System.out.println("Bu e-mail daha once kullanilmis!");
					return false;
				}
			}else {
				System.out.println("Ad ve Soyad en az 2 karakter olmali!");
				return false;
			}
		}else {
			System.out.println("Gecersiz e-mail girisi!");
			return false;
		}
	}
	
	
	
}
