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
 * with basic calculator functions, as well as methods
 * return calculator data
 */

public class Calculator {

	/**
	 * An integer to hold the running total
	 */
	private int total;
	
	/** 
	 * Class constructor
	 */
	public Calculator () {
		total = 0;  
	}
	
	/**
	 * Returns current total
	 *
	 *@return	the total amount
	 */
	public int getTotal () {
		return 0;
	}
	
	/**
	 * Accumulates the parameter (integer) into the total	
	 * 
	 * @param	value  the integer to be added 
	 */
	public void add (int value) {
		
	}
	
	/**
	 * Subtracts the parameter (integer) from the total	
	 * 
	 * @param	value the integer used for subtracting 
	 */
	public void subtract (int value) {
		
	}
	
	/**
	 * Multiplies the total by the parameter (integer)	
	 * 
	 * @param	value the integer used for multiplying 
	 */
	public void multiply (int value) {
		
	}
	
	/**
	 * Divides the total by the parameter (integer)	
	 * 
	 * @param	value the integer used for divide 
	 */
	public void divide (int value) {
		
	}
	
	/**
	 * Returns a running list of previously applied operations
	 * to get the total to its current state 	
	 * 
	 * @return	the string containing the list of operations  
	 */
	public String getHistory () {
		return "";
	}
}