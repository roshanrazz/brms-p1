package com.revature.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import com.revature.dao.impl.RouteDaoImplementation;
import com.revature.model.Route;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/addroute")
public class AddRouteController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: Roshan").append(request.getContextPath());
		
		String routeId = request.getParameter("routeId");
		String busRid = request.getParameter("busRid");
		String source = request.getParameter("source");
		String destination = request.getParameter("destination");
		
//		PrintWriter out = response.getWriter();
//		out.print(routeId);
		
		Route route = new Route();
		
		route.setRouteId(routeId);
		route.setBusRegistrationNumber(busRid);
		route.setSource(source);
		route.setDestination(destination);

		RouteDaoImplementation routeDaoImplementation = new RouteDaoImplementation();
		try {
			routeDaoImplementation.addRoute(route);
			response.sendRedirect("allroutes");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		super.service(req, resp);
	}

}
