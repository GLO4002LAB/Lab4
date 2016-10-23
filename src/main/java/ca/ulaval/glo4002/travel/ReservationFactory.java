package ca.ulaval.glo4002.travel;

public abstract class ReservationFactory {
	public static ReservationFactory getFactory(TypeReservation typeReservation)
    {
		 ReservationFactory reservationFactory = null;
		 switch (typeReservation) {
		 	case FLIGHT:
		 		reservationFactory = new FlightReservationFactory();
		 		break;
		 	case HOTEL:
		 		reservationFactory = new HotelReservationFactory();
		 		break;
		 }

		 return reservationFactory;
    }
	
	public abstract Reservation create(Object object);
}
