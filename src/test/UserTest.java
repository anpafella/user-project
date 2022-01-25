package test;

import java.util.ArrayList;
import java.util.List;

import model.entity.User;
import service.UserService;
import service.UserServiceImpl;

public final class UserTest {

	public static List<User> userBD = new ArrayList<User>();
	
	public static UserService userService = new UserServiceImpl(); //logica de negocio
	
	
	public static void main(String[] args) {
		
		userBD.add( new User(1, 19, "patrick", "rnandez") );
		userBD.add( new User(66, 23, "juan", "gomez") );
		
		print();
		
		System.out.println("*********************************************************");
		
		// crear un user nuevo
		
		User userToSave = new User(500, 28, "Arly", "Fernandez");
		User userSaved = userService.create(userToSave);
		System.out.println( "saved user :" + userSaved.toString());
		
		
		System.out.println("*********************************************************");
		
		//update user
		User userToUpdate = new User(null, 22, "patrick", "fernandez");
		User userUpdated = userService.update(userToUpdate, 1);
		System.out.println( "updated user :" + userUpdated.toString());
		
		System.out.println("*********************************************************");
		
		//get all
		
		List<User> userList = userService.getAll();
		for(User userToPrint : userList) {
			System.out.println("getAll:"+ userToPrint.toString() );
		}
		
		System.out.println("*********************************************************");
		
		//delete
		
		userService.delete(500);
		print();
		
	}

	
	private static void print() {
		for(User userToPrint : userBD) {
			System.out.println( userToPrint);
		}
		
	}
	
	
}
