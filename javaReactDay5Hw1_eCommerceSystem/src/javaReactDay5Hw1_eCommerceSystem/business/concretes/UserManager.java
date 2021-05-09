package javaReactDay5Hw1_eCommerceSystem.business.concretes;

import java.util.List;

import javaReactDay5Hw1_eCommerceSystem.business.abstracts.UserService;
import javaReactDay5Hw1_eCommerceSystem.dataAccess.abstracts.UserDao;
import javaReactDay5Hw1_eCommerceSystem.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	
	public UserManager(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		userDao.add(user);
		
	}
	public List<User> getAll(){
		return userDao.getAll();
	}

	@Override
	public User getByEMailAndPass(String eMail, String password) {
		return userDao.getByEMailAndPass(eMail, password);
	}

}
