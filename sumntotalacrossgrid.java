package seleniumtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class sumntotalacrossgrid {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		SoftAssert a=new SoftAssert();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,500)");
		js.executeScript("document.querySelector('.table-display').scrollTop=5000");
		List<WebElement> val=driver.findElements(By.className("table-display"));
		List<WebElement> num=driver.findElements(By.xpath("//table[@class='table-display'] //tr/td[3]"));
		int sum=0;
		for(int i=0;i<num.size();i++)
		{
		sum=sum+Integer.parseInt(num.get(i).getText());
		}

		
		
	}

}
