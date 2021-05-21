package se.kth.iv1350.integration;

import java.util.ArrayList;
import java.util.HashMap;

import se.kth.iv1350.DTO.ItemDTO;
import se.kth.iv1350.DTO.SaleDTO;


public class Inventory {
	
	private ArrayList<SaleDTO> sale = new ArrayList<SaleDTO>();
	
	HashMap<Integer, ItemDTO> items = new HashMap<Integer, ItemDTO>();
	
	
	public Inventory() 
	{
		int itemtIdentifier = 1;
		int price = 20;
		int vat = 5;
		String description = "Milk";
		
		ItemDTO  itemDTO = new ItemDTO(price, vat, description);
		
		items.put(itemtIdentifier, itemDTO);
	}
	
	/**
	 * Gets a item given its identifier
	 * 
	 * @param itemIdentifier The identifier of the item
	 * 
	 * @return A item matching the identifier
	 */
	
	public ItemDTO getItemDTO(int itemIdentifier) 
	{	
		return items.get(itemIdentifier);
	}
	
	/**
	 * Adds total price and vat to the sale.
	 * 
	 * @param saleDTO parameter adds to the sale. 
	 *
	 */
	
	public void logSale(SaleDTO saleDTO)
	{
		 sale.add(saleDTO);
	}

}
