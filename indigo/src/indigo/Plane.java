package indigo;
import java.util.ArrayList;
class Plane{

    private int    noOfSeats,noOfAirHostess;
	private String pilotName;
	 

	Plane(int noOfSeats, int noOfAirHostess, String pilotName ){
	 	this.noOfSeats 		= noOfSeats;
	   	this.noOfAirHostess = noOfAirHostess;
	   	this.pilotName   	= pilotName;
	 }

	public int getNoOfSeats(){
		return noOfSeats;
	}
	public int getNoOfHostess(){
		return noOfAirHostess;
	}
	public String getPilotName(){
		return pilotName;
	}
	void setNoOfSeats(int noOfSeats){
		this.noOfSeats = noOfSeats;

	}
	void setNoOfAirHostess(int noOfAirHostess){
		this.noOfAirHostess = noOfAirHostess;
	}
	void setPilotName(String pilotName){
		 this.pilotName = pilotName;

	}
	
	void display(){
		System.out.println("Details of plane are : \n No. of seats = " + getNoOfSeats() + " \n No. of air hostess are " + getNoOfHostess() + "\n Name of pilot = " + getPilotName());
	
	
		 }
}
