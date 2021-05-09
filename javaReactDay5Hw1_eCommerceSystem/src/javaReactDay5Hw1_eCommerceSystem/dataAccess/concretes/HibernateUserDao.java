package javaReactDay5Hw1_eCommerceSystem.dataAccess.concretes;


import java.util.List;

import javaReactDay5Hw1_eCommerceSystem.dataAccess.abstracts.UserDao;
import javaReactDay5Hw1_eCommerceSystem.entities.concretes.Database;
import javaReactDay5Hw1_eCommerceSystem.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	
	@Override
	public void add(User user) {
		Database.database.add(user);
		System.out.println("Added successfully: "+ user.getFirstName());
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> getAll() {

		return Database.database;
		
	}

	@Override
	public User getByEMailAndPass(String eMail, String password) {
		for (User user : Database.database) { 
			if(user.geteMail().equals(eMail) && user.getPassword().equals(password)) {
				return user;
			}
		}
		
		return null;
	}

}
