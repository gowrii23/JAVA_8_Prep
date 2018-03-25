package objects.test;

import java.io.IOException;

public class Horse extends Animal{
	
	//Overridden:: Cannot have Private access specifier in Override Method
	//Overridden:: Exception must be more specific Eg: It can have IOException or more specifc IOExc
	public void eat() throws IOException {
		System.out.println("Horse Eats Oats");
	}
}
