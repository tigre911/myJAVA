
public class OPP {
	public static void main(String[] args) {
		
		Animal animal = new Animal();
		
		System.out.println(animal.name);
		System.out.println(animal.specify);
		System.out.println(animal.age);
		System.out.println(animal.weight);
		
		animal.bulkUp();
		animal.oneYearAgo();
		
		System.out.println(animal.age);
		System.out.println(animal.weight);
	}
}
