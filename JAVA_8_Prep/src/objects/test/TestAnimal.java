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
	 	
		//Fun Q
		int a=5,b;
		a++;
		b=a;
		System.out.println(a+" "+b);
		b=a++;
		System.out.println(a+" "+b);
		
		StringBuffer strBuf = new StringBuffer("5");
		StringBuffer strBuf2;
		strBuf.append("6");
		strBuf2= strBuf;
		System.out.println(strBuf+"Str Buffer"+strBuf2);
		
		StringBuilder strbld = new StringBuilder("5");
		StringBuilder strbld2;
		strbld.append("6");
		strbld2=strbld;
		System.out.println(strbld+"Str Builder"+strbld2);
		//End Of Fun Q
		
		
		
	}

	
	//Polymorphism 2
	public static void sleep(Animal ani) {
		// TODO Auto-generated method stub
		System.out.println("Polymorphism:: Though Horse obj is passed it picks");
	}
}
