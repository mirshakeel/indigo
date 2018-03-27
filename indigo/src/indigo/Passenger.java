package indigo;

public class Passenger {
	private String passengerName, passengerEmail,passengerGroup;
	private long   passengerPhoneNumber;

	  Passenger(String passengerName, String passengerEmail ,String passengerGroup, long passengerPhoneNumber ){
	  	this.passengerName 		  = passengerName;
	  	this.passengerEmail 	  = passengerEmail;
	  	this.passengerGroup   	  = passengerGroup;
	  	this.passengerPhoneNumber = passengerPhoneNumber;
	  }

	public String getPassengerName(){
		return passengerName;
	}

	public String getPassengerEmail(){
		return passengerEmail;
	}

	public String getpassengerGroup(){
		return passengerGroup; 
	}

	public long getPassengerPhoneNumber(){
		return passengerPhoneNumber;
	}

    void setPassengerName(String passengerName){
		this.passengerName = passengerName;		
	}

	void setPassengerEmail(String passengerEmail){
		this.passengerEmail = passengerEmail;
	}

	void setPassengerGroup(String passengerGroup){
		this.passengerGroup = passengerGroup;
	}

	void setPassengerPhoneNumber(long passengerPhoneNumber){
		this.passengerPhoneNumber = passengerPhoneNumber;
	}
	void display() {
		System.out.println("Passenger details :\n Name :"+getPassengerName()+ "\n Email :" +getPassengerEmail()+ "\n Group :"+getpassengerGroup()+ "\n Phone number :" +getPassengerPhoneNumber());
	}
}
