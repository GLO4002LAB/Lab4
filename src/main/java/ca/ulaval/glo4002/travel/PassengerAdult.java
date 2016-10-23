package ca.ulaval.glo4002.travel;

public class PassengerAdult implements Passenger {
	
    private final static double REBATE = 1;
    private final static double CHARTER_REBATE = 0.85;
    private double bonus = 1;
    private boolean isRequester = false;
    
	@Override
	public double getRebate() {
		System.out.print("Rabais PassengerAdult : " + REBATE*bonus + "\n");
		return REBATE*bonus;
	}
	
	@Override
	public double getCharterRebate() {
		return CHARTER_REBATE*bonus;
	}
	
	@Override
	public void addRebate(double rebate) {
		this.bonus = rebate;
	}

	@Override
	public void setRequester(boolean isRequester) {
		this.isRequester = isRequester;
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
