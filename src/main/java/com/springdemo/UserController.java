package com.springdemo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@Autowired
	UserService service;

	@GetMapping("/users")
	public List<User> getUsers() {
		return service.getUsers();
	}
	
	@GetMapping("/users/{id}")
	public User getUserById(@PathVariable int id)
	{
		User user = service.getUserById(id);
		
		if(user==null)
		{
			throw new UserNotFondException("User not found " + id);
		}
		return user;
	}

	@DeleteMapping("/users/{id}")
	public void deleteUserById(@PathVariable int id){
		
		// find user
		User user = service.getUserById(id);

		if(user==null)
		{
			throw new UserNotFondException("User not found " + id);
		}
		
		service.deleteUserById(user);
	}
	
	@PostMapping("/users")
	public User save(@RequestBody User user){
		System.out.println("user ::"+user.toString());
		// Map<String, User> retMap = new HashMap<String, User>();
		
		User savedUser = service.save(user);
		
		return savedUser;
	}
}
