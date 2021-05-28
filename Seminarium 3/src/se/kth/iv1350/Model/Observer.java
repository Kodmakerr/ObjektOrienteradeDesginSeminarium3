package se.kth.iv1350.Model;


import se.kth.iv1350.DTO.SaleDTO;


public interface Observer {

	/**
	 * Invoked when a sale is completed
	 * 
	 * @param gettotalPrice The sale completed
	 */
	
	void newobserver(SaleDTO gettotalPrice);


}
