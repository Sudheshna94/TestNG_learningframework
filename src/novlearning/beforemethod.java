package novlearning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class beforemethod 
{
	WebDriver driver;
	@BeforeMethod
	public void setup() throws Throwable
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.findElement(By.name("")).sendKeys("Admin");
		driver.findElement(By.name("")).sendKeys("Admin");
		driver.findElement(By.name("")).click();
		Reporter.log("Running beforemethod", true);
		Thread.sleep(2000);
	}
	@Test
	public void branches() throws Throwable
	{
		driver.findElement(By.xpath(null)).click();
		Reporter.log("executing branches",true);
		Thread.sleep(3000);

	}
	@Test
	public void roles() throws Throwable
	{
		driver.findElement(By.xpath(null)).click();
		Reporter.log("executing roles",true);
		Thread.sleep(3000);

	}
	@Test
	public void user() throws Throwable
	{
		driver.findElement(By.xpath(null)).click();
		Reporter.log("executing user",true);
		Thread.sleep(3000);

	}
	@AfterMethod
	public void teardown() throws Throwable
	{
		Thread.sleep(3000);
		driver.quit();
		Reporter.log(null);
		
	}

}
