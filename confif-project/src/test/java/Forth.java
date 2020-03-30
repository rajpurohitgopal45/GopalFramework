
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Pages.Locator1;
import Pages.Locator2;

public class Forth extends MultiThread {
	public Locator1 forthTest1;
	public Locator2 forthTest2;

	public Forth() {
		this.forthTest1 = new Locator1();
		this.forthTest2 = new Locator2();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(getDriver(), 20);
		PageFactory.initElements(factory, this.forthTest1);
		PageFactory.initElements(factory, this.forthTest2);
	}
	@Test
	public void forth(String url) {
//		SoftAssert softAssertion= new SoftAssert();
			getDriver().navigate().to(url);
			String threadname = Thread.currentThread().getName();
			System.out.println(threadname+ " this is thread");
			
			waitClickOn(getDriver(),this.forthTest1.username,30);
			this.forthTest1.username.sendKeys("IM-546438");
			this.forthTest1.password.sendKeys("Lombard2018");
			Select drppro = new Select(this.forthTest1.dropdown);
			drppro.selectByValue("1");
			waitClickOn(getDriver(),this.forthTest1.login,20);
			this.forthTest1.login.click();
		
			waitClickOn(getDriver(),this.forthTest1.getQuote,20);
			this.forthTest1.getQuote.click();
	//-----------------------------------------------------------------------------------------------------------------------	
			waitClickOn(getDriver(),this.forthTest2.registrationNo,20);
			this.forthTest2.registrationNo.sendKeys("MH04EH7666");
			this.forthTest2.rtoCity.sendKeys("mum");
			List<WebElement> list = this.forthTest2.rtoSuggetions;
			if (list.get(1).getText().contains("MUMBAI")) {
				list.get(1).click();
			}
			
			waitVisibilityOfElement(getDriver(),this.forthTest2.loader,3);
			waitInvisibilityOfElement(getDriver(),this.forthTest2.loader,20);
			waitClickOn(getDriver(),this.forthTest2.dateIcon,20);
			this.forthTest2.dateIcon.click();
			this.forthTest2.currentDate.click();

			Select value = new Select(this.forthTest2.manufaturer);
			value.selectByValue("33");
		
			waitVisibilityOfElement(getDriver(),this.forthTest2.loader,3);
			waitInvisibilityOfElement(getDriver(),this.forthTest2.loader,20);
			
			Select model = new Select(this.forthTest2.model);
			model.selectByValue("16016");
			waitVisibilityOfElement(getDriver(),this.forthTest2.loader,3);
			waitInvisibilityOfElement(getDriver(),this.forthTest2.loader,20);

			Select state = new Select(this.forthTest2.state);
			state.selectByValue("27");
			waitVisibilityOfElement(getDriver(),this.forthTest2.loader,3);
			waitInvisibilityOfElement(getDriver(),this.forthTest2.loader,20);

			Select tenure = new Select(this.forthTest2.cpaTenure);
			tenure.selectByValue("1");
			waitVisibilityOfElement(getDriver(),this.forthTest2.loader,3);
			waitInvisibilityOfElement(getDriver(),this.forthTest2.loader,20);

			this.forthTest2.calculatePremium.click();
			waitVisibilityOfElement(getDriver(),this.forthTest2.loader,3);
			waitInvisibilityOfElement(getDriver(),this.forthTest2.loader,25);
			
	//---------------------------------------------------------------------------------------------------------------------
			this.forthTest2.engineNo.sendKeys("1234578");
			this.forthTest2.chassisNo.sendKeys("1234568");
			this.forthTest2.sourceCode.sendKeys("12345678");
			
			this.forthTest2.searchCustomer.click();
			String parentWindow = getDriver().getWindowHandle();
			Set<String> allWindowHandles = getDriver().getWindowHandles();

			for (String handle : allWindowHandles) {
				getDriver().switchTo().window(handle);
			}
			waitVisibilityOfElement(getDriver(),this.forthTest2.customerName,60);
			this.forthTest2.customerName.sendKeys("Pratik");

			waitClickOn(getDriver(),this.forthTest2.searchCutomerName,5);
			this.forthTest2.searchCutomerName.click();
			waitVisibilityOfElement(getDriver(),this.forthTest2.searchCustomerloader,5);
			waitInvisibilityOfElement(getDriver(),this.forthTest2.searchCustomerloader,60);

			this.forthTest2.wantedCustomer.click();	
	//-------------------------------------------------------------------------------------------------------------
			getDriver().switchTo().window(parentWindow);

			waitVisibilityOfElement(getDriver(),this.forthTest2.customerMobileNo,60);
			this.forthTest2.createProposal.click();

			waitVisibilityOfElement(getDriver(),this.forthTest2.proposalId,30);
			String origin=getDriver().getCurrentUrl();
			String proposalID = this.forthTest2.proposalId.getText();
			String policyTypeH = this.forthTest2.policyTypeT.getText();
			String vehicleType = this.forthTest2.vehicleTypeT.getText();
			System.out.println(origin+ " >> " +vehicleType + " >> " + policyTypeH + " >> " + proposalID);
			getDriver().close();
		}
	}