package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class nested_frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Nested Frames")).click();
		Actions a =new Actions(driver);
		driver.findElement(By.xpath("//frame[@name='frame-top']"));//this line also not neccessary as we are using switchto
		WebElement dest=driver.findElement(By.xpath("//frameset/frame[2]"));//this line not neccessary
		
		driver.switchTo().frame("frame-top");//
		driver.switchTo().frame(1);//can do this in another way by frame("frame-middle")
		//this is done using frame(index which starts with 0)
		System.out.println(driver.findElement(By.xpath("//div[@id='content']")).getText());
				
		
		
	}

}
