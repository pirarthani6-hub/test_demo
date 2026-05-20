package seleniumtest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class staticdropdown {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.cssSelector("select#dropdown-class-example"));

		driver.findElement(By.xpath("//select/option[2]")).click();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select/option[2]")));

		System.out
				.println(driver.findElement(By.xpath("//select[@id='dropdown-class-example']/option[2]")).isSelected());

		System.out.println(driver.findElement(By.xpath("//button[text()='Home']")).getText());// button text
		// TODO Auto-generated method stub
		System.out.println(driver.findElement(By.xpath("//div/a[1]/following-sibling::button[1]")).getText());// sibling
																												// traverse
		System.out.println(driver.findElement(By.xpath("//option/parent::select/parent::fieldset")).getText());// child-parent
																												// traverse
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement staticdropdown = driver
				.findElement(By.xpath("//select[@name='ctl00$mainContent$DropDownListCurrency']"));
		// System.out.println(driver.findElement(By.xpath("//select[@name='ctl00$mainContent$DropDownListCurrency']/option[2]")).getText());//customised
		// xpath with tagname and selecting subtag
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByIndex(1);
		Thread.sleep(2000);
		dropdown.selectByValue("USD");
		Thread.sleep(2000);
		System.out.println(dropdown.getFirstSelectedOption().getText());// based on single select dropdown it replaces
																		// lastly selected value
		dropdown.selectByContainsVisibleText("AED");

		// dropdown1.selectByContainsVisibleText("AED");
		// System.out.println(dropdown1.getFirstSelectedOption());
		// dropdown1.selectByValue("USD");
		// dropdown1.

	}
}