package se.kth.iv1350.Controller;

import se.kth.iv1350.DTO.ItemDTO;
import se.kth.iv1350.DTO.ReceiptDTO;
import se.kth.iv1350.DTO.SaleDTO;
import se.kth.iv1350.Integration.ExternalAccountingSystem;
import se.kth.iv1350.Integration.Inventory;
import se.kth.iv1350.Model.Saleprocessing;

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
	 */
	
	public ItemDTO scanItem(int quantity, int itemIdentifier) 
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
	
	
	

	}


