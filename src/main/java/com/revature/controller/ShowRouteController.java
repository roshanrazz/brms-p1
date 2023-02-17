package com.revature.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.revature.dao.impl.RouteDaoImplementation;
import com.revature.model.Route;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/showroute")
public class ShowRouteController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.service(req, resp);
		String routeId = request.getParameter("routeId");
//		PrintWriter out = response.getWriter();
//		out.print(routeId);
		
		RouteDaoImplementation routeDaoImplementation = new RouteDaoImplementation();
		List<Route> list;
		boolean flag = false;
		try {
			list = routeDaoImplementation.getRoutes();
			
			for (Route allRoutes : list) {
				if (allRoutes.getRouteId().equalsIgnoreCase(routeId)) {
					Route route = routeDaoImplementation.getRoute(routeId);
					
					
//					out.println(route.getRouteId() + "		" + route.getBusRegistrationNumber() + "		" + route.getSource()
//							+ "		" + route.getDestination());
					flag = true;
					request.setAttribute("route", route);
//					request.setAttribute("noRoute", flag);
					RequestDispatcher requestDispatcher = request.getRequestDispatcher("showroute.jsp");
					requestDispatcher.forward(request, response);
				}
			}
			if (!flag) {
//				out.println("INVALID_ROUTE_ID");
				response.sendRedirect("allroutes");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
		
	}

}
