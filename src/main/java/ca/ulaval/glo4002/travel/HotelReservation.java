package ca.ulaval.glo4002.travel;

public class HotelReservation implements Reservation {
	@Override
	public void generateQuote(Object object, Quote quote) {
		Hotel hotel = (Hotel)object;
		double price = 0.0;

        Passenger requester = quote.getRequester();
        price += hotel.getPrice() * requester.getRebate();

        quote.setHotelPrice(price);
	}
}
