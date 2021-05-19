package se.kth.iv1350.DTO;

import java.util.List;

public class ReceiptDTO {
	private int date;
	private int time;
	private String storeName;
	private String storeAdress;
	private List<QuantityDTO> listofItem;
	private int totalPrice;
	private int vat;
	private int amountPaid;
	private int Change;
	
	/**
	 * getdate gives the information about with date the sale was performed. 
	 * 
	 * @return the date information.
	 */
	
	public int getdate() {
		return date;
	}
	
	/**
	 * gettime gives the information about what time the sale was performed. 
	 * 
	 * @return the time information.
	 */
	
	public int gettime() {
		return time;
	}
	
	/**
	 * storeName gives the information about which store the sale was performed. 
	 * 
	 * @return the store name information.
	 */
	
	public String storeName() {
		return storeName;
	}
	
	/**
	 * storeName gives the information about which address the sale was performed. 
	 * 
	 * @return the store address information.
	 */
	
	public String storeAdress() {
		return storeAdress;
	}

	/**
	 * listofItem gives the information about item in the list. 
	 * 
	 * @return the item in the list information.
	 */
	
	public List<QuantityDTO> listofItem() {
		return listofItem;
	}
	
	/**
	 * totalPrice gives the information about total price for the sale. 
	 * 
	 * @return the total price for sale information.
	 */
	
	public int totalPrice() {
		return totalPrice;
	}
	
	/**
	 * vat gives the information about vat price for the sale. 
	 * 
	 * @return the vat price for sale information.
	 */
	
	public int vat() {
		return vat;
	}
	
	/**
	 * amountPaid gives the information about amount paid for the sale. 
	 * 
	 * @return the amount paid for sale information.
	 */
	
	public int getamountPaid() {
		return amountPaid;
	}
	
	/**
	 * Change gives the information about change after the total payment. 
	 * 
	 * @return the change after the total payment.
	 */
	
	public int getChange() {
		return Change;
	}
	
	/**
	 * ReceiptDTO creates the object the are represent for the item and the sale .
	 * 
	 * @param date of the sale
	 * 
	 * @param time of the sale
	 *   
	 * @param storename of the sale.
	 *    
	 * @param storeAdress of the sale.
	 *     
	 * @param listofItem of the items.
	 *       
	 * @param totalPrice for all the items in the sale.
	 *       
	 * @param vat for the total price.
	 *         
	 * @param amountPaid in the sale.
	 * 
	 * @param Change after the payment in the sale.
	 * 
	 * @return information about the date, time, store name, store address, list of all item, total price, vat, amount paid and change of the items and sale.  
	 */
	
	public ReceiptDTO(int date, int time, String storeName, String storeAdress,List<QuantityDTO> listofItem, int totalPrice, int vat, int amountPaid, int Change )
	{
		this.date = date;
		this.time = time;
		this.storeName = storeName;
		this.listofItem = listofItem;
		this.totalPrice = totalPrice;
		this.vat = vat;
		this.amountPaid = amountPaid;
		this.Change = Change;
	}
}
