package seleniumtest;

import static org.testng.Assert.assertEquals;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class autosuggestioncountry {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("autocomplete")).sendKeys("ind");
		Actions a=new Actions(driver);
		Thread.sleep(2000);
	    a.moveToElement(driver.findElement(By.id("autocomplete"))).keyDown(Keys.DOWN);
	    a.moveToElement(driver.findElement(By.id("autocomplete"))).keyDown(Keys.DOWN);
	    a.moveToElement(driver.findElement(By.id("autocomplete"))).keyDown(Keys.ENTER).build().perform();
	    System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
	

	}

}
