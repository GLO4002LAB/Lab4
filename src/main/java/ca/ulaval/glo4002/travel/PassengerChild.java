package ca.ulaval.glo4002.travel;

public class PassengerChild implements Passenger {

	private static final double REBATE = 0.6;
	
	@Override
	public double getRebate() {
		return REBATE;
	}

	@Override
	public boolean isChild() {
		return true;
	}

	@Override
	public boolean isAdult() {
		return false;
	}

	@Override
	public boolean isVIP() {
		return false;
	}
}
