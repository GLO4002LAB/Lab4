package ca.ulaval.glo4002.travel;

public class HotelReservation implements Reservation {
	private double bonus = 1;
	
	@Override
	public void generateQuote(Object object, Quote quote) {
		Hotel hotel = (Hotel)object;
		double price = 0.0;

        Passenger requester = quote.getRequester();
        requester.addRebate(bonus);
        price += hotel.getPrice() * requester.getRebate();

        quote.setHotelPrice(price);
	}
	
	@Override
	public void addRebate(double rebate) {
		this.bonus = rebate;
	}
}
