
import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

public class MultiThread {
	private WebDriver driver;
	public static ThreadLocal<WebDriver> dr = new ThreadLocal<WebDriver>();

	public static WebDriver getDriver() {
		return dr.get();
	}

	public static void setWebDriver(WebDriver driver) {
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

	public static void waitClickOn(WebDriver driver, WebElement locator, int timeout) {
		try {
			new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class)
					.until(ExpectedConditions.elementToBeClickable(locator));
		} catch (Exception e) {
			System.out.println(locator + " locator not clickable");
		}
	}

	public static void waitVisibilityOfElement(WebDriver driver, WebElement locator, int timeout) {
		try {
			new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class)
					.until(ExpectedConditions.visibilityOf(locator));
		} catch (Exception e) {
			System.out.println(locator + " locator not visible");
		}
	}

	public static void waitInvisibilityOfElement(WebDriver driver, WebElement locator, int timeout) {
		try {
			new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class)
					.until(ExpectedConditions.invisibilityOf(locator));
		} catch (Exception e) {
			System.out.println(locator + " locator still visible ");
		}
	}

	public static void selectText(WebElement locator, String value) {
		Select select = new Select(locator);
		select.selectByVisibleText(value);
	}
	public static void selectValue(WebElement locator, String value) {
		Select select = new Select(locator);
		select.selectByValue(value);
	}

	public static void captureScreenshot() throws IOException {
		File scrFile = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
		Date d = new Date();
		String screenshotName = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";
		FileUtils.copyFile(scrFile, new File("C:\\Users\\ASUS\\Desktop\\" + screenshotName));
	}

	public static void verifyEquals(String expected, String actual) throws IOException {
		try {
			Assert.assertEquals(actual, expected);
		} catch (Throwable t) {
		    captureScreenshot();
		}
	}
}