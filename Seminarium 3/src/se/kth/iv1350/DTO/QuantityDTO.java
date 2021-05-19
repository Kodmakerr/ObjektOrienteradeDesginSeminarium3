package se.kth.iv1350.DTO;

public class QuantityDTO {
	
	private ItemDTO itemDTO;
	private int quantity;
	
	/**
	 *  
	 * 
	 * @return the itemDTO that 
	 */

	public ItemDTO getitemDTO() {
		return itemDTO;
	} 
	
	/**
	 * Quantity of Items in the sale.
	 * 
	 * @return quantity of items 
	 */
	
	public int getquantity() {
		return quantity;
	}
	
	/**
	 * 
	 * 
	 * @param . 
	 * 
	 * @param 
	 * 
	 * @return 
	 */
	
	
	public QuantityDTO(ItemDTO itemDTO, int quantity) 
	{
		this.itemDTO = itemDTO;
		this.quantity = quantity;
	}

}
