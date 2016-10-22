package ca.ulaval.glo4002.travel;

public class PassengerAdult implements Passenger {

    private static final double VIP_REBATE = 0.8;
    private static final double CHILD_REBATE = 0.6;
    private static final double REBATE = 1;
    
	@Override
	public double getRebate() {
		return REBATE;
	}
}
