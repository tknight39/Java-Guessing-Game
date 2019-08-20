/*******************************************************************************
 * Author: Tyler Knight
 * Date: 
 *
 * Description:
 ******************************************************************************/

package com.company;

import java.util.ArrayList;

/**
 * The type Gear box.
 */
public class GearBox
{
	private ArrayList<Gear> gears;
	private int maxGears;
	private int currentGear = 0;
	private boolean clutchIsIn;

	/**
	 * Instantiates a new Gear box.
	 *
	 * @param maxGears the max gears
	 */
	public GearBox(int maxGears)
	{
		this.gears = new ArrayList<Gear>();
		this.maxGears = maxGears;

		Gear neutral = new Gear(0,0.0);
		this.gears.add(neutral);

		for (int i=0;i<maxGears;i++)
			addGear(i, i * 5.3);
	}


	public void operateClutch(boolean in)
	{
		this.clutchIsIn = in;
	}


	/* Makes sure the gearNumber is valid,
	*  then creates an instance of the inner class
	*  (Gear), and adds a new gear number and ratio */
	public void addGear(int gearNumber, double ratio)
	{
		if ((gearNumber>0) && (gearNumber<=maxGears))
		{
			this.gears.add(new Gear(gearNumber, ratio));
		}
	}

	/* Makes sure the newGear param is valid,
	*  then it changes the currentGear value to the new gear */
	public void changeGear(int newGear)
	{
		if ((newGear >= 0) && (newGear < this.gears.size()) && this.clutchIsIn)
		{
			this.currentGear = newGear;
			System.out.println("Gear " + newGear + " selected");
		}
		else
		{
			System.out.println("Grind!");
			this.currentGear = 0;
		}
	}



	public double wheelSpeed(int revs)
	{
		if (clutchIsIn)
		{
			System.out.println("Scream!");
			return 0.0;
		}
		return revs * gears.get(currentGear).getRatio();
	}



	/* Added a Gear inner class because a gear object would most likely
	*  only be used inside a gearbox */
	private class Gear
	{
		private int gearNumber;
		private double ratio;

		/**
		 * Instantiates a new Gear.
		 *
		 * @param gearNumber the gear number
		 * @param ratio      the ratio
		 */
		public Gear(int gearNumber, double ratio)
		{
			/* Refers to the gearNumber in *this class* */
			this.gearNumber = gearNumber;
			this.ratio = ratio;
		}

		/**
		 * Drive speed double.
		 *
		 * @param revs the revs
		 * @return the double
		 */
		public double driveSpeed(int revs)
		{
			return (revs * this.ratio);
		}

		/**
		 * Gets ratio.
		 *
		 * @return the ratio
		 */
		public double getRatio()
		{
			return ratio;
		}
	}

}
