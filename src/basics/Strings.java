package basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		bookTitle = "The Lord of the Rings";
		String wordChoice = "Ring";
		if(bookTitle.contains(wordChoice)) {
			System.out.println("The book contains the word " + wordChoice);
		}
		
		String browser = "Chrome";
		if(browser.equalsIgnoreCase("chrome")) {
			System.out.println("The browser is Chrome.");
		}
		
		String firstName = "April";
		String lastName = "Valdueza";
		String SSN = "14564545";
		
		//Print the initials plus last 4 digits of SSN
		System.out.println("There are " + SSN.length() + " digits in your SSN.");
		System.out.println(firstName.substring(0, 1) + "\n" + lastName.substring(0, 1) + "\n" + SSN.substring(4));
	}

}
