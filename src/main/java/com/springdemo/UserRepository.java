package com.springdemo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

	private static List<User> users = new ArrayList<User>();
	
	private static int userCont;
	
	static 
	{
		users.add(new User(1, "Nikunj", new Date()));
		users.add(new User(2, "Veena", new Date()));
		users.add(new User(3, "Poorvi", new Date()));
		
		userCont=users.size();
	}
	
	public List<User> getUsers()
	{
		return users;
	}

	public User getUserById(int id)
	{
		for(User user : users){
			
			if(user.getEmpId()==id){
				
				return user;
			}
		}
		
		return null;
	}
	
	public void deleteUserById(User user)
	{
		users.remove(user);
	}

	public User save(User user){
		
		int id = ++userCont;
		
		//List<User> list =new ArrayList<User>();
		
		//System.out.println(list);
		user.setEmpId(id);

		
		users.add(user);
		
		return user;
	}
}
