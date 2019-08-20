package com.company;

public class Main
{

	public static void main(String[] args)
	{
		/* You cannot access an inner class without first
		*  Creating an instance of the parent class */

		/* Creating a new gearbox */
		GearBox mcLaren = new GearBox(6);


		/* Change to 1st gear */
		mcLaren.operateClutch(true);
		mcLaren.changeGear(1);
		mcLaren.operateClutch(false);

		/* Print speed */
		System.out.println(mcLaren.wheelSpeed(1000));

		/* Change to 2nd without using the clutch (Will Fail) */
		mcLaren.changeGear(2);
		System.out.println(mcLaren.wheelSpeed(3000));

		/* Change to 3rd gear */
		mcLaren.operateClutch(true);
		mcLaren.changeGear(3);
		mcLaren.operateClutch(false);

		/* Print speed */
		System.out.println(mcLaren.wheelSpeed(6000));
	}

}
