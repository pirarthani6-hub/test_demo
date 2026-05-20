package seleniumtest;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dynamicdropdown {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(5));
		//driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();//first method directly by id and then navigating to subtag.
	  //driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);



//driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']")).click();
	

//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();//x-path using index
driver.findElement(By.id("autosuggest")).sendKeys("India");

List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));


for(WebElement option :options)

{

if(option.getText().equalsIgnoreCase("India"))

{

option.click();

break;


}

}

















}



}
