package seleniumtest;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorinselenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
				WebDriver driver=new ChromeDriver();
				driver.get("https://rahulshettyacademy.com/locatorspractice/");
				driver.findElement(By.id("inputUsername")).sendKeys("rahul");
				driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacadem");
				   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	              WebElement a=driver.findElement(By.xpath("//form/div/span[1]"));//abs x-path
				a.click();
                System.out.println(a);
	               Thread.sleep(2000);
	               System.out.println(driver.findElement(By.xpath("//label[@for='chkboxOne']")).getText());
               driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();				
//above statement with regular expression
               Thread.sleep(2000);
               System.out.println(driver.findElement(By.cssSelector("form p")).getText());//parent child infor msg displayed in reset-pwd
               driver.findElement(By.linkText("Forgot your password?")).click();
               driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
               driver.findElement(By.cssSelector("input[placeholder='Name']:nth-child(2)")).sendKeys("priya");
               driver.findElement(By.xpath("//form/input[2]")).sendKeys("pirar6@gmail.com");
            	driver.findElement(By.cssSelector("input[placeholder*='Phone Number']")).sendKeys("91210888888");//reg expression
            	Thread.sleep(2000);
            driver.findElement(By.xpath("//div/button[2]")).click();
            Thread.sleep(2000);
            System.out.println(driver.findElement(By.xpath("//div/button[2]")).getText());
           
            	driver.findElement(By.cssSelector(".go-to-login-btn")).click();
            
			}

		}




