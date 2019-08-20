/*******************************************************************************
 * Problems with this class is that everything is public
 * 1) Fields can be accessed from anywhere
 * 2) You may forget to initialize the fields
 ******************************************************************************/

package com.company;

public class Player
{
	public String name;
	public int health;
	public String weapon;

	public void loseHealth(int damage)
	{
		this.health = this.health - damage;

		if (this.health <= 0)
		{
			System.out.println("Player knocked out");
			// Reduce health
		}
	}

	public int healthRemaining()
	{
		return this.health;
	}

}
