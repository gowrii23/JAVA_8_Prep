package objects.test;

import java.io.IOException;
import java.sql.SQLException;

public class TestAnimal {

	public static void main(String... args) throws IOException, SQLException {
		//Object Creating
		Animal ani = new Animal();
		Horse hor = new Horse();
		ani.eat();
		hor.eat();
		
		//Polymorphism 1
		Animal pAni = new Horse();  // Horse IS-A Animal so it will work
		pAni.eat();
		//Horse pHor = new Animal(); //Error //Type mismatch: cannot convert from Animal to Horse
		
		//Polymorphism 2
		sleep(hor);
		
		System.out.println("HI");
	 	
	}

	
	//Polymorphism 2
	public static void sleep(Animal ani) {
		// TODO Auto-generated method stub
		System.out.println("Polymorphism:: Though Horse obj is passed it picks");
	}
}
