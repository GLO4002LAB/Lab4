package ca.ulaval.glo4002.travel;

public class SampleMain {
    public static void main(String[] args) {
    	PassengerFactory passengerFactory = new PassengerFactory();
        Passenger requester = passengerFactory.create(true, false);
        Passenger passenger1 = passengerFactory.create(true, false);
        Passenger passenger2 = passengerFactory.create(true, false);
        Passenger passenger3 = passengerFactory.create(true, false);

        Quote quote = new Quote(requester);
        quote.addPassenger(passenger1);
        quote.addPassenger(passenger2);
        quote.addPassenger(passenger3);

        Hotel hotel = new Hotel(964.35);
        Flight flight = new Flight(473.01, true);

        new HotelReservation().generateQuote(hotel, quote);
        new FlightReservation().generateQuote(flight, quote);
    }
}
