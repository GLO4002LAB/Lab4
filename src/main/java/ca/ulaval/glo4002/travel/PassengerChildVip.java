package ca.ulaval.glo4002.travel;

public class PassengerChildVip implements Passenger {
	
	private final static double REBATE = 1;
	private final static double CHARTER_REBATE = 0.95;
	private double bonus = 1;
	private boolean isRequester = false;
	
	@Override
	public double getRebate() {
		double rebate = 1;
		if(isRequester && bonus != 1)
			rebate = bonus;
		else
			rebate = REBATE*bonus;
		System.out.print("Rabais PassengerChildVip : " + rebate + "\n");
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
