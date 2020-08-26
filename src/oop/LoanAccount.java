package oop;

public class LoanAccount implements IRate{

	
	public void setRate() {
		System.out.println("Rate");
	}
	public void increaseRate() {
		System.out.println("Increase Rate");
	}
	public void setTerm(int term) {
		System.out.println("Setting terms to " + term + " years.");
	}
	public void setAmmortSchedule() {
		System.out.println("Ammortization schedule");
	}
}
