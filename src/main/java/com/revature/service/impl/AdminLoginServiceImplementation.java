package com.revature.service.impl;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import org.apache.log4j.Logger;

import com.revature.dao.impl.UserDaoImplementation;
import com.revature.menu.Menu;
import com.revature.model.User;
import com.revature.service.AdminLoginService;

public class AdminLoginServiceImplementation implements AdminLoginService{

	static Logger logger = Logger.getLogger(Menu.class.getName());
	Scanner scanner = new Scanner(System.in);
	@Override
	public boolean authenticateAdmin(String username,String password) throws SQLException {
		
		
		UserDaoImplementation userDaoImplementation = new UserDaoImplementation();
		List<User> list = userDaoImplementation.getUsers();
		for (User user : list) {
			if (username.equalsIgnoreCase(user.getLoginId()) && password.equals(user.getPassword())
					&& user.getRole().equalsIgnoreCase("admin")) {
//				firstName = user.getFirstname();
				return true;
			}
		}

		return false;
	}

}
