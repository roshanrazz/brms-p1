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

@WebServlet("/updatetrip")

public class UpdateTripController extends HttpServlet {

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
		
		
		TripDaoImplementation tripDaoImplementation = new TripDaoImplementation();
		try {
			Trip trip = tripDaoImplementation.getTrip(busRid);
			trip.setBoardingTime(btime);;
			trip.setArrivalTime(atime);;
			trip.setTicketCharge(Integer.parseInt(ticketCharge));;
			tripDaoImplementation.updateTrip(trip, busRid);
//			response.getWriter().println("1 row updated");
			response.sendRedirect("alltrips");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		super.service(req, resp);
	}

}
