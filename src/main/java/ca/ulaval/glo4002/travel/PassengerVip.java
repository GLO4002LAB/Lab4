package ca.ulaval.glo4002.travel;

public class PassengerVip implements Passenger {

	private final static double REBATE = 0.8;
	private final static double CHARTER_REBATE = 0.85;
	private double bonus = 1;
	private boolean isRequester = false;
	
	@Override
	public double getRebate() {
		double rebate = 1;
		if(isRequester && bonus != 1)
			rebate = bonus;
		else
			rebate = REBATE*bonus;
		
		System.out.print("Rabais PassengerVip : " + rebate + "\n");
		return rebate;
	}
	
	@Override
	public double getCharterRebate() {
		double rebate = 1;
		if(isRequester && bonus != 1)
			rebate = bonus;
		else
			rebate = CHARTER_REBATE*bonus;
		return rebate;
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
		return true;
	}
}
