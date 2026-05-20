package seleniumtest;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
public class ch
{
	
	public static void main(String[] args) throws InterruptedException   {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","/Users/santhoshkesanupalli/Downloads/chromedriver-mac-arm64/chromedriver");
WebDriver pir=new ChromeDriver();
pir.get("https://www.google.com/");
WebElement p=pir.findElement(By.className("gLFyf"));
p.sendKeys("india");
p.sendKeys(Keys.ENTER);
Thread.sleep(2000);

}
}
	