package com.company;

public class Animal
{
	private String type;
	private int brain;
	private int body;
	private int size;
	private int weight;

	Animal(String type, int brain, int body, int size, int weight)
	{
		this.type = type;
		this.brain = brain;
		this.body = body;
		this.size = size;
		this.weight = weight;
	}

	void eat()
	{
		System.out.println("Eating");
	}

	void move(int speed)

	{
		System.out.println("Moving @ " + speed + "MPH");
	}


	/* Getters & Setters */
	public String getName()
	{
		return type;
	}

	public void setName(String name)
	{
		this.type = name;
	}

	public int getBrain()
	{
		return brain;
	}

	public void setBrain(int brain)
	{
		this.brain = brain;
	}

	public int getBody()
	{
		return body;
	}

	public void setBody(int body)
	{
		this.body = body;
	}

	public int getSize()
	{
		return size;
	}

	public void setSize(int size)
	{
		this.size = size;
	}

	public int getWeight()
	{
		return weight;
	}

	public void setWeight(int weight)
	{
		this.weight = weight;
	}
	/**************************************************************************/
}
