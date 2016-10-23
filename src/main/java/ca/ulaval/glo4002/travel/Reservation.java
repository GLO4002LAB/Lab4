package ca.ulaval.glo4002.travel;

public interface Reservation {
	public void generateQuote(Object object, Quote quote);
	public void addRebate(double rebate);
}
