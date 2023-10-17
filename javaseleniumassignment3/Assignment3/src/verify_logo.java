import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class verify_logo {

	public static void main(String[] args) {
		String driver_path = System.getProperty("user.dir")+"/geckodriver/geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", driver_path);
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.makemytrip.com");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("a.mmtLogo.makeFlex"));
		
		driver.close();
		System.out.println("Logo found");

	}

}
