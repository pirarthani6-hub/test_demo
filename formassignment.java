package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class formassignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("priya");
		driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("123abs");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		System.out.println(driver.findElement(By.xpath("//label[@for='exampleCheck1']")).getText());
	 WebElement pri=driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']"));
		Select obj=new Select(pri);
	 obj.selectByIndex(1);
	 driver.findElement(By.xpath("//input[@id='inlineRadio1']")).click();
	 driver.findElement(By.cssSelector("input[type=date]"));
	 driver.findElement(By.name("bday")).sendKeys("15/04/2026");
	 driver.findElement(By.xpath("//input[@type='submit']")).click();
	 Thread.sleep(2000);
	System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());

	}

}
