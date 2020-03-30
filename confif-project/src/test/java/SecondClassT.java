import org.testng.annotations.Test;
import Pages.Locator1;
import Pages.Locator2;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

public class SecondClassT extends MultiThread {
	public Locator1 secondTest1;
	public Locator2 secondTest2;

	public SecondClassT() {
		this.secondTest1 = new Locator1();
		this.secondTest2 = new Locator2();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(getDriver(), 20);
		PageFactory.initElements(factory, this.secondTest1);
		PageFactory.initElements(factory, this.secondTest2);
	}

	@Test()
	public void second(String url) throws InterruptedException {
		getDriver().navigate().to(url);
		String threadname = Thread.currentThread().getName();
		System.out.println(threadname + " this is also thread");

		waitClickOn(getDriver(), this.secondTest1.username, 30);
		this.secondTest1.username.sendKeys("IM-546438");
		this.secondTest1.password.sendKeys("Lombard2018");
		Select drppro = new Select(this.secondTest1.dropdown);
		drppro.selectByValue("1");
		waitClickOn(getDriver(), this.secondTest1.login, 20);
		this.secondTest1.login.click();

		waitClickOn(getDriver(), this.secondTest1.getQuote, 20);
		this.secondTest1.getQuote.click();
		// -----------------------------------------------------------------------------------------------------------------------
		waitClickOn(getDriver(), this.secondTest2.registrationNo, 20);
		this.secondTest2.registrationNo.sendKeys("MH04EH7666");
		this.secondTest2.rtoCity.sendKeys("mum");
		List<WebElement> list = this.secondTest2.rtoSuggetions;
		if (list.get(1).getText().contains("MUMBAI")) {
			list.get(1).click();
		}
		waitClickOn(getDriver(), this.secondTest2.loader, 20);
		waitVisibilityOfElement(getDriver(), this.secondTest2.loader, 3);
		waitInvisibilityOfElement(getDriver(), this.secondTest2.loader, 20);
		
		this.secondTest2.dateIcon.click();
		this.secondTest2.currentDate.click();

		Select value = new Select(this.secondTest2.manufaturer);
		value.selectByValue("33");

		waitVisibilityOfElement(getDriver(), this.secondTest2.loader, 3);
		waitInvisibilityOfElement(getDriver(), this.secondTest2.loader, 20);

		Select model = new Select(this.secondTest2.model);
		model.selectByValue("16016");
		waitVisibilityOfElement(getDriver(), this.secondTest2.loader, 6);
		waitInvisibilityOfElement(getDriver(), this.secondTest2.loader, 20);
// need to add wait for price display    name="txtPrice"    value="87952"
		Select state = new Select(this.secondTest2.state);
		state.selectByValue("27");
		waitVisibilityOfElement(getDriver(), this.secondTest2.loader, 3);
		waitInvisibilityOfElement(getDriver(), this.secondTest2.loader, 20);

		Select tenure = new Select(this.secondTest2.cpaTenure);
		tenure.selectByValue("1");
		waitVisibilityOfElement(getDriver(), this.secondTest2.loader, 3);
		waitInvisibilityOfElement(getDriver(), this.secondTest2.loader, 20);

		this.secondTest2.calculatePremium.click();
		waitVisibilityOfElement(getDriver(), this.secondTest2.loader, 3);
		waitInvisibilityOfElement(getDriver(), this.secondTest2.loader, 25);

		// ---------------------------------------------------------------------------------------------------------------------
		this.secondTest2.engineNo.sendKeys("1234578");
		this.secondTest2.chassisNo.sendKeys("1234568");
		this.secondTest2.sourceCode.sendKeys("12345678");

		this.secondTest2.searchCustomer.click();
		String parentWindow = getDriver().getWindowHandle();
		Set<String> allWindowHandles = getDriver().getWindowHandles();

		for (String handle : allWindowHandles) {
			getDriver().switchTo().window(handle);
		}
		waitVisibilityOfElement(getDriver(), this.secondTest2.customerName, 60);
		this.secondTest2.customerName.sendKeys("Pratik");

		waitClickOn(getDriver(), this.secondTest2.searchCutomerName, 5);
		this.secondTest2.searchCutomerName.click();
		waitVisibilityOfElement(getDriver(), this.secondTest2.searchCustomerloader, 5);
		waitInvisibilityOfElement(getDriver(), this.secondTest2.searchCustomerloader, 60);

		this.secondTest2.wantedCustomer.click();
		// -------------------------------------------------------------------------------------------------------------
		getDriver().switchTo().window(parentWindow);

		waitVisibilityOfElement(getDriver(), this.secondTest2.customerMobileNo, 60);
		this.secondTest2.createProposal.click();

		waitVisibilityOfElement(getDriver(), this.secondTest2.proposalId, 30);
		String origin = getDriver().getCurrentUrl();
		String proposalID = this.secondTest2.proposalId.getText();
		String policyTypeH = this.secondTest2.policyTypeT.getText();
		String vehicleType = this.secondTest2.vehicleTypeT.getText();
		System.out.println(origin+ " >> " +vehicleType + " >> " + policyTypeH + " >> " + proposalID);
		getDriver().close();
	}
}