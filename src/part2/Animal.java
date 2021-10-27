package part2;

public abstract class Animal {
	
	private String name;
	
	public Animal(String n) {
		name = n;
	}
	
	public String getName() {
		return name; 
	}
	
	abstract public String getSound();
	
	public void makeSound() {
		System.out.println("the " + getName() + " says " +
	getSound());
	}
	
	public static void main(String[] args) {
		//Animal a = new Animal("squirrel");
		Animal a = new Squirrel("kronk");
		System.out.println(a.getSound());
		System.out.println(a.getName());
	}

}
