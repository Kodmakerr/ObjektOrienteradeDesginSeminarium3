package se.kth.iv1350.integration.TestPakage;

import static org.junit.Assert.fail;

import org.junit.jupiter.api.Test;

import se.kth.iv1350.integration.Inventory;
import se.kth.iv1350.integration.Itemnotexistexception;

class ItemnotexistexceptionTest {

	@Test
	void ItemnotexistTest() {
		
		
		int itemtIdentifier = 1;
		
		try 
		{
			Inventory inventory = new Inventory();
			inventory.getItemDTO (itemtIdentifier);
			fail("The item was found");
		}
		catch(Itemnotexistexception e)
		{}
		
		catch(Exception e) 
		{
			fail("The inventory threw a incorrect exception");
		}
			
	}

}
