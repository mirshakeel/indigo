package indigo;

import indigo.StatesOfIndia;

public class Indigo {
	public static void main(String[] args) {

    	 	Plane indigo = new Plane(30, 5, "bumman" );
    	 	
    	 	
    	 	
    	 	
    	 	Flight f = new Flight(indigo,123,2,StatesOfIndia.SXR,StatesOfIndia.BLR,"10/09/2018","10:30 AM","04:30 PM","Domestic");
    	 	
    	 	Passenger mir = new Passenger("shakeel","mir@123","ADULT",9149401290l);
            
    	 	Passenger burhan = new Passenger("burhan","brn@123","ADULT",9149234290l);
    	 	
    	 	TicketCounter t = new TicketCounter("nghj");
    	 
    	 	f.bookSeatForPassenger(mir);
    	 	f.bookSeatForPassenger(burhan);
    	 	f.bookSeatForPassenger(burhan);
    	 	
            indigo.display();
            burhan.display();
            
            f.display(mir);
            t.display();
         
    	  }
}
