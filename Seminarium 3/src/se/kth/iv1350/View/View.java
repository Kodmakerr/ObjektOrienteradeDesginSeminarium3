package se.kth.iv1350.View;

import se.kth.iv1350.Controller.Controller;
import se.kth.iv1350.DTO.ItemDTO;
import se.kth.iv1350.DTO.ReceiptDTO;
import se.kth.iv1350.DTO.SaleDTO;
import se.kth.iv1350.integration.Itemnotexistexception;
import se.kth.iv1350.integration.databasefailureexception;

public class View {

	private Controller controller;
	
	/**
	 * View represent the user interface and execute the code.
	 * 
	 * @return the view.  
	 * @throws databasefailureexception 
	 * @throws Itemnotexistexception 
	 */
	public View() throws Itemnotexistexception, databasefailureexception
	{
		int amountPaid = 23;
		
		Controller controllers = new Controller();
		
		this.controller = controllers;
		
		System.out.println("Sale start");
		controllers.beginSale();
		controllers.addObserver(new TotalRevenueView());
		controllers.addObserver(new TotalRevenueFileOutput());
		
		scanItem(1,1);
		
		System.out.println("Getting sale data");
		SaleDTO saleDTO = controllers.getSaleDTO();
		System.out.println("Running total " + ": " + saleDTO.gettotalPrice());
		System.out.println("Total VAT " + ": " + saleDTO.getvat());

		ReceiptDTO receiptDTO = controllers.getReceipt(amountPaid);
		
		controllers.getReceipt(20);
		
		System.out.println("Ending sale" );
		System.out.println("Paid amount " + ": " + receiptDTO.getamountPaid());
		System.out.println("Change to return" + ": " + receiptDTO.getChange());
		System.out.println("End of the sale ");
		
		controllers.endSale();
		
	}	
	
	private void scanItem(int itemIdentifier, int quantity) {
		
		System.out.println("Scanning item " + itemIdentifier +" quantity " + quantity);
		
		try {
			ItemDTO itemDTO = controller.scanItem(itemIdentifier, quantity);
			System.out.println("Item price :" + itemDTO.getprice());
			System.out.println("Item VAT :" + itemDTO.getvat());
			System.out.println("Item Description :" + itemDTO.getdescription());
		}
		catch(Itemnotexistexception e) 
		{
			System.out.println("No item with identifier " + itemIdentifier + " could be found");
			System.out.println("To log: " + e);
		}
		catch(databasefailureexception e) 
		{
			System.out.println("The server could not be reached");
			System.out.println("To log: " + e);
		}
		
		
	}
}
