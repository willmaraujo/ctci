package inheritance;

public abstract class Animal {
	
	String name;
	Integer age;
	
	public abstract void bark();
	
	public String getName() {
		return this.name;
	}
	
	public void walk() {
		System.out.println("Walking");
	}

}
