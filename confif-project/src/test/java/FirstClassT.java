import Pages.Locator1;
import Pages.Locator2;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class FirstClassT extends MultiThread {
	public Locator1 firstTest1;
	public Locator2 firstTest2;
	CommonLogin cl = new CommonLogin();

	public FirstClassT() {
		this.firstTest1 = new Locator1();
		this.firstTest2 = new Locator2();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(getDriver(), 20);
		PageFactory.initElements(factory, this.firstTest1);
		PageFactory.initElements(factory, this.firstTest2);
	}

	public void first(String url) throws InterruptedException {
		getDriver().navigate().to(url);
		cl.commonLogin();
	}

	public void dashboard() {
		waitClickOn(getDriver(), this.firstTest1.getQuote, 20);
		this.firstTest1.getQuote.click();
	}

	public void getQuote() {
		waitClickOn(getDriver(), this.firstTest2.registrationNo, 20);
		this.firstTest2.registrationNo.sendKeys("MH04EH7666");
		this.firstTest2.rtoCity.sendKeys("mum");
		List<WebElement> list = this.firstTest2.rtoSuggetions;
		if (list.get(1).getText().contains("MUMBAI")) {
			list.get(1).click();
		}

		cl.loaderWait();
		waitClickOn(getDriver(), this.firstTest2.dateIcon, 20);
		this.firstTest2.dateIcon.click();
		this.firstTest2.currentDate.click();

		selectValue(this.firstTest2.manufaturer, "33");
		cl.loaderWait();
		selectValue(this.firstTest2.model, "16016");
		cl.loaderWait();
		selectValue(this.firstTest2.state, "27");
		cl.loaderWait();
		selectValue(this.firstTest2.cpaTenure, "1");
		cl.loaderWait();
		this.firstTest2.calculatePremium.click();
		cl.loaderWait();
	}

	public void nexttPage() throws IOException {
		this.firstTest2.engineNo.sendKeys("1234578");
		this.firstTest2.chassisNo.sendKeys("1234568");
		this.firstTest2.sourceCode.sendKeys("12345678");
		cl.searchCustomer();
		cl.getProposal();
		getDriver().close();
	}
}