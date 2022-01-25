package service;

import java.util.List;

import model.entity.User;

public interface UserService {

	
	User create(User user);
	
	User update(User user, Integer id);
	
	User getById(Integer id);
	
	List<User> getAll();
	
	void delete(Integer id);
	
	
}
