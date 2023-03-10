package com.revature.constant;

public class Constant {
	
	public static final String WELCOME_MSG = "########## š¦š®šµš¬šøš¶š® š½šø šš¾š¼ š”š®š¼š®š»šæšŖš½š²šøš· ššŖš·šŖš°š®š¶š®š·š½ š¢šš¼š½š®š¶ #########";
	public static final String ENTER_CHOICE = "\nEnter your choice : ";
	public static final String SUCCESSFUL_LOGIN = "\nššøš°š°š®š­ š²š· š¢š¾š¬š¬š®š¼š¼šÆš¾šµšµ";
	public static final String INVALID_USERNAME_PASSWORD = "Invalid Username or Password or User have no admin rights\nExiting ...";
	public static final String ENTER_USERNAME = "\nEnter Username : ";
	public static final String ENTER_PASSWORD = "Enter Password : ";
	public static final String ADMIN_LOGIN = "\nAdmin Login ";
	public static final String ADMIN_PANEL_WELCOME_MSG = "\n################# š¦š®šµš¬šøš¶š® š½šø šš­š¶š²š· ššŖš·š®šµ ################";
	public static final String CHOICE_ROUTE_TRIP = "\n1. Route Management\n2. Trip Management\n3. Exit";
	public static final String ROUTE_CHOICES = "\n############## š”šøš¾š½š® ššŖš·šŖš°š®š¶š®š·š½ #############\n1. Add Route\n2. Delete Route\n3. Update Route \n4. Get Particular Route \n5. Get All Routes \n6. Exit";
	public static final String TRIP_CHOICES = "\n############## š£š»š²š¹ ššŖš·šŖš°š®š¶š®š·š½ #############\n1. Add Trip\n2. Delete Trip\n3. Update Trip \n4. Get Particular Trip \n5. Get All Trips \n6. Exit";
	public static final String EXITING_MSG = "Exiting ...";
	public static final String INVALID_CHOICE_MSG = "\nInvalid choice";
	public static final String WELCOME = "\nHi, ";
	public static final String WELCOME_LAST_MSG = " you have all admin rights :)";
	public static final String NO_ROUTES_FOUND = "No routes found :(\nPlease add new routes :)";
	public static final String ENTER_ROUTE_ID = "Enter Route ID need to be deleted : "; 
	public static final String ONE_ROW_DELETED = "1 row deleted";
	public static final String INVALID_ROUTE_ID = "Invalid Route Id";
	public static final String ENTER_BUS_RID = "Enter Bus Registration Number : ";
	public static final String ENTER_SOURCE = "Enter Source : ";
	public static final String ENTER_DESTINATION = "Enter Destination : ";
	public static final String ONE_ROW_INSERTED = "1 row inserted into database";
	public static final String NO_TRIPS_FOUND = "No trips found :(\nPlease add new trips :)";
	public static final String TRIP_TABLE = "BusRegNum BoardingTime ArrivalTime TicketCharge";
	public static final String INVALID_BUS_RID = "Invalid Bus registration Number";
	public static final String BUS_RID_TO_BE_UPDATED = "Enter Bus Registration Number to be updated : ";
	public static final String UPDATE_ATTRIBUTES_CHOICES= "1. Update Bus Registration Number\n2. Update Boarding Time\n3. Update Arrival Time\n4. Update Ticket Charge";
	public static final String NEW_BUS_RID = "Enter new Bus Registration Number :";
	public static final String ONE_ROW_UPDATED = "1 row updated";
	public static final String NEW_BOARDING_TIME = "Enter new Boarding time : "; 
	public static final String NEW_ARRIVAL_TIME = "Enter new Arrival time: ";
	public static final String NEW_DESTINATION = "Enter new Destination";
	public static final String BUS_RID_TO_BE_DELETED = "Enter Bus Registration Number to be deleted : ";
	public static final String BOARDING_TIME = "Enter Boarding time : ";
	public static final String ARRIVAL_TIME = "Enter Arrival time : ";
	public static final String TICKET_CHARGE = "Enter Ticket charge : ";
	public static final String ROUTE_TABLE = "RouteID  BusRegistrationNumber  Source  Destination";
	public static final String ROUTE_ID = "Enter Route ID : ";
	public static final String UPDATE_ATTRIBUTES_ROUTE = "1. Update Route Id\n2. Update Bus Registration Number\n3. Update Source\n4. Update destination";
	public static final String ENETR_NEW_ROUTE_ID = "Enter new Route Id :";
	public static final String NEW_SOURCE = "Enter new Source: ";
	public static final String CONTINUE_MSG = "\nDo you want to continue (Y/N)?";
	public static final String ROUTE_INSERT = "insert into route(Route_Id, " + "Bus_Registration_number, " + "Source, " + "Destination ) VALUES (?, ?, ?, ?)";
	public static final String ROUTE_DELETE = "delete from route where Route_Id =?";
	public static final String ROUTE_GET_ONE_ROUTE = "select * from route where Route_Id= ?";
	public static final String ROUTE_GET_ALL_ROUTE = "select * from route";
	public static final String ROUTE_UPDATE_ROUTE = "update route set route_id=?, bus_registration_number=?, source=?, destination=?  where route_id=?";
	public static final String TRIP_INSERT = "insert into trip VALUES (?, ?, ?, ?)";
	public static final String TRIP_DELETE = "delete from trip where Bus_Registration_number =?";
	public static final String TRIP_GET_ONE_TRIP = "select * from trip where Bus_Registration_number= ?";
	public static final String TRIP_GET_ALL_TRIP = "select * from trip";
	public static final String TRIP_UPDATE = "update trip set bus_registration_number=?, boarding_time=?, arrival_time=?, ticket_charge=?  where Bus_Registration_number=?";
	public static final String USER_INSERT = "insert into user VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	public static final String USER_DELETE = "delete from user where login_id =?";
	public static final String USER_GET_ONE_USER = "select * from user where login_id= ?";
	public static final String USER_GET_ALL_USERS = "select * from user";
	public static final String USER_UPDATE = "update user set login_id=?, fname=?, lname=?, email=?, phone_number=?, password=?, identity_proof_number=?, physical_disability=?, address=?, date_of_birth=?, role=? where login_id=?";
	public static final String ENTER_NEW_ROUTE = "Enter Route ID : ";
	public static final String ENTER_ROUTE_ID_TO_UPDATE = "Enter Route ID to be Updated : ";
	public static final String NEW_TICKET_CHARGE = "Enter new ticket charge : ";
}
