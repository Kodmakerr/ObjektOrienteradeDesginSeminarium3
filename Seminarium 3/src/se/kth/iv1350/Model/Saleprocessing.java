package se.kth.iv1350.Model;

import java.util.ArrayList;
import java.util.List;

import se.kth.iv1350.DTO.ItemDTO;
import se.kth.iv1350.DTO.QuantityDTO;
import se.kth.iv1350.DTO.ReceiptDTO;
import se.kth.iv1350.DTO.SaleDTO;

/**
 * Creates a instance to process a sale.
 * 
 */

public class Saleprocessing 
{
	private List<QuantityDTO> listofItem;
	private List<Observer> observer = new ArrayList<>();
	
	private void notifyObserver() 
	
	{	
			for (Observer obs : observer ) 
			{
				obs.newobserver(getSaleDTO());
			}
		
	}
	
	/**
	 * Adds a observer. 
	 * 
	 * @Param observer the observer to be added
	 */
	
	public void addObserver (Observer observer) {
		this.observer.add(observer);
	}
	
	
	/**
	 * Saleprocessing create instance of saleproccessing. 
	 * 
	 * @return A saleproccessing. 
	 */
	
	public Saleprocessing()
	{
		listofItem = new ArrayList<QuantityDTO> ();	
	}
	
	/**
	 * Adds a scanned item.
	 *  
	 * @param itemDTO The item to be added
	 * @param quantity The quantity of item added
	 * 
	 */
	public void scanItem(ItemDTO itemDTO, int quantity)
	{
		
		for(int i = 0; i < listofItem.size() ; i++)
		{
			listofItem.get(i);
			
			if(listofItem.get(i).getitemDTO() .equals(itemDTO)) 
			{
				quantity += listofItem.get(i).getquantity();
				listofItem.remove(i);
			}
				
		}
		
		QuantityDTO newitem = new QuantityDTO(itemDTO, quantity);
		listofItem.add(newitem);
	}
	
	/**
	 * endSale returns the value of totalPrice and vat. 
	 * 
	 * @return getSaleDTO return the total price and vat of the sale. 
	 */
	
	public SaleDTO endSale()
	{
		notifyObserver();
		return getSaleDTO();
	}
	
	/**
	 * getRecipt gives the information about the sale position and item description.
	 * 
	 * @param amoutpaid how much amount that have been paid for the sale.
	 * 
	 * @return return the receipt with the sale information. 
	 */
	
	public ReceiptDTO getReceipt(int amountPaid)
	{
		SaleDTO saleDTO = getSaleDTO(); 
		
		int Change;

		Change = amountPaid - saleDTO.gettotalPrice();
		
		ReceiptDTO receipt = new ReceiptDTO(20210507, 3, "ica", "vallahallav??gen", listofItem, saleDTO.gettotalPrice(),  saleDTO.getvat(), amountPaid, Change );
		
		return receipt;
	}
	
	/**
	 * getSaleDTO counts the total price and vat for the sale. 
	 * 
	 * @return saleDTO returns the information that have been counted.
	 */
	
	public SaleDTO getSaleDTO()
	{
		int totalPrice = 0;
		int vat = 0;
		
		for(int i = 0; i < listofItem.size(); i++)
		{
			
			totalPrice += listofItem.get(i).getitemDTO().getprice() * listofItem.get(i).getquantity();
			vat += listofItem.get(i).getitemDTO().getvat() * listofItem.get(i).getquantity();
		}
		
		SaleDTO saleDTO = new SaleDTO (totalPrice, vat);
		
		return saleDTO;
	}

}



