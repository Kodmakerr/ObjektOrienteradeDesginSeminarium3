package se.kth.iv1350.DTO;

public class SaleDTO {
	
	private int totalPrice;
	private int vat;
	
	/**
	 * totalPrice of the item the sale. 
	 * 
	 * @return totalPrice of the sale.
	 */

	public int gettotalPrice() {
		return totalPrice;
	} 
	
	/**
	 * vat of the total price in the sale. 
	 * 
	 * @return vat the total price.
	 */
	
	public int getvat() {
		return vat;
	}
	
	/**
	 * SaleDTO creates the object for total price and vat in the sale. 
	 * 
	 * @param total price for the all items. 
	 * 
	 * @param vat of the total price in the sale.
	 * 
	 * @return information about the total price and vat for the all items in the sale. 
	 */
	
	
	public SaleDTO(int totalPrice, int vat) 
	{
		this.totalPrice = totalPrice;
		this.vat = vat;
	}
	
}
