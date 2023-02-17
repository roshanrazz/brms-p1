package com.revature.service;

import java.sql.SQLException;

public interface AdminLoginService {
	
	public boolean authenticateAdmin(String email,String password) throws SQLException;
	

}
