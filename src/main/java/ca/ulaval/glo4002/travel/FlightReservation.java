package ca.ulaval.glo4002.travel;

import java.util.List;

public class FlightReservation {
	
	private List<Passenger> passengers;
	
	public FlightReservation(List<Passenger> passengers){
		this.passengers = passengers;
	}
	
	public 
    /*public void generateQuote(Flight flight, Quote quote) {
        double price = 0.0;

        for (Passenger passenger : quote.getPassengers()) {
            if (!flight.isFlightFromPartnerCompany()) {

                if (passenger.isVIP() && passenger.isAdult()) {
                    price += flight.getPrice() * passenger.getVIPRebate();
                } else if (passenger.isChild()) {
                    price += flight.getPrice() * passenger.getChildRebate();
                } else {
                    price += flight.getPrice();
                }

            } else {
                price += flight.getPrice();
            }

        }
        quote.setFlightPrice(price);
    }*/
}
