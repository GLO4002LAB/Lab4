package ca.ulaval.glo4002.travel;

public class FlightPartnerReservation implements Reservation {
	private double bonus = 1;
	
	@Override
	public void generateQuote(Object object, Quote quote) {
		Flight flight = (Flight)object;
		double price = 0.0;

        for (Passenger passenger : quote.getPassengers()) {
        	passenger.addRebate(bonus);
            price += flight.getPrice() * passenger.getRebate();
        }
        quote.setFlightPrice(price);
	}
	
	@Override
	public void addRebate(double rebate) {
		this.bonus = rebate;
	}

}
