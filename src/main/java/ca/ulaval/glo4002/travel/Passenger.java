package ca.ulaval.glo4002.travel;

public interface Passenger {
	public double getRebate();
	public double getCharterRebate();
	public void addRebate(double rebate);
	public void setRequester(boolean isRequester);
	public boolean isChild();
	public boolean isAdult();
	public boolean isVIP();
}
