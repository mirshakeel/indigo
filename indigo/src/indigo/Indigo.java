package indigo;

import java.util.ArrayList;
import java.util.Scanner;

import indigo.StatesOfIndia;

public class Indigo {
	public static void main(String[] args) {
			
			/*list of indigo planes at the airport*/
			Plane indigo = new Plane(0, 5, "bumman" );
    	 	
			
			/*list of flights our planes are scheduled*/
			ArrayList<Flight> listOfFlights  = new ArrayList<>();
			ArrayList<Flight> flightsMatched = new ArrayList<>();
			 Passenger mir = new Passenger("shakeel","mir@123","ADULT",9149401290l);

    	 	Flight f  = new Flight(indigo,123,2,7000,StatesOfIndia.SXR,StatesOfIndia.BLR,"10/09/2018","10:30","16:30","Domestic","6 hrs");
    	 	Flight f1 = new Flight(indigo,124,2,5000,StatesOfIndia.DLH,StatesOfIndia.MMB,"10/09/2018","14:30","19:30","Domestic","5 hrs");
    	 	Flight f2 = new Flight(indigo,125,2,7000,StatesOfIndia.BLR,StatesOfIndia.SXR,"10/09/2018","12:30","18:30","Domestic","6 hrs");
    	 	Flight f3 = new Flight(indigo,126,2,5000,StatesOfIndia.MMB,StatesOfIndia.DLH,"10/09/2018","14:30","19:30","Domestic","5 hrs");
    	 	Flight f4 = new Flight(indigo,127,2,3000,StatesOfIndia.SXR,StatesOfIndia.DLH,"10/09/2018","10:30","12:30","Domestic","2 hrs");
    	 	Flight f5 = new Flight(indigo,128,2,4000,StatesOfIndia.BLR,StatesOfIndia.DLH,"10/09/2018","10:30","14:30","Domestic","4 hrs");
    	 	Flight f6 = new Flight(indigo,129,2,6000,StatesOfIndia.MMB,StatesOfIndia.SXR,"10/09/2018","10:30","14:30","Domestic","4 hrs");
    	 	Flight f7 = new Flight(indigo,130,2,5000,StatesOfIndia.MMB,StatesOfIndia.DLH,"10/09/2018","10:30","15:30","Domestic","5 hrs");
       	 	
    	 	listOfFlights.add(f);
    	 	listOfFlights.add(f1);
    	 	listOfFlights.add(f2);
    	 	listOfFlights.add(f3);
    	 	listOfFlights.add(f4);
    	 	listOfFlights.add(f5);
    	 	listOfFlights.add(f6);
    	 	listOfFlights.add(f7);
    	 	
    	 	Scanner scan = new Scanner (System.in);
    	 	
    	 	System.out.println("Please Enter Flight Origin : ");
    	 	
    	 	String passengerOrigin      = 	scan.nextLine();
    	 	
    	 	System.out.println("Please Enter Flight Destination : ");
    	 	
    	 	String passengerDestination = 	scan.nextLine();
    	 	
    	 	System.out.println("Please Enter Flight Date : ");
    	 	
    	 	String flightDate           = 	scan.nextLine();
    	 	
    	 	System.out.println("A - adult C - Child");
    	 	String passengerType 		= scan.nextLine();
    	 	
    	 	
    	 	
    	 	
    	 	
    	 	
    	 	for (int i = 0; i < listOfFlights.size(); i++) {
    	 		
    	 		//System.out.println( "Source : " +  listOfFlights.get(i).getFlightSourceLocation()  + "  --->   Destination : " + listOfFlights.get(i).getFlightDestination());
    	 		if(passengerOrigin.equals(listOfFlights.get(i).getFlightSourceLocation()) && passengerDestination.equals(listOfFlights.get(i).getFlightDestination())&& flightDate.equals(listOfFlights.get(i).getFlightDate()) ) {
    	 		
    	 			flightsMatched.add(listOfFlights.get(i));
    	 		}
    	 		
    	 	}
    	 	if(flightsMatched.size()==0) 
    	 		System.out.println("no flights available at the moment");
    	 	else {
    	 		System.out.println(passengerOrigin + " --> " + passengerDestination + "\n" + flightDate + "\n");
    	 		System.out.println("F.No  	 Departure  	 Duration  	 Price");
    	 		
    	 		for(int j = 0; j < flightsMatched.size(); j++) {
    	 		//System.out.println("flights available :");
    	 		    System.out.print(  j+1 +"."+ "       " + flightsMatched.get(j).getFlightArrivalTime()+ "-" + flightsMatched.get(j).getFlightDepartureTime()+ "        "+ flightsMatched.get(j).getFlightDuration());
    	 		   
    	 		
    	 	
		 	
    	 		if(passengerType.equals("A")) {
    	 			System.out.println( "  	 "+flightsMatched.get(j).getBookingCost());
    	 		}
    	 		else {
    	 			System.out.println("  	 "+flightsMatched.get(j).getBookingCost()*.70);
    	 		
    	 		
    	 		}
    	 		
 	 	
    	 		}
    	 		
    	 		System.out.println("\nPlease enter  Flight number,you want to book...");
  	 		   
    	 		int flightNo = scan.nextInt();
    	 		f.bookSeatForPassenger(mir);
    	 		if(flightNo>0 && flightNo<= flightsMatched.size()) {
    	 			
    	 			 System.out.println("Enter your Details:");
    	 			Scanner scans = new Scanner(System.in);
	 			 //Passenger p = new Passenger(passengerName, passengerEmail, passengerGroup, passengerPhoneNumber) 
	 			  System.out.println("Name");
	 			    String passengerName = scans.nextLine();	 			 
	 			  System.out.println("Group");
	 			    String passengerGroup = scans.nextLine();
	 			   System.out.println("Email");
	 			    String  passengerEmail = scans.nextLine();
	 			   System.out.println("Phone no.");
	 			    Long  passengerPhoneNo = scans.nextLong();

	 			 System.out.println("\nplease check your details again");
	 			 System.out.println("passenger details :\nName: "+passengerName+"\nEmail: "+passengerEmail +"\nGroup: " + passengerGroup + "\nPhone no.:"+passengerPhoneNo);
                 System.out.println("press 1 to confirm 0r any other key to cancel");
                 int confirmation = scans.nextInt();
                 if (confirmation==1) {
                	 System.out.println("Your flight has been booked");
                 }
                 else {
                	 System.out.println("booking cancelled");
                 }
	 			  
	 			  
	 			  
	 		   }
	 		   else {
	 			   System.out.println("Please enter a valid input..");
	 		   }
    	 	}
	       // Passenger mir = new Passenger("shakeel","mir@123","ADULT",9149401290l);
//            
//    	 	Passenger burhan = new Passenger("burhan","brn@123","ADULT",9149234290l);
//    	 	
//    	 	TicketCounter t = new TicketCounter("nghj");
//    	 
//    	 	f.bookSeatForPassenger(mir);
//    	 	f.bookSeatForPassenger(burhan);
//    	 	f.bookSeatForPassenger(burhan);
//    	 
//            indigo.display();
//            burhan.display();
//            
//          f.display(mir);
//          f1.display(mir);
// 		    f1.flightDetails(f1);
//          t.display();
//         
    	  }
	}
