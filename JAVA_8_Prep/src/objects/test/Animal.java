package objects.test;

import java.io.IOException;

public class Animal {

	private double ani;


	//override::  must not be <<static>> or <<final>> for overridded by Sub-classes
	//override:: must not be private, - access restriction
	public void eat() throws IOException{
		System.out.println("Animal Eat");
	}

	
	//equals() - Override
	@Override
	public boolean equals(Object arg0) {
		Animal c = (Animal) arg0;
		// Compare the data members and return accordingly 
	    return Double.compare(ani, c.ani) == 0;
	}

}
