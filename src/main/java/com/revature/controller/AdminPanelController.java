package com.revature.controller;

import java.io.IOException;
import java.sql.SQLException;

import com.revature.dao.UserDao;
import com.revature.dao.impl.UserDaoImplementation;
import com.revature.model.User;
import com.revature.service.AdminLoginService;
import com.revature.service.impl.AdminLoginServiceImplementation;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class AdminLoginController
 */
public class AdminPanelController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminPanelController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		AdminLoginService adminLogin = new AdminLoginServiceImplementation();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
//		final String firstName;
		boolean validUser;
		try {
			validUser = adminLogin.authenticateAdmin(username,password);
			
			if (validUser) {
				UserDao userDao = new UserDaoImplementation();
				User user = userDao.getUser(username);
				String firstName = user.getFirstname();
				request.setAttribute("firstName", firstName);
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("dashboard.jsp");
				requestDispatcher.forward(request, response);
			}
			else {
				request.setAttribute("inValidUser", true);
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("adminlogin.jsp");
				requestDispatcher.forward(request, response);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
