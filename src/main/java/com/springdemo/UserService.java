package com.springdemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	UserRepository repo;

	public List<User> getUsers()
	{
		return repo.getUsers();
	}

	public User getUserById(int id)
	{
		return repo.getUserById(id);
	}
	
	public void deleteUserById(User user)
	{
		repo.deleteUserById(user);
	}

	public User save(User user){
		
		return repo.save(user);
	}

}
