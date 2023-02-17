
<%@page import="java.util.List"%>
<%@page import="com.revature.dao.impl.TripDaoImplementation"%>
<%@page import="com.revature.dao.TripDao"%>
<%@page import="com.revature.model.Trip"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8" />
    <meta content="width=device-width, initial-scale=1.0" name="viewport" />

    <title>BRMS Admin Panel</title>
    <meta content="" name="description" />

    <meta content="" name="keywords" />

    <!-- Favicons -->
    <link href="assets/img/bus.png" rel="icon" />

    <!-- Google Fonts -->
    <link
      href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Nunito:300,300i,400,400i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i"
      rel="stylesheet"
    />

    <!-- Vendor CSS Files -->
    <link href="assets/vendor/aos/aos.css" rel="stylesheet" />
    <link
      href="assets/vendor/bootstrap/css/bootstrap.min.css"
      rel="stylesheet"
    />
    <link
      href="assets/vendor/bootstrap-icons/bootstrap-icons.css"
      rel="stylesheet"
    />
    <link
      href="assets/vendor/glightbox/css/glightbox.min.css"
      rel="stylesheet"
    />
    <link href="assets/vendor/remixicon/remixicon.css" rel="stylesheet" />
    <link href="assets/vendor/swiper/swiper-bundle.min.css" rel="stylesheet" />

    <link href="assets/css/style.css" rel="stylesheet" />

    <link rel="stylesheet" href="assets/css/routetrip.css" />
  </head>

  <body>
    <!-- ======= Header ======= -->
	<jsp:include page="_adminheader.jsp"></jsp:include>   
    <!-- End Header -->
    
    <%
		TripDao tripDao = new TripDaoImplementation();
		List<Trip> list = tripDao.getTrips();
	%>

    <section class="intro">
      <div class="bg-image h-100" style="background-color: #f5f7fa">
        <div class="mask d-flex align-items-center h-100">
          <div class="container">
            <div class="row justify-content-center">
              <div class="col-12">
                <div class="card">
                  <div class="card-body p-0">
                    <div
                      class="table-responsive table-scroll"
                      data-mdb-perfect-scrollbar="true"
                      style="position: relative; height: 700px"
                    >
                      <table class="table table-striped mb-0 text-center">
                        <thead style="background-color: #002d72">
                          <tr>
                            <th scope="col">Bus_Registration_number</th>
                            <th scope="col">Boarding_Time</th>
                            <th scope="col">Arrival_Time</th>
                            <th scope="col">Ticket_Charge</th>
                            <th scope="col">Update</th>
                            <th scope="col">Delete</th>
                          </tr>
                        </thead>
                        <tbody>
                          <%
                          Trip trip = (Trip) request.getAttribute("trip");
                       //   boolean noRoute = Boolean.parseBoolean(request.getAttribute("noRoute").toString());
                     	// for (Route route : list) { 
                     		%>
                     		<tr>
                            <td><%out.println(trip.getBusRegistrationNumber());%></td>
                            <td><%out.println(trip.getBoardingTime()); %></td>
                            <td><%out.println(trip.getArrivalTime()); %></td>
                            <td><%out.println(trip.getTicketCharge()); %></td>
                            <td><a href="#" data-bs-toggle="modal"  data-bs-target="#editTripModal">Edit</a></td>
                            <td><a href="deleteroute?rid=<%out.println(trip.getBusRegistrationNumber());%>">Delete</a></td>
                          </tr>
                     	<% %>
                        </tbody>
                      </table>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>
    
    
       
        <!-- Modal Update Trip-->
<div class="modal fade" id="editTripModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h1 class="modal-title fs-5" id="exampleModalLabel">Update Trip to Database</h1>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <form action="updatetrip">
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
        <button type="submit" class="btn btn-primary">Update Trip</button>
      </div>
    </form>
    </div>
  </div>
</div>
    
    

    

    <!-- Vendor JS Files -->
    <script src="assets/vendor/purecounter/purecounter_vanilla.js"></script>
    <script src="assets/vendor/aos/aos.js"></script>
    <script src="assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
    <script src="assets/vendor/glightbox/js/glightbox.min.js"></script>
    <script src="assets/vendor/isotope-layout/isotope.pkgd.min.js"></script>
    <script src="assets/vendor/swiper/swiper-bundle.min.js"></script>
  

    <!-- Template Main JS File -->
    <script src="assets/js/main.js"></script>
  </body>
</html>
