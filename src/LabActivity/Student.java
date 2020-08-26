package LabActivity;

public class Student {
	public static void main (String[] args) {
		Students stud1 = new Students("Janelle", "19028301");
		stud1.enroll("Eng01");
		stud1.enroll("Math101");
		stud1.enroll("Hist011");
		stud1.checkCourse();
		stud1.checkBalance();
		stud1.payTuition(2000);
		System.out.println(stud1.toString());
	}
}


class Students {
	private static int ID = 1000;
	private String userID;
	private String name;
	private String ssn;
	private String email;
	private String courses = "";
	private static final int costOfCourse = 800;
	private int balance = 0;
	private String phone;
	private String city;
	private String state;
	
	
	public Students(String name, String ssn) {
		this.ID++;
		this.name = name;
		this.ssn = ssn;
		setEmail();
		setUserId();
	}
	
	//Getters and Setters
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	private void setEmail() {
		email = name.toLowerCase() + ID + "@university.edu";
		//System.out.println("Your email is: " + email);
	}
	private void setUserId() {
		int max = 9000;
		int min = 1000;
		int randNum = (int) (Math.random() * (max - min));
		randNum = randNum + min;
		userID = ID + "" + randNum + ssn.substring(6);
		//System.out.println("Your account number: "+ userID);
	}
	public void enroll(String courses) {
		this.courses += ", "+courses;
		balance = balance + costOfCourse;
	}
	
	public void payTuition(int amount) {
		//System.out.println("Payment: $" + amount);
		balance -= amount;
		//System.out.println("Updated balance: " + balance);
	}
	
	public void checkBalance() {
		//System.out.println("Balance: $" + balance);
	}
	
	public void checkCourse() {
		//System.out.println("Enrolled courses: " + courses + "\n");
	}
	
	public String toString() {
		return "[Your email is: " + email + "]\n[User ID: " + userID + " "
				+ "]\n[Courses enrolled: " + courses + "]\n[Balance: $" + balance +"]";
				
	}
}
