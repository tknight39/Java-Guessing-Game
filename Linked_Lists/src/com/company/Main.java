/*
* Linked Lists: Holds the link to the next item, as well as the item value
*/


package com.company;

import java.util.ArrayList;

public class Main
{

	public static void main(String[] args)
	{
		Customer customer = new Customer("tyler", 32.15);
		Customer anotherCustomer;

		anotherCustomer = customer;
		anotherCustomer.setBalance(12.18);

		System.out.println("Balance for customer " + customer.getName() + " " +
				"is $" + customer.getBalance());

		ArrayList<Integer> intList = new ArrayList<Integer>();

		intList.add(1);
		intList.add(3);
		intList.add(4);

		for (int i = 0; i < intList.size(); i++)
			System.out.println(i + ": " + intList.get(i));

		intList.add(1,2);
		System.out.println();

		for (int i = 0; i < intList.size(); i++)
			System.out.println(i + ": " + intList.get(i));


	}

}
