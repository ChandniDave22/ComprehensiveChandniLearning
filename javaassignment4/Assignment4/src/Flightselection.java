import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flightselection {
	
	static WebDriver driver;
	
	public static void chrome_driver_launch() {
		String driver_path = System.getProperty("user.dir")+"/chromedriver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driver_path);
		
		driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
	}
	

	public static void main(String[] args) throws InterruptedException {
		
		chrome_driver_launch();
		
		//wait for iframe and login popup
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//commented 'iframe close' code as it is now not coming up
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#webengage-notification-container")));
//		
//		//Switch to frame and close the modal
//		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='webklipper-publisher-widget-container-notification-frame']")));
//		driver.findElement(By.cssSelector("a#webklipper-publisher-widget-container-notification-close-div")).click();
//		
//		driver.switchTo().defaultContent();
		
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
		
		System.out.println("Test Pass");
		close_driver();
	}
	
	public static void close_driver() {
		driver.close();
	}

}
