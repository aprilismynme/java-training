package oop;

public class BankAccount implements IRate {
	
	//Define variables
	private String accountNumber;
 	private static final String routingNumber = "901122";
	private String accountName;
	private String SSN;
	double balance = 0;
	private String accountType;
	
	 
	//Constractor definitions: unique method
	
	BankAccount(){
		System.out.println("NEW ACCOUNT CREATED	");
	}
	BankAccount(String accountType){
		System.out.println("NEW ACCOUNT: " + accountType);
	}
	BankAccount(String accountType, double initDeposit){
		String msg = "";
		System.out.println("Initial Deposit of : " + accountType + " is $" + initDeposit);
		if(initDeposit < 1000) {
			msg = "ERROR: Minimum Deposit must be atleast $1000";
		}
		else {
			msg = "Thank you for your initial deposit of: $" + initDeposit;
		}
		System.out.println(msg);
		balance = initDeposit;
	}
	//Define methods
	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("Deposit");
	}
	
	private void showActivity(String activity) {
		System.out.println("Your recent transaction: " + activity);
		System.out.println("Your new balance is: $" + balance);
	}
	
	void withdraw(double amount) {
		balance = balance - amount;
		showActivity("Withdraw");
	}
	
	void checkBalance() {
		System.out.println("BALANCE: $" + balance);
	}
	
	void getStatus() {
		
	}
	@Override
	public String toString() {
		return "Name: " + accountName + ". \nAccount number: " + accountNumber + ". \nBalance: $" + balance + " \nAccount Type: "+ accountType;
	}
	
	//Setter and Getter
	public void setAccountName(String accountName) {
		this.accountName = "Mr./Mrs " + accountName;
	}
	
	public String getAccountName() {
		return accountName;
	}
	
	public String getSSN() {
		return SSN;
	}
	public void setSSN(String sSN) {
		SSN = sSN;
	}
	
	public void setRate() {
		System.out.println("SETTING RATE");
	}
	public void increaseRate() {
		System.out.println("INCREASE RATE");
	}
	
}
