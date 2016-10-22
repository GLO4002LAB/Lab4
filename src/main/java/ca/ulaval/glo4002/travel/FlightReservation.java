package ca.ulaval.glo4002.travel;

public class FlightReservation {
    public void generateQuote(Flight flight, Quote quote) {
        double price = 0.0;

        for (Passenger passenger : quote.getPassengers()) {
            if (!flight.isFlightFromPartnerCompany()) {
            	price += flight.getPrice() * passenger.getRebate();

            } else {
                price += flight.getPrice();
            }

        }
        quote.setFlightPrice(price);
    }
}
