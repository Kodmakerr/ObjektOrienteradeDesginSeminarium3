package se.kth.iv1350.DTO.TestPakage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import se.kth.iv1350.DTO.ItemDTO;


class ItemDTOTest {

	@Test
	void testitemDTO () 
	{
		
	int itemDTOprice = 20;
	int itemDTOvat = 5;
	String itemDTODescription = "Test item";
	
	ItemDTO itemToGet = new ItemDTO(itemDTOprice, itemDTOvat, itemDTODescription);
	
	int expectedPrice = itemDTOprice;
	int resultPrice = itemToGet.getprice();
	
	int expectedVAT= itemDTOvat;
	int resultVAT = itemToGet.getvat();
	
	String expectedDescription = itemDTODescription;
	String resultDescription = itemToGet.getdescription();
	
	assertEquals(expectedPrice, resultPrice, "Expected price and resulting price are not equal");
	assertEquals(expectedVAT, resultVAT, "Expected VAT and resulting VAT are not equal");
	assertEquals(expectedDescription, resultDescription, "Expected Description and resulting Description are not equal");

	}
	
}
