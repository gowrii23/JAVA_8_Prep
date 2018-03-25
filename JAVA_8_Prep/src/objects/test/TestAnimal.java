package objects.test;

public class TestAnimal {

	public static void main(String... args) {
		//Object Creating
		Animal ani = new Animal();
		Horse hor = new Horse();
		ani.eat();
		hor.eat();
		
		//Polymorphism 
		Animal pAni = new Horse();  // Horse IS-A Animal so it will work
		pAni.eat();
		//Horse pHor = new Animal(); //Error //Type mismatch: cannot convert from Animal to Horse
		System.out.println("HI");
		
	}
}
