/*******************************************************************************
 * Title: Keypad
 * Author: Some Dude
 * Date: 7/14/2019
 *
 *
 * Description:
 * ! Interface for a 9 digit keypad
 ******************************************************************************/


package com.company;

import java.util.Scanner;

public class Keypad
{

	private Scanner keypadReader = new Scanner(System.in);

	/* Control buttons */
	private final char SUBMIT_BUTTON = '#';
	private final char DELETE_BUTTON = '-';

	/* User defined button ranges */
	private final char minNumberInput = '0';
	private final char maxNumberInput = '9';


	/***************************************************************************
	 *! Gets input from user until the button pressed was a valid button
	 *  on the keypad (Valid buttons are defined up top)
	 **************************************************************************/
	char getKeypadEntry()
	{
		char keypadEntry = '0';
		boolean inputIsValid = false;

		while (!inputIsValid)
		{
			System.out.println("Enter a keypad option: ");
			keypadEntry = keypadReader.next().charAt(0);
			inputIsValid = validateKeypadEntry(keypadEntry);
		}

		return keypadEntry;
	}


	/***************************************************************************
	 *! Checks user input to make sure it's valid
	 **************************************************************************/
	private boolean validateKeypadEntry(char keypadInput)
	{
		if ((keypadInput >= minNumberInput) && (keypadInput <= maxNumberInput))
			return true;
		else
			return (keypadInput == SUBMIT_BUTTON) || (keypadInput == DELETE_BUTTON);
	}


	/* Checks to see if the '#' button was pressed */
	public boolean orderCompleteBtnPressed(int input)
	{
		return input == SUBMIT_BUTTON;
	}


	/* Checks to see if the '-' button was pressed */
	public boolean deleteBtnPressed(int input)
	{
		return input == DELETE_BUTTON;
	}


}
