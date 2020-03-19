
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class MultiThread {
	public WebDriver driver;
	public static ThreadLocal<WebDriver> dr = new ThreadLocal<WebDriver>();

	public WebDriver getDriver() {
		return dr.get();
	}

	public void setWebDriver(WebDriver driver) {
		dr.set(driver);
	}

	@BeforeMethod
	public void setup() {

	}

	public void verify() {
		System.setProperty("webdriver.chrome.driver", "I:\\Automation\\chromedriver.exe");
		driver = new ChromeDriver();
		setWebDriver(driver);
	}
}