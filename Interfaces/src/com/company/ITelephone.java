/**
 * Title: ITelephone Interface
 * Author: Tyler Knight
 * Date: 8/18/2019
 *
 * Description: Interfaces are used as a way to implement functionality
 * - without having to define the behavior in every class manually
 *
 * Example: Every phone would need defined behavior for
 * - power on
 * - dial
 * - answer
 * - call
 * - ring
 *
 * For different phone class, the behaviors may be different, but we would
 * still need the functions.
 *
 * Interface functions are overridden when used with a class
 *
 * When you implement an interface, all classes must be defined even
 * if they aren't used
 **/

package com.company;

public interface ITelephone
{
	void powerOn();
	void dial(int phoneNumber);
	void answer();
	boolean callPhone(int phoneNumber);
	boolean isRinging();
}
