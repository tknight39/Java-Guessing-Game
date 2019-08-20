package com.company;

public class Dog extends Animal
{
	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	private String coat;
	private String breed;

	/* Creates a new constructor with the same args as the animal constructor */
	/* Also introduces features specific to a dog */
	Dog(String name, int size, int weight, int eyes,
		int legs,
		int tail,
		int teeth, String coat)
	{
		super("Canine", 1, 1, size, weight);
		this.breed = "Unknown";
		this.eyes = eyes;
		this.tail = tail;
		this.teeth = teeth;
		this.coat = coat;
	}

	void bark()
	{
		System.out.println("WOOF WOOF");
	}

	private void chew()
	{
		System.out.println("Smack Smack Smack");
	}


	void eat()
	{
		System.out.println("Dog is eating");
		chew();
	}

	void walk()
	{
		System.out.println("Dog is walking");
		move(5);
	}

	void run()
	{
		System.out.println("Dog is running");
		move(10);
	}


	/***************************************************************************
	 * Will call the parent "move()", function instead of using
	 * a function called "move()" that we may have in this class
	 **************************************************************************/
	@Override
	void move(int speed)
	{
		System.out.println("Dog moving");
		super.move(speed);
	}

	public int getEyes()
	{
		return eyes;
	}

	public void setEyes(int eyes)
	{
		this.eyes = eyes;
	}

	public int getLegs()
	{
		return legs;
	}

	public void setLegs(int legs)
	{
		this.legs = legs;
	}

	public int getTail()
	{
		return tail;
	}

	public void setTail(int tail)
	{
		this.tail = tail;
	}

	public int getTeeth()
	{
		return teeth;
	}

	public void setTeeth(int teeth)
	{
		this.teeth = teeth;
	}

	public String getCoat()
	{
		return coat;
	}

	public void setCoat(String coat)
	{
		this.coat = coat;
	}

	public String getBreed()
	{
		return breed;
	}

	public void setBreed(String breed)
	{
		this.breed = breed;
	}
}
