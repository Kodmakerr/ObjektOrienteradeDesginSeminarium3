package se.kth.iv1350.integration;

public class Itemnotexistexception extends Exception {
	
	/**
	 *This exception throws when the item does not exist in the inventory. 
	 * 
	 * Author:
	 * Keshav Tiwari
	 * 
	 */
	
	public Itemnotexistexception (String message)
	{
	
	super(message);
	
	}

}
