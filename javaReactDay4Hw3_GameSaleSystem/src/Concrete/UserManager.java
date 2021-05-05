package Concrete;


import Abstract.UserCheckService;
import Abstract.UserService;
import Entities.User;

public class UserManager implements UserService {
	
	private UserCheckService userCheckService;
	public UserManager(UserCheckService userCheckService) {
		
		this.userCheckService = userCheckService;
	}

	@Override
	public void add(User user) {
		if (userCheckService.checkIfRealPerson(user)) {
			
			System.out.println("Added succesfully: "+user.getFirstName());
		}else {
			System.out.println("Not a valid person!");
		}
		
		
	}

	@Override
	public void update(User user) {

		System.out.println("Updated succesfully: "+user.getFirstName());
		
	}

	@Override
	public void delete(User user) {
		
		System.out.println("Deleted succesfully: "+user.getFirstName());
	}

}
