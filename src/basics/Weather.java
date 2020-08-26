package basics;

public class Weather {
	public static void main (String[] args) {
		//This program will give suggestions of what to wear based on the weather (temperature)
		
		int temperature = 65; 
		String sunCondition = "Overcast";
		
		if(temperature > 80) {
			System.out.println("It's pleasant. Just wear shorts and tshirts");
		}
		else if (temperature > 60 && (sunCondition == "Sunny")) {
			System.out.println("It's a litter bit cooler, wear a long sleeve shirt");
			System.out.println("Wear a hat to keep the sun out of your eyes.");
		}
		else {
			System.out.println("Looks like a cold day. Bring sweater.");
		}
		
	}
}
