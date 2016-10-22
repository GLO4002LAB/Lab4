package ca.ulaval.glo4002.travel;

public class PassengerChildVip implements Passenger {
	
	private static final double REBATE = 1;

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
		return true;
	}

}
