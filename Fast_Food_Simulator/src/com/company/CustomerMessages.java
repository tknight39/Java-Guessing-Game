/*******************************************************************************
 * Title: Customer Messages
 * Author: Some Dude
 * Date: 7/14/2019
 *
 * Purpose: Stores all of the general messages that the company would
 * want to show on the screen
 ******************************************************************************/

package com.company;

public class CustomerMessages
{

	public static void displayGreeting()
	{
		System.out.println("Welcome to some burger joint!");
	}

	public static void goodbye()
	{
		System.out.println("Thank you for eating at some burger joint!\n" +
				"Please come again!");
	}

	/* Shows the instructions for the keypad */
	public static void displayKeypadInstructions()
	{
		System.out.println("\n");
		System.out.println(
				"************************************************************");
		System.out.println("~Keypad Instructions~");
		System.out.println("To add an item to your order, please press the " +
				"keypad number that matches the item number on the screen");

		System.out.println("To delete an item from your order, press the '-' " +
				"key on the keypad");

		System.out.println("To submit your order, press the '#' key on the " +
				"keypad");
		System.out.println(
				"************************************************************");
	}

}
