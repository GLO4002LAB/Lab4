package ca.ulaval.glo4002.travel;

public class PassengerFactory {
	Passenger create(boolean isVip, boolean isChild){
		Passenger passanger = null;
		
		if(isChild){
			passanger = new PassengerChild();
		}
		else if(isVip){
			passanger = new PassengerVip();
		}
		else{
			passanger = new PassengerAdult();
		}
		
		return passanger;
	}
}
