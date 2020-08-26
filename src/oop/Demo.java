package oop;

class Person {
	
	String name;
	String email;
	String phone;
	
	void walk(){
		System.out.println(name + " is walking.");
	}
	
	void eat(){
		System.out.println(name + " is eating.");
	}
	void sleep() {
		System.out.println(name + " is sleeping");
	}
}


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person();
		p1.name = "Joe";
		p1.email = "joe@emailtest.com";
		p1.phone = "09236985310";
		
		p1.walk();
		p1.sleep();
		p1.eat();
		
//		String name = "Joe";
//		String email = "joe@testemail.com";
//		String phone = "0923-698-5310";
//		Walking(name);
//
//	}
//	
//	static void Walking(String name) {
//		System.out.println(name + " is walking.");
//	}

	}
}
