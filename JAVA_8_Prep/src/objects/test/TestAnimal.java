package objects.test;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Hashtable;

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
		
		String s1 = "Gowri";
        concat1(s1);  // s1 is not changed
        System.out.println("String: " + s1);
		
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
		
		//AutoBoxing -- will be done for primitive
		Integer i1= 10;
		Integer i2=10;
		if(i1==i2) {System.out.println("Same object");}
		if(i1!=i2) {System.out.println("Different  object");}
		
		//AutoBoxing -- will NOT be done for primitive
		Integer i3= 1000;
		Integer i4=1000;
		if(i3==i4) {System.out.println("Same object");}
		if(i3!=i4) {System.out.println("Different  object");}
		
		Hashtable ha= new Hashtable();
		ha.put(a, "abc");
		System.out.println(ha.get(a));
	}

	
	//Polymorphism 2
	public static void sleep(Animal ani) {
		// TODO Auto-generated method stub
		System.out.println("Polymorphism:: Though Horse obj is passed it picks");
	}
	
	// Concatenates to String
    public static void concat1(String s1)
    {
        s1 = s1 + "forgeeks";
    }
}
