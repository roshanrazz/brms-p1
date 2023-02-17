package com.revature.controller;

import java.io.IOException;
import java.sql.SQLException;

import com.revature.dao.impl.TripDaoImplementation;
import com.revature.model.Trip;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/addtrip")
public class AddTripController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String busRid = request.getParameter("busRid");
		String btime = request.getParameter("btime");
		String atime = request.getParameter("atime");
		String ticketCharge = request.getParameter("ticketCharge");
		
//		PrintWriter out = response.getWriter();
//		out.print(routeId);
		
		Trip trip = new Trip();
		
		trip.setBusRegistrationNumber(busRid);
		trip.setBoardingTime(btime);
		trip.setArrivalTime(atime);
		trip.setTicketCharge(Integer.parseInt(ticketCharge));

		TripDaoImplementation tripDaoImplementation = new TripDaoImplementation();
		try {
			tripDaoImplementation.addTrip(trip);
			response.sendRedirect("alltrips");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
//		super.service(req, resp);
	}

}
