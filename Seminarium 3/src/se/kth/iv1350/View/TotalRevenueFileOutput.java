package se.kth.iv1350.View;

import java.io.FileWriter;
import java.io.PrintWriter;

import se.kth.iv1350.DTO.SaleDTO;
import se.kth.iv1350.Model.Observer;

public class TotalRevenueFileOutput implements Observer {
	
	private int totalRevenue = 0;

	@Override
	public void newobserver(SaleDTO gettotalPrice) {

		totalRevenue += gettotalPrice.gettotalPrice();
		
		
		try 
		{
			PrintWriter fileLog = new PrintWriter(new FileWriter("log.txt"), true);		
			fileLog.println("Total revenue : " + totalRevenue);
		}
		
		catch(Exception e) 
		{
			System.out.println("Could not log file");
		}
	}
	
}
