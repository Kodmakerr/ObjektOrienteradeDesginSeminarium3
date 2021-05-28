package se.kth.iv1350.View;

import se.kth.iv1350.DTO.SaleDTO;
import se.kth.iv1350.Model.Observer;

public class TotalRevenueView implements Observer{

	private int totalRevenu = 0;
	
	@Override
	public void newobserver(SaleDTO gettotalPrice) {
	
		totalRevenu += gettotalPrice.gettotalPrice();
		
	System.out.println("The current total revenue is : " + totalRevenu);
		
		
	}

}
