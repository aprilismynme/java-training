package basics;

public class Cities {

	public static void main(String[] args) {
		// Declare and define an array
		
		String[] cities = {"New york", "San francisco", "Miami", "Dallas"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		
		//Declare the array
		String[] Countries = new String[3];
				
		//Define the array
		Countries[0] = "USA";
		Countries[1] = "Canada";
		Countries[2] = "Uk";
//		System.out.println(Countries[0]);
		
		
		//Declare and define the array
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "New jersey";
		states[3] = "Texas";
		states[4] = "Utah";
//		System.out.println(states[0]);
		
		int i = 0;
		//Do loop: enters the loop THEN test the condition 
		System.out.println("\nPrint using do while loop");
		do {
			System.out.println(states[i]);
			i = i + 1;
		//While loop test condition first then enter loop
		}while (i < 5);
		
		int n = 0;
		boolean stateFound = false;
		while(!stateFound) {
			String state = states[n];
			if(state == "Texas") {
				System.out.println("State: " + states[n]);
				stateFound = true;
			}
			n++;
		}
		
		//For loop : best structure for iterating through an array
		System.out.println("\nPrint using array");
		for(int x = 0; x < 5; x++) {
			System.out.println(states[x]);
		}
		
	
	}

}
