package com.company;

public class Fish extends Animal
{
	private int gills;
	private int eyes;
	private int fins;

	public Fish(String name, int size, int weight, int gills, int eyes,
				int fins)
	{
		super(name, 1, 1, size, weight);
		this.gills = gills;
		this.eyes = eyes;
		this.fins = fins;
	}

	private void rest()
	{

	}

	void swim(int speed)
	{
		moveMuscles();
		moveBackFin();

		System.out.print("Shark is ");
		super.move(speed);
	}

	private void moveMuscles()
	{
		System.out.println("Moving muscles");
	}

	private void moveBackFin()
	{
		System.out.println("Moving back fin");
	}

	/* Getters & Setters */
	public int getGills()
	{
		return gills;
	}
	public void setGills(int gills)
	{
		this.gills = gills;
	}
	public int getEyes()
	{
		return eyes;
	}
	public void setEyes(int eyes)
	{
		this.eyes = eyes;
	}
	public int getFins()
	{
		return fins;
	}
	public void setFins(int fins)
	{
		this.fins = fins;
	}

}
