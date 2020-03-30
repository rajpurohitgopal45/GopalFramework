
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Pages.Locator1;
import Pages.Locator2;

public class Third extends MultiThread {
	public Locator1 thirdTest1;
	public Locator2 thirdTest2;

	public Third() {
		this.thirdTest1 = new Locator1();
		this.thirdTest2 = new Locator2();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(getDriver(), 20);
		PageFactory.initElements(factory, this.thirdTest1);
		PageFactory.initElements(factory, this.thirdTest2);
	}

	@Test
	public void thirdst(String url) {
//		SoftAssert softAssertion= new SoftAssert();
			getDriver().navigate().to(url);
			String threadname = Thread.currentThread().getName();
			System.out.println(threadname+ " this is thread");
			
			waitClickOn(getDriver(),this.thirdTest1.username,30);
			this.thirdTest1.username.sendKeys("IM-546438");
			this.thirdTest1.password.sendKeys("Lombard2018");
			Select drppro = new Select(this.thirdTest1.dropdown);
			drppro.selectByValue("1");
			waitClickOn(getDriver(),this.thirdTest1.login,20);
			this.thirdTest1.login.click();
		
			waitClickOn(getDriver(),this.thirdTest1.getQuote,20);
			this.thirdTest1.getQuote.click();
	//-----------------------------------------------------------------------------------------------------------------------	
			waitClickOn(getDriver(),this.thirdTest2.registrationNo,20);
			this.thirdTest2.registrationNo.sendKeys("MH04EH7666");
			this.thirdTest2.rtoCity.sendKeys("mum");
			List<WebElement> list = this.thirdTest2.rtoSuggetions;
			if (list.get(1).getText().contains("MUMBAI")) {
				list.get(1).click();
			}
			
			waitVisibilityOfElement(getDriver(),this.thirdTest2.loader,3);
			waitInvisibilityOfElement(getDriver(),this.thirdTest2.loader,20);
			waitClickOn(getDriver(),this.thirdTest2.dateIcon,20);
			this.thirdTest2.dateIcon.click();
			this.thirdTest2.currentDate.click();

			Select value = new Select(this.thirdTest2.manufaturer);
			value.selectByValue("33");
		
			waitVisibilityOfElement(getDriver(),this.thirdTest2.loader,3);
			waitInvisibilityOfElement(getDriver(),this.thirdTest2.loader,20);
			
			Select model = new Select(this.thirdTest2.model);
			model.selectByValue("16016");
			waitVisibilityOfElement(getDriver(),this.thirdTest2.loader,3);
			waitInvisibilityOfElement(getDriver(),this.thirdTest2.loader,20);

			Select state = new Select(this.thirdTest2.state);
			state.selectByValue("27");
			waitVisibilityOfElement(getDriver(),this.thirdTest2.loader,3);
			waitInvisibilityOfElement(getDriver(),this.thirdTest2.loader,20);

			Select tenure = new Select(this.thirdTest2.cpaTenure);
			tenure.selectByValue("1");
			waitVisibilityOfElement(getDriver(),this.thirdTest2.loader,3);
			waitInvisibilityOfElement(getDriver(),this.thirdTest2.loader,20);

			this.thirdTest2.calculatePremium.click();
			waitVisibilityOfElement(getDriver(),this.thirdTest2.loader,3);
			waitInvisibilityOfElement(getDriver(),this.thirdTest2.loader,25);
			
	//---------------------------------------------------------------------------------------------------------------------
			this.thirdTest2.engineNo.sendKeys("1234578");
			this.thirdTest2.chassisNo.sendKeys("1234568");
			this.thirdTest2.sourceCode.sendKeys("12345678");
			
			this.thirdTest2.searchCustomer.click();
			String parentWindow = getDriver().getWindowHandle();
			Set<String> allWindowHandles = getDriver().getWindowHandles();

			for (String handle : allWindowHandles) {
				getDriver().switchTo().window(handle);
			}
			waitVisibilityOfElement(getDriver(),this.thirdTest2.customerName,60);
			this.thirdTest2.customerName.sendKeys("Pratik");

			waitClickOn(getDriver(),this.thirdTest2.searchCutomerName,5);
			this.thirdTest2.searchCutomerName.click();
			waitVisibilityOfElement(getDriver(),this.thirdTest2.searchCustomerloader,5);
			waitInvisibilityOfElement(getDriver(),this.thirdTest2.searchCustomerloader,60);

			this.thirdTest2.wantedCustomer.click();	
	//-------------------------------------------------------------------------------------------------------------
			getDriver().switchTo().window(parentWindow);

			waitVisibilityOfElement(getDriver(),this.thirdTest2.customerMobileNo,60);
			this.thirdTest2.createProposal.click();

			waitVisibilityOfElement(getDriver(),this.thirdTest2.proposalId,30);
			String origin=getDriver().getCurrentUrl();
			String proposalID = this.thirdTest2.proposalId.getText();
			String policyTypeH = this.thirdTest2.policyTypeT.getText();
			String vehicleType = this.thirdTest2.vehicleTypeT.getText();
			System.out.println(origin+ " >> " +vehicleType + " >> " + policyTypeH + " >> " + proposalID);
			getDriver().close();
		}
	}