package seleniumtest;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class returnpasswordruntime {

	public static void main(String[] args) throws InterruptedException 
				// TODO Auto-generated method stub
	{
						WebDriver driver=new ChromeDriver();
						driver.get("https://rahulshettyacademy.com/locatorspractice/");
						String password=getpassword(driver);
						Thread.sleep(5000);
						driver.findElement(By.cssSelector(".go-to-login-btn")).click();
			            
			            driver.findElement(By.id("inputUsername")).sendKeys("rahul");
						driver.findElement(By.name("inputPassword")).sendKeys(password);
						Thread.sleep(2000);
						driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
			               
			               //driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();				
		//above statement with regular expression
		              
	
		            
		            	
					}
private static String getpassword(WebDriver driver) throws InterruptedException 

{
		// TODO Auto-generated method stub
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	Thread.sleep(2000);
	 driver.findElement(By.linkText("Forgot your password?")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//div/button[2]")).click();
	 Thread.sleep(2000);
driver.findElement(By.cssSelector("form p")).getText();//parent child
  
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	String pwdtxt=driver.findElement(By.cssSelector("form p")).getText();//reset-pwd button click info txt mentioned on screen
String[] pwdarray=pwdtxt.split("'");
//Please use temporary password 'rahulshettyacademy' to Login.
//pwdarray[0]=Please use temporary password
//pwdarray[1]=rahulshettyacademy' to Login.

String[] pwdarray2= pwdarray[1].split("'");
//pwdarray2[0]=rahulshettyacademy
//pwdarray2[1]=' to Login.
String password=pwdarray2[0];
return password;
}
}
















	

