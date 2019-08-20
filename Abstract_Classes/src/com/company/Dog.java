/**
 * Title:
 * Author: Tyler Knight
 * Date:
 * Purpose:
 * <p>
 * Description:
 **/

package com.company;

public class Dog extends Animal
{

	public Dog(String name)
	{
		super(name);
	}

	@Override
	public void eat()
	{
		System.out.println(getName() + " is eating");
	}

	@Override
	public void breathe()
	{
		System.out.println("Breath in, breath out...");
	}
}
