package com.revature.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.revature.dao.impl.TripDaoImplementation;
import com.revature.model.Trip;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



@WebServlet("/showtrip")
public class showTripController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String busRid = request.getParameter("busRid");
//		PrintWriter out = response.getWriter();
		
		TripDaoImplementation tripDaoImplementation = new TripDaoImplementation();
		List<Trip> list;
		boolean flag = false;
		try {
			list = tripDaoImplementation.getTrips();
			
			for (Trip allTrip : list) {
				if (allTrip.getBusRegistrationNumber().equalsIgnoreCase(busRid)) {
					Trip trip = tripDaoImplementation.getTrip(busRid);
					
					
//					out.println(route.getRouteId() + "		" + route.getBusRegistrationNumber() + "		" + route.getSource()
//							+ "		" + route.getDestination());
					flag = true;
					request.setAttribute("trip", trip);
//					request.setAttribute("noRoute", flag);
					RequestDispatcher requestDispatcher = request.getRequestDispatcher("showtrip.jsp");
					requestDispatcher.forward(request, response);
				}
			}
			if (!flag) {
//				out.println("INVALID BUS REGISTRATION NUMBER");
				response.sendRedirect("alltrips");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
//		super.service(req, resp);
	}

}
