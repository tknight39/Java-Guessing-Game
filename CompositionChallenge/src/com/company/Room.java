/*******************************************************************************
 * Author: Tyler Knight
 * Date: 
 *
 * Description:
 ******************************************************************************/

package com.company;

public class Room
{
	private Window aWindow;
	private Floor theFloor;
	private Lamp theLamp;


	public Room(Window aWindow, Floor theFloor, Lamp theLamp)
	{
		this.aWindow = aWindow;
		this.theFloor = theFloor;
		this.theLamp = theLamp;
	}


	public void bedTime()
	{
		System.out.println("It's bedtime");
		getaWindow().closeWindow();
		getTheLamp().turnOff();
	}

	public Window getaWindow()
	{
		return aWindow;
	}

	private Floor getTheFloor()
	{
		return theFloor;
	}

	public Lamp getTheLamp()
	{
		return theLamp;
	}
}
