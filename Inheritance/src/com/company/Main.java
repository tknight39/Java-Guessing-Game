package com.company;

public class Main
{

	public static void main(String[] args)
	{
		Animal animal = new Animal("Animal", 1, 1, 5, 5);

		/*Dog dog = new Dog("German Shepherd",8,2,4,1,1,20,"Medium");

		dog.eat();
		dog.bark();
		dog.run();*/

		/*Fish shark = new Fish("Shark",10,550,1,2,4);

		shark.swim(50);*/

		GermanShepherd Ranger = new GermanShepherd("Ranger", 98, "Medium");

		System.out.println(Ranger.getBreed());
		Ranger.bark();
		Ranger.walk();
		Ranger.run();
		Ranger.eat();
	}

}
