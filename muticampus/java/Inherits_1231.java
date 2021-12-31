package mul;

public class Inherits {
	public static void main(String[] args) {
		
//		Mother mother = new Mother();
		
		Son son = new Son();
		
		son.printMotherAge();
		
	}
}

class Mother{
	int motherAge = 50;
	
	public Mother() {
		System.out.println("Welcome to super class");
	}
	
}

class Son extends Mother{
	
	int sonAge = 23;
	
	public Son() {
		System.out.println("welcome to son class");
	}
	
	public void printMotherAge() {
		System.out.println("Mother's age : " + super.motherAge);
	}
	
}