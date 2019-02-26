/**
 * Shivam Sadachar
 * Class Id: 536
 * Assignment 2
 *
 * This file represents a Calculator object, which incorporates many of the basic
 *  calculator functions (add, subtract, multiply, divide), etc.
 * 
 */

package cse360assign2;

/**
 * The Calculator object encapsulates the data and operations associated 
 * with basic calculator functions, as well as methods to
 * return calculator total data and history of operations
 */

public class Calculator {

	/**
	 * An integer to hold the running total
	 */
	private int total;
	
	/**
	 * A string to displays the history of values in the total 
	 * and the operations applied on those values 
	 */
	private String history;
	
	/** 
	 * Class constructor
	 */
	public Calculator () {
		total = 0;  
		history = "0 ";
	}
	
	/**
	 * Returns current total
	 *
	 *@return	the total amount
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Accumulates the parameter (integer) into the total	
	 * and updates the history of operations
	 * 
	 * @param	value  the integer to be added 
	 */
	public void add (int value) {
		total += value;
		history += "+ " + value + " ";
	}
	
	/**
	 * Subtracts the parameter (integer) from the total	
	 * and updates the history of operations
	 * 
	 * @param	value the integer used for subtracting 
	 */
	public void subtract (int value) {
		total -= value;
		history += "- " + value + " ";
	}
	
	/**
	 * Multiplies the total by the parameter (integer)
	 * and updates the history of operations
	 * 
	 * @param	value the integer used for multiplying 
	 */
	public void multiply (int value) {
		total *= value;
		history += "* " + value + " ";
	}
	
	/**
	 * Divides the total by the parameter (integer)	
	 * and updates the history of operations
	 * 
	 * @param	value the integer used for divide 
	 */
	public void divide (int value) {
		if (value == 0)	// if trying to divide by zero, set total to zero
			total = 0;
		else 
			total /= value;
		
		history += "/ " + value + " ";
	}
	
	/**
	 * Returns a running list of previously applied operations
	 * which got the total to its current state 	
	 * 
	 * @return	the string containing the list of operations  
	 */
	public String getHistory () {
		return history;
	}
}