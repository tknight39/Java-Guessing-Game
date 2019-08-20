/*******************************************************************************
 * Author: Tyler Knight
 * Date: 
 *
 * Description:
 ******************************************************************************/

package com.company;

public class Window
{
	private Dimensions dimensions;

	public Window(Dimensions dimensions)
	{
		this.dimensions = dimensions;
	}

	public void openWindow()
	{
		System.out.println("The window is open");
	}

	public void closeWindow()
	{
		System.out.println("The window is closed");
	}

	public Dimensions getDimensions()
	{
		return dimensions;
	}
}
