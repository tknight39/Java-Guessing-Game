/*******************************************************************************
 * Title: Order
 * Author: Some Dude
 * Date: 7/14/2019
 * Purpose: Handles everything that has to do with the order
 *
 * Description: Handles everything that has to do with the order such as ->
 *! Adding/deleting order items
 *! Accepting payment for the order
 *! Keeping track of subtotal(no tax), and grandTotal(After tax)
 *! Keeping track of items in the order
 ******************************************************************************/

package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Order
{
	/* Scanner used for keypad input */
	private Scanner scanner = new Scanner(System.in);

	private final double STATE_TAX = 0.10;

	/* Order total before/after tax */
	private double subTotal;
	private double grandTotal;

	/* Counter for items ordered and list to hold item names*/
	private int itemCount;
	private ArrayList<String> orderItems;


	public Order()
	{
		this.itemCount = 0;
		this.subTotal = 0.00;
		this.grandTotal = 0.00;
		this.orderItems = new ArrayList<>();
	}


	/***************************************************************************
	 *! Add and item to the order, increment itemCount, increase price
	 **************************************************************************/
	void addItem(String itemName, double itemPrice)
	{
		if ((!itemName.equals("")) && (itemPrice > 0.00))
		{
			this.orderItems.add(itemName);
			this.itemCount++;
			this.subTotal += itemPrice;
			System.out.println(itemName + " Added to your order");
			updateGrandTotal();
		}
	}


	/***************************************************************************
	 *! If item has actually been ordered, delete it, else, show err message
	 **************************************************************************/
	void removeItem(String itemName, double itemPrice)
	{
		if (this.orderItems.contains(itemName))
		{
			this.orderItems.remove(itemName);
			this.itemCount -= 1;
			this.subTotal -= itemPrice;
			System.out.println(itemName + " Deleted from your order");
			updateGrandTotal();
		}
		else
			System.out.println(itemName + " is not in your order");
	}



	double getGrandTotal()
	{
		return this.grandTotal;
	}

	public double getSubTotal()
	{
		return this.subTotal;
	}

	public int getItemCount()
	{
		return itemCount;
	}


	private void setSubTotal(double amount)
	{
		this.subTotal = amount;
	}


	/* Adds the tax rate to the order */
	private void updateGrandTotal()
	{
		this.grandTotal =
				this.subTotal + (this.subTotal * this.STATE_TAX);
	}


	/* Checks to see if item is in orderItems list */
	private boolean findOrderItem(String itemName)
	{
		return this.orderItems.contains(itemName);
	}


	/* Displays the order details to the user */
	public void displayOrder(String customerName)
	{
		System.out.println(
				"************************************************************");
		System.out.printf("%s's order details:\n", customerName);
		System.out.printf("Items ordered: %d\n", itemCount);
		System.out.println(Arrays.toString(this.orderItems.toArray()));
		System.out.printf("Price before tax: $%.2f\n", subTotal);
		System.out.printf("Grand total: $%.2f\n", grandTotal);
		System.out.println(
				"************************************************************");
	}


	/* While order is not paid for, get money from customer */
	public void payForOrder()
	{
		double cashRecieved = 0.00;

		while (grandTotal != 0.00)
		{
			/* Round grandTotal to 2nd decimal place */
			grandTotal = round2Decimals(grandTotal);

			System.out.printf("Your total is $%.2f\n", grandTotal);
			System.out.println("Enter your payment amount");

			cashRecieved = scanner.nextDouble();

			if (cashRecieved > 0)
				grandTotal -= cashRecieved;

			if (grandTotal < 0.00)
				calculateChange();
		}
	}


	/* Calculates the change due (Only used when grandTotal is < 0.00) */
	private void calculateChange()
	{
		double changeDue = 0.00;

		changeDue = (0.00 - grandTotal);
		grandTotal = 0.00;

		changeDue = round2Decimals(changeDue);

		System.out.println("Your change is " + changeDue);
	}


	/* Returns a double rounded to the 2nd value (2.222 = 2.22) */
	private double round2Decimals(double num)
	{
		return (double) Math.round(num * 100) / 100;
	}

}
