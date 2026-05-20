package seleniumtest;
import java.time.Duration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class additemstocart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<>();
		prefs.put("credentials_enable_service", false);
		prefs.put("password_manager_enabled", false);
		Map<String, Object> profile = new HashMap<>();
		profile.put("password_manager_leak_detection", false);
		prefs.put("profile", profile);
		options.setExperimentalOption("prefs", prefs);
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
	    driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.name("password")).sendKeys("Learning@830$3mK2");
		driver.findElement(By.xpath("//input[@id='usertype']"));
		driver.findElement(By.className("checkmark")).click();
	WebElement driver1=driver.findElement(By.xpath("//select[@class='form-control']"));
Select role=new Select(driver1);
role.selectByIndex(2);
WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[contains(@value,'Sign I')]")).click();
	w.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("iphone X")));
	driver.findElement(By.linkText("iphone X"));
	driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
			List<WebElement> pri=driver.findElements(By.xpath("//app-card[@class='col-lg-3 col-md-6 mb-3']"));
			for(int i=1;i<pri.size();i++)
			{
			
				driver.findElement(By.xpath("//button[text()='Add ']")).click();
	}
			Thread.sleep(2000);
			driver.findElement(By.partialLinkText("Checkout")).click();
			driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
			}

}
