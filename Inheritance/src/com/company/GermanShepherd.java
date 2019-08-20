package com.company;

public class GermanShepherd extends Dog
{
	private String breed = "German Shepherd";

	GermanShepherd(String name, int weight, String coat)
	{
		super(name, 5, weight, 2, 4, 1, 20, coat);
	}

	@Override
	void bark()
	{
		System.out.println("The german Shepherd barks!");
		super.bark();
	}

	@Override
	public String getBreed()
	{
		return breed;
	}

	@Override
	public void setBreed(String breed)
	{
		this.breed = breed;
	}

}
