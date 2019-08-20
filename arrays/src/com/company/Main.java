package com.company;

import java.util.Scanner;

public class Main
{
	private static Scanner scanner = new Scanner(System.in);

	/**************************************************************************/
	public static void main(String[] args)
	{
		int[] myIntegers = getIntegers(5);

		for (int i = 0; i < myIntegers.length; i++)
			System.out.println("Index " + i + ": " + myIntegers[i]);

		System.out.println("Average of array is: " + getAverage(myIntegers));
	}
    /**************************************************************************/

	/* Gets values for an integer array based on the numbers parameter */
	static int[] getIntegers(int numbers)
	{
		int[] values = new int[numbers];

		System.out.println("Enter " + numbers + " integer values\r");

		for (int i = 0; i < values.length; i++)
			values[i] = scanner.nextInt();

		return values;
	}

	/* Returns the average of integer array values */
	public static double getAverage(int[] array)
	{
		int sum = 0;

		for (int i=0;i<array.length;i++)
			sum += array[i];

		return ((double) sum / (double) array.length);
	}

	/* Examples of integer arrays */
	static void intArrays()
	{
		/* A blank array */
		//int[] intArray = new int [10];

		/* An initialized array */
		//int[] intArray = {1,2,3,4,5,6,7,8,9,10};

		int[] intArray = new int[25];

		/* Initialize int array with loop */
		for (int i = 0; i < intArray.length; i++)
			intArray[i] = i * 10;

		/* Print contents of int array */
		for (int i = 0; i < intArray.length; i++)
			System.out.println("Element " + i + " value is " + intArray[i]);
	}
}
