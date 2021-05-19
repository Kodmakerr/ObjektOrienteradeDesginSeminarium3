package se.kth.iv1350.View;

import se.kth.iv1350.Controller.Controller;
import se.kth.iv1350.DTO.ItemDTO;
import se.kth.iv1350.DTO.ReceiptDTO;
import se.kth.iv1350.DTO.SaleDTO;

public class View {

	/**
	 * View represent the user interface and execute the code.
	 * 
	 * @return the view.  
	 */
	
	public View()
	{
		int itemIdentifier = 1;
		int quantity = 1;
		int amountPaid = 20;
		
		Controller controllers = new Controller();
		
		controllers.beginSale();
			
		ItemDTO itemDTO = controllers.scanItem(quantity, itemIdentifier);
		
		SaleDTO saleDTO = controllers.endSale();

		ReceiptDTO receiptDTO = controllers.getReceipt(amountPaid);
	
		
		controllers.getReceipt(20);
		
		System.out.println("Sale start");
		System.out.println("Scanning Item " + ": " + quantity);
		System.out.println("Item price " + ": " + itemDTO.getprice());
		System.out.println("Item Vat " + ": " +  itemDTO.getvat());
		System.out.println("Item Description " + ": " + itemDTO.getdescription());	
		System.out.println("End of the sale ");
		System.out.println("Getting sale data");
		System.out.println("Running total " + ": " + saleDTO.gettotalPrice());
		System.out.println("Total VAT " + ": " + saleDTO.getvat());
		System.out.println("Ending sale" );
		System.out.println("Paid amount " + ": " + receiptDTO.getamountPaid());
		System.out.println("Change to return" + ": " + receiptDTO.getChange());
		
	}	
}
