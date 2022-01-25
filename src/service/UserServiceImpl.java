package service;

import java.util.List;

import model.entity.User;
import test.UserTest;

public class UserServiceImpl implements UserService{

	UserTest userTest = new UserTest();
	
	
	@Override
	public User create(User user) {
		userTest.userBD.add(user);
		return user;
	}

	@Override
	public User update(User user, Integer id) {
		
		
//		for(int i=0; i<userTest.userBD.size(); i++) { //usar cuando interesa el indice indice
//			
//		}
		
//		for(User userIterator:userTest.userBD) { //usar cuando no me interesa el indice
//			
//		}
		
		User userToReturn = null;
		
		for(User userIterator:userTest.userBD) {
			if (userIterator.getId() == id) {
				userIterator.setApellido(user.getApellido());
				userIterator.setEdad(user.getEdad());
				userIterator.setNombre(user.getNombre());
				
				userToReturn = userIterator;
			}
		}
		
		return userToReturn;
	}

	@Override
	public User getById(Integer id) {
		
		User userToReturn = null;
		
		for(User userIterator:userTest.userBD) {
			if (userIterator.getId() == id) {
				userToReturn = userIterator;
			}
		}
		
		return userToReturn;
	}
	
	

	@Override
	public List<User> getAll() {
		return userTest.userBD;
	}

	@Override
	public void delete(Integer id) {
		
		
		for(int i=0; i<userTest.userBD.size(); i++) { //usar cuando interesa el indice i
			
			User userFound = userTest.userBD.get(i); //obtengo
			if( userFound.getId().equals(id) ) {
				userTest.userBD.remove(i);
			}
			
		}
		
		
	}

}
