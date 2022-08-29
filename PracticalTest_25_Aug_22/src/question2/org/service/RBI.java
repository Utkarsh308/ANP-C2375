package question2.org.service;

public abstract class RBI {
	private Account account;
	private Costumer costumer;
	
	double interestRate;
	static final double minimumInterestRate = 4;
	static final int minimumBalance = 3000;
	static final double maximumWithdraw = 600000;
	
	public abstract double getInterestRate();
	public abstract double getWithdrawLimit();

}
