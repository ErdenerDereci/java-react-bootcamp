package javaReactDay3_kodlamaIo;

public class UserManager {

	public void add(User user) {
		System.out.println(user.getFirstName()+" adli kullanici eklendi.");
	}
	
	public void update(User user) {
		System.out.println(user.getUserId()+" numarali kullanici guncellendi");
	}
	
	public void delete(User user) {
		System.out.println(user.getUserId()+" numarali kullanici silindi.");
	}
	public void getAll() {
		System.out.println("Kullanicilar listelendi.");
	}
}
