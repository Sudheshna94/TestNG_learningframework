package novlearning;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class first {
	 WebDriver driver;
    @BeforeTest
	  public void beforeTest() {
    	driver= new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("http://primusbank.qedgetech.com/");
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	Reporter.log("before test",true);
	  }
  @Test
  public void international() {
	 
  }
  @Test
  public void personal() {
	 
  }
  @Test
  public void city() {
	 
  }
  @AfterTest
  public void afterTest() {
  }

}
