
package com.company;

public class Main
{

	public static void main(String[] args)
	{
		/* Bad class with public fields */
		/*Player player = new Player();
		player.name = "Tyler";
		player.health = 20;
		player.weapon = "Sword";

		int damage = 10;
		player.loseHealth(damage);
        System.out.println("Remaining health: " + player.healthRemaining());

        damage = 11;
        player.health = 200;
		player.loseHealth(damage);
		System.out.println("Remaining health: " + player.healthRemaining());*/

		/* Better class with private fields */
		EnhancedPlayer player = new EnhancedPlayer("Tyler", 50, "Sword");
		System.out.println("Starting health: " + player.getHitPoints());
	}

}
