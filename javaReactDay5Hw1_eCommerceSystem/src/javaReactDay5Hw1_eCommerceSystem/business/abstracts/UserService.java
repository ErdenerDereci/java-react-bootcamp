package javaReactDay5Hw1_eCommerceSystem.business.abstracts;

import java.util.List;

import javaReactDay5Hw1_eCommerceSystem.entities.concretes.User;

public interface UserService {
	void add(User user);
	List<User> getAll();
	User getByEMailAndPass(String eMail, String password);
}
