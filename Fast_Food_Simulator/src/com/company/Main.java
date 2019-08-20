/*******************************************************************************
 * Title: Fast Food Simulator
 * Author: Some Dude
 * Date: 7/14/2019
 * Purpose: Learning basic OOP design
 *
 * Description:
 * ! A simple program that simulates placing an order at a drive-thru
 *   using a keypad for input.
 *
 * ! User can add/delete items from their order, and pay for the items
 ******************************************************************************/

package com.company;

import java.util.Scanner;

public class Main
{
	private static Scanner scanner = new Scanner(System.in);

	private static Menu mainMenu = new Menu();
	private static Customer newCustomer;
	private static Order customerOrder = new Order();
	private static Keypad driveThruKeypad = new Keypad();


	/* Main Function Here! */
	public static void main(String[] args)
	{
		CustomerMessages.displayGreeting();
		getCustomerName();
		CustomerMessages.displayKeypadInstructions();
		getOrder();
		customerOrder.payForOrder();
		CustomerMessages.goodbye();
	}


	/***************************************************************************
	 *! While the order is active,
	 *! Show menu
	 *! Display order (if they have actually ordered something)
	 *! Get keypad input from customer
	 *! Allows user to add/delete items from their order
	 **************************************************************************/
	private static void getOrder()
	{
		char itemSelection = '0';

		while (itemSelection != '#')
		{
			mainMenu.displayMenu();

			if (customerOrder.getItemCount() > 0)
				customerOrder.displayOrder(newCustomer.getCustomerName());

			itemSelection = driveThruKeypad.getKeypadEntry();

			 if (driveThruKeypad.deleteBtnPressed(itemSelection))
				 deleteItem();
			else
				customerOrder.addItem(mainMenu.getMenuItemName(itemSelection),
						mainMenu.getMenuItemPrice(itemSelection));
		}
	}


	/***************************************************************************
	 *  Prompts user to select an item to delete, then deletes it
	 *  only if the item has actually been ordered
	 **************************************************************************/
	private static void deleteItem()
	{
		char itemSelection = 0;

		System.out.println("What Item would you like to delete?");

		itemSelection = driveThruKeypad.getKeypadEntry();

		customerOrder.removeItem(mainMenu.getMenuItemName(itemSelection),
				mainMenu.getMenuItemPrice(itemSelection));
	}

	/***************************************************************************
	 * Prompts the customer to enter their name, then initializes the Customer
	 * instance *newCustomer* using the name given by customer
	 **************************************************************************/
	private static void getCustomerName()
	{
		System.out.println("Please enter your name");
		newCustomer = new Customer(scanner.nextLine());
	}

}
