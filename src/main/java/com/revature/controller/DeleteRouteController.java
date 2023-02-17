package com.revature.controller;

import java.io.IOException;
import java.sql.SQLException;

import com.revature.dao.impl.RouteDaoImplementation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/deleteroute")
public class DeleteRouteController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: Roshan").append(request.getContextPath());
		
		String routeId = request.getParameter("rid");
		
		RouteDaoImplementation routeDaoImplementation = new RouteDaoImplementation();
//		PrintWriter out = response.getWriter();
		
		try {
			routeDaoImplementation.deleteRoute(routeId);
//			RequestDispatcher rd = request.getRequestDispatcher("allroutes");
//			out.println("Deleted Route "+routeId+" from database.");
//			rd.forward(request, response);
			response.sendRedirect("allroutes");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		super.service(req, resp);
	}

}
