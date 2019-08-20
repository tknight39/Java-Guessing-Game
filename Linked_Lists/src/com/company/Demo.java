/*******************************************************************************
 * Author: Tyler Knight
 * Date: 
 *
 * Description:
 ******************************************************************************/

package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo
{
	public static void main(String[] args)
	{
		LinkedList<String> placesToVisit = new LinkedList<String>();

		addInOrder(placesToVisit, "Nashville");
		addInOrder(placesToVisit, "Memphis");
		addInOrder(placesToVisit, "Gatlinburg");
		addInOrder(placesToVisit, "Pigeon Forge");
		addInOrder(placesToVisit, "Knoxville");
		addInOrder(placesToVisit, "Chattanooga");

		printList(placesToVisit);
		addInOrder(placesToVisit, "Alice Springs");
		addInOrder(placesToVisit, "Nashville");
		printList(placesToVisit);

	}

	private static void printList(LinkedList<String> linkedList)
	{
		Iterator<String> i = linkedList.iterator();

		while (i.hasNext())
		{
			System.out.println("Now visiting " + i.next());
		}

		System.out.println("==========================");
	}

	private static boolean addInOrder(LinkedList<String> linkedList,
									  String newCity)
	{
		// is not pointing at anything yet, must use .next to make it right
		ListIterator<String> stringListIterator = linkedList.listIterator();

		while(stringListIterator.hasNext())
		{
			int comparison = stringListIterator.next().compareTo(newCity);

			if (comparison == 0)
			{
				// Equal, do not add
				System.out.println(newCity + " is already in list");
				return false;
			}
			else if (comparison > 0)
			{
				// New city alphabet comes before Current node
				// So add new city before current node
				// Go back to previous node, add new city
				stringListIterator.previous();
				stringListIterator.add(newCity);
				return true;
			}
			else if (comparison < 0)
			{
				// New city alphabet doesn't come before current node
				// Move on to next city
			}
		}
		// Now were at the end of the list, so go ahead and add new city to end
		stringListIterator.add(newCity);

		return true;
	}

}
