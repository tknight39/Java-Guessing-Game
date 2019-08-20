/*******************************************************************************
 * Title: Fast Food Simulator
 * Author: Some Dude
 * Date: 7/14/2019
 * Purpose: Class for a customer, will hold name, and maybe a member id later
 ******************************************************************************/

package com.company;


public class Customer
{
	private String customerName;


	Customer(String name)
	{
		this.customerName = name;
	}


	public String getCustomerName()
	{
		return customerName;
	}

}
