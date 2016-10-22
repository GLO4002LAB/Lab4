package ca.ulaval.glo4002.travel;

public class HotelReservation {
    public void generateQuote(Hotel hotel, Quote quote) {
        double price = 0.0;

        Passenger requester = quote.getRequester();
        price += hotel.getPrice() * requester.getRebate();

        quote.setHotelPrice(price);
    }
}
