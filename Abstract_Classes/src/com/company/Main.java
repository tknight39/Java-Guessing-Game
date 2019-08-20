/**
 * An Abstract Class is a class that defines methods, but has no
 * implementation of those methods
 **/

package com.company;


public class Main
{

	public static void main(String[] args)
	{
		Dog scooby_doo = new Dog("Scooby Doo");

		System.out.println("Dogs name is: " + scooby_doo.getName());

		scooby_doo.breathe();
		scooby_doo.eat();

		Parrot parrot = new Parrot("Parrot");

		parrot.breathe();
		parrot.eat();
		parrot.fly();

		Penguin penguin = new Penguin("Penguin");

		penguin.fly();

	}

}
