package com.company;

import java.rmi.MarshalledObject;

public class Main
{

	public static void main(String[] args)
	{
	    // Define Tyler's Phone to be an ITelephone
		//ITelephone tylersPhone;
		// Now make tylersPhone a desk phone
		//tylersPhone = new DeskPhone(12345);

        // this is also valid
        DeskPhone tylersPhone = new DeskPhone(12345);
		MobilePhone tylersCell = new MobilePhone(12345);

		tylersPhone.powerOn();
		tylersPhone.callPhone(12345);
		tylersPhone.answer();

		tylersCell.powerOn();
		tylersCell.callPhone(54321);
		tylersCell.answer();

	}

}
