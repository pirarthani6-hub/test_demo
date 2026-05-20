package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class multioptionselectusingloop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(5000);
		for (int i=1;i<5;i++)
		{
	driver.findElement(By.id("hrefIncAdt")).click();
		}
	int j=1;
		while(j <5)
		{
			driver.findElement(By.id("hrefIncChd")).click();
			j++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
	}

}
