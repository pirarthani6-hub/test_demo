package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class endendui {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver =new ChromeDriver();

		driver.get("http://spicejet.com"); //
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']")).click();
		driver.findElement(By.xpath("//div[@class='css-76zvg2 r-cqee49 r-ubezar r-1kfrs79']")).click();
Thread.sleep(2000);	
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1v8vaea r-eqz5dr r-1d2f490 r-u8s1d r-zchlnj r-1pozq62']  //div[@class='css-76zvg2 r-jwli3a r-xb2eav r-majxgm r-q4m81j']")).click();
		
		// TODO Auto-generated method stub

	}

}
