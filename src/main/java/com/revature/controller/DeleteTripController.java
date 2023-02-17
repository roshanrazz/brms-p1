package com.revature.controller;

import java.io.IOException;
import java.sql.SQLException;

import com.revature.dao.impl.TripDaoImplementation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/deletetrip")
public class DeleteTripController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String busRid = request.getParameter("busrid");
		
		TripDaoImplementation tripDaoImplementation = new TripDaoImplementation();
//		PrintWriter out = response.getWriter();
		
		try {
			tripDaoImplementation.deleteTrip(busRid);

			response.sendRedirect("alltrips");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		super.service(req, resp);
	}

}
