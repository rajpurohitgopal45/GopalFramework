
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class SecondClassT extends MultiThread {
	@Test()
	public void second(String url) throws InterruptedException {
		getDriver().navigate().to(url);
		String threadname = Thread.currentThread().getName();
		System.out.println(threadname);
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		getDriver().manage().window().maximize();

		getDriver().findElement(By.id("txtLoginId")).clear();
		Thread.sleep(1000);

		getDriver().findElement(By.id("txtLoginId")).sendKeys("IM-546438");
		getDriver().findElement(By.id("login2_txtPassword")).sendKeys("Lombard2018");

		Select drppro = new Select(getDriver().findElement(By.xpath("//*[@id=\"login2_ddlLandingPage\"]")));
		drppro.selectByValue("1");

		getDriver().findElement(By.xpath("//input[@id='login2_btnLoginMain']")).click();
		// driver.switchTo().alert().accept();
		getDriver().findElement(By.id("ctl00_headA_motorQuote_rdb2Wheeler")).click();

		// To click on 2W-NEW
		getDriver().findElement(By.id("ctl00_headA_motorQuote_btnProceed")).click();
	}}