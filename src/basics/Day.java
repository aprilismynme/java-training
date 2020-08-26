package basics;

public class Day {
	public static void main (String[] args) {
		//Execute different block of code based on a value of condition
		
		String dayOfWeek = "Friday";
		
		switch(dayOfWeek) {
		case "Monday" : 
			System.out.println("Today is monday");
		break;
		case "Tuesday" : 
			System.out.println("Today is tuesday");
		break;
		case "Wednesday" : 
			System.out.println("Today is wednesday");
		break;
		case "Thursday" : 
			System.out.println("Today is thursday");
		break;
		case "Friday" : 
			System.out.println("Today is friday");
		break;
		}
	}
}
