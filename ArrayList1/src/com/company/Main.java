package com.company;

import java.util.Scanner;

public class Main
{
	private static Scanner scanner = new Scanner(System.in);
	private static GroceryList groceryList = new GroceryList();

	public static void main(String[] args)
	{

		boolean quit = false;
		int choice = 0;

		while (!quit)
		{
			System.out.println("Enter your choice");
			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice)
			{
				case 0:
					printInstructions();
					break;
				case 1:
					groceryList.printGroceryList();
					break;
				case 2:
					addItem();
					break;
				case 3:
					modifyItem();
					break;
				case 4:
					removeItem();
					break;
				case 5:
					searchForItem();
					break;
				case 6:
					quit = true;
					break;
			}

		}
	}

	private static void printInstructions()
	{
		System.out.println("Some instructions");
	}

	private static void addItem()
	{
		System.out.println("Please enter the grocery item");
		groceryList.addGroceryItem(scanner.nextLine());
	}

	private static void removeItem()
	{
		String item;

		System.out.println("Please enter an item to delete");
		item = scanner.nextLine();
		groceryList.removeGroceryItem(item);
	}

	private static void modifyItem()
	{
		String oldItem;
		String newItem;

		System.out.println("Enter item to replace");
		oldItem = scanner.nextLine();

		System.out.println("Enter replacement item");
		newItem = scanner.nextLine();
		groceryList.modifyGroceryItem(oldItem, newItem);
	}

	private static void searchForItem()
	{
		String searchItem;

		System.out.println("Enter an item to search for");
		searchItem = scanner.nextLine();

		if (groceryList.onFile(searchItem))
			System.out.println("found " + searchItem);
		else
			System.out.println("Not on file");
	}

}
