package ca.ulaval.glo4002.travel;

public class FlightReservationFactory extends ReservationFactory {

	@Override
	public Reservation create(Object object) {
		Flight flight = (Flight)object;
		
		Reservation reservation = null;
		if(!flight.isFlightFromPartnerCompany())
			reservation = new FlightPartnerReservation();
		else
			reservation = new FlightCharterReservation();
		
		return reservation;
	}

}
