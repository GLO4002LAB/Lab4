package ca.ulaval.glo4002.travel;

public class HotelReservationFactory extends ReservationFactory {

	@Override
	public Reservation create(Object object) {
		return new HotelReservation();
	}

}
