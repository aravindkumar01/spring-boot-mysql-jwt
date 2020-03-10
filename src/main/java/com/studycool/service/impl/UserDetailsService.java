package com.studycool.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studycool.Repo.UserDetailsRepo;
import com.studycool.model.User;
import com.studycool.model.UserDetails;
import com.studycool.service.UserService;


@Service
public class UserDetailsService {
	@Autowired
	UserDetailsRepo repo;
	
	@Autowired
	UserServiceImpl userService;
	
	public User newUser(UserDetails user)
	{
		try {
			
			if(userService.findByEmail(user.getUsername())!=null)
			{
							
				//return  "Email already registerd";
			}
			
			repo.save(user);			
			//insert username,password in users table
				User u=new User();
				String pass=String.valueOf(user.getMobile()).substring(6);	
					u.setUsername(user.getUsername());
					u.setPassword(user.getLast_name()+pass);
			User res=	userService.save(u,user.getRole());
			
			System.out.println(res);
				//end
			return res;
		} catch (Exception e) {
			
			return null;
		}
	}
	
	
	
	
	public String deleteUser(String username)
	
	{
		
		
		try {
			
			repo.deleteByEmail(username);
			userService.deleteByUser(username);
			return "deleted";
		} catch (Exception e) {
			return e.toString();
			// TODO: handle exception
		}
	}




	public List<UserDetails> getAllUsers() {
		
		
		try {
			
			return repo.findAll();
		} catch (Exception e) {
			System.out.println("user_details find all:"+e);
			// TODO: handle exception
		}
		return null;
	}
}
