package Assignment6.Assignment6;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;


public class MakeMyTripTest {

	  WebDriver driver;	
	  
	  @Test(description="This test validate logo")
	  public void verifyLogo() {
		  driver.findElement(By.cssSelector("a.mmtLogo.makeFlex"));
	  }
	  
	  @Test(description="This test validate flight selection")
	  public void verifyFlightSelection() {
		  WebDriverWait wait = new WebDriverWait(driver, 20);
			
		  //close login popup
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.commonModal__close")));
		  driver.findElement(By.cssSelector("span.commonModal__close")).click();
		  wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("span.commonModal__close")));
			
		  //Click flights
		  driver.findElement(By.xpath("//a[@href='https://www.makemytrip.com/flights/']")).click();
			
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@data-cy='oneWayTrip']/span[contains(@class, 'tabsCircle')]")));
		  driver.findElement(By.xpath("//li[@data-cy='oneWayTrip']/span[contains(@class, 'tabsCircle')]")).click();
		  driver.findElement(By.xpath("//input[@data-cy='fromCity']"));
		  driver.findElement(By.xpath("//input[@data-cy='toCity']"));
	  }
	  
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("Executing on Chrome");
		  String driver_path = System.getProperty("user.dir")+"/chromedriver/chromedriver.exe";
		  System.setProperty("webdriver.chrome.driver", driver_path);
		  driver = new ChromeDriver();
		  driver.get("https://www.makemytrip.com");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  }

	  @AfterMethod
	  public void afterMethod() {
		  driver.close();
	  }

}
