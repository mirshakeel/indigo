package indigo;

import java.util.ArrayList;

class Flight {
	private int 	flightNo,noOfStops,bookingCost;
	private String  flightDate,flightArrivalTime,flightDepartureTime,flightType,flightSourceLocation,flightDestination,flightDuration;
	private 		ArrayList<Passenger> listOfPassengers;
	private 		Plane planeRef;
	
		
		Flight(Plane planeRef,int flightNo, int noOfStops,int bookingCost, String flightSourceLocation,String flightDestination, String flightDate, String flightArrivalTime, String flightDepartureTime, String flightType , String flightDuration){
			this.planeRef			  = planeRef;
			this.flightNo 		      = flightNo;
			this.noOfStops 		      = noOfStops;
			this.bookingCost          = bookingCost;
			this.flightDate 	      = flightDate;
			this.flightArrivalTime    = flightArrivalTime;
			this.flightDepartureTime  = flightDepartureTime;
			this.flightType			  = flightType;
			this.flightSourceLocation = flightSourceLocation;
			this.flightDestination    = flightDestination;
			this.flightDuration 	  = flightDuration;
			listOfPassengers		  = new ArrayList<>(); 
			
		}
		public int getFlightCost(Passenger passenger) {
			switch(passenger.getpassengerGroup()) {
			case "ADULT":
				return 10000;
			case "infant":
				return 7000;
			case "child":
				return 3000;
			default:
				return 4000;
			
			}
		}
		
	public Plane getPlaneRef() {
		return planeRef;
	}	

	public int getFlightNo(){
		return flightNo;
	}
	public int getNoOfStops(){
		return noOfStops;
	}
	public int getBookingCost() {
		return bookingCost;
	}
	public String getFlightSourceLocation() {
		return flightSourceLocation;
	}
	public String getFlightDestination() {
		return flightDestination;
	}
	public String getFlightDate(){
		return flightDate;
	}
	public String getFlightArrivalTime(){
		return flightArrivalTime;

	}
	public String getFlightDepartureTime(){
		return flightDepartureTime;
	}
	public String getFlightType(){
		return flightType;
	}
	public String getFlightDuration(){
		return flightDuration;
	}
	void setFlightNo(int flightNo){
		this.flightNo = flightNo;
	}
	void setNoOfStops(int noOfStops){
		this.noOfStops = noOfStops;
	}
	void setBookingCost(int bookingCost) {
		this.bookingCost = bookingCost;
	}
	void setFlightSourceLocation(String flightSourceLocation) {
		this.flightSourceLocation = flightSourceLocation;
	}
	void setFlightDestination(String flightDestination) {
		this.flightDestination = flightDestination;
	}
	void setFlightDate(String flightDate){
		this.flightDate = flightDate;
	}
	void setFlightArrivalTime(String flightArrivalTime){
		this.flightArrivalTime = flightArrivalTime;

	}
	void setFlightDepartureTime(String flightDepartureTime){
		this.flightDepartureTime = flightDepartureTime;
	}
	void setFlightType(String flightType){
		this.flightType = flightType;
	}
	void setFlightDuration(String flightDuration) {
		this.flightDuration = flightDuration;
	}
	
	
	
	void display(Passenger p) {
		System.out.println("Flight details: \n Flight No. : "+ getFlightNo() + "\n Flight Source :"+ getFlightSourceLocation()+ "\n Flight Destination :"+ getFlightDestination()+"\n Flight Arrival Time :" +getFlightArrivalTime()+ "\n Flight Departure Time:" + getFlightDepartureTime()+ "\n Flight Type :" +getFlightType()+ "\n Flight Cost :" +getFlightCost(p));
	}
	
	
	void bookSeatForPassenger(Passenger passenger) {
		
		if ( listOfPassengers.size() >= planeRef.getNoOfSeats()) {
			System.out.println("No Seats available");	
			return;	
		}
		
		listOfPassengers.add(passenger);
		System.out.println("Booking available");
	
	}
	
	
	
}
