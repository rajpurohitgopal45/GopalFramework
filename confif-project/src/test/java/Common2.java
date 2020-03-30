import java.util.Set;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import Pages.Locator3;

public class Common2 extends MultiThread{
	ConfigExcel config1 = new ConfigExcel("C:\\Users\\ASUS\\Desktop\\r.xlsx");
	public Locator3 pcvLocator1;

	public Common2() {
		this.pcvLocator1 = new Locator3();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(getDriver(), 20);
		PageFactory.initElements(factory, this.pcvLocator1);
	}
	public void nextPage() throws InterruptedException {
		waitVisibilityOfElement(getDriver(), this.pcvLocator1.loader, 8);
		waitInvisibilityOfElement(getDriver(), this.pcvLocator1.loader, 10);
		this.pcvLocator1.registrationNo.sendKeys("MH45H4545");
		this.pcvLocator1.engineNo.sendKeys("12345678");
		this.pcvLocator1.chassisNo.sendKeys("12345678");
		this.pcvLocator1.sourcingCode.sendKeys("12345678");
	}
	public void searchCustomer() throws InterruptedException {
		waitClickOn(getDriver(), this.pcvLocator1.searchCustomerButton, 20);
		this.pcvLocator1.searchCustomerButton.click();

		String parentWindow = getDriver().getWindowHandle();
		Set<String> allWindowHandles = getDriver().getWindowHandles();
		for (String handle : allWindowHandles) {
			getDriver().switchTo().window(handle);
		}
		waitClickOn(getDriver(), this.pcvLocator1.customerName, 20);
		this.pcvLocator1.customerName.sendKeys("Pratik Tadke");

		this.pcvLocator1.customerSearch.click();
		waitClickOn(getDriver(), this.pcvLocator1.customerWanted, 30);

		this.pcvLocator1.customerWanted.click();	
		getDriver().switchTo().window(parentWindow);
	}
		public void lastAction()   {
		waitClickOn(getDriver(), this.pcvLocator1.customerMobileNo, 30);
		this.pcvLocator1.continue2.click();
		waitClickOn(getDriver(), this.pcvLocator1.buy, 30);
		getDriver().close();
	/*	this.pcvLocator1.buy.click();

		getDriver().switchTo().window(parentWindow);
		Set<String> views = getDriver().getWindowHandles();
		Thread.sleep(5000);
		for (String handle : views) {
			getDriver().switchTo().window(handle);
			System.out.println("Handle the..." + handle);
		}
		Thread.sleep(5000);
		this.pcvLocator1.offline.click();
		Thread.sleep(9000);
		this.pcvLocator1.bankIdLocked.click();
		Thread.sleep(9000);
		this.pcvLocator1.logout.click();*/
	}
}
