package ca.ulaval.glo4002.travel;

public class PassengerChild implements Passenger {

	private final static double REBATE = 0.6;
	private final static double CHARTER_REBATE = 0.95;
	private double bonus = 1;
	private boolean isRequester = false;
	
	@Override
	public double getRebate() {
		System.out.print("Rabais PassengerChild : " + REBATE*bonus + "\n");
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
