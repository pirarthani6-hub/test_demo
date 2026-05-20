package seleniumtest;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignmentongrabbingobjatruntime {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@value='option2']")).click();
		String val=driver.findElement(By.xpath("//fieldset/label[@for='benz']")).getText();
		System.out.println(val);
		WebElement var=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));

		Select a=new Select(var);
		Thread.sleep(5000);
		a.selectByVisibleText(val);
		driver.findElement(By.name("enter-name")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("enter-name")).sendKeys(val);
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		
		Thread.sleep(3000);
						
		String alert=driver.switchTo().alert().getText();
		if(alert.contains(val))
		
			driver.switchTo().alert().accept();	
	
	
	}

}
