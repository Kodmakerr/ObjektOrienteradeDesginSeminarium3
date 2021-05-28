package se.kth.iv1350.Startup;

import se.kth.iv1350.Controller.Controller;
import se.kth.iv1350.View.View;
import se.kth.iv1350.integration.Itemnotexistexception;
import se.kth.iv1350.integration.databasefailureexception;

public class Startup {


	
	
	public static void main(String[] args) throws Itemnotexistexception, databasefailureexception {
		
		Controller controller = new Controller();
		View views = new View();

	}

}
