/*******************************************************************************
 * Author: Tyler Knight
 * Date: 8/12/19
 *
 * Description: Create a room using composition
 ******************************************************************************/

package com.company;

public class Main
{
	public static void main(String[] args)
	{
		Window smallWindow = new Window(new Dimensions(12, 12));
		Floor smallFloor = new Floor(new Dimensions(12, 12), "Brown",
				"Hardwood");
		Lamp nightStandLamp = new Lamp();

		Room bedroom = new Room(smallWindow, smallFloor, nightStandLamp);

		bedroom.bedTime();
		bedroom.getTheLamp().turnOn();
		bedroom.getTheLamp().turnOff();
		bedroom.getaWindow().openWindow();
		bedroom.getaWindow().closeWindow();

		System.out.println(bedroom.getaWindow().getDimensions().getHeight());
	}
}
