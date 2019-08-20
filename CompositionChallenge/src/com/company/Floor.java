/*******************************************************************************
 * Author: Tyler Knight
 * Date: 
 *
 * Description:
 ******************************************************************************/

package com.company;

public class Floor
{
	private Dimensions dimensions;
	private String color;
	private String type;

	public Floor(Dimensions dimensions, String color, String type)
	{
		this.dimensions = dimensions;
		this.color = color;
		this.type = type;
	}

	public Dimensions getDimensions()
	{
		return dimensions;
	}

	public String getColor()
	{
		return color;
	}

	public String getType()
	{
		return type;
	}
}
