package objects.test;

import java.io.IOException;

public class Animal {

	//override::  must not be <<static>> or <<final>> for overridded by Sub-classes
	//override:: must not be private, - access restriction
	public void eat() throws IOException{
		System.out.println("Animal Eat");
	}
}
