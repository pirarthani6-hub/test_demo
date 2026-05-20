package seleniumtest;

import org.openqa.selenium.edge.EdgeDriver;


public class edgelaunch {

	public static void main(String[] args) {
		
		
		System.setProperty("Webdriver.edge.driver","/Users/santhoshkesanupalli/msedgedriver");
		// TODO Auto-generated method stub
		EdgeDriver pir=new EdgeDriver();
		pir.navigate().to("https://rahulshettyacademy.com/practice");
	
		pir.close();
		
		

	}

}
