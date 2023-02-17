package com.revature.controller;

import java.io.IOException;
import java.sql.SQLException;
import com.revature.dao.impl.RouteDaoImplementation;
import com.revature.model.Route;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/updateroute")
public class UpdateRouteController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String routeId = request.getParameter("routeId");
		String busRid = request.getParameter("busRid");
		String source = request.getParameter("source");
		String destination = request.getParameter("destination");
		
		
		RouteDaoImplementation routeDaoImplementation = new RouteDaoImplementation();
		try {
			Route route = routeDaoImplementation.getRoute(routeId);
			route.setBusRegistrationNumber(busRid);
			route.setSource(source);
			route.setDestination(destination);
			routeDaoImplementation.updateRoute(route, routeId);
//			response.getWriter().println("1 row updated");
			response.sendRedirect("allroutes");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		super.service(req, resp);
	}
}
