package se.kth.iv1350.Controller;

import se.kth.iv1350.DTO.ItemDTO;
import se.kth.iv1350.DTO.ReceiptDTO;
import se.kth.iv1350.DTO.SaleDTO;
import se.kth.iv1350.Model.Observer;
import se.kth.iv1350.Model.Saleprocessing;
import se.kth.iv1350.integration.ExternalAccountingSystem;
import se.kth.iv1350.integration.Inventory;
import se.kth.iv1350.integration.Itemnotexistexception;
import se.kth.iv1350.integration.Printer;
import se.kth.iv1350.integration.databasefailureexception;

public class Controller {
	
	private Saleprocessing saleproccessing;
	private Inventory inventory;
	private ExternalAccountingSystem externalaccounting;
	
	/**
	 * Controller creates the object for ExternalAccountingSystem and Inventory.
	 * 
	 * @return controller returns the object that was created.  
	 */
	
	public Controller() 
		{	    
		externalaccounting = new ExternalAccountingSystem();
		inventory = new Inventory();
		}
	
	/**
	 * scanItem gets the information about item identifier and how many items the is. 
	 * 
	 * @param itemIdentifier identifies what type of item it's.
	 * 
	 * @param quantity shows how many item is in the sale.
	 * 
	 * @return itemDTO returns the information about what type of item it's and how many item.
	 * @throws databasefailureexception 
	 * @throws Itemnotexistexception 
	 */
	
	public ItemDTO scanItem(int quantity, int itemIdentifier) throws Itemnotexistexception, databasefailureexception 
	{
		
		ItemDTO itemDTO = inventory.getItemDTO(itemIdentifier);
		saleproccessing.scanItem(itemDTO, quantity);
		
		return itemDTO;
	}
	
	/**
	 * beginSale creates the object of sale processing. 
	 */
	
	public void beginSale() {
		
	  saleproccessing = new Saleprocessing(); 
	}
	
	/**
	 * Gets information about the current sale.
	 * 
	 * @return The information about the sale
	 * 
	 */
	public SaleDTO getSaleDTO() {
		return saleproccessing.getSaleDTO();
	}
	
	/**
	 * endsale gives the information about the saleDTO. 
	 * 
	 * @return SaleDTO gives the totalPrice and vat. 
	 */
	
	public SaleDTO endSale() {
		
		return saleproccessing.endSale();
	}
	
	/**
	 * getReceipt gives the receipt information of the sale.
	 * 
	 * @param amountpaid represent what amount was paid for the sale.
	 * 
	 * @return receiptDTO returns all the information about the sale and items. 
	 */
	
	public ReceiptDTO getReceipt(int amountPaid) 
	{
		SaleDTO saleDTO = saleproccessing.getSaleDTO();
		inventory.logSale(saleDTO);
		externalaccounting.logSale(saleDTO);
		ReceiptDTO receiptDTO = saleproccessing.getReceipt(amountPaid);
		
		return receiptDTO;
		
	}
	

	/**
	 * Adds a observer to saleProcessing.
	 *  
	 * @param observer The observer to be added
	 * 
	 */
	public void addObserver(Observer observer) {
		saleproccessing.addObserver(observer);
	}
	

	
}


