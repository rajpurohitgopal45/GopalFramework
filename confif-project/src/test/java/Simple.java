import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Simple {

	@Test
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "I:\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.guru99.com");
		driver.close();
	}

	@Test
	public void setup1() {
		System.setProperty("webdriver.chrome.driver", "I:\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/");
		driver.close();
	}
	
	@Test
	public void setup2() {
		System.setProperty("webdriver.chrome.driver", "I:\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.close();
	}
}
