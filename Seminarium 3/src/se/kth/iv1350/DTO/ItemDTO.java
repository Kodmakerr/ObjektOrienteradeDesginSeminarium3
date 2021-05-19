package se.kth.iv1350.DTO;

public class ItemDTO {
	
	private int price;
	private int vat;
	private String description;  
	
	/**
	 * getprice gives the information about the item price.
	 * 
	 * @return return the price for the item.
	 */
	
	public int getprice() {
		return price;
	}
	
	/**
	 * getvat gives the information about the item vat.
	 * 
	 * @return return the vat for the item.
	 */
	
	public int getvat() {
		return vat;
	}
	
	/**
	 * getdescription gives the description about the item .
	 * 
	 * @return return the description for the item.
	 */
	
	public String getdescription() {
		return description;
	}
	
	/**
	 * ItemDTO creates the item object. 
	 * 
	 * @param price of the item 
	 * 
	 * @param vat of the item 
	 * 
	 * @param description of the item 
	 * 
	 * @return information about the price, vat and description of the item. 
	 */
	
	public ItemDTO(int price, int vat, String description)
	{
		this.price = price;
		this.vat = vat;
		this.description = description;
	}
	
}
