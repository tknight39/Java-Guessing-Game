/*******************************************************************************
 * Author: Tyler Knight
 * Date: 
 *
 * Description:
 ******************************************************************************/

package com.company;

public class Lamp
{
	private boolean lampIsOn;
	private String status;

	public Lamp()
	{
		lampIsOn = false;
		status = "OFF";
	}

	void getStatus()
	{
		System.out.println("The lamp is " + status);
	}

	private void setStatus()
	{
		if (lampIsOn)
			status = "ON";
		else
			status = "OFF";
	}

	void flipLampSwitch()
	{
		if (lampIsOn)
			turnOff();
		else
			turnOn();
	}

	void turnOff()
	{
		if (lampIsOn)
		{
			lampIsOn = false;
			setStatus();
			System.out.println("The lamp turns off");
		}
	}

	void turnOn()
	{
		if (!lampIsOn)
		{
			lampIsOn = true;
			setStatus();
			System.out.println("The lamp turns on");
		}
	}
}
