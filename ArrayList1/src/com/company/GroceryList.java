/*******************************************************************************
 * Author: Tyler Knight
 * Date: 
 *
 * Description:
 ******************************************************************************/

package com.company;

import java.util.ArrayList;

public class GroceryList
{
	private ArrayList<String> groceryList = new ArrayList<String>();


	public void addGroceryItem(String item)
	{
		groceryList.add(item);
	}


	public void removeGroceryItem(String item)
	{
		int position = findItem(item);

		if (position >= 0)
			removeGroceryItem(position);
	}

	private void removeGroceryItem(int position)
	{
		groceryList.remove(position);
	}

	public void printGroceryList()
	{
		System.out.println("You have " + groceryList.size() + " Items in your " +
				"grocery list");

		for (int i = 0; i < groceryList.size(); i++)
			System.out.println((i + 1) + ". " + groceryList.get(i));
	}


	private void modifyGroceryItem(int position, String newItem)
	{
		groceryList.set(position, newItem);
		System.out.println("Grocery item " + (position + 1) + " has been " +
				"modified");
	}


	public void modifyGroceryItem(String oldItem ,String newItem)
	{
		int position = findItem(newItem);

		if (position >= 0)
			modifyGroceryItem(position, newItem);
	}


	public ArrayList<String> getGroceryList()
	{
		return groceryList;
	}


	public boolean onFile(String searchItem)
	{
		return ((findItem(searchItem)) >= 0);
	}

	private int findItem(String searchItem)
	{
		return groceryList.indexOf(searchItem);
	}
}
