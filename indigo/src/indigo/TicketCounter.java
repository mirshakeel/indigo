package indigo;

class TicketCounter {
	private        String      PNR;
	private static String      totalweightAllowed="20 kg";


	TicketCounter(String PNR){
		     this.PNR = PNR;
			
	}


	public String getPNR(){
		  return PNR;
	}
	
	public String getTotalWeightAllowed(){
	 	  return totalweightAllowed;
	}
    
    void setPNR(String PNR){
	 		this.PNR = PNR;
	}	
	
	void setTotalWeightAllowed(String totalweightAllowed){
	 	  String totalWeight = TicketCounter.totalweightAllowed; 
	}
	void display() {
		System.out.println("Ticket Counter: \n PNR :" +getPNR()+ "\n Total weight allowed :" + getTotalWeightAllowed());
	}
}
