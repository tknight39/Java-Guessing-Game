/**
 * Title:
 * Author: Tyler Knight
 * Date:
 * Purpose:
 * <p>
 * Description: Extends bird, since penguins can't fly
 * we override the fly method
 **/

package com.company;

public class Penguin extends Bird
{
	public Penguin(String name)
	{
		super(name);
	}

	@Override
	public void fly()
	{
		super.fly();
		System.out.println("Penguins can't fly!");
	}
}
