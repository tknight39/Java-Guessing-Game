/*******************************************************************************
 * Title: Composition
 * Author: Tyler Knight
 * Date: 8/12/2019
 *
 * Description: Composition uses other classes as components of a class.
 * Since you can only extend from one class, Composition allows you to
 * Access functions and behavior from as many classes as you need
 ******************************************************************************/


package com.company;

public class Main
{

	public static void main(String[] args)
	{
		makePC();
	}


	public static void makePC()
	{
		/* Define dimensions (for the Case) */
		Dimensions dimensions = new Dimensions(20, 20, 5);

		/* Define a new case */
		Case theCase = new Case("220B", "Dell", "240", dimensions);

		/* Define a new monitor (Using a random class for resolution) */
		Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27,
				new Resolution(2540, 1440));

		/* Define a new motherboard */
		Motherboard theMotherBoard = new Motherboard("BJ-200", "Asus", 4, 6,
				"v2.44");

		/* Define a new PC using all of the components above */
		Pc thePC = new Pc(theCase, theMonitor, theMotherBoard);

		/* Using the new Pc, draw a pixel on the screen */
		// A better way is below
		//thePC.getMonitor().drawPixelAt(1500, 1200, "red");
		//thePC.getMotherboard().loadProgram("Ubuntu Linux");
		//thePC.getTheCase().pressPowerButton();

		/* We made the pc class methods private except for powerUp()
		*  and added the pressPowerButton() and drawPixelAt()
		*  Functions to the powerUp() function*/
		thePC.powerUp();
	}

}
