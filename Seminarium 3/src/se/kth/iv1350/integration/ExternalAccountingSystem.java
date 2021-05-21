package se.kth.iv1350.integration;

import java.util.ArrayList;

import se.kth.iv1350.DTO.SaleDTO;

public class ExternalAccountingSystem {
	
	private ArrayList<SaleDTO> sale = new ArrayList<SaleDTO>();
	
	/**
	 * logsale add the information about saleDTO to sale. 
	 * 
	 * @param saleDTO parameter adds to the sale. 
	 * 
	 */
	
	public void logSale(SaleDTO saleDTO)
	{
		sale.add(saleDTO);
	}

}
