import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Simple {
	public WebDriver driver;
	
	@Test
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "I:\\Automation\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.guru99.com");
		driver.close();
	}
}
