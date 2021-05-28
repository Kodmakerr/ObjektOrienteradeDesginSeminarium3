package se.kth.iv1350.integration.TestPakage;

import static org.junit.Assert.fail;

import org.junit.jupiter.api.Test;

import se.kth.iv1350.integration.Inventory;
import se.kth.iv1350.integration.databasefailureexception;

class databasefailureexceptionTest {
	
	@Test
	void databasefailureTest() {
		
		
		int itemtIdentifier = 10;
		
		try 
		{
			Inventory inventory = new Inventory();
			inventory.getItemDTO (itemtIdentifier);
			fail("The inventory DatabaseNotFoundException for itemtIdentifier");
		}
		catch(databasefailureexception e)
		{}
		
		catch(Exception e) 
		{
			fail("The inventory threw a incorrect exception");
		}
			
	}

}
