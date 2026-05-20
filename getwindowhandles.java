package seleniumtest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class getwindowhandles {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise");//parent
		driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material")).click();//child
		
		Set<String> check=driver.getWindowHandles();
		System.out.println("Before switching: " + check.size());
		Iterator<String>i=check.iterator();
		String parent=i.next();
		String child =i.next();
		// TODO Auto-generated method stub
		Thread.sleep(5000);
		driver.switchTo().window(child);
		
	
		driver.findElement(By.xpath("//a[@class='theme-btn']")).click();
		System.out.println("after switching: " + check.size());
		
	}

}



