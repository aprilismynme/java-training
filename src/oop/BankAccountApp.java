package oop;

public class BankAccountApp {

	public static void main (String[] args) {
		
		BankAccount acc1 = new BankAccount();
//		BankAccount acc2 = new BankAccount("Savings account");
//		BankAccount acc3 = new BankAccount("Savings account", 1000);
		
//		acc1.deposit(9000);
//		acc1.deposit(800);
//		acc1.withdraw(8000);
//		acc1.deposit(1000);
		acc1.setAccountName("Roger Hue");
		System.out.println(acc1.getAccountName());
		acc1.setRate();
		acc1.increaseRate();
//		acc1.accountName = "Roger Hue";
//		acc1.balance = 19000;
//		acc1.accountNumber = "1299189054";
//		System.out.println(acc1.toString());
//		
//		//Demo for inheritance
//		
//		CDAccount cd1 = new CDAccount();
//		cd1.balance = 3000;
//		cd1.accountName = "Juan";
//		cd1.accountType = "CD account";
//		cd1.accountNumber = "1299189054";
//		System.out.println(cd1.toString());
	}

}
