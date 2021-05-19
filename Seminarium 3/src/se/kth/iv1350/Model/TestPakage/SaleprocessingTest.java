package se.kth.iv1350.Model.TestPakage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import se.kth.iv1350.DTO.ItemDTO;
import se.kth.iv1350.DTO.ReceiptDTO;
import se.kth.iv1350.DTO.SaleDTO;
import se.kth.iv1350.Model.Saleprocessing;



class SaleprocessingTest 
{

	@Test
	void testScanItem () 
	{
	Saleprocessing saleProcessing = new Saleprocessing();
	
	int scanItemQuantity = 1;
	int scanItemPrice = 20;
	int scanItemVAT = 5;
	String scanItemDescription = "Test item";
	
	ItemDTO itemToBeScanned = new ItemDTO(scanItemPrice, scanItemVAT, scanItemDescription);
	
	saleProcessing.scanItem(itemToBeScanned, scanItemQuantity);
	
	
	SaleDTO saleData = saleProcessing.getSaleDTO();
	
	int expectedPrice = itemToBeScanned.getprice() * scanItemQuantity;
	int resultPrice = saleData.gettotalPrice();
	
	int expectedVAT= itemToBeScanned.getvat() * scanItemQuantity;
	int resultVAT = saleData.getvat();
	
	assertEquals(expectedPrice, resultPrice, "Expected price and resulting price are not equal");
	assertEquals(expectedVAT, resultVAT, "Expected VAT and resulting VAT are not equal");

	}
	
	@Test
	void testgetReceipt () 
	{
		Saleprocessing saleProcessing = new Saleprocessing();
		
		int amountPaid = 25;
		
		saleProcessing.getReceipt(amountPaid);
		
		ReceiptDTO saleData = saleProcessing.getReceipt(amountPaid);
		
		int expectedamoundPaid = amountPaid;
		int resultamoundPaid = saleData.getamountPaid();
		
		assertEquals(expectedamoundPaid, resultamoundPaid, "Expected amount paid and resulting amount paid are not equal");
		
	}
		
}
