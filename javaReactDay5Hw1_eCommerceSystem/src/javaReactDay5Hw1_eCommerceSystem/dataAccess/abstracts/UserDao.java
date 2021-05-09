package javaReactDay5Hw1_eCommerceSystem.dataAccess.abstracts;

import java.util.List;

import javaReactDay5Hw1_eCommerceSystem.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void update(User user);
	void delete(User user);
	List<User> getAll();
	User getByEMailAndPass(String eMail, String password);
}
