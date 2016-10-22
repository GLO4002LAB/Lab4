package ca.ulaval.glo4002.travel;

public class PassengerAdult implements Passenger {
	
    private static final double REBATE = 1;
    
	@Override
	public double getRebate() {
		return REBATE;
	}

	@Override
	public boolean isChild() {
		return false;
	}

	@Override
	public boolean isAdult() {
		return true;
	}

	@Override
	public boolean isVIP() {
		return false;
	}
}
