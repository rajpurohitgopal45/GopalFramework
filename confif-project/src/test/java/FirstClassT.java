
import org.testng.annotations.Test;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstClassT extends MultiThread {
	@Test()
	public void first(String url) throws InterruptedException {
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

		getDriver().findElement(By.id("TxtRegistrationNumber")).sendKeys("MH04EH7666");

		getDriver().findElement(By.id("TxtRtoCity")).sendKeys("mum");
		Thread.sleep(2000);

		List<WebElement> list = driver.findElements(By.xpath("//*[@id='divwidth']//child::div"));
		System.out.println("----------size" + list.size());

		System.out.println(list.get(1).getText());
		if (list.get(1).getText().contains("MUMBAI")) {
			list.get(1).click();
		}

		// Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait(driver, 0);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//img[@alt=Loader]")));

		WebElement icon = getDriver().findElement(By.xpath("//img[@id='datecontrol']"));
		icon.click();

		WebElement currentdate = getDriver()
				.findElement(By.xpath("//div[@class='datepicker-days']/table/tbody//td[@class='today day']"));
		currentdate.click();

		WebElement manifac = getDriver().findElement(By.id("DdlManufacture"));
		Select value = new Select(manifac);
		value.selectByValue("33");
		Thread.sleep(5000);

		Select model = new Select(getDriver().findElement(By.id("DdlModel")));
		model.selectByValue("16016");
		Thread.sleep(5000);

		Select state = new Select(getDriver().findElement(By.id("ddToState")));
		state.selectByValue("27");
		Thread.sleep(5000);

		Select tenure = new Select(getDriver().findElement(By.id("DdlCPATenure")));
		tenure.selectByValue("1");
		Thread.sleep(5000);

		getDriver().findElement(By.id("BtnCalculatePremium")).click();
		Thread.sleep(5000);

		getDriver().findElement(By.id("TxtEngineNumber")).sendKeys("1234578");

		getDriver().findElement(By.id("TxtChassisNumber")).sendKeys("1234568");

		getDriver().findElement(By.id("txtSourcingCode")).sendKeys("12345678");

		getDriver().findElement(By.id("ctrlCustomerAddress_btnSearchCustomers")).click();
		Thread.sleep(5000);

		String parentWindow = getDriver().getWindowHandle();
		Set<String> allWindowHandles = getDriver().getWindowHandles();

		for (String handle : allWindowHandles) {
			getDriver().switchTo().window(handle);
		}

		getDriver().findElement(By.id("Name")).sendKeys("Pratik");
		Thread.sleep(3000);

		getDriver().findElement(By.id("searchButton")).click();
		Thread.sleep(20000);

		getDriver().findElement(By.xpath("//a[contains(text(),'Pratik Tadke')]")).click();
		Thread.sleep(5000);

		getDriver().switchTo().window(parentWindow);
		Thread.sleep(5000);

		getDriver().findElement(By.id("btnCreateProposal")).click();
		Thread.sleep(10000);

		getDriver().findElement(By.id("btnViewPremiumBreakup1")).click();
		for (String handle : allWindowHandles) {
			getDriver().switchTo().window(handle);
		}

		getDriver().switchTo().window(parentWindow);

		getDriver().findElement(By.id("BtnBuyPolicy")).click();
	}

//
// driver.findElement(By.id("btnCancelPaymentOptions")).click();
// for(String handle : allWindowHandles)
// {
// driver.switchTo().window(handle);
}

//driver.switchTo().window(parentWindow);
