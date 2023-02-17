<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <header id="header" class="header fixed-top">
      <div
        class="container-fluid container-xl d-flex align-items-center justify-content-between"
      >
        <a href="dashboard.jsp" class="logo d-flex align-items-center">
          <img src="assets/img/bus_home.gif" alt="bus gif icon" />
          <span>BRMS Admin Panel</span>
        </a>

        <nav id="navbar" class="navbar">
          <ul>
            <li class="dropdown">
              <a href="allroutes"
                ><span>Route Management</span> <i class="bi bi-chevron-down"></i
              ></a>
              <ul>
                <li><a href="#" data-bs-toggle="modal"  data-bs-target="#addRouteModal">Add Route</a></li>
                <form class="d-flex" role="search" action="showroute">
                  <input class="form-control me-2" type="search" name="routeId" placeholder="Route Id" aria-label="Search">
                  <button class="btn btn-outline-success sm" type="submit">Search</button>
                </form>
              </ul>
            </li> 

            <li class="dropdown">
              <a href="alltrips"
                ><span>Trip Management</span> <i class="bi bi-chevron-down"></i
              ></a>
              <ul>
                <li><a href="#" data-bs-toggle="modal"  data-bs-target="#addTripModal">Add Trip</a></li>
                <form class="d-flex" role="search" action="showtrip">
                  <input class="form-control me-2" type="search" name="busRid" placeholder="Bus Id" aria-label="Search">
                  <button class="btn btn-outline-success sm" type="submit">Search</button>
                </form>
              </ul>
            </li>
             <li class="dropdown">
              <a href="#"
                ><span><%!
        		String firstName;
            	String copyName;
            %>
            
            <% 	
        	try{
        		firstName = request.getAttribute("firstName").toString();
        		copyName =firstName;
        		out.println("Welcome "+firstName);
        	}
        	catch(Exception e){
        		
        		if (copyName!=null){
        			out.println("Welcome "+copyName);
        		}
        		else{
        			out.println("Welcome Roshan");
        		}
        	}
            %></span> <i class="bi bi-chevron-down"></i
              ></a>
              <ul>
                <li><a href="adminlogin.jsp">Log out</a></li>
              </ul>
            </li>
          </ul>
          <i class="bi bi-list mobile-nav-toggle"></i>
        </nav>
        <!-- .navbar -->
      </div>
    </header>
    
    <!-- Modal Add Route-->
<div class="modal fade" id="addRouteModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h1 class="modal-title fs-5" id="exampleModalLabel">Add new Route to Database</h1>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <form action="addroute">
      <div class="modal-body">
  
        <div class="mb-3">
          <label for="exampleFormControlInput1" class="form-label">Route Id</label>
          <input type="text" class="form-control" name="routeId" id="exampleFormControlInput1" placeholder="Route Id">
        </div>
        <div class="mb-3">
          <label for="exampleFormControlInput1" class="form-label">Bus Registration Number</label>
          <input type="text" class="form-control" name="busRid" id="exampleFormControlInput1" placeholder="Bus Registration Number">
        </div>
        <div class="mb-3">
          <label for="exampleFormControlInput1" class="form-label">Source</label>
          <input type="text" class="form-control" name="source" id="exampleFormControlInput1" placeholder="Source">
        </div>
        <div class="mb-3">
          <label for="exampleFormControlInput1" class="form-label">Destination</label>
          <input type="text" class="form-control" name="destination" id="exampleFormControlInput1" placeholder="Destination">
        </div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
        <button type="submit" class="btn btn-primary">Add Route</button>
      </div>
    </form>
    </div>
  </div>
</div>






        <!-- Modal Add Trip-->
<div class="modal fade" id="addTripModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h1 class="modal-title fs-5" id="exampleModalLabel">Add Trip to Database</h1>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <form action="addtrip">
      <div class="modal-body">
  
        <div class="mb-3">
          <label for="exampleFormControlInput1" class="form-label">Bus Registration Number</label>
          <input type="text" class="form-control disabled" name="busRid" id="exampleFormControlInput1" placeholder="Bus Registration Number">
        </div>
        <div class="mb-3">
          <label for="exampleFormControlInput1" class="form-label">Boarding Time</label>
          <input type="text" class="form-control" name="btime" id="exampleFormControlInput1" placeholder="Boarding Time">
        </div>
        <div class="mb-3">
          <label for="exampleFormControlInput1" class="form-label">Arrival Time</label>
          <input type="text" class="form-control" name="atime" id="exampleFormControlInput1" placeholder="Arrival Time">
        </div>
        <div class="mb-3">
          <label for="exampleFormControlInput1" class="form-label">Ticket Charge</label>
          <input type="text" class="form-control" name="ticketCharge" id="exampleFormControlInput1" placeholder="Ticket Charge">
        </div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
        <button type="submit" class="btn btn-primary">Add Trip</button>
      </div>
    </form>
    </div>
  </div>
</div>