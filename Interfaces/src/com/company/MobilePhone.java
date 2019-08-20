/*******************************************************************************
 * Author: Tyler Knight
 * Date: 
 *
 * Description:
 ******************************************************************************/

package com.company;

public class MobilePhone implements ITelephone
{

	private int myNumber;
	private boolean isRinging;
	private boolean isOn = false;


	public MobilePhone(int myNumber)
	{
		this.myNumber = myNumber;
	}

	@Override
	public void powerOn()
	{
		isOn = true;
		System.out.println("Mobile phone powered up");
	}

	@Override
	public void dial(int phoneNumber)
	{
		if (isOn)
		{
			System.out.println("Now ringing " + phoneNumber + " on mobile " +
					"phone");
		}
		else
		{
			System.out.println("Phone is off, can't dial");
		}
	}

	@Override
	public void answer()
	{
		if (isRinging)
		{
			System.out.println("Answering the mobile phone");
			isRinging = false;
		}
		else
		{
			System.out.println("Cannot answer if phone is not ringing");
		}
	}

	@Override
	public boolean callPhone(int phoneNumber)
	{
		if ((phoneNumber == myNumber) && (isOn))
		{
			isRinging = true;
			System.out.println("Playing some dope ringtone");
		}
		else
		{
			isRinging = false;
			System.out.println("Mobile phone is not on or number is different");
		}

		return isRinging;
	}

	@Override
	public boolean isRinging()
	{
		return isRinging;
	}
}
