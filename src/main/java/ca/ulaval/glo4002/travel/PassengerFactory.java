package ca.ulaval.glo4002.travel;

public class PassengerFactory {
	Passenger create(boolean isVip, boolean isChild){
		Passenger passanger = null;
		
		if(isChild){
			passanger = new PassengerChild();
			if(isVip)
				passanger = new PassengerChildVip();
		}
		else{
			passanger = new PassengerAdult();
			if(isVip)
				passanger = new PassengerVip();
		}
		
		return passanger;
	}
}
