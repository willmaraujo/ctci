package inheritance;

public class Main {
	
	public static void main(String[] args) {
		Animal mDog = new Dog();
		mDog.name = "Max";
		
		mDog.bark();
		mDog.walk();
		
		Animal mCat = new Cat();
		
		mCat.bark();
		mCat.walk();
		
	}

}
