package ca.ulaval.glo4002.travel;

public class FlightCharterReservation implements Reservation {

	@Override
	public void generateQuote(Object object, Quote quote) {
		Flight flight = (Flight)object;
		double price = 0.0;

        for (Passenger passenger : quote.getPassengers()) {      
        	price += flight.getPrice();
        }
        quote.setFlightPrice(price);
	}
}
