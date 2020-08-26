package basics;

public class SalaryCalculation {
	public static void main (String[] args) {
		// Career variables
		String career;
		System.out.println("Program is starting...");
		career = "Software developer";
		System.out.println("My career is " + career);
		
		//Declare and Define
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		career = "Web Developer";
		double salary = hoursPerWeek * weeksPerYear * rate;
		System.out.println("My salary as a " + career + " at the rate of  $" + rate + " per hour and $ " + salary + " per year.");
		
		//Computation
		// rate * hoursPerWeek = WeeksPerYear
	}
}
