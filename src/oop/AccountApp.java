package oop;

public class AccountApp {

	public static void main (String[] args) {
		
		LoanAccount la = new LoanAccount();
		la.increaseRate();
		la.setRate();
		la.setTerm(10);
		la.setAmmortSchedule();
		
		IRate account1 = new LoanAccount();
		account1.setRate();
		account1.increaseRate();
	}
}
